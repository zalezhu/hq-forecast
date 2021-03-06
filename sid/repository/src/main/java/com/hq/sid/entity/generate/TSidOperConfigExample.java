package com.hq.sid.entity.generate;

import java.util.ArrayList;
import java.util.List;

public class TSidOperConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public TSidOperConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
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
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
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

        public Criteria andOperIdIsNull() {
            addCriterion("oper_id is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(Integer value) {
            addCriterion("oper_id =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(Integer value) {
            addCriterion("oper_id <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(Integer value) {
            addCriterion("oper_id >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oper_id >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(Integer value) {
            addCriterion("oper_id <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(Integer value) {
            addCriterion("oper_id <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<Integer> values) {
            addCriterion("oper_id in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<Integer> values) {
            addCriterion("oper_id not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(Integer value1, Integer value2) {
            addCriterion("oper_id between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oper_id not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNull() {
            addCriterion("is_push is null");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNotNull() {
            addCriterion("is_push is not null");
            return (Criteria) this;
        }

        public Criteria andIsPushEqualTo(Boolean value) {
            addCriterion("is_push =", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotEqualTo(Boolean value) {
            addCriterion("is_push <>", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThan(Boolean value) {
            addCriterion("is_push >", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_push >=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThan(Boolean value) {
            addCriterion("is_push <", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThanOrEqualTo(Boolean value) {
            addCriterion("is_push <=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushIn(List<Boolean> values) {
            addCriterion("is_push in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotIn(List<Boolean> values) {
            addCriterion("is_push not in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushBetween(Boolean value1, Boolean value2) {
            addCriterion("is_push between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_push not between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordIsNull() {
            addCriterion("refund_password is null");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordIsNotNull() {
            addCriterion("refund_password is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordEqualTo(String value) {
            addCriterion("refund_password =", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordNotEqualTo(String value) {
            addCriterion("refund_password <>", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordGreaterThan(String value) {
            addCriterion("refund_password >", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("refund_password >=", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordLessThan(String value) {
            addCriterion("refund_password <", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordLessThanOrEqualTo(String value) {
            addCriterion("refund_password <=", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordLike(String value) {
            addCriterion("refund_password like", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordNotLike(String value) {
            addCriterion("refund_password not like", value, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordIn(List<String> values) {
            addCriterion("refund_password in", values, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordNotIn(List<String> values) {
            addCriterion("refund_password not in", values, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordBetween(String value1, String value2) {
            addCriterion("refund_password between", value1, value2, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundPasswordNotBetween(String value1, String value2) {
            addCriterion("refund_password not between", value1, value2, "refundPassword");
            return (Criteria) this;
        }

        public Criteria andRefundAuthIsNull() {
            addCriterion("refund_auth is null");
            return (Criteria) this;
        }

        public Criteria andRefundAuthIsNotNull() {
            addCriterion("refund_auth is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAuthEqualTo(String value) {
            addCriterion("refund_auth =", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthNotEqualTo(String value) {
            addCriterion("refund_auth <>", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthGreaterThan(String value) {
            addCriterion("refund_auth >", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthGreaterThanOrEqualTo(String value) {
            addCriterion("refund_auth >=", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthLessThan(String value) {
            addCriterion("refund_auth <", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthLessThanOrEqualTo(String value) {
            addCriterion("refund_auth <=", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthLike(String value) {
            addCriterion("refund_auth like", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthNotLike(String value) {
            addCriterion("refund_auth not like", value, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthIn(List<String> values) {
            addCriterion("refund_auth in", values, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthNotIn(List<String> values) {
            addCriterion("refund_auth not in", values, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthBetween(String value1, String value2) {
            addCriterion("refund_auth between", value1, value2, "refundAuth");
            return (Criteria) this;
        }

        public Criteria andRefundAuthNotBetween(String value1, String value2) {
            addCriterion("refund_auth not between", value1, value2, "refundAuth");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated do_not_delete_during_merge Tue Feb 21 20:05:58 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sid_oper_config
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
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