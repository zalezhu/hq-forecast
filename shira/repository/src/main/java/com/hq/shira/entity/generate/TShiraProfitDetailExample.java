package com.hq.shira.entity.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TShiraProfitDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public TShiraProfitDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
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
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
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

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(String value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(String value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(String value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(String value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(String value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLike(String value) {
            addCriterion("trade_id like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotLike(String value) {
            addCriterion("trade_id not like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<String> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<String> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(String value1, String value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(String value1, String value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdIsNull() {
            addCriterion("agent_core_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdIsNotNull() {
            addCriterion("agent_core_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdEqualTo(Integer value) {
            addCriterion("agent_core_id =", value, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdNotEqualTo(Integer value) {
            addCriterion("agent_core_id <>", value, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdGreaterThan(Integer value) {
            addCriterion("agent_core_id >", value, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_core_id >=", value, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdLessThan(Integer value) {
            addCriterion("agent_core_id <", value, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_core_id <=", value, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdIn(List<Integer> values) {
            addCriterion("agent_core_id in", values, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdNotIn(List<Integer> values) {
            addCriterion("agent_core_id not in", values, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_core_id between", value1, value2, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andAgentCoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_core_id not between", value1, value2, "agentCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdIsNull() {
            addCriterion("trade_core_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdIsNotNull() {
            addCriterion("trade_core_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdEqualTo(Integer value) {
            addCriterion("trade_core_id =", value, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdNotEqualTo(Integer value) {
            addCriterion("trade_core_id <>", value, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdGreaterThan(Integer value) {
            addCriterion("trade_core_id >", value, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_core_id >=", value, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdLessThan(Integer value) {
            addCriterion("trade_core_id <", value, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_core_id <=", value, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdIn(List<Integer> values) {
            addCriterion("trade_core_id in", values, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdNotIn(List<Integer> values) {
            addCriterion("trade_core_id not in", values, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_core_id between", value1, value2, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andTradeCoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_core_id not between", value1, value2, "tradeCoreId");
            return (Criteria) this;
        }

        public Criteria andPrdIdIsNull() {
            addCriterion("prd_id is null");
            return (Criteria) this;
        }

        public Criteria andPrdIdIsNotNull() {
            addCriterion("prd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrdIdEqualTo(Integer value) {
            addCriterion("prd_id =", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotEqualTo(Integer value) {
            addCriterion("prd_id <>", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThan(Integer value) {
            addCriterion("prd_id >", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_id >=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThan(Integer value) {
            addCriterion("prd_id <", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("prd_id <=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdIn(List<Integer> values) {
            addCriterion("prd_id in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotIn(List<Integer> values) {
            addCriterion("prd_id not in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdBetween(Integer value1, Integer value2) {
            addCriterion("prd_id between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_id not between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitIsNull() {
            addCriterion("total_sub_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitIsNotNull() {
            addCriterion("total_sub_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitEqualTo(Long value) {
            addCriterion("total_sub_profit =", value, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitNotEqualTo(Long value) {
            addCriterion("total_sub_profit <>", value, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitGreaterThan(Long value) {
            addCriterion("total_sub_profit >", value, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitGreaterThanOrEqualTo(Long value) {
            addCriterion("total_sub_profit >=", value, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitLessThan(Long value) {
            addCriterion("total_sub_profit <", value, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitLessThanOrEqualTo(Long value) {
            addCriterion("total_sub_profit <=", value, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitIn(List<Long> values) {
            addCriterion("total_sub_profit in", values, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitNotIn(List<Long> values) {
            addCriterion("total_sub_profit not in", values, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitBetween(Long value1, Long value2) {
            addCriterion("total_sub_profit between", value1, value2, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andTotalSubProfitNotBetween(Long value1, Long value2) {
            addCriterion("total_sub_profit not between", value1, value2, "totalSubProfit");
            return (Criteria) this;
        }

        public Criteria andProfitValueIsNull() {
            addCriterion("profit_value is null");
            return (Criteria) this;
        }

        public Criteria andProfitValueIsNotNull() {
            addCriterion("profit_value is not null");
            return (Criteria) this;
        }

        public Criteria andProfitValueEqualTo(Long value) {
            addCriterion("profit_value =", value, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueNotEqualTo(Long value) {
            addCriterion("profit_value <>", value, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueGreaterThan(Long value) {
            addCriterion("profit_value >", value, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueGreaterThanOrEqualTo(Long value) {
            addCriterion("profit_value >=", value, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueLessThan(Long value) {
            addCriterion("profit_value <", value, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueLessThanOrEqualTo(Long value) {
            addCriterion("profit_value <=", value, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueIn(List<Long> values) {
            addCriterion("profit_value in", values, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueNotIn(List<Long> values) {
            addCriterion("profit_value not in", values, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueBetween(Long value1, Long value2) {
            addCriterion("profit_value between", value1, value2, "profitValue");
            return (Criteria) this;
        }

        public Criteria andProfitValueNotBetween(Long value1, Long value2) {
            addCriterion("profit_value not between", value1, value2, "profitValue");
            return (Criteria) this;
        }

        public Criteria andDistConfIdIsNull() {
            addCriterion("dist_conf_id is null");
            return (Criteria) this;
        }

        public Criteria andDistConfIdIsNotNull() {
            addCriterion("dist_conf_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistConfIdEqualTo(Integer value) {
            addCriterion("dist_conf_id =", value, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdNotEqualTo(Integer value) {
            addCriterion("dist_conf_id <>", value, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdGreaterThan(Integer value) {
            addCriterion("dist_conf_id >", value, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dist_conf_id >=", value, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdLessThan(Integer value) {
            addCriterion("dist_conf_id <", value, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdLessThanOrEqualTo(Integer value) {
            addCriterion("dist_conf_id <=", value, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdIn(List<Integer> values) {
            addCriterion("dist_conf_id in", values, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdNotIn(List<Integer> values) {
            addCriterion("dist_conf_id not in", values, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdBetween(Integer value1, Integer value2) {
            addCriterion("dist_conf_id between", value1, value2, "distConfId");
            return (Criteria) this;
        }

        public Criteria andDistConfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dist_conf_id not between", value1, value2, "distConfId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 05 23:04:28 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_shira_profit_detail
     *
     * @mbg.generated Wed Apr 05 23:04:28 CST 2017
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