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




---------------------------------------------------------------------
アクセストークンの取得
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=password&username=bigadmin&password=p@ssw0rd" http://localhost:8080/authentication/oauth/token --dump-header -
{"access_token":"894e73f6-a090-43b1-926a-d4cbd9dfef27","token_type":"bearer","refresh_token":"a8a8abd7-6dd2-49ce-8640-a9f44c1305a5","expires_in":43199,"scope":"trust"}

アクセストークンを用いてリソースにアクセス
curl --header "Authorization: Bearer 894e73f6-a090-43b1-926a-d4cbd9dfef27" http://localhost:8080/authentication/resources/MyResource/getMyInfo --dump-header -

ログアウト
curl --header "Authorization: Bearer 894e73f6-a090-43b1-926a-d4cbd9dfef27" http://localhost:8080/authentication/logout --dump-header -

リフレッシュ
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=refresh_token&refresh_token=3dd7294d-6c0d-4d00-935c-805d3504dbbc" http://localhost:8080/authentication/oauth/token --dump-header -
{"access_token":"0dbbe57d-bbf3-40bc-a7a7-fc8e409be667","token_type":"bearer","refresh_token":"3dd7294d-6c0d-4d00-935c-805d3504dbbc","expires_in":299999,"scope":"trust"}

