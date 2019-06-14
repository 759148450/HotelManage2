package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaguerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaguerExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gId is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gId is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gId =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gId <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gId >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gId >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gId <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gId <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gId in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gId not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gId between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gId not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gName is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gName is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gName =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gName <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gName >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gName >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gName <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gName <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gName like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gName not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gName in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gName not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gName between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gName not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGsexIsNull() {
            addCriterion("gSex is null");
            return (Criteria) this;
        }

        public Criteria andGsexIsNotNull() {
            addCriterion("gSex is not null");
            return (Criteria) this;
        }

        public Criteria andGsexEqualTo(String value) {
            addCriterion("gSex =", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotEqualTo(String value) {
            addCriterion("gSex <>", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexGreaterThan(String value) {
            addCriterion("gSex >", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexGreaterThanOrEqualTo(String value) {
            addCriterion("gSex >=", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLessThan(String value) {
            addCriterion("gSex <", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLessThanOrEqualTo(String value) {
            addCriterion("gSex <=", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexLike(String value) {
            addCriterion("gSex like", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotLike(String value) {
            addCriterion("gSex not like", value, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexIn(List<String> values) {
            addCriterion("gSex in", values, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotIn(List<String> values) {
            addCriterion("gSex not in", values, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexBetween(String value1, String value2) {
            addCriterion("gSex between", value1, value2, "gsex");
            return (Criteria) this;
        }

        public Criteria andGsexNotBetween(String value1, String value2) {
            addCriterion("gSex not between", value1, value2, "gsex");
            return (Criteria) this;
        }

        public Criteria andGpwdIsNull() {
            addCriterion("gPwd is null");
            return (Criteria) this;
        }

        public Criteria andGpwdIsNotNull() {
            addCriterion("gPwd is not null");
            return (Criteria) this;
        }

        public Criteria andGpwdEqualTo(String value) {
            addCriterion("gPwd =", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdNotEqualTo(String value) {
            addCriterion("gPwd <>", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdGreaterThan(String value) {
            addCriterion("gPwd >", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdGreaterThanOrEqualTo(String value) {
            addCriterion("gPwd >=", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdLessThan(String value) {
            addCriterion("gPwd <", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdLessThanOrEqualTo(String value) {
            addCriterion("gPwd <=", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdLike(String value) {
            addCriterion("gPwd like", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdNotLike(String value) {
            addCriterion("gPwd not like", value, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdIn(List<String> values) {
            addCriterion("gPwd in", values, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdNotIn(List<String> values) {
            addCriterion("gPwd not in", values, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdBetween(String value1, String value2) {
            addCriterion("gPwd between", value1, value2, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGpwdNotBetween(String value1, String value2) {
            addCriterion("gPwd not between", value1, value2, "gpwd");
            return (Criteria) this;
        }

        public Criteria andGtelIsNull() {
            addCriterion("gTel is null");
            return (Criteria) this;
        }

        public Criteria andGtelIsNotNull() {
            addCriterion("gTel is not null");
            return (Criteria) this;
        }

        public Criteria andGtelEqualTo(Integer value) {
            addCriterion("gTel =", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotEqualTo(Integer value) {
            addCriterion("gTel <>", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelGreaterThan(Integer value) {
            addCriterion("gTel >", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("gTel >=", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelLessThan(Integer value) {
            addCriterion("gTel <", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelLessThanOrEqualTo(Integer value) {
            addCriterion("gTel <=", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelIn(List<Integer> values) {
            addCriterion("gTel in", values, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotIn(List<Integer> values) {
            addCriterion("gTel not in", values, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelBetween(Integer value1, Integer value2) {
            addCriterion("gTel between", value1, value2, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotBetween(Integer value1, Integer value2) {
            addCriterion("gTel not between", value1, value2, "gtel");
            return (Criteria) this;
        }

        public Criteria andGaddressIsNull() {
            addCriterion("gAddress is null");
            return (Criteria) this;
        }

        public Criteria andGaddressIsNotNull() {
            addCriterion("gAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGaddressEqualTo(String value) {
            addCriterion("gAddress =", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotEqualTo(String value) {
            addCriterion("gAddress <>", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressGreaterThan(String value) {
            addCriterion("gAddress >", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressGreaterThanOrEqualTo(String value) {
            addCriterion("gAddress >=", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLessThan(String value) {
            addCriterion("gAddress <", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLessThanOrEqualTo(String value) {
            addCriterion("gAddress <=", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLike(String value) {
            addCriterion("gAddress like", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotLike(String value) {
            addCriterion("gAddress not like", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressIn(List<String> values) {
            addCriterion("gAddress in", values, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotIn(List<String> values) {
            addCriterion("gAddress not in", values, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressBetween(String value1, String value2) {
            addCriterion("gAddress between", value1, value2, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotBetween(String value1, String value2) {
            addCriterion("gAddress not between", value1, value2, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGemailIsNull() {
            addCriterion("gEmail is null");
            return (Criteria) this;
        }

        public Criteria andGemailIsNotNull() {
            addCriterion("gEmail is not null");
            return (Criteria) this;
        }

        public Criteria andGemailEqualTo(String value) {
            addCriterion("gEmail =", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotEqualTo(String value) {
            addCriterion("gEmail <>", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailGreaterThan(String value) {
            addCriterion("gEmail >", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailGreaterThanOrEqualTo(String value) {
            addCriterion("gEmail >=", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLessThan(String value) {
            addCriterion("gEmail <", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLessThanOrEqualTo(String value) {
            addCriterion("gEmail <=", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLike(String value) {
            addCriterion("gEmail like", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotLike(String value) {
            addCriterion("gEmail not like", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailIn(List<String> values) {
            addCriterion("gEmail in", values, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotIn(List<String> values) {
            addCriterion("gEmail not in", values, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailBetween(String value1, String value2) {
            addCriterion("gEmail between", value1, value2, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotBetween(String value1, String value2) {
            addCriterion("gEmail not between", value1, value2, "gemail");
            return (Criteria) this;
        }

        public Criteria andGscoreIsNull() {
            addCriterion("gScore is null");
            return (Criteria) this;
        }

        public Criteria andGscoreIsNotNull() {
            addCriterion("gScore is not null");
            return (Criteria) this;
        }

        public Criteria andGscoreEqualTo(Integer value) {
            addCriterion("gScore =", value, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreNotEqualTo(Integer value) {
            addCriterion("gScore <>", value, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreGreaterThan(Integer value) {
            addCriterion("gScore >", value, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("gScore >=", value, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreLessThan(Integer value) {
            addCriterion("gScore <", value, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreLessThanOrEqualTo(Integer value) {
            addCriterion("gScore <=", value, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreIn(List<Integer> values) {
            addCriterion("gScore in", values, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreNotIn(List<Integer> values) {
            addCriterion("gScore not in", values, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreBetween(Integer value1, Integer value2) {
            addCriterion("gScore between", value1, value2, "gscore");
            return (Criteria) this;
        }

        public Criteria andGscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("gScore not between", value1, value2, "gscore");
            return (Criteria) this;
        }

        public Criteria andGrankIsNull() {
            addCriterion("gRank is null");
            return (Criteria) this;
        }

        public Criteria andGrankIsNotNull() {
            addCriterion("gRank is not null");
            return (Criteria) this;
        }

        public Criteria andGrankEqualTo(String value) {
            addCriterion("gRank =", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankNotEqualTo(String value) {
            addCriterion("gRank <>", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankGreaterThan(String value) {
            addCriterion("gRank >", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankGreaterThanOrEqualTo(String value) {
            addCriterion("gRank >=", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankLessThan(String value) {
            addCriterion("gRank <", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankLessThanOrEqualTo(String value) {
            addCriterion("gRank <=", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankLike(String value) {
            addCriterion("gRank like", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankNotLike(String value) {
            addCriterion("gRank not like", value, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankIn(List<String> values) {
            addCriterion("gRank in", values, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankNotIn(List<String> values) {
            addCriterion("gRank not in", values, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankBetween(String value1, String value2) {
            addCriterion("gRank between", value1, value2, "grank");
            return (Criteria) this;
        }

        public Criteria andGrankNotBetween(String value1, String value2) {
            addCriterion("gRank not between", value1, value2, "grank");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeIsNull() {
            addCriterion("gLastLiveTime is null");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeIsNotNull() {
            addCriterion("gLastLiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeEqualTo(Date value) {
            addCriterion("gLastLiveTime =", value, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeNotEqualTo(Date value) {
            addCriterion("gLastLiveTime <>", value, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeGreaterThan(Date value) {
            addCriterion("gLastLiveTime >", value, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gLastLiveTime >=", value, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeLessThan(Date value) {
            addCriterion("gLastLiveTime <", value, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeLessThanOrEqualTo(Date value) {
            addCriterion("gLastLiveTime <=", value, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeIn(List<Date> values) {
            addCriterion("gLastLiveTime in", values, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeNotIn(List<Date> values) {
            addCriterion("gLastLiveTime not in", values, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeBetween(Date value1, Date value2) {
            addCriterion("gLastLiveTime between", value1, value2, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastlivetimeNotBetween(Date value1, Date value2) {
            addCriterion("gLastLiveTime not between", value1, value2, "glastlivetime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeIsNull() {
            addCriterion("gLastOrderTime is null");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeIsNotNull() {
            addCriterion("gLastOrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeEqualTo(Date value) {
            addCriterion("gLastOrderTime =", value, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeNotEqualTo(Date value) {
            addCriterion("gLastOrderTime <>", value, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeGreaterThan(Date value) {
            addCriterion("gLastOrderTime >", value, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gLastOrderTime >=", value, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeLessThan(Date value) {
            addCriterion("gLastOrderTime <", value, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeLessThanOrEqualTo(Date value) {
            addCriterion("gLastOrderTime <=", value, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeIn(List<Date> values) {
            addCriterion("gLastOrderTime in", values, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeNotIn(List<Date> values) {
            addCriterion("gLastOrderTime not in", values, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeBetween(Date value1, Date value2) {
            addCriterion("gLastOrderTime between", value1, value2, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andGlastordertimeNotBetween(Date value1, Date value2) {
            addCriterion("gLastOrderTime not between", value1, value2, "glastordertime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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