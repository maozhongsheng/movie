package com.reptile.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovelTvdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovelTvdataExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("`alias` is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("`alias` is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("`alias` =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("`alias` <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("`alias` >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("`alias` >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("`alias` <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("`alias` <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("`alias` like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("`alias` not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("`alias` in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("`alias` not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("`alias` between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("`alias` not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andMainstarIsNull() {
            addCriterion("mainstar is null");
            return (Criteria) this;
        }

        public Criteria andMainstarIsNotNull() {
            addCriterion("mainstar is not null");
            return (Criteria) this;
        }

        public Criteria andMainstarEqualTo(String value) {
            addCriterion("mainstar =", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarNotEqualTo(String value) {
            addCriterion("mainstar <>", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarGreaterThan(String value) {
            addCriterion("mainstar >", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarGreaterThanOrEqualTo(String value) {
            addCriterion("mainstar >=", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarLessThan(String value) {
            addCriterion("mainstar <", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarLessThanOrEqualTo(String value) {
            addCriterion("mainstar <=", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarLike(String value) {
            addCriterion("mainstar like", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarNotLike(String value) {
            addCriterion("mainstar not like", value, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarIn(List<String> values) {
            addCriterion("mainstar in", values, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarNotIn(List<String> values) {
            addCriterion("mainstar not in", values, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarBetween(String value1, String value2) {
            addCriterion("mainstar between", value1, value2, "mainstar");
            return (Criteria) this;
        }

        public Criteria andMainstarNotBetween(String value1, String value2) {
            addCriterion("mainstar not between", value1, value2, "mainstar");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("`year` is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("`year` is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("`year` =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("`year` <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("`year` >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("`year` >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("`year` <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("`year` <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("`year` like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("`year` not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("`year` in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("`year` not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("`year` between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("`year` not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andParamIsNull() {
            addCriterion("param is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("param is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(Integer value) {
            addCriterion("param =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(Integer value) {
            addCriterion("param <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(Integer value) {
            addCriterion("param >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(Integer value) {
            addCriterion("param >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(Integer value) {
            addCriterion("param <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(Integer value) {
            addCriterion("param <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<Integer> values) {
            addCriterion("param in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<Integer> values) {
            addCriterion("param not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(Integer value1, Integer value2) {
            addCriterion("param between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(Integer value1, Integer value2) {
            addCriterion("param not between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("sitename is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("sitename is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("sitename =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("sitename <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("sitename >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("sitename >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("sitename <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("sitename <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("sitename like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("sitename not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("sitename in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("sitename not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("sitename between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("sitename not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andTvtypeIsNull() {
            addCriterion("tvtype is null");
            return (Criteria) this;
        }

        public Criteria andTvtypeIsNotNull() {
            addCriterion("tvtype is not null");
            return (Criteria) this;
        }

        public Criteria andTvtypeEqualTo(String value) {
            addCriterion("tvtype =", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeNotEqualTo(String value) {
            addCriterion("tvtype <>", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeGreaterThan(String value) {
            addCriterion("tvtype >", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeGreaterThanOrEqualTo(String value) {
            addCriterion("tvtype >=", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeLessThan(String value) {
            addCriterion("tvtype <", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeLessThanOrEqualTo(String value) {
            addCriterion("tvtype <=", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeLike(String value) {
            addCriterion("tvtype like", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeNotLike(String value) {
            addCriterion("tvtype not like", value, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeIn(List<String> values) {
            addCriterion("tvtype in", values, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeNotIn(List<String> values) {
            addCriterion("tvtype not in", values, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeBetween(String value1, String value2) {
            addCriterion("tvtype between", value1, value2, "tvtype");
            return (Criteria) this;
        }

        public Criteria andTvtypeNotBetween(String value1, String value2) {
            addCriterion("tvtype not between", value1, value2, "tvtype");
            return (Criteria) this;
        }

        public Criteria andSiteurlIsNull() {
            addCriterion("siteurl is null");
            return (Criteria) this;
        }

        public Criteria andSiteurlIsNotNull() {
            addCriterion("siteurl is not null");
            return (Criteria) this;
        }

        public Criteria andSiteurlEqualTo(String value) {
            addCriterion("siteurl =", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotEqualTo(String value) {
            addCriterion("siteurl <>", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlGreaterThan(String value) {
            addCriterion("siteurl >", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlGreaterThanOrEqualTo(String value) {
            addCriterion("siteurl >=", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLessThan(String value) {
            addCriterion("siteurl <", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLessThanOrEqualTo(String value) {
            addCriterion("siteurl <=", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLike(String value) {
            addCriterion("siteurl like", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotLike(String value) {
            addCriterion("siteurl not like", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlIn(List<String> values) {
            addCriterion("siteurl in", values, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotIn(List<String> values) {
            addCriterion("siteurl not in", values, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlBetween(String value1, String value2) {
            addCriterion("siteurl between", value1, value2, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotBetween(String value1, String value2) {
            addCriterion("siteurl not between", value1, value2, "siteurl");
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

        public Criteria andMovel_statusIsNull() {
            addCriterion("movel_status is null");
            return (Criteria) this;
        }

        public Criteria andMovel_statusIsNotNull() {
            addCriterion("movel_status is not null");
            return (Criteria) this;
        }

        public Criteria andMovel_statusEqualTo(String value) {
            addCriterion("movel_status =", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusNotEqualTo(String value) {
            addCriterion("movel_status <>", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusGreaterThan(String value) {
            addCriterion("movel_status >", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusGreaterThanOrEqualTo(String value) {
            addCriterion("movel_status >=", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusLessThan(String value) {
            addCriterion("movel_status <", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusLessThanOrEqualTo(String value) {
            addCriterion("movel_status <=", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusLike(String value) {
            addCriterion("movel_status like", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusNotLike(String value) {
            addCriterion("movel_status not like", value, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusIn(List<String> values) {
            addCriterion("movel_status in", values, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusNotIn(List<String> values) {
            addCriterion("movel_status not in", values, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusBetween(String value1, String value2) {
            addCriterion("movel_status between", value1, value2, "movel_status");
            return (Criteria) this;
        }

        public Criteria andMovel_statusNotBetween(String value1, String value2) {
            addCriterion("movel_status not between", value1, value2, "movel_status");
            return (Criteria) this;
        }

        public Criteria andSeach_nameIsNull() {
            addCriterion("seach_name is null");
            return (Criteria) this;
        }

        public Criteria andSeach_nameIsNotNull() {
            addCriterion("seach_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeach_nameEqualTo(String value) {
            addCriterion("seach_name =", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameNotEqualTo(String value) {
            addCriterion("seach_name <>", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameGreaterThan(String value) {
            addCriterion("seach_name >", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameGreaterThanOrEqualTo(String value) {
            addCriterion("seach_name >=", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameLessThan(String value) {
            addCriterion("seach_name <", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameLessThanOrEqualTo(String value) {
            addCriterion("seach_name <=", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameLike(String value) {
            addCriterion("seach_name like", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameNotLike(String value) {
            addCriterion("seach_name not like", value, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameIn(List<String> values) {
            addCriterion("seach_name in", values, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameNotIn(List<String> values) {
            addCriterion("seach_name not in", values, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameBetween(String value1, String value2) {
            addCriterion("seach_name between", value1, value2, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_nameNotBetween(String value1, String value2) {
            addCriterion("seach_name not between", value1, value2, "seach_name");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameIsNull() {
            addCriterion("seach_rname is null");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameIsNotNull() {
            addCriterion("seach_rname is not null");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameEqualTo(String value) {
            addCriterion("seach_rname =", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameNotEqualTo(String value) {
            addCriterion("seach_rname <>", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameGreaterThan(String value) {
            addCriterion("seach_rname >", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameGreaterThanOrEqualTo(String value) {
            addCriterion("seach_rname >=", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameLessThan(String value) {
            addCriterion("seach_rname <", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameLessThanOrEqualTo(String value) {
            addCriterion("seach_rname <=", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameLike(String value) {
            addCriterion("seach_rname like", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameNotLike(String value) {
            addCriterion("seach_rname not like", value, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameIn(List<String> values) {
            addCriterion("seach_rname in", values, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameNotIn(List<String> values) {
            addCriterion("seach_rname not in", values, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameBetween(String value1, String value2) {
            addCriterion("seach_rname between", value1, value2, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_rnameNotBetween(String value1, String value2) {
            addCriterion("seach_rname not between", value1, value2, "seach_rname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameIsNull() {
            addCriterion("seach_aname is null");
            return (Criteria) this;
        }

        public Criteria andSeach_anameIsNotNull() {
            addCriterion("seach_aname is not null");
            return (Criteria) this;
        }

        public Criteria andSeach_anameEqualTo(String value) {
            addCriterion("seach_aname =", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameNotEqualTo(String value) {
            addCriterion("seach_aname <>", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameGreaterThan(String value) {
            addCriterion("seach_aname >", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameGreaterThanOrEqualTo(String value) {
            addCriterion("seach_aname >=", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameLessThan(String value) {
            addCriterion("seach_aname <", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameLessThanOrEqualTo(String value) {
            addCriterion("seach_aname <=", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameLike(String value) {
            addCriterion("seach_aname like", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameNotLike(String value) {
            addCriterion("seach_aname not like", value, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameIn(List<String> values) {
            addCriterion("seach_aname in", values, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameNotIn(List<String> values) {
            addCriterion("seach_aname not in", values, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameBetween(String value1, String value2) {
            addCriterion("seach_aname between", value1, value2, "seach_aname");
            return (Criteria) this;
        }

        public Criteria andSeach_anameNotBetween(String value1, String value2) {
            addCriterion("seach_aname not between", value1, value2, "seach_aname");
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