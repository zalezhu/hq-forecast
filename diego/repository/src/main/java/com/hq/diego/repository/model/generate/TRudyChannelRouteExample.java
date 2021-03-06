package com.hq.diego.repository.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TRudyChannelRouteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public TRudyChannelRouteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
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
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(Integer value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(Integer value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(Integer value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(Integer value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(Integer value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<Integer> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<Integer> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(Integer value1, Integer value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andCostRateIsNull() {
            addCriterion("cost_rate is null");
            return (Criteria) this;
        }

        public Criteria andCostRateIsNotNull() {
            addCriterion("cost_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCostRateEqualTo(BigDecimal value) {
            addCriterion("cost_rate =", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateNotEqualTo(BigDecimal value) {
            addCriterion("cost_rate <>", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateGreaterThan(BigDecimal value) {
            addCriterion("cost_rate >", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_rate >=", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateLessThan(BigDecimal value) {
            addCriterion("cost_rate <", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_rate <=", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateIn(List<BigDecimal> values) {
            addCriterion("cost_rate in", values, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateNotIn(List<BigDecimal> values) {
            addCriterion("cost_rate not in", values, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_rate between", value1, value2, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_rate not between", value1, value2, "costRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateIsNull() {
            addCriterion("guiding_rate is null");
            return (Criteria) this;
        }

        public Criteria andGuidingRateIsNotNull() {
            addCriterion("guiding_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGuidingRateEqualTo(BigDecimal value) {
            addCriterion("guiding_rate =", value, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateNotEqualTo(BigDecimal value) {
            addCriterion("guiding_rate <>", value, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateGreaterThan(BigDecimal value) {
            addCriterion("guiding_rate >", value, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guiding_rate >=", value, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateLessThan(BigDecimal value) {
            addCriterion("guiding_rate <", value, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guiding_rate <=", value, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateIn(List<BigDecimal> values) {
            addCriterion("guiding_rate in", values, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateNotIn(List<BigDecimal> values) {
            addCriterion("guiding_rate not in", values, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guiding_rate between", value1, value2, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andGuidingRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guiding_rate not between", value1, value2, "guidingRate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTradeServiceIsNull() {
            addCriterion("trade_service is null");
            return (Criteria) this;
        }

        public Criteria andTradeServiceIsNotNull() {
            addCriterion("trade_service is not null");
            return (Criteria) this;
        }

        public Criteria andTradeServiceEqualTo(String value) {
            addCriterion("trade_service =", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceNotEqualTo(String value) {
            addCriterion("trade_service <>", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceGreaterThan(String value) {
            addCriterion("trade_service >", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceGreaterThanOrEqualTo(String value) {
            addCriterion("trade_service >=", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceLessThan(String value) {
            addCriterion("trade_service <", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceLessThanOrEqualTo(String value) {
            addCriterion("trade_service <=", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceLike(String value) {
            addCriterion("trade_service like", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceNotLike(String value) {
            addCriterion("trade_service not like", value, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceIn(List<String> values) {
            addCriterion("trade_service in", values, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceNotIn(List<String> values) {
            addCriterion("trade_service not in", values, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceBetween(String value1, String value2) {
            addCriterion("trade_service between", value1, value2, "tradeService");
            return (Criteria) this;
        }

        public Criteria andTradeServiceNotBetween(String value1, String value2) {
            addCriterion("trade_service not between", value1, value2, "tradeService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceIsNull() {
            addCriterion("query_service is null");
            return (Criteria) this;
        }

        public Criteria andQueryServiceIsNotNull() {
            addCriterion("query_service is not null");
            return (Criteria) this;
        }

        public Criteria andQueryServiceEqualTo(String value) {
            addCriterion("query_service =", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceNotEqualTo(String value) {
            addCriterion("query_service <>", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceGreaterThan(String value) {
            addCriterion("query_service >", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceGreaterThanOrEqualTo(String value) {
            addCriterion("query_service >=", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceLessThan(String value) {
            addCriterion("query_service <", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceLessThanOrEqualTo(String value) {
            addCriterion("query_service <=", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceLike(String value) {
            addCriterion("query_service like", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceNotLike(String value) {
            addCriterion("query_service not like", value, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceIn(List<String> values) {
            addCriterion("query_service in", values, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceNotIn(List<String> values) {
            addCriterion("query_service not in", values, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceBetween(String value1, String value2) {
            addCriterion("query_service between", value1, value2, "queryService");
            return (Criteria) this;
        }

        public Criteria andQueryServiceNotBetween(String value1, String value2) {
            addCriterion("query_service not between", value1, value2, "queryService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceIsNull() {
            addCriterion("cancel_service is null");
            return (Criteria) this;
        }

        public Criteria andCancelServiceIsNotNull() {
            addCriterion("cancel_service is not null");
            return (Criteria) this;
        }

        public Criteria andCancelServiceEqualTo(String value) {
            addCriterion("cancel_service =", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceNotEqualTo(String value) {
            addCriterion("cancel_service <>", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceGreaterThan(String value) {
            addCriterion("cancel_service >", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_service >=", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceLessThan(String value) {
            addCriterion("cancel_service <", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceLessThanOrEqualTo(String value) {
            addCriterion("cancel_service <=", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceLike(String value) {
            addCriterion("cancel_service like", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceNotLike(String value) {
            addCriterion("cancel_service not like", value, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceIn(List<String> values) {
            addCriterion("cancel_service in", values, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceNotIn(List<String> values) {
            addCriterion("cancel_service not in", values, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceBetween(String value1, String value2) {
            addCriterion("cancel_service between", value1, value2, "cancelService");
            return (Criteria) this;
        }

        public Criteria andCancelServiceNotBetween(String value1, String value2) {
            addCriterion("cancel_service not between", value1, value2, "cancelService");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 22 18:29:43 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
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