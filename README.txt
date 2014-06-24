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





アクセストークンの取得
ブラウザよりアクセスした場合
http://localhost:8080/authentication/oauth/token?client_id=my-auth&client_secret=pass123&scope=trust&grant_type=password&username=user01&password=pass01
{"access_token":"46948e51-c372-4b44-9eba-8d26a90998fc","token_type":"bearer","refresh_token":"6b7e02eb-766c-42af-89cb-d2f1da3a84f0","expires_in":299999,"scope":"trust"}



---------------------------------------------------------------------
アクセストークンを取得
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=password&username=bigadmin&password=p@ssw0rd" http://localhost:8080/authentication/oauth/token --dump-header -
{"access_token":"c67381d7-0bd1-4d0f-b5ba-09e3346231ce","token_type":"bearer","refresh_token":"b08ebd7d-15ba-48d8-aa73-25502a2da7d8","expires_in":299999,"scope":"trust"}

アクセストークンを用いてリソースにアクセス
curl --header "Authorization: Bearer c67381d7-0bd1-4d0f-b5ba-09e3346231ce" http://localhost:8080/authentication/resources/MyResource/getMyInfo --dump-header -

ログアウト
curl --header "Authorization: Bearer c67381d7-0bd1-4d0f-b5ba-09e3346231ce" http://localhost:8080/authentication/logout --dump-header -

リフレッシュ
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=refresh_token&refresh_token=3dd7294d-6c0d-4d00-935c-805d3504dbbc" http://localhost:8080/authentication/oauth/token --dump-header -
{"access_token":"0dbbe57d-bbf3-40bc-a7a7-fc8e409be667","token_type":"bearer","refresh_token":"3dd7294d-6c0d-4d00-935c-805d3504dbbc","expires_in":299999,"scope":"trust"}

