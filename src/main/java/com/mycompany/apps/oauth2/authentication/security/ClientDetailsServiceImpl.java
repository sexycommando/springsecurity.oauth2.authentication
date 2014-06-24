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

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.BaseClientDetails;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.stereotype.Service;

/**
 *
 * @author stnetadmin
 */
@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

    @Override
    public ClientDetails loadClientByClientId(String clientId)
            throws OAuth2Exception {

        if (clientId.equals("client1")) {

            List<String> authorizedGrantTypes = new ArrayList<>();
            authorizedGrantTypes.add("password");
            authorizedGrantTypes.add("refresh_token");
            authorizedGrantTypes.add("client_credentials");

            BaseClientDetails clientDetails = new BaseClientDetails();
            clientDetails.setClientId("client1");
            clientDetails.setClientSecret("client1");
            clientDetails.setAuthorizedGrantTypes(authorizedGrantTypes);

            return clientDetails;

        } else if (clientId.equals("client2")) {

            List<String> authorizedGrantTypes = new ArrayList<>();
            authorizedGrantTypes.add("password");
            authorizedGrantTypes.add("refresh_token");
            authorizedGrantTypes.add("client_credentials");

            BaseClientDetails clientDetails = new BaseClientDetails();
            clientDetails.setClientId("client2");
            clientDetails.setClientSecret("client2");
            clientDetails.setAuthorizedGrantTypes(authorizedGrantTypes);

            return clientDetails;
        } else {
            throw new NoSuchClientException("No client with requested id: "
                    + clientId);
        }
    }

}
