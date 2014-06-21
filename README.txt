@see
http://www.e-zest.net/blog/rest-authentication-using-oauth-2-0-resource-owner-password-flow-protocol/



アクセストークンの取得
ブラウザよりアクセスした場合
http://localhost:8080/authentication/oauth/token?client_id=my-auth&client_secret=pass123&scope=trust&grant_type=password&username=user01&password=pass01
{"access_token":"46948e51-c372-4b44-9eba-8d26a90998fc","token_type":"bearer","refresh_token":"6b7e02eb-766c-42af-89cb-d2f1da3a84f0","expires_in":299999,"scope":"trust"}


cURLよりアクセスした場合
curl -X POST -d "client_id=my-auth&client_secret=pass123&scope=trust&grant_type=password&username=bigadmin&password=p@ssw0rd" http://localhost:8080/authentication/oauth/token
{"access_token":"3c134bed-3a0b-4dea-a048-0cf68746fc83","token_type":"bearer","refresh_token":"8a379bb5-757d-4254-ba09-a6f6e3088ba8","expires_in":299999,"scope":"trust"}

アクセストークンを用いてリソースにアクセス
curl --header "Authorization: Bearer 3c134bed-3a0b-4dea-a048-0cf68746fc83" http://localhost:8080/authentication/resources/MyResource/getMyInfo


