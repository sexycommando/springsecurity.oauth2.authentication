■主要なエラー
HTTP/1.1 400 Bad Request
{"error":"invalid_grant",
"error_description":"Bad credentials"
}

HTTP/1.1 401 Unauthorized
{
"error":"invalid_token",
"error_description":"Invalid access token: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
"error_description":"Access token expired: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
"error_description":"Client not valid: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
"error_description":"Invalid access token (no client id): xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
"error_description":"Invalid refresh token (expired): xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
}

{
"error":"unauthorized",
"error_description":"An Authentication object was not found in the SecurityContext"
}




---------------------------------------------------------------------
アクセストークンの取得
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=password&username=bigadmin&password=p@ssw0rd" http://localhost:8080/authentication/oauth/token --dump-header -
{"access_token":"cdfd4407-486b-4216-92b9-b6be9f28092e","token_type":"bearer","refresh_token":"f7e920d6-c63c-4fe7-83fa-ae6d21203847","expires_in":34430,"scope":"trust"}

アクセストークンを用いてリソースにアクセス
curl --header "Authorization: Bearer cdfd4407-486b-4216-92b9-b6be9f28092e" http://localhost:8080/authentication/api/member/getMyInfo --dump-header -

ログアウト
curl --header "Authorization: Bearer cdfd4407-486b-4216-92b9-b6be9f28092e" http://localhost:8080/authentication/logout --dump-header -

リフレッシュ
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=refresh_token&refresh_token=3dd7294d-6c0d-4d00-935c-805d3504dbbc" http://localhost:8080/authentication/oauth/token --dump-header -

