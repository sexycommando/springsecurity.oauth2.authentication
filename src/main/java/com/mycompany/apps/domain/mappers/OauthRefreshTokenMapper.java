package com.mycompany.apps.domain.mappers;

import com.mycompany.apps.domain.entities.OauthRefreshToken;

public interface OauthRefreshTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.oauth_refresh_token
     *
     * @mbggenerated Sat Jun 21 20:18:08 JST 2014
     */
    int deleteByPrimaryKey(String tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.oauth_refresh_token
     *
     * @mbggenerated Sat Jun 21 20:18:08 JST 2014
     */
    int insert(OauthRefreshToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.oauth_refresh_token
     *
     * @mbggenerated Sat Jun 21 20:18:08 JST 2014
     */
    int insertSelective(OauthRefreshToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.oauth_refresh_token
     *
     * @mbggenerated Sat Jun 21 20:18:08 JST 2014
     */
    OauthRefreshToken selectByPrimaryKey(String tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.oauth_refresh_token
     *
     * @mbggenerated Sat Jun 21 20:18:08 JST 2014
     */
    int updateByPrimaryKeySelective(OauthRefreshToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.oauth_refresh_token
     *
     * @mbggenerated Sat Jun 21 20:18:08 JST 2014
     */
    int updateByPrimaryKeyWithBLOBs(OauthRefreshToken record);
}