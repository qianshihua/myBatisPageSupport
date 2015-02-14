package com.ailk.system.dal.ibatis.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected Integer limitClauseStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected Integer limitClauseCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected String suffix;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public SysConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected SysConfigExample(SysConfigExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void setLimitClauseStart(Integer limitClauseStart) {
        this.limitClauseStart = limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public Integer getLimitClauseStart() {
        return limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void setLimitClauseCount(Integer limitClauseCount) {
        this.limitClauseCount = limitClauseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public Integer getLimitClauseCount() {
        return limitClauseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
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
     * This method corresponds to the database table sys_config
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
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
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
     * This class corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andCfgTypeIsNull() {
            addCriterion("CFG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCfgTypeIsNotNull() {
            addCriterion("CFG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCfgTypeEqualTo(String value) {
            addCriterion("CFG_TYPE =", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotEqualTo(String value) {
            addCriterion("CFG_TYPE <>", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeGreaterThan(String value) {
            addCriterion("CFG_TYPE >", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CFG_TYPE >=", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeLessThan(String value) {
            addCriterion("CFG_TYPE <", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeLessThanOrEqualTo(String value) {
            addCriterion("CFG_TYPE <=", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeLike(String value) {
            addCriterion("CFG_TYPE like", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotLike(String value) {
            addCriterion("CFG_TYPE not like", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeIn(List<String> values) {
            addCriterion("CFG_TYPE in", values, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotIn(List<String> values) {
            addCriterion("CFG_TYPE not in", values, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeBetween(String value1, String value2) {
            addCriterion("CFG_TYPE between", value1, value2, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotBetween(String value1, String value2) {
            addCriterion("CFG_TYPE not between", value1, value2, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgKeyIsNull() {
            addCriterion("CFG_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCfgKeyIsNotNull() {
            addCriterion("CFG_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCfgKeyEqualTo(String value) {
            addCriterion("CFG_KEY =", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotEqualTo(String value) {
            addCriterion("CFG_KEY <>", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyGreaterThan(String value) {
            addCriterion("CFG_KEY >", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyGreaterThanOrEqualTo(String value) {
            addCriterion("CFG_KEY >=", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyLessThan(String value) {
            addCriterion("CFG_KEY <", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyLessThanOrEqualTo(String value) {
            addCriterion("CFG_KEY <=", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyLike(String value) {
            addCriterion("CFG_KEY like", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotLike(String value) {
            addCriterion("CFG_KEY not like", value, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyIn(List<String> values) {
            addCriterion("CFG_KEY in", values, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotIn(List<String> values) {
            addCriterion("CFG_KEY not in", values, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyBetween(String value1, String value2) {
            addCriterion("CFG_KEY between", value1, value2, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgKeyNotBetween(String value1, String value2) {
            addCriterion("CFG_KEY not between", value1, value2, "cfgKey");
            return (Criteria) this;
        }

        public Criteria andCfgValueIsNull() {
            addCriterion("CFG_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCfgValueIsNotNull() {
            addCriterion("CFG_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCfgValueEqualTo(String value) {
            addCriterion("CFG_VALUE =", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotEqualTo(String value) {
            addCriterion("CFG_VALUE <>", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueGreaterThan(String value) {
            addCriterion("CFG_VALUE >", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueGreaterThanOrEqualTo(String value) {
            addCriterion("CFG_VALUE >=", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLessThan(String value) {
            addCriterion("CFG_VALUE <", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLessThanOrEqualTo(String value) {
            addCriterion("CFG_VALUE <=", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLike(String value) {
            addCriterion("CFG_VALUE like", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotLike(String value) {
            addCriterion("CFG_VALUE not like", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueIn(List<String> values) {
            addCriterion("CFG_VALUE in", values, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotIn(List<String> values) {
            addCriterion("CFG_VALUE not in", values, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueBetween(String value1, String value2) {
            addCriterion("CFG_VALUE between", value1, value2, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotBetween(String value1, String value2) {
            addCriterion("CFG_VALUE not between", value1, value2, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgCommentIsNull() {
            addCriterion("CFG_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andCfgCommentIsNotNull() {
            addCriterion("CFG_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCfgCommentEqualTo(String value) {
            addCriterion("CFG_COMMENT =", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentNotEqualTo(String value) {
            addCriterion("CFG_COMMENT <>", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentGreaterThan(String value) {
            addCriterion("CFG_COMMENT >", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentGreaterThanOrEqualTo(String value) {
            addCriterion("CFG_COMMENT >=", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentLessThan(String value) {
            addCriterion("CFG_COMMENT <", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentLessThanOrEqualTo(String value) {
            addCriterion("CFG_COMMENT <=", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentLike(String value) {
            addCriterion("CFG_COMMENT like", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentNotLike(String value) {
            addCriterion("CFG_COMMENT not like", value, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentIn(List<String> values) {
            addCriterion("CFG_COMMENT in", values, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentNotIn(List<String> values) {
            addCriterion("CFG_COMMENT not in", values, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentBetween(String value1, String value2) {
            addCriterion("CFG_COMMENT between", value1, value2, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andCfgCommentNotBetween(String value1, String value2) {
            addCriterion("CFG_COMMENT not between", value1, value2, "cfgComment");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("UPDATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("UPDATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(String value) {
            addCriterion("UPDATE_FLAG =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(String value) {
            addCriterion("UPDATE_FLAG <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(String value) {
            addCriterion("UPDATE_FLAG >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_FLAG >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(String value) {
            addCriterion("UPDATE_FLAG <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_FLAG <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLike(String value) {
            addCriterion("UPDATE_FLAG like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotLike(String value) {
            addCriterion("UPDATE_FLAG not like", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<String> values) {
            addCriterion("UPDATE_FLAG in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<String> values) {
            addCriterion("UPDATE_FLAG not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(String value1, String value2) {
            addCriterion("UPDATE_FLAG between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(String value1, String value2) {
            addCriterion("UPDATE_FLAG not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_config
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}