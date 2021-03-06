package com.hq.elva.entity.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBasYpetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public TBasYpetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
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
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
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

        public Criteria andTypIdIsNull() {
            addCriterion("typ_id is null");
            return (Criteria) this;
        }

        public Criteria andTypIdIsNotNull() {
            addCriterion("typ_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypIdEqualTo(String value) {
            addCriterion("typ_id =", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotEqualTo(String value) {
            addCriterion("typ_id <>", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdGreaterThan(String value) {
            addCriterion("typ_id >", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdGreaterThanOrEqualTo(String value) {
            addCriterion("typ_id >=", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdLessThan(String value) {
            addCriterion("typ_id <", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdLessThanOrEqualTo(String value) {
            addCriterion("typ_id <=", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdLike(String value) {
            addCriterion("typ_id like", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotLike(String value) {
            addCriterion("typ_id not like", value, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdIn(List<String> values) {
            addCriterion("typ_id in", values, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotIn(List<String> values) {
            addCriterion("typ_id not in", values, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdBetween(String value1, String value2) {
            addCriterion("typ_id between", value1, value2, "typId");
            return (Criteria) this;
        }

        public Criteria andTypIdNotBetween(String value1, String value2) {
            addCriterion("typ_id not between", value1, value2, "typId");
            return (Criteria) this;
        }

        public Criteria andTypNmIsNull() {
            addCriterion("typ_nm is null");
            return (Criteria) this;
        }

        public Criteria andTypNmIsNotNull() {
            addCriterion("typ_nm is not null");
            return (Criteria) this;
        }

        public Criteria andTypNmEqualTo(String value) {
            addCriterion("typ_nm =", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmNotEqualTo(String value) {
            addCriterion("typ_nm <>", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmGreaterThan(String value) {
            addCriterion("typ_nm >", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmGreaterThanOrEqualTo(String value) {
            addCriterion("typ_nm >=", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmLessThan(String value) {
            addCriterion("typ_nm <", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmLessThanOrEqualTo(String value) {
            addCriterion("typ_nm <=", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmLike(String value) {
            addCriterion("typ_nm like", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmNotLike(String value) {
            addCriterion("typ_nm not like", value, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmIn(List<String> values) {
            addCriterion("typ_nm in", values, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmNotIn(List<String> values) {
            addCriterion("typ_nm not in", values, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmBetween(String value1, String value2) {
            addCriterion("typ_nm between", value1, value2, "typNm");
            return (Criteria) this;
        }

        public Criteria andTypNmNotBetween(String value1, String value2) {
            addCriterion("typ_nm not between", value1, value2, "typNm");
            return (Criteria) this;
        }

        public Criteria andBaseRefIsNull() {
            addCriterion("base_ref is null");
            return (Criteria) this;
        }

        public Criteria andBaseRefIsNotNull() {
            addCriterion("base_ref is not null");
            return (Criteria) this;
        }

        public Criteria andBaseRefEqualTo(BigDecimal value) {
            addCriterion("base_ref =", value, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefNotEqualTo(BigDecimal value) {
            addCriterion("base_ref <>", value, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefGreaterThan(BigDecimal value) {
            addCriterion("base_ref >", value, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_ref >=", value, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefLessThan(BigDecimal value) {
            addCriterion("base_ref <", value, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_ref <=", value, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefIn(List<BigDecimal> values) {
            addCriterion("base_ref in", values, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefNotIn(List<BigDecimal> values) {
            addCriterion("base_ref not in", values, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_ref between", value1, value2, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseRefNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_ref not between", value1, value2, "baseRef");
            return (Criteria) this;
        }

        public Criteria andBaseAmtIsNull() {
            addCriterion("base_amt is null");
            return (Criteria) this;
        }

        public Criteria andBaseAmtIsNotNull() {
            addCriterion("base_amt is not null");
            return (Criteria) this;
        }

        public Criteria andBaseAmtEqualTo(BigDecimal value) {
            addCriterion("base_amt =", value, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtNotEqualTo(BigDecimal value) {
            addCriterion("base_amt <>", value, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtGreaterThan(BigDecimal value) {
            addCriterion("base_amt >", value, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_amt >=", value, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtLessThan(BigDecimal value) {
            addCriterion("base_amt <", value, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_amt <=", value, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtIn(List<BigDecimal> values) {
            addCriterion("base_amt in", values, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtNotIn(List<BigDecimal> values) {
            addCriterion("base_amt not in", values, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_amt between", value1, value2, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andBaseAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_amt not between", value1, value2, "baseAmt");
            return (Criteria) this;
        }

        public Criteria andSpecRefIsNull() {
            addCriterion("spec_ref is null");
            return (Criteria) this;
        }

        public Criteria andSpecRefIsNotNull() {
            addCriterion("spec_ref is not null");
            return (Criteria) this;
        }

        public Criteria andSpecRefEqualTo(BigDecimal value) {
            addCriterion("spec_ref =", value, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefNotEqualTo(BigDecimal value) {
            addCriterion("spec_ref <>", value, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefGreaterThan(BigDecimal value) {
            addCriterion("spec_ref >", value, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_ref >=", value, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefLessThan(BigDecimal value) {
            addCriterion("spec_ref <", value, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_ref <=", value, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefIn(List<BigDecimal> values) {
            addCriterion("spec_ref in", values, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefNotIn(List<BigDecimal> values) {
            addCriterion("spec_ref not in", values, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_ref between", value1, value2, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecRefNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_ref not between", value1, value2, "specRef");
            return (Criteria) this;
        }

        public Criteria andSpecAmtIsNull() {
            addCriterion("spec_amt is null");
            return (Criteria) this;
        }

        public Criteria andSpecAmtIsNotNull() {
            addCriterion("spec_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSpecAmtEqualTo(BigDecimal value) {
            addCriterion("spec_amt =", value, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtNotEqualTo(BigDecimal value) {
            addCriterion("spec_amt <>", value, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtGreaterThan(BigDecimal value) {
            addCriterion("spec_amt >", value, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_amt >=", value, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtLessThan(BigDecimal value) {
            addCriterion("spec_amt <", value, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_amt <=", value, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtIn(List<BigDecimal> values) {
            addCriterion("spec_amt in", values, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtNotIn(List<BigDecimal> values) {
            addCriterion("spec_amt not in", values, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_amt between", value1, value2, "specAmt");
            return (Criteria) this;
        }

        public Criteria andSpecAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_amt not between", value1, value2, "specAmt");
            return (Criteria) this;
        }

        public Criteria andOperUserIsNull() {
            addCriterion("oper_user is null");
            return (Criteria) this;
        }

        public Criteria andOperUserIsNotNull() {
            addCriterion("oper_user is not null");
            return (Criteria) this;
        }

        public Criteria andOperUserEqualTo(String value) {
            addCriterion("oper_user =", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotEqualTo(String value) {
            addCriterion("oper_user <>", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserGreaterThan(String value) {
            addCriterion("oper_user >", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserGreaterThanOrEqualTo(String value) {
            addCriterion("oper_user >=", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserLessThan(String value) {
            addCriterion("oper_user <", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserLessThanOrEqualTo(String value) {
            addCriterion("oper_user <=", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserLike(String value) {
            addCriterion("oper_user like", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotLike(String value) {
            addCriterion("oper_user not like", value, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserIn(List<String> values) {
            addCriterion("oper_user in", values, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotIn(List<String> values) {
            addCriterion("oper_user not in", values, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserBetween(String value1, String value2) {
            addCriterion("oper_user between", value1, value2, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperUserNotBetween(String value1, String value2) {
            addCriterion("oper_user not between", value1, value2, "operUser");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("oper_time is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("oper_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Date value) {
            addCriterion("oper_time =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Date value) {
            addCriterion("oper_time <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Date value) {
            addCriterion("oper_time >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oper_time >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Date value) {
            addCriterion("oper_time <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("oper_time <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Date> values) {
            addCriterion("oper_time in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Date> values) {
            addCriterion("oper_time not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Date value1, Date value2) {
            addCriterion("oper_time between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("oper_time not between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bas_ypet
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 03 09:37:18 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bas_ypet
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}