package com.antec.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckedcollectinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public CheckedcollectinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidIsNull() {
            addCriterion("collectInfoId is null");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidIsNotNull() {
            addCriterion("collectInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidEqualTo(Integer value) {
            addCriterion("collectInfoId =", value, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidNotEqualTo(Integer value) {
            addCriterion("collectInfoId <>", value, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidGreaterThan(Integer value) {
            addCriterion("collectInfoId >", value, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectInfoId >=", value, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidLessThan(Integer value) {
            addCriterion("collectInfoId <", value, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("collectInfoId <=", value, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidIn(List<Integer> values) {
            addCriterion("collectInfoId in", values, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidNotIn(List<Integer> values) {
            addCriterion("collectInfoId not in", values, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidBetween(Integer value1, Integer value2) {
            addCriterion("collectInfoId between", value1, value2, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andCollectinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("collectInfoId not between", value1, value2, "collectinfoid");
            return (Criteria) this;
        }

        public Criteria andModifykbnIsNull() {
            addCriterion("modifyKbn is null");
            return (Criteria) this;
        }

        public Criteria andModifykbnIsNotNull() {
            addCriterion("modifyKbn is not null");
            return (Criteria) this;
        }

        public Criteria andModifykbnEqualTo(String value) {
            addCriterion("modifyKbn =", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnNotEqualTo(String value) {
            addCriterion("modifyKbn <>", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnGreaterThan(String value) {
            addCriterion("modifyKbn >", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnGreaterThanOrEqualTo(String value) {
            addCriterion("modifyKbn >=", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnLessThan(String value) {
            addCriterion("modifyKbn <", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnLessThanOrEqualTo(String value) {
            addCriterion("modifyKbn <=", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnLike(String value) {
            addCriterion("modifyKbn like", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnNotLike(String value) {
            addCriterion("modifyKbn not like", value, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnIn(List<String> values) {
            addCriterion("modifyKbn in", values, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnNotIn(List<String> values) {
            addCriterion("modifyKbn not in", values, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnBetween(String value1, String value2) {
            addCriterion("modifyKbn between", value1, value2, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifykbnNotBetween(String value1, String value2) {
            addCriterion("modifyKbn not between", value1, value2, "modifykbn");
            return (Criteria) this;
        }

        public Criteria andModifiyurlIsNull() {
            addCriterion("modifiyUrl is null");
            return (Criteria) this;
        }

        public Criteria andModifiyurlIsNotNull() {
            addCriterion("modifiyUrl is not null");
            return (Criteria) this;
        }

        public Criteria andModifiyurlEqualTo(String value) {
            addCriterion("modifiyUrl =", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlNotEqualTo(String value) {
            addCriterion("modifiyUrl <>", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlGreaterThan(String value) {
            addCriterion("modifiyUrl >", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlGreaterThanOrEqualTo(String value) {
            addCriterion("modifiyUrl >=", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlLessThan(String value) {
            addCriterion("modifiyUrl <", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlLessThanOrEqualTo(String value) {
            addCriterion("modifiyUrl <=", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlLike(String value) {
            addCriterion("modifiyUrl like", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlNotLike(String value) {
            addCriterion("modifiyUrl not like", value, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlIn(List<String> values) {
            addCriterion("modifiyUrl in", values, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlNotIn(List<String> values) {
            addCriterion("modifiyUrl not in", values, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlBetween(String value1, String value2) {
            addCriterion("modifiyUrl between", value1, value2, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andModifiyurlNotBetween(String value1, String value2) {
            addCriterion("modifiyUrl not between", value1, value2, "modifiyurl");
            return (Criteria) this;
        }

        public Criteria andOccurdateIsNull() {
            addCriterion("occurDate is null");
            return (Criteria) this;
        }

        public Criteria andOccurdateIsNotNull() {
            addCriterion("occurDate is not null");
            return (Criteria) this;
        }

        public Criteria andOccurdateEqualTo(Date value) {
            addCriterion("occurDate =", value, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateNotEqualTo(Date value) {
            addCriterion("occurDate <>", value, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateGreaterThan(Date value) {
            addCriterion("occurDate >", value, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateGreaterThanOrEqualTo(Date value) {
            addCriterion("occurDate >=", value, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateLessThan(Date value) {
            addCriterion("occurDate <", value, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateLessThanOrEqualTo(Date value) {
            addCriterion("occurDate <=", value, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateIn(List<Date> values) {
            addCriterion("occurDate in", values, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateNotIn(List<Date> values) {
            addCriterion("occurDate not in", values, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateBetween(Date value1, Date value2) {
            addCriterion("occurDate between", value1, value2, "occurdate");
            return (Criteria) this;
        }

        public Criteria andOccurdateNotBetween(Date value1, Date value2) {
            addCriterion("occurDate not between", value1, value2, "occurdate");
            return (Criteria) this;
        }

        public Criteria andEventsummaryIsNull() {
            addCriterion("eventSummary is null");
            return (Criteria) this;
        }

        public Criteria andEventsummaryIsNotNull() {
            addCriterion("eventSummary is not null");
            return (Criteria) this;
        }

        public Criteria andEventsummaryEqualTo(String value) {
            addCriterion("eventSummary =", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryNotEqualTo(String value) {
            addCriterion("eventSummary <>", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryGreaterThan(String value) {
            addCriterion("eventSummary >", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryGreaterThanOrEqualTo(String value) {
            addCriterion("eventSummary >=", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryLessThan(String value) {
            addCriterion("eventSummary <", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryLessThanOrEqualTo(String value) {
            addCriterion("eventSummary <=", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryLike(String value) {
            addCriterion("eventSummary like", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryNotLike(String value) {
            addCriterion("eventSummary not like", value, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryIn(List<String> values) {
            addCriterion("eventSummary in", values, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryNotIn(List<String> values) {
            addCriterion("eventSummary not in", values, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryBetween(String value1, String value2) {
            addCriterion("eventSummary between", value1, value2, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventsummaryNotBetween(String value1, String value2) {
            addCriterion("eventSummary not between", value1, value2, "eventsummary");
            return (Criteria) this;
        }

        public Criteria andEventaddressidIsNull() {
            addCriterion("eventAddressId is null");
            return (Criteria) this;
        }

        public Criteria andEventaddressidIsNotNull() {
            addCriterion("eventAddressId is not null");
            return (Criteria) this;
        }

        public Criteria andEventaddressidEqualTo(Integer value) {
            addCriterion("eventAddressId =", value, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidNotEqualTo(Integer value) {
            addCriterion("eventAddressId <>", value, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidGreaterThan(Integer value) {
            addCriterion("eventAddressId >", value, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eventAddressId >=", value, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidLessThan(Integer value) {
            addCriterion("eventAddressId <", value, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidLessThanOrEqualTo(Integer value) {
            addCriterion("eventAddressId <=", value, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidIn(List<Integer> values) {
            addCriterion("eventAddressId in", values, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidNotIn(List<Integer> values) {
            addCriterion("eventAddressId not in", values, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidBetween(Integer value1, Integer value2) {
            addCriterion("eventAddressId between", value1, value2, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andEventaddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("eventAddressId not between", value1, value2, "eventaddressid");
            return (Criteria) this;
        }

        public Criteria andPickedaddressIsNull() {
            addCriterion("pickedAddress is null");
            return (Criteria) this;
        }

        public Criteria andPickedaddressIsNotNull() {
            addCriterion("pickedAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPickedaddressEqualTo(String value) {
            addCriterion("pickedAddress =", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressNotEqualTo(String value) {
            addCriterion("pickedAddress <>", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressGreaterThan(String value) {
            addCriterion("pickedAddress >", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pickedAddress >=", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressLessThan(String value) {
            addCriterion("pickedAddress <", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressLessThanOrEqualTo(String value) {
            addCriterion("pickedAddress <=", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressLike(String value) {
            addCriterion("pickedAddress like", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressNotLike(String value) {
            addCriterion("pickedAddress not like", value, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressIn(List<String> values) {
            addCriterion("pickedAddress in", values, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressNotIn(List<String> values) {
            addCriterion("pickedAddress not in", values, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressBetween(String value1, String value2) {
            addCriterion("pickedAddress between", value1, value2, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andPickedaddressNotBetween(String value1, String value2) {
            addCriterion("pickedAddress not between", value1, value2, "pickedaddress");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCredibilityIsNull() {
            addCriterion("credibility is null");
            return (Criteria) this;
        }

        public Criteria andCredibilityIsNotNull() {
            addCriterion("credibility is not null");
            return (Criteria) this;
        }

        public Criteria andCredibilityEqualTo(Integer value) {
            addCriterion("credibility =", value, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityNotEqualTo(Integer value) {
            addCriterion("credibility <>", value, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityGreaterThan(Integer value) {
            addCriterion("credibility >", value, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("credibility >=", value, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityLessThan(Integer value) {
            addCriterion("credibility <", value, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityLessThanOrEqualTo(Integer value) {
            addCriterion("credibility <=", value, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityIn(List<Integer> values) {
            addCriterion("credibility in", values, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityNotIn(List<Integer> values) {
            addCriterion("credibility not in", values, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityBetween(Integer value1, Integer value2) {
            addCriterion("credibility between", value1, value2, "credibility");
            return (Criteria) this;
        }

        public Criteria andCredibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("credibility not between", value1, value2, "credibility");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table checkedCollectInfo
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}