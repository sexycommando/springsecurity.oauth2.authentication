/*
 * Copyright (C) 2014 STNet,Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.mycompany.apps.oauth2.authentication.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

/**
 * エンドユーザの認証を行うカスタムクラスです。<br>
 * 独自にユーザ認証を行いたい場合はこのクラスを使用してください。
 *
 * @author stnetadmin
 */
public class CustomUserAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {

        if (authentication.getPrincipal().equals("user") && authentication.getCredentials().equals("user")) {

            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            CustomUserPasswordAuthenticationToken auth
                    = new CustomUserPasswordAuthenticationToken(
                            authentication.getPrincipal(),
                            authentication.getCredentials(),
                            grantedAuthorities);

            return auth;

        } else if (authentication.getPrincipal().equals("admin") && authentication.getCredentials().equals("admin")) {

            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            CustomUserPasswordAuthenticationToken auth
                    = new CustomUserPasswordAuthenticationToken(
                            authentication.getPrincipal(),
                            authentication.getCredentials(),
                            grantedAuthorities);

            return auth;

        } else if (authentication.getPrincipal().equals("user1") && authentication.getCredentials().equals("user1")) {

            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            CustomUserPasswordAuthenticationToken auth
                    = new CustomUserPasswordAuthenticationToken(
                            authentication.getPrincipal(),
                            authentication.getCredentials(),
                            grantedAuthorities);
            return auth;

        } else {
            throw new BadCredentialsException("Bad User Credentials.");
        }
    }

    @Override
    public boolean supports(Class<? extends Object> authentication) {
        return true;
    }

}
