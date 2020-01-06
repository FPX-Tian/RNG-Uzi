package com.bdqn.meitao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersidIsNull() {
            addCriterion("ordersID is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("ordersID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(Integer value) {
            addCriterion("ordersID =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(Integer value) {
            addCriterion("ordersID <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(Integer value) {
            addCriterion("ordersID >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordersID >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(Integer value) {
            addCriterion("ordersID <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(Integer value) {
            addCriterion("ordersID <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<Integer> values) {
            addCriterion("ordersID in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<Integer> values) {
            addCriterion("ordersID not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(Integer value1, Integer value2) {
            addCriterion("ordersID between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(Integer value1, Integer value2) {
            addCriterion("ordersID not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOrdersdateIsNull() {
            addCriterion("ordersDate is null");
            return (Criteria) this;
        }

        public Criteria andOrdersdateIsNotNull() {
            addCriterion("ordersDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersdateEqualTo(String value) {
            addCriterion("ordersDate =", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotEqualTo(String value) {
            addCriterion("ordersDate <>", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateGreaterThan(String value) {
            addCriterion("ordersDate >", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateGreaterThanOrEqualTo(String value) {
            addCriterion("ordersDate >=", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateLessThan(String value) {
            addCriterion("ordersDate <", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateLessThanOrEqualTo(String value) {
            addCriterion("ordersDate <=", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateLike(String value) {
            addCriterion("ordersDate like", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotLike(String value) {
            addCriterion("ordersDate not like", value, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateIn(List<String> values) {
            addCriterion("ordersDate in", values, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotIn(List<String> values) {
            addCriterion("ordersDate not in", values, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateBetween(String value1, String value2) {
            addCriterion("ordersDate between", value1, value2, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andOrdersdateNotBetween(String value1, String value2) {
            addCriterion("ordersDate not between", value1, value2, "ordersdate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(String value) {
            addCriterion("deliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(String value) {
            addCriterion("deliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(String value) {
            addCriterion("deliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(String value) {
            addCriterion("deliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(String value) {
            addCriterion("deliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLike(String value) {
            addCriterion("deliveryDate like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotLike(String value) {
            addCriterion("deliveryDate not like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<String> values) {
            addCriterion("deliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<String> values) {
            addCriterion("deliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(String value1, String value2) {
            addCriterion("deliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(String value1, String value2) {
            addCriterion("deliveryDate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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