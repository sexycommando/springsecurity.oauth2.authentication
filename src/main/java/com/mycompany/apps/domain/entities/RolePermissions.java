package com.mycompany.apps.domain.entities;

import java.util.Date;

public class RolePermissions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.role_permissions.roles_id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Short rolesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.role_permissions.permissions_id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Short permissionsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.role_permissions.rec_insert_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Date recInsertDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.role_permissions.roles_id
     *
     * @return the value of public.role_permissions.roles_id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Short getRolesId() {
        return rolesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.role_permissions.roles_id
     *
     * @param rolesId the value for public.role_permissions.roles_id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setRolesId(Short rolesId) {
        this.rolesId = rolesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.role_permissions.permissions_id
     *
     * @return the value of public.role_permissions.permissions_id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Short getPermissionsId() {
        return permissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.role_permissions.permissions_id
     *
     * @param permissionsId the value for public.role_permissions.permissions_id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setPermissionsId(Short permissionsId) {
        this.permissionsId = permissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.role_permissions.rec_insert_datetime
     *
     * @return the value of public.role_permissions.rec_insert_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Date getRecInsertDatetime() {
        return recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.role_permissions.rec_insert_datetime
     *
     * @param recInsertDatetime the value for public.role_permissions.rec_insert_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setRecInsertDatetime(Date recInsertDatetime) {
        this.recInsertDatetime = recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.role_permissions
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
        RolePermissions other = (RolePermissions) that;
        return (this.getRolesId() == null ? other.getRolesId() == null : this.getRolesId().equals(other.getRolesId()))
            && (this.getPermissionsId() == null ? other.getPermissionsId() == null : this.getPermissionsId().equals(other.getPermissionsId()))
            && (this.getRecInsertDatetime() == null ? other.getRecInsertDatetime() == null : this.getRecInsertDatetime().equals(other.getRecInsertDatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.role_permissions
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRolesId() == null) ? 0 : getRolesId().hashCode());
        result = prime * result + ((getPermissionsId() == null) ? 0 : getPermissionsId().hashCode());
        result = prime * result + ((getRecInsertDatetime() == null) ? 0 : getRecInsertDatetime().hashCode());
        return result;
    }
}