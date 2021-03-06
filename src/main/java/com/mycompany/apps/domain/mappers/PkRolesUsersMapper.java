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
package com.mycompany.apps.domain.mappers;

import com.mycompany.apps.domain.entities.PkRolesUsers;

public interface PkRolesUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pk_roles_users
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    int insert(PkRolesUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pk_roles_users
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    int insertSelective(PkRolesUsers record);
}