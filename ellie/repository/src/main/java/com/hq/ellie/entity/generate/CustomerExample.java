package com.hq.ellie.entity.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
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
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNull() {
            addCriterion("mchId is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("mchId is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(String value) {
            addCriterion("mchId =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(String value) {
            addCriterion("mchId <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(String value) {
            addCriterion("mchId >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("mchId >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(String value) {
            addCriterion("mchId <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(String value) {
            addCriterion("mchId <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLike(String value) {
            addCriterion("mchId like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotLike(String value) {
            addCriterion("mchId not like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<String> values) {
            addCriterion("mchId in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<String> values) {
            addCriterion("mchId not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(String value1, String value2) {
            addCriterion("mchId between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(String value1, String value2) {
            addCriterion("mchId not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andPlat_typeIsNull() {
            addCriterion("plat_type is null");
            return (Criteria) this;
        }

        public Criteria andPlat_typeIsNotNull() {
            addCriterion("plat_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlat_typeEqualTo(Integer value) {
            addCriterion("plat_type =", value, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeNotEqualTo(Integer value) {
            addCriterion("plat_type <>", value, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeGreaterThan(Integer value) {
            addCriterion("plat_type >", value, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plat_type >=", value, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeLessThan(Integer value) {
            addCriterion("plat_type <", value, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeLessThanOrEqualTo(Integer value) {
            addCriterion("plat_type <=", value, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeIn(List<Integer> values) {
            addCriterion("plat_type in", values, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeNotIn(List<Integer> values) {
            addCriterion("plat_type not in", values, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeBetween(Integer value1, Integer value2) {
            addCriterion("plat_type between", value1, value2, "plat_type");
            return (Criteria) this;
        }

        public Criteria andPlat_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("plat_type not between", value1, value2, "plat_type");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andProfile_photoIsNull() {
            addCriterion("profile_photo is null");
            return (Criteria) this;
        }

        public Criteria andProfile_photoIsNotNull() {
            addCriterion("profile_photo is not null");
            return (Criteria) this;
        }

        public Criteria andProfile_photoEqualTo(String value) {
            addCriterion("profile_photo =", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoNotEqualTo(String value) {
            addCriterion("profile_photo <>", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoGreaterThan(String value) {
            addCriterion("profile_photo >", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoGreaterThanOrEqualTo(String value) {
            addCriterion("profile_photo >=", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoLessThan(String value) {
            addCriterion("profile_photo <", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoLessThanOrEqualTo(String value) {
            addCriterion("profile_photo <=", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoLike(String value) {
            addCriterion("profile_photo like", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoNotLike(String value) {
            addCriterion("profile_photo not like", value, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoIn(List<String> values) {
            addCriterion("profile_photo in", values, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoNotIn(List<String> values) {
            addCriterion("profile_photo not in", values, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoBetween(String value1, String value2) {
            addCriterion("profile_photo between", value1, value2, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andProfile_photoNotBetween(String value1, String value2) {
            addCriterion("profile_photo not between", value1, value2, "profile_photo");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andVisit_numIsNull() {
            addCriterion("visit_num is null");
            return (Criteria) this;
        }

        public Criteria andVisit_numIsNotNull() {
            addCriterion("visit_num is not null");
            return (Criteria) this;
        }

        public Criteria andVisit_numEqualTo(Integer value) {
            addCriterion("visit_num =", value, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numNotEqualTo(Integer value) {
            addCriterion("visit_num <>", value, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numGreaterThan(Integer value) {
            addCriterion("visit_num >", value, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_num >=", value, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numLessThan(Integer value) {
            addCriterion("visit_num <", value, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numLessThanOrEqualTo(Integer value) {
            addCriterion("visit_num <=", value, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numIn(List<Integer> values) {
            addCriterion("visit_num in", values, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numNotIn(List<Integer> values) {
            addCriterion("visit_num not in", values, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numBetween(Integer value1, Integer value2) {
            addCriterion("visit_num between", value1, value2, "visit_num");
            return (Criteria) this;
        }

        public Criteria andVisit_numNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_num not between", value1, value2, "visit_num");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeIsNull() {
            addCriterion("lastvisit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeIsNotNull() {
            addCriterion("lastvisit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeEqualTo(Date value) {
            addCriterion("lastvisit_time =", value, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeNotEqualTo(Date value) {
            addCriterion("lastvisit_time <>", value, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeGreaterThan(Date value) {
            addCriterion("lastvisit_time >", value, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastvisit_time >=", value, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeLessThan(Date value) {
            addCriterion("lastvisit_time <", value, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeLessThanOrEqualTo(Date value) {
            addCriterion("lastvisit_time <=", value, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeIn(List<Date> values) {
            addCriterion("lastvisit_time in", values, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeNotIn(List<Date> values) {
            addCriterion("lastvisit_time not in", values, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeBetween(Date value1, Date value2) {
            addCriterion("lastvisit_time between", value1, value2, "lastvisit_time");
            return (Criteria) this;
        }

        public Criteria andLastvisit_timeNotBetween(Date value1, Date value2) {
            addCriterion("lastvisit_time not between", value1, value2, "lastvisit_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated do_not_delete_during_merge Tue Feb 21 01:23:58 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated Tue Feb 21 01:23:58 CST 2017
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