package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderFormExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIsNull() {
            addCriterion("room_price is null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIsNotNull() {
            addCriterion("room_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEqualTo(Long value) {
            addCriterion("room_price =", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotEqualTo(Long value) {
            addCriterion("room_price <>", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceGreaterThan(Long value) {
            addCriterion("room_price >", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("room_price >=", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLessThan(Long value) {
            addCriterion("room_price <", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLessThanOrEqualTo(Long value) {
            addCriterion("room_price <=", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIn(List<Long> values) {
            addCriterion("room_price in", values, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotIn(List<Long> values) {
            addCriterion("room_price not in", values, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceBetween(Long value1, Long value2) {
            addCriterion("room_price between", value1, value2, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotBetween(Long value1, Long value2) {
            addCriterion("room_price not between", value1, value2, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Long value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Long value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Long value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Long value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Long value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Long value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Long> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Long> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Long value1, Long value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Long value1, Long value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andLivedDaysIsNull() {
            addCriterion("lived_days is null");
            return (Criteria) this;
        }

        public Criteria andLivedDaysIsNotNull() {
            addCriterion("lived_days is not null");
            return (Criteria) this;
        }

        public Criteria andLivedDaysEqualTo(Integer value) {
            addCriterion("lived_days =", value, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysNotEqualTo(Integer value) {
            addCriterion("lived_days <>", value, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysGreaterThan(Integer value) {
            addCriterion("lived_days >", value, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("lived_days >=", value, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysLessThan(Integer value) {
            addCriterion("lived_days <", value, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysLessThanOrEqualTo(Integer value) {
            addCriterion("lived_days <=", value, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysIn(List<Integer> values) {
            addCriterion("lived_days in", values, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysNotIn(List<Integer> values) {
            addCriterion("lived_days not in", values, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysBetween(Integer value1, Integer value2) {
            addCriterion("lived_days between", value1, value2, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("lived_days not between", value1, value2, "livedDays");
            return (Criteria) this;
        }

        public Criteria andLivedPriceIsNull() {
            addCriterion("lived_price is null");
            return (Criteria) this;
        }

        public Criteria andLivedPriceIsNotNull() {
            addCriterion("lived_price is not null");
            return (Criteria) this;
        }

        public Criteria andLivedPriceEqualTo(Long value) {
            addCriterion("lived_price =", value, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceNotEqualTo(Long value) {
            addCriterion("lived_price <>", value, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceGreaterThan(Long value) {
            addCriterion("lived_price >", value, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("lived_price >=", value, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceLessThan(Long value) {
            addCriterion("lived_price <", value, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceLessThanOrEqualTo(Long value) {
            addCriterion("lived_price <=", value, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceIn(List<Long> values) {
            addCriterion("lived_price in", values, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceNotIn(List<Long> values) {
            addCriterion("lived_price not in", values, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceBetween(Long value1, Long value2) {
            addCriterion("lived_price between", value1, value2, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andLivedPriceNotBetween(Long value1, Long value2) {
            addCriterion("lived_price not between", value1, value2, "livedPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBillIsNull() {
            addCriterion("room_bill is null");
            return (Criteria) this;
        }

        public Criteria andRoomBillIsNotNull() {
            addCriterion("room_bill is not null");
            return (Criteria) this;
        }

        public Criteria andRoomBillEqualTo(Long value) {
            addCriterion("room_bill =", value, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillNotEqualTo(Long value) {
            addCriterion("room_bill <>", value, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillGreaterThan(Long value) {
            addCriterion("room_bill >", value, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillGreaterThanOrEqualTo(Long value) {
            addCriterion("room_bill >=", value, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillLessThan(Long value) {
            addCriterion("room_bill <", value, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillLessThanOrEqualTo(Long value) {
            addCriterion("room_bill <=", value, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillIn(List<Long> values) {
            addCriterion("room_bill in", values, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillNotIn(List<Long> values) {
            addCriterion("room_bill not in", values, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillBetween(Long value1, Long value2) {
            addCriterion("room_bill between", value1, value2, "roomBill");
            return (Criteria) this;
        }

        public Criteria andRoomBillNotBetween(Long value1, Long value2) {
            addCriterion("room_bill not between", value1, value2, "roomBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillIsNull() {
            addCriterion("food_bill is null");
            return (Criteria) this;
        }

        public Criteria andFoodBillIsNotNull() {
            addCriterion("food_bill is not null");
            return (Criteria) this;
        }

        public Criteria andFoodBillEqualTo(Long value) {
            addCriterion("food_bill =", value, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillNotEqualTo(Long value) {
            addCriterion("food_bill <>", value, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillGreaterThan(Long value) {
            addCriterion("food_bill >", value, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillGreaterThanOrEqualTo(Long value) {
            addCriterion("food_bill >=", value, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillLessThan(Long value) {
            addCriterion("food_bill <", value, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillLessThanOrEqualTo(Long value) {
            addCriterion("food_bill <=", value, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillIn(List<Long> values) {
            addCriterion("food_bill in", values, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillNotIn(List<Long> values) {
            addCriterion("food_bill not in", values, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillBetween(Long value1, Long value2) {
            addCriterion("food_bill between", value1, value2, "foodBill");
            return (Criteria) this;
        }

        public Criteria andFoodBillNotBetween(Long value1, Long value2) {
            addCriterion("food_bill not between", value1, value2, "foodBill");
            return (Criteria) this;
        }

        public Criteria andTelBillIsNull() {
            addCriterion("tel_bill is null");
            return (Criteria) this;
        }

        public Criteria andTelBillIsNotNull() {
            addCriterion("tel_bill is not null");
            return (Criteria) this;
        }

        public Criteria andTelBillEqualTo(Long value) {
            addCriterion("tel_bill =", value, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillNotEqualTo(Long value) {
            addCriterion("tel_bill <>", value, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillGreaterThan(Long value) {
            addCriterion("tel_bill >", value, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillGreaterThanOrEqualTo(Long value) {
            addCriterion("tel_bill >=", value, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillLessThan(Long value) {
            addCriterion("tel_bill <", value, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillLessThanOrEqualTo(Long value) {
            addCriterion("tel_bill <=", value, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillIn(List<Long> values) {
            addCriterion("tel_bill in", values, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillNotIn(List<Long> values) {
            addCriterion("tel_bill not in", values, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillBetween(Long value1, Long value2) {
            addCriterion("tel_bill between", value1, value2, "telBill");
            return (Criteria) this;
        }

        public Criteria andTelBillNotBetween(Long value1, Long value2) {
            addCriterion("tel_bill not between", value1, value2, "telBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillIsNull() {
            addCriterion("total_bill is null");
            return (Criteria) this;
        }

        public Criteria andTotalBillIsNotNull() {
            addCriterion("total_bill is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBillEqualTo(Long value) {
            addCriterion("total_bill =", value, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillNotEqualTo(Long value) {
            addCriterion("total_bill <>", value, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillGreaterThan(Long value) {
            addCriterion("total_bill >", value, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillGreaterThanOrEqualTo(Long value) {
            addCriterion("total_bill >=", value, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillLessThan(Long value) {
            addCriterion("total_bill <", value, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillLessThanOrEqualTo(Long value) {
            addCriterion("total_bill <=", value, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillIn(List<Long> values) {
            addCriterion("total_bill in", values, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillNotIn(List<Long> values) {
            addCriterion("total_bill not in", values, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillBetween(Long value1, Long value2) {
            addCriterion("total_bill between", value1, value2, "totalBill");
            return (Criteria) this;
        }

        public Criteria andTotalBillNotBetween(Long value1, Long value2) {
            addCriterion("total_bill not between", value1, value2, "totalBill");
            return (Criteria) this;
        }

        public Criteria andRebackDepositIsNull() {
            addCriterion("reback_deposit is null");
            return (Criteria) this;
        }

        public Criteria andRebackDepositIsNotNull() {
            addCriterion("reback_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andRebackDepositEqualTo(Long value) {
            addCriterion("reback_deposit =", value, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositNotEqualTo(Long value) {
            addCriterion("reback_deposit <>", value, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositGreaterThan(Long value) {
            addCriterion("reback_deposit >", value, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositGreaterThanOrEqualTo(Long value) {
            addCriterion("reback_deposit >=", value, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositLessThan(Long value) {
            addCriterion("reback_deposit <", value, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositLessThanOrEqualTo(Long value) {
            addCriterion("reback_deposit <=", value, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositIn(List<Long> values) {
            addCriterion("reback_deposit in", values, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositNotIn(List<Long> values) {
            addCriterion("reback_deposit not in", values, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositBetween(Long value1, Long value2) {
            addCriterion("reback_deposit between", value1, value2, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andRebackDepositNotBetween(Long value1, Long value2) {
            addCriterion("reback_deposit not between", value1, value2, "rebackDeposit");
            return (Criteria) this;
        }

        public Criteria andPayStyleIsNull() {
            addCriterion("pay_style is null");
            return (Criteria) this;
        }

        public Criteria andPayStyleIsNotNull() {
            addCriterion("pay_style is not null");
            return (Criteria) this;
        }

        public Criteria andPayStyleEqualTo(String value) {
            addCriterion("pay_style =", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotEqualTo(String value) {
            addCriterion("pay_style <>", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleGreaterThan(String value) {
            addCriterion("pay_style >", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleGreaterThanOrEqualTo(String value) {
            addCriterion("pay_style >=", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLessThan(String value) {
            addCriterion("pay_style <", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLessThanOrEqualTo(String value) {
            addCriterion("pay_style <=", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLike(String value) {
            addCriterion("pay_style like", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotLike(String value) {
            addCriterion("pay_style not like", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleIn(List<String> values) {
            addCriterion("pay_style in", values, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotIn(List<String> values) {
            addCriterion("pay_style not in", values, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleBetween(String value1, String value2) {
            addCriterion("pay_style between", value1, value2, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotBetween(String value1, String value2) {
            addCriterion("pay_style not between", value1, value2, "payStyle");
            return (Criteria) this;
        }

        public Criteria andRealWagesIsNull() {
            addCriterion("real_wages is null");
            return (Criteria) this;
        }

        public Criteria andRealWagesIsNotNull() {
            addCriterion("real_wages is not null");
            return (Criteria) this;
        }

        public Criteria andRealWagesEqualTo(Long value) {
            addCriterion("real_wages =", value, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesNotEqualTo(Long value) {
            addCriterion("real_wages <>", value, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesGreaterThan(Long value) {
            addCriterion("real_wages >", value, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesGreaterThanOrEqualTo(Long value) {
            addCriterion("real_wages >=", value, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesLessThan(Long value) {
            addCriterion("real_wages <", value, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesLessThanOrEqualTo(Long value) {
            addCriterion("real_wages <=", value, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesIn(List<Long> values) {
            addCriterion("real_wages in", values, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesNotIn(List<Long> values) {
            addCriterion("real_wages not in", values, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesBetween(Long value1, Long value2) {
            addCriterion("real_wages between", value1, value2, "realWages");
            return (Criteria) this;
        }

        public Criteria andRealWagesNotBetween(Long value1, Long value2) {
            addCriterion("real_wages not between", value1, value2, "realWages");
            return (Criteria) this;
        }

        public Criteria andOddChangeIsNull() {
            addCriterion("odd_change is null");
            return (Criteria) this;
        }

        public Criteria andOddChangeIsNotNull() {
            addCriterion("odd_change is not null");
            return (Criteria) this;
        }

        public Criteria andOddChangeEqualTo(Long value) {
            addCriterion("odd_change =", value, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeNotEqualTo(Long value) {
            addCriterion("odd_change <>", value, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeGreaterThan(Long value) {
            addCriterion("odd_change >", value, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeGreaterThanOrEqualTo(Long value) {
            addCriterion("odd_change >=", value, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeLessThan(Long value) {
            addCriterion("odd_change <", value, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeLessThanOrEqualTo(Long value) {
            addCriterion("odd_change <=", value, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeIn(List<Long> values) {
            addCriterion("odd_change in", values, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeNotIn(List<Long> values) {
            addCriterion("odd_change not in", values, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeBetween(Long value1, Long value2) {
            addCriterion("odd_change between", value1, value2, "oddChange");
            return (Criteria) this;
        }

        public Criteria andOddChangeNotBetween(Long value1, Long value2) {
            addCriterion("odd_change not between", value1, value2, "oddChange");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
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