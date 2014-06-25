/*
 * Copyright 2014 STNet,Inc..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycompany.apps.oauth2.authentication.security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.token.JdbcTokenStore;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * LogoutSuccessHandler の実装クラスです。
 *
 * @author stnetadmin
 */
@Service
public class LogoutImpl implements LogoutSuccessHandler {

    private static final Logger LOG = LoggerFactory.getLogger(LogoutImpl.class);

    JdbcTokenStore tokenstore;

    public JdbcTokenStore getTokenstore() {
        return tokenstore;
    }

    public void setTokenstore(JdbcTokenStore tokenstore) {
        this.tokenstore = tokenstore;
    }

    /**
     * ログアウト処理を行います。<br>
     * アクセストークン、リフレッシュトークンをトークンストアから削除します。
     *
     * @param paramHttpServletRequest
     * @param paramHttpServletResponse
     * @param paramAuthentication
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest paramHttpServletRequest,
            HttpServletResponse paramHttpServletResponse,
            Authentication paramAuthentication) throws IOException,
            ServletException {

        String tokens = paramHttpServletRequest.getHeader("Authorization");
        String values[] = StringUtils.split(tokens, " ");
        LOG.debug("\n\ttoken type: " + values[0]);
        LOG.debug("\n\ttoken: " + values[1]);

        String accessTokenId = null;
        String refreshTokenId = null;

        if (values.length != 2) {
            return;
        }

        if (values[1] != null) {
            accessTokenId = values[1];
        } else {
            return;
        }

        // アクセストークン存在チェック
        OAuth2AccessToken accessToken = tokenstore.readAccessToken(accessTokenId);
        if (accessToken != null) {

            // アクセストークン経由でリフレッシュトークンを取得する
            OAuth2RefreshToken rt = accessToken.getRefreshToken();
            refreshTokenId = rt.getValue();

            // アクセストークンを削除する
            tokenstore.removeAccessToken(values[1]);
            LOG.info("\n\tAccess Token Removed Successfully!");

        } else {
            LOG.info("\n\tAccess Token Not Exist(Not Removed)!");
        }

        // リフレッシュトークン存在チェック
        OAuth2RefreshToken refreshToken = tokenstore.readRefreshToken(refreshTokenId);
        if (refreshToken != null) {

            // リフレッシュトークンを削除する
            tokenstore.removeRefreshToken(refreshTokenId);
            LOG.info("\n\tRefresh Token Removed Successfully!");

        } else {
            LOG.info("\n\tRefresh Token Not Exist(Not Removed)!");
        }

        paramHttpServletResponse.getOutputStream().write("\n\tYou Have Logged Out successfully.".getBytes());
    }

}
