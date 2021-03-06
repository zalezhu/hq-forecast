package com.hq.flood.entity.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFloodPrdExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public TFloodPrdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
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
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
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

        public Criteria andPrdCodeIsNull() {
            addCriterion("PRD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrdCodeIsNotNull() {
            addCriterion("PRD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCodeEqualTo(String value) {
            addCriterion("PRD_CODE =", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotEqualTo(String value) {
            addCriterion("PRD_CODE <>", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeGreaterThan(String value) {
            addCriterion("PRD_CODE >", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_CODE >=", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeLessThan(String value) {
            addCriterion("PRD_CODE <", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeLessThanOrEqualTo(String value) {
            addCriterion("PRD_CODE <=", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeLike(String value) {
            addCriterion("PRD_CODE like", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotLike(String value) {
            addCriterion("PRD_CODE not like", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeIn(List<String> values) {
            addCriterion("PRD_CODE in", values, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotIn(List<String> values) {
            addCriterion("PRD_CODE not in", values, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeBetween(String value1, String value2) {
            addCriterion("PRD_CODE between", value1, value2, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotBetween(String value1, String value2) {
            addCriterion("PRD_CODE not between", value1, value2, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdNameIsNull() {
            addCriterion("PRD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrdNameIsNotNull() {
            addCriterion("PRD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNameEqualTo(String value) {
            addCriterion("PRD_NAME =", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotEqualTo(String value) {
            addCriterion("PRD_NAME <>", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThan(String value) {
            addCriterion("PRD_NAME >", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NAME >=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThan(String value) {
            addCriterion("PRD_NAME <", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThanOrEqualTo(String value) {
            addCriterion("PRD_NAME <=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLike(String value) {
            addCriterion("PRD_NAME like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotLike(String value) {
            addCriterion("PRD_NAME not like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameIn(List<String> values) {
            addCriterion("PRD_NAME in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotIn(List<String> values) {
            addCriterion("PRD_NAME not in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameBetween(String value1, String value2) {
            addCriterion("PRD_NAME between", value1, value2, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotBetween(String value1, String value2) {
            addCriterion("PRD_NAME not between", value1, value2, "prdName");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("GMT_CREATE =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("GMT_CREATE <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("GMT_CREATE >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("GMT_CREATE <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("GMT_CREATE in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("GMT_CREATE not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("GMT_MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("GMT_MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("GMT_MODIFIED =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("GMT_MODIFIED <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("GMT_MODIFIED >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFIED >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("GMT_MODIFIED <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFIED <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("GMT_MODIFIED in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("GMT_MODIFIED not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFIED between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFIED not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIsNull() {
            addCriterion("MODIFIED_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIsNotNull() {
            addCriterion("MODIFIED_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID =", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID <>", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdGreaterThan(String value) {
            addCriterion("MODIFIED_USER_ID >", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID >=", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLessThan(String value) {
            addCriterion("MODIFIED_USER_ID <", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USER_ID <=", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLike(String value) {
            addCriterion("MODIFIED_USER_ID like", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotLike(String value) {
            addCriterion("MODIFIED_USER_ID not like", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIn(List<String> values) {
            addCriterion("MODIFIED_USER_ID in", values, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotIn(List<String> values) {
            addCriterion("MODIFIED_USER_ID not in", values, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdBetween(String value1, String value2) {
            addCriterion("MODIFIED_USER_ID between", value1, value2, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_USER_ID not between", value1, value2, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andProfitPointIsNull() {
            addCriterion("PROFIT_POINT is null");
            return (Criteria) this;
        }

        public Criteria andProfitPointIsNotNull() {
            addCriterion("PROFIT_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andProfitPointEqualTo(BigDecimal value) {
            addCriterion("PROFIT_POINT =", value, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointNotEqualTo(BigDecimal value) {
            addCriterion("PROFIT_POINT <>", value, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointGreaterThan(BigDecimal value) {
            addCriterion("PROFIT_POINT >", value, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROFIT_POINT >=", value, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointLessThan(BigDecimal value) {
            addCriterion("PROFIT_POINT <", value, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROFIT_POINT <=", value, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointIn(List<BigDecimal> values) {
            addCriterion("PROFIT_POINT in", values, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointNotIn(List<BigDecimal> values) {
            addCriterion("PROFIT_POINT not in", values, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROFIT_POINT between", value1, value2, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andProfitPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROFIT_POINT not between", value1, value2, "profitPoint");
            return (Criteria) this;
        }

        public Criteria andIsStatIsNull() {
            addCriterion("IS_STAT is null");
            return (Criteria) this;
        }

        public Criteria andIsStatIsNotNull() {
            addCriterion("IS_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andIsStatEqualTo(String value) {
            addCriterion("IS_STAT =", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatNotEqualTo(String value) {
            addCriterion("IS_STAT <>", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatGreaterThan(String value) {
            addCriterion("IS_STAT >", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatGreaterThanOrEqualTo(String value) {
            addCriterion("IS_STAT >=", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatLessThan(String value) {
            addCriterion("IS_STAT <", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatLessThanOrEqualTo(String value) {
            addCriterion("IS_STAT <=", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatLike(String value) {
            addCriterion("IS_STAT like", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatNotLike(String value) {
            addCriterion("IS_STAT not like", value, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatIn(List<String> values) {
            addCriterion("IS_STAT in", values, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatNotIn(List<String> values) {
            addCriterion("IS_STAT not in", values, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatBetween(String value1, String value2) {
            addCriterion("IS_STAT between", value1, value2, "isStat");
            return (Criteria) this;
        }

        public Criteria andIsStatNotBetween(String value1, String value2) {
            addCriterion("IS_STAT not between", value1, value2, "isStat");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_flood_prd
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 15 23:13:34 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_flood_prd
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
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