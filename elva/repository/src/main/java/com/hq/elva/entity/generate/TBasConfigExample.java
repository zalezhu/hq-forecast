package com.hq.elva.entity.generate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBasConfigExample implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public TBasConfigExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
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

		public Criteria andConfigIdIsNull() {
			addCriterion("config_id is null");
			return (Criteria) this;
		}

		public Criteria andConfigIdIsNotNull() {
			addCriterion("config_id is not null");
			return (Criteria) this;
		}

		public Criteria andConfigIdEqualTo(Long value) {
			addCriterion("config_id =", value, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdNotEqualTo(Long value) {
			addCriterion("config_id <>", value, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdGreaterThan(Long value) {
			addCriterion("config_id >", value, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdGreaterThanOrEqualTo(Long value) {
			addCriterion("config_id >=", value, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdLessThan(Long value) {
			addCriterion("config_id <", value, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdLessThanOrEqualTo(Long value) {
			addCriterion("config_id <=", value, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdIn(List<Long> values) {
			addCriterion("config_id in", values, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdNotIn(List<Long> values) {
			addCriterion("config_id not in", values, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdBetween(Long value1, Long value2) {
			addCriterion("config_id between", value1, value2, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigIdNotBetween(Long value1, Long value2) {
			addCriterion("config_id not between", value1, value2, "configId");
			return (Criteria) this;
		}

		public Criteria andConfigNameIsNull() {
			addCriterion("config_name is null");
			return (Criteria) this;
		}

		public Criteria andConfigNameIsNotNull() {
			addCriterion("config_name is not null");
			return (Criteria) this;
		}

		public Criteria andConfigNameEqualTo(String value) {
			addCriterion("config_name =", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotEqualTo(String value) {
			addCriterion("config_name <>", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameGreaterThan(String value) {
			addCriterion("config_name >", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
			addCriterion("config_name >=", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameLessThan(String value) {
			addCriterion("config_name <", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameLessThanOrEqualTo(String value) {
			addCriterion("config_name <=", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameLike(String value) {
			addCriterion("config_name like", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotLike(String value) {
			addCriterion("config_name not like", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameIn(List<String> values) {
			addCriterion("config_name in", values, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotIn(List<String> values) {
			addCriterion("config_name not in", values, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameBetween(String value1, String value2) {
			addCriterion("config_name between", value1, value2, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotBetween(String value1, String value2) {
			addCriterion("config_name not between", value1, value2, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigValueIsNull() {
			addCriterion("config_value is null");
			return (Criteria) this;
		}

		public Criteria andConfigValueIsNotNull() {
			addCriterion("config_value is not null");
			return (Criteria) this;
		}

		public Criteria andConfigValueEqualTo(String value) {
			addCriterion("config_value =", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotEqualTo(String value) {
			addCriterion("config_value <>", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueGreaterThan(String value) {
			addCriterion("config_value >", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
			addCriterion("config_value >=", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueLessThan(String value) {
			addCriterion("config_value <", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueLessThanOrEqualTo(String value) {
			addCriterion("config_value <=", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueLike(String value) {
			addCriterion("config_value like", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotLike(String value) {
			addCriterion("config_value not like", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueIn(List<String> values) {
			addCriterion("config_value in", values, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotIn(List<String> values) {
			addCriterion("config_value not in", values, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueBetween(String value1, String value2) {
			addCriterion("config_value between", value1, value2, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotBetween(String value1, String value2) {
			addCriterion("config_value not between", value1, value2, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigExpIsNull() {
			addCriterion("config_exp is null");
			return (Criteria) this;
		}

		public Criteria andConfigExpIsNotNull() {
			addCriterion("config_exp is not null");
			return (Criteria) this;
		}

		public Criteria andConfigExpEqualTo(String value) {
			addCriterion("config_exp =", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpNotEqualTo(String value) {
			addCriterion("config_exp <>", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpGreaterThan(String value) {
			addCriterion("config_exp >", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpGreaterThanOrEqualTo(String value) {
			addCriterion("config_exp >=", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpLessThan(String value) {
			addCriterion("config_exp <", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpLessThanOrEqualTo(String value) {
			addCriterion("config_exp <=", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpLike(String value) {
			addCriterion("config_exp like", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpNotLike(String value) {
			addCriterion("config_exp not like", value, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpIn(List<String> values) {
			addCriterion("config_exp in", values, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpNotIn(List<String> values) {
			addCriterion("config_exp not in", values, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpBetween(String value1, String value2) {
			addCriterion("config_exp between", value1, value2, "configExp");
			return (Criteria) this;
		}

		public Criteria andConfigExpNotBetween(String value1, String value2) {
			addCriterion("config_exp not between", value1, value2, "configExp");
			return (Criteria) this;
		}

		public Criteria andServiceNameIsNull() {
			addCriterion("service_name is null");
			return (Criteria) this;
		}

		public Criteria andServiceNameIsNotNull() {
			addCriterion("service_name is not null");
			return (Criteria) this;
		}

		public Criteria andServiceNameEqualTo(String value) {
			addCriterion("service_name =", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotEqualTo(String value) {
			addCriterion("service_name <>", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameGreaterThan(String value) {
			addCriterion("service_name >", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
			addCriterion("service_name >=", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLessThan(String value) {
			addCriterion("service_name <", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLessThanOrEqualTo(String value) {
			addCriterion("service_name <=", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLike(String value) {
			addCriterion("service_name like", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotLike(String value) {
			addCriterion("service_name not like", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameIn(List<String> values) {
			addCriterion("service_name in", values, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotIn(List<String> values) {
			addCriterion("service_name not in", values, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameBetween(String value1, String value2) {
			addCriterion("service_name between", value1, value2, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotBetween(String value1, String value2) {
			addCriterion("service_name not between", value1, value2, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceIpIsNull() {
			addCriterion("service_ip is null");
			return (Criteria) this;
		}

		public Criteria andServiceIpIsNotNull() {
			addCriterion("service_ip is not null");
			return (Criteria) this;
		}

		public Criteria andServiceIpEqualTo(String value) {
			addCriterion("service_ip =", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpNotEqualTo(String value) {
			addCriterion("service_ip <>", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpGreaterThan(String value) {
			addCriterion("service_ip >", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpGreaterThanOrEqualTo(String value) {
			addCriterion("service_ip >=", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpLessThan(String value) {
			addCriterion("service_ip <", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpLessThanOrEqualTo(String value) {
			addCriterion("service_ip <=", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpLike(String value) {
			addCriterion("service_ip like", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpNotLike(String value) {
			addCriterion("service_ip not like", value, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpIn(List<String> values) {
			addCriterion("service_ip in", values, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpNotIn(List<String> values) {
			addCriterion("service_ip not in", values, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpBetween(String value1, String value2) {
			addCriterion("service_ip between", value1, value2, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andServiceIpNotBetween(String value1, String value2) {
			addCriterion("service_ip not between", value1, value2, "serviceIp");
			return (Criteria) this;
		}

		public Criteria andDynamicIsNull() {
			addCriterion("dynamic is null");
			return (Criteria) this;
		}

		public Criteria andDynamicIsNotNull() {
			addCriterion("dynamic is not null");
			return (Criteria) this;
		}

		public Criteria andDynamicEqualTo(String value) {
			addCriterion("dynamic =", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicNotEqualTo(String value) {
			addCriterion("dynamic <>", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicGreaterThan(String value) {
			addCriterion("dynamic >", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicGreaterThanOrEqualTo(String value) {
			addCriterion("dynamic >=", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicLessThan(String value) {
			addCriterion("dynamic <", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicLessThanOrEqualTo(String value) {
			addCriterion("dynamic <=", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicLike(String value) {
			addCriterion("dynamic like", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicNotLike(String value) {
			addCriterion("dynamic not like", value, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicIn(List<String> values) {
			addCriterion("dynamic in", values, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicNotIn(List<String> values) {
			addCriterion("dynamic not in", values, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicBetween(String value1, String value2) {
			addCriterion("dynamic between", value1, value2, "dynamic");
			return (Criteria) this;
		}

		public Criteria andDynamicNotBetween(String value1, String value2) {
			addCriterion("dynamic not between", value1, value2, "dynamic");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_bas_config
	 * @mbggenerated  Mon Nov 07 14:10:41 CST 2016
	 */
	public static class Criterion implements Serializable {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;
		/**
		* This field was generated by MyBatis Generator. This field corresponds to the database table t_bas_config
		* @mbggenerated  Mon Nov 07 14:10:41 CST 2016
		*/
		private static final long serialVersionUID = 1L;

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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bas_config
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 07 14:09:58 CST 2016
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_bas_config
         *
         * @mbggenerated Mon Nov 07 14:09:58 CST 2016
         */
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }
}