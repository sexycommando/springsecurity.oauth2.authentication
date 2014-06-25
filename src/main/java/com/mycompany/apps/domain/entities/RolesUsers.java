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
package com.mycompany.apps.domain.entities;

import java.util.Date;

public class RolesUsers {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_users.role_id
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    private Short roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_users.user_id
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    private Short userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_users.rec_insert_datetime
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    private Date recInsertDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_users.role_id
     *
     * @return the value of public.roles_users.role_id
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    public Short getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_users.role_id
     *
     * @param roleId the value for public.roles_users.role_id
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_users.user_id
     *
     * @return the value of public.roles_users.user_id
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    public Short getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_users.user_id
     *
     * @param userId the value for public.roles_users.user_id
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    public void setUserId(Short userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_users.rec_insert_datetime
     *
     * @return the value of public.roles_users.rec_insert_datetime
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    public Date getRecInsertDatetime() {
        return recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_users.rec_insert_datetime
     *
     * @param recInsertDatetime the value for public.roles_users.rec_insert_datetime
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    public void setRecInsertDatetime(Date recInsertDatetime) {
        this.recInsertDatetime = recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.roles_users
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RolesUsers other = (RolesUsers) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRecInsertDatetime() == null ? other.getRecInsertDatetime() == null : this.getRecInsertDatetime().equals(other.getRecInsertDatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.roles_users
     *
     * @mbggenerated Wed Jun 18 23:12:48 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRecInsertDatetime() == null) ? 0 : getRecInsertDatetime().hashCode());
        return result;
    }
}