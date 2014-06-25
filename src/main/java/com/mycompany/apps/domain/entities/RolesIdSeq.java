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

public class RolesIdSeq {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.sequence_name
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private String sequenceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.last_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long lastValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.start_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long startValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.increment_by
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long incrementBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.max_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long maxValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.min_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long minValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.cache_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long cacheValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.log_cnt
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Long logCnt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.is_cycled
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Boolean isCycled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.roles_id_seq.is_called
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Boolean isCalled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.sequence_name
     *
     * @return the value of public.roles_id_seq.sequence_name
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.sequence_name
     *
     * @param sequenceName the value for public.roles_id_seq.sequence_name
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName == null ? null : sequenceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.last_value
     *
     * @return the value of public.roles_id_seq.last_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getLastValue() {
        return lastValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.last_value
     *
     * @param lastValue the value for public.roles_id_seq.last_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setLastValue(Long lastValue) {
        this.lastValue = lastValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.start_value
     *
     * @return the value of public.roles_id_seq.start_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getStartValue() {
        return startValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.start_value
     *
     * @param startValue the value for public.roles_id_seq.start_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setStartValue(Long startValue) {
        this.startValue = startValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.increment_by
     *
     * @return the value of public.roles_id_seq.increment_by
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getIncrementBy() {
        return incrementBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.increment_by
     *
     * @param incrementBy the value for public.roles_id_seq.increment_by
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setIncrementBy(Long incrementBy) {
        this.incrementBy = incrementBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.max_value
     *
     * @return the value of public.roles_id_seq.max_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.max_value
     *
     * @param maxValue the value for public.roles_id_seq.max_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.min_value
     *
     * @return the value of public.roles_id_seq.min_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getMinValue() {
        return minValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.min_value
     *
     * @param minValue the value for public.roles_id_seq.min_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.cache_value
     *
     * @return the value of public.roles_id_seq.cache_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getCacheValue() {
        return cacheValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.cache_value
     *
     * @param cacheValue the value for public.roles_id_seq.cache_value
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setCacheValue(Long cacheValue) {
        this.cacheValue = cacheValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.log_cnt
     *
     * @return the value of public.roles_id_seq.log_cnt
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Long getLogCnt() {
        return logCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.log_cnt
     *
     * @param logCnt the value for public.roles_id_seq.log_cnt
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setLogCnt(Long logCnt) {
        this.logCnt = logCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.is_cycled
     *
     * @return the value of public.roles_id_seq.is_cycled
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Boolean getIsCycled() {
        return isCycled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.is_cycled
     *
     * @param isCycled the value for public.roles_id_seq.is_cycled
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setIsCycled(Boolean isCycled) {
        this.isCycled = isCycled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.roles_id_seq.is_called
     *
     * @return the value of public.roles_id_seq.is_called
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Boolean getIsCalled() {
        return isCalled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.roles_id_seq.is_called
     *
     * @param isCalled the value for public.roles_id_seq.is_called
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setIsCalled(Boolean isCalled) {
        this.isCalled = isCalled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.roles_id_seq
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
        RolesIdSeq other = (RolesIdSeq) that;
        return (this.getSequenceName() == null ? other.getSequenceName() == null : this.getSequenceName().equals(other.getSequenceName()))
            && (this.getLastValue() == null ? other.getLastValue() == null : this.getLastValue().equals(other.getLastValue()))
            && (this.getStartValue() == null ? other.getStartValue() == null : this.getStartValue().equals(other.getStartValue()))
            && (this.getIncrementBy() == null ? other.getIncrementBy() == null : this.getIncrementBy().equals(other.getIncrementBy()))
            && (this.getMaxValue() == null ? other.getMaxValue() == null : this.getMaxValue().equals(other.getMaxValue()))
            && (this.getMinValue() == null ? other.getMinValue() == null : this.getMinValue().equals(other.getMinValue()))
            && (this.getCacheValue() == null ? other.getCacheValue() == null : this.getCacheValue().equals(other.getCacheValue()))
            && (this.getLogCnt() == null ? other.getLogCnt() == null : this.getLogCnt().equals(other.getLogCnt()))
            && (this.getIsCycled() == null ? other.getIsCycled() == null : this.getIsCycled().equals(other.getIsCycled()))
            && (this.getIsCalled() == null ? other.getIsCalled() == null : this.getIsCalled().equals(other.getIsCalled()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.roles_id_seq
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSequenceName() == null) ? 0 : getSequenceName().hashCode());
        result = prime * result + ((getLastValue() == null) ? 0 : getLastValue().hashCode());
        result = prime * result + ((getStartValue() == null) ? 0 : getStartValue().hashCode());
        result = prime * result + ((getIncrementBy() == null) ? 0 : getIncrementBy().hashCode());
        result = prime * result + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        result = prime * result + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        result = prime * result + ((getCacheValue() == null) ? 0 : getCacheValue().hashCode());
        result = prime * result + ((getLogCnt() == null) ? 0 : getLogCnt().hashCode());
        result = prime * result + ((getIsCycled() == null) ? 0 : getIsCycled().hashCode());
        result = prime * result + ((getIsCalled() == null) ? 0 : getIsCalled().hashCode());
        return result;
    }
}