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
package com.mycompany.apps.domain.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author stnetadmin
 */
public class Users implements UserDetails {

    private static final List<? extends GrantedAuthority> DEFAULT_AUTHORITIES = Collections
            .singletonList(new SimpleGrantedAuthority("ROLE_USER"));

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.id
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.username
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.password
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.mail_address
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private String mailAddress;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.enabled
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private boolean enabled;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.account_non_locked
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private boolean accountNonLocked;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.account_non_expired
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private boolean accountNonExpired;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.account_expiration_date
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private Date accountExpirationDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.credentials_non_expired
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private boolean credentialsNonExpired;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.login_failed_count
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private Short loginFailedCount;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.last_login_date
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private Date lastLoginDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.rec_insert_datetime
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private Date recInsertDatetime;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.rec_insert_user
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private String recInsertUser;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.rec_update_datetime
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private Date recUpdateDatetime;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column public.users.rec_update_user
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    private String recUpdateUser;

    /**
     *
     */
    private List<GrantedAuthority> authorities;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.id
     *
     * @return the value of public.users.id
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.id
     *
     * @param id the value for public.users.id
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.username
     *
     * @return the value of public.users.username
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.username
     *
     * @param username the value for public.users.username
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.password
     *
     * @return the value of public.users.password
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.password
     *
     * @param password the value for public.users.password
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.mail_address
     *
     * @return the value of public.users.mail_address
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.mail_address
     *
     * @param mailAddress the value for public.users.mail_address
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.enabled
     *
     * @return the value of public.users.enabled
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.enabled
     *
     * @param enabled the value for public.users.enabled
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.account_non_locked
     *
     * @return the value of public.users.account_non_locked
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.account_non_locked
     *
     * @param accountNonLocked the value for public.users.account_non_locked
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.account_non_expired
     *
     * @return the value of public.users.account_non_expired
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.account_non_expired
     *
     * @param accountNonExpired the value for public.users.account_non_expired
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.account_expiration_date
     *
     * @return the value of public.users.account_expiration_date
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public Date getAccountExpirationDate() {
        return accountExpirationDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.account_expiration_date
     *
     * @param accountExpirationDate the value for
     * public.users.account_expiration_date
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setAccountExpirationDate(Date accountExpirationDate) {
        this.accountExpirationDate = accountExpirationDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.credentials_non_expired
     *
     * @return the value of public.users.credentials_non_expired
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.credentials_non_expired
     *
     * @param credentialsNonExpired the value for
     * public.users.credentials_non_expired
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.login_failed_count
     *
     * @return the value of public.users.login_failed_count
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public Short getLoginFailedCount() {
        return loginFailedCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.login_failed_count
     *
     * @param loginFailedCount the value for public.users.login_failed_count
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setLoginFailedCount(Short loginFailedCount) {
        this.loginFailedCount = loginFailedCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.last_login_date
     *
     * @return the value of public.users.last_login_date
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.last_login_date
     *
     * @param lastLoginDate the value for public.users.last_login_date
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.rec_insert_datetime
     *
     * @return the value of public.users.rec_insert_datetime
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public Date getRecInsertDatetime() {
        return recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.rec_insert_datetime
     *
     * @param recInsertDatetime the value for public.users.rec_insert_datetime
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setRecInsertDatetime(Date recInsertDatetime) {
        this.recInsertDatetime = recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.rec_insert_user
     *
     * @return the value of public.users.rec_insert_user
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public String getRecInsertUser() {
        return recInsertUser;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.rec_insert_user
     *
     * @param recInsertUser the value for public.users.rec_insert_user
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setRecInsertUser(String recInsertUser) {
        this.recInsertUser = recInsertUser == null ? null : recInsertUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.rec_update_datetime
     *
     * @return the value of public.users.rec_update_datetime
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public Date getRecUpdateDatetime() {
        return recUpdateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.rec_update_datetime
     *
     * @param recUpdateDatetime the value for public.users.rec_update_datetime
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setRecUpdateDatetime(Date recUpdateDatetime) {
        this.recUpdateDatetime = recUpdateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column public.users.rec_update_user
     *
     * @return the value of public.users.rec_update_user
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public String getRecUpdateUser() {
        return recUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column public.users.rec_update_user
     *
     * @param recUpdateUser the value for public.users.rec_update_user
     *
     * @mbggenerated Tue Jun 17 18:24:33 JST 2014
     */
    public void setRecUpdateUser(String recUpdateUser) {
        this.recUpdateUser = recUpdateUser == null ? null : recUpdateUser.trim();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //return DEFAULT_AUTHORITIES;
        return (Collection<? extends GrantedAuthority>) authorities;
    }

    public void setAuthorities(List<String> roles) {
        List<GrantedAuthority> listOfAuthorities = new ArrayList<GrantedAuthority>();
        for (String role : roles) {
            listOfAuthorities.add(new Roles(role));
        }
        authorities = listOfAuthorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}