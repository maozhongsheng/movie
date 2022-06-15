package com.reptile.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovelTvnumsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovelTvnumsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andTvnameIsNull() {
            addCriterion("tvname is null");
            return (Criteria) this;
        }

        public Criteria andTvnameIsNotNull() {
            addCriterion("tvname is not null");
            return (Criteria) this;
        }

        public Criteria andTvnameEqualTo(String value) {
            addCriterion("tvname =", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameNotEqualTo(String value) {
            addCriterion("tvname <>", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameGreaterThan(String value) {
            addCriterion("tvname >", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameGreaterThanOrEqualTo(String value) {
            addCriterion("tvname >=", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameLessThan(String value) {
            addCriterion("tvname <", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameLessThanOrEqualTo(String value) {
            addCriterion("tvname <=", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameLike(String value) {
            addCriterion("tvname like", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameNotLike(String value) {
            addCriterion("tvname not like", value, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameIn(List<String> values) {
            addCriterion("tvname in", values, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameNotIn(List<String> values) {
            addCriterion("tvname not in", values, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameBetween(String value1, String value2) {
            addCriterion("tvname between", value1, value2, "tvname");
            return (Criteria) this;
        }

        public Criteria andTvnameNotBetween(String value1, String value2) {
            addCriterion("tvname not between", value1, value2, "tvname");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPlayurlIsNull() {
            addCriterion("playurl is null");
            return (Criteria) this;
        }

        public Criteria andPlayurlIsNotNull() {
            addCriterion("playurl is not null");
            return (Criteria) this;
        }

        public Criteria andPlayurlEqualTo(String value) {
            addCriterion("playurl =", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotEqualTo(String value) {
            addCriterion("playurl <>", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlGreaterThan(String value) {
            addCriterion("playurl >", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlGreaterThanOrEqualTo(String value) {
            addCriterion("playurl >=", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlLessThan(String value) {
            addCriterion("playurl <", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlLessThanOrEqualTo(String value) {
            addCriterion("playurl <=", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlLike(String value) {
            addCriterion("playurl like", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotLike(String value) {
            addCriterion("playurl not like", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlIn(List<String> values) {
            addCriterion("playurl in", values, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotIn(List<String> values) {
            addCriterion("playurl not in", values, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlBetween(String value1, String value2) {
            addCriterion("playurl between", value1, value2, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotBetween(String value1, String value2) {
            addCriterion("playurl not between", value1, value2, "playurl");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idIsNull() {
            addCriterion("tvuuid_id is null");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idIsNotNull() {
            addCriterion("tvuuid_id is not null");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idEqualTo(String value) {
            addCriterion("tvuuid_id =", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idNotEqualTo(String value) {
            addCriterion("tvuuid_id <>", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idGreaterThan(String value) {
            addCriterion("tvuuid_id >", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idGreaterThanOrEqualTo(String value) {
            addCriterion("tvuuid_id >=", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idLessThan(String value) {
            addCriterion("tvuuid_id <", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idLessThanOrEqualTo(String value) {
            addCriterion("tvuuid_id <=", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idLike(String value) {
            addCriterion("tvuuid_id like", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idNotLike(String value) {
            addCriterion("tvuuid_id not like", value, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idIn(List<String> values) {
            addCriterion("tvuuid_id in", values, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idNotIn(List<String> values) {
            addCriterion("tvuuid_id not in", values, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idBetween(String value1, String value2) {
            addCriterion("tvuuid_id between", value1, value2, "tvuuid_id");
            return (Criteria) this;
        }

        public Criteria andTvuuid_idNotBetween(String value1, String value2) {
            addCriterion("tvuuid_id not between", value1, value2, "tvuuid_id");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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