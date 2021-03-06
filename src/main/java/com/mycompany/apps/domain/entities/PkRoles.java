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

public class PkRoles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.pk_roles.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Integer id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.pk_roles.id
     *
     * @return the value of public.pk_roles.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.pk_roles.id
     *
     * @param id the value for public.pk_roles.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pk_roles
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
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
        PkRoles other = (PkRoles) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pk_roles
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}