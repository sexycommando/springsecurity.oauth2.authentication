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
package com.mycompany.apps.web.resources;

import com.mycompany.apps.domain.entities.Users;
import com.mycompany.apps.domain.mappers.UsersMapper;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * REST Web Service
 *
 * @author stnetadmin
 */
@Service
@Path("/member")
public class MemberResource {

    @Autowired
    private UsersMapper usersMapper;

    @GET
    @Path("/getMyInfo")
    public String getMyInfo() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        com.mycompany.apps.domain.dto.Users principal
            = (com.mycompany.apps.domain.dto.Users) auth.getPrincipal();

        Users users = usersMapper.selectByUsername(principal.getUsername());
        if (users == null) {
            throw new UnsupportedOperationException("User not found...");
        }
        return "\n\tProtected Resource(getMyInfo) Accessed !!!! Returning from Myresource getMyInfo";
    }

}
