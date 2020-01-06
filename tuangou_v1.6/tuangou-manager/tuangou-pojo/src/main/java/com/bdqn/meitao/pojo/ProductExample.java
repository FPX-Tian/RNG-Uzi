package com.bdqn.meitao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNull() {
            addCriterion("productDesc is null");
            return (Criteria) this;
        }

        public Criteria andProductdescIsNotNull() {
            addCriterion("productDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductdescEqualTo(String value) {
            addCriterion("productDesc =", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotEqualTo(String value) {
            addCriterion("productDesc <>", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThan(String value) {
            addCriterion("productDesc >", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescGreaterThanOrEqualTo(String value) {
            addCriterion("productDesc >=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThan(String value) {
            addCriterion("productDesc <", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLessThanOrEqualTo(String value) {
            addCriterion("productDesc <=", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescLike(String value) {
            addCriterion("productDesc like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotLike(String value) {
            addCriterion("productDesc not like", value, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescIn(List<String> values) {
            addCriterion("productDesc in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotIn(List<String> values) {
            addCriterion("productDesc not in", values, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescBetween(String value1, String value2) {
            addCriterion("productDesc between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andProductdescNotBetween(String value1, String value2) {
            addCriterion("productDesc not between", value1, value2, "productdesc");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNull() {
            addCriterion("originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNotNull() {
            addCriterion("originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceEqualTo(BigDecimal value) {
            addCriterion("originalPrice =", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("originalPrice <>", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("originalPrice >", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("originalPrice >=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThan(BigDecimal value) {
            addCriterion("originalPrice <", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("originalPrice <=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIn(List<BigDecimal> values) {
            addCriterion("originalPrice in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("originalPrice not in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("originalPrice between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("originalPrice not between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceIsNull() {
            addCriterion("currentPrice is null");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceIsNotNull() {
            addCriterion("currentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceEqualTo(BigDecimal value) {
            addCriterion("currentPrice =", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceNotEqualTo(BigDecimal value) {
            addCriterion("currentPrice <>", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceGreaterThan(BigDecimal value) {
            addCriterion("currentPrice >", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currentPrice >=", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceLessThan(BigDecimal value) {
            addCriterion("currentPrice <", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currentPrice <=", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceIn(List<BigDecimal> values) {
            addCriterion("currentPrice in", values, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceNotIn(List<BigDecimal> values) {
            addCriterion("currentPrice not in", values, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentPrice between", value1, value2, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentPrice not between", value1, value2, "currentprice");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopID is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopID is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopID =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopID <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopID >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopID >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopID <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopID <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopID in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopID not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopID between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopID not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryID =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryID <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryID >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryID >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryID <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryID <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryID in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryID not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryID between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryID not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andSalescountIsNull() {
            addCriterion("salesCount is null");
            return (Criteria) this;
        }

        public Criteria andSalescountIsNotNull() {
            addCriterion("salesCount is not null");
            return (Criteria) this;
        }

        public Criteria andSalescountEqualTo(Integer value) {
            addCriterion("salesCount =", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountNotEqualTo(Integer value) {
            addCriterion("salesCount <>", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountGreaterThan(Integer value) {
            addCriterion("salesCount >", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesCount >=", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountLessThan(Integer value) {
            addCriterion("salesCount <", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountLessThanOrEqualTo(Integer value) {
            addCriterion("salesCount <=", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountIn(List<Integer> values) {
            addCriterion("salesCount in", values, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountNotIn(List<Integer> values) {
            addCriterion("salesCount not in", values, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountBetween(Integer value1, Integer value2) {
            addCriterion("salesCount between", value1, value2, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountNotBetween(Integer value1, Integer value2) {
            addCriterion("salesCount not between", value1, value2, "salescount");
            return (Criteria) this;
        }

        public Criteria andIscommendIsNull() {
            addCriterion("isCommend is null");
            return (Criteria) this;
        }

        public Criteria andIscommendIsNotNull() {
            addCriterion("isCommend is not null");
            return (Criteria) this;
        }

        public Criteria andIscommendEqualTo(String value) {
            addCriterion("isCommend =", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendNotEqualTo(String value) {
            addCriterion("isCommend <>", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendGreaterThan(String value) {
            addCriterion("isCommend >", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendGreaterThanOrEqualTo(String value) {
            addCriterion("isCommend >=", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendLessThan(String value) {
            addCriterion("isCommend <", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendLessThanOrEqualTo(String value) {
            addCriterion("isCommend <=", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendLike(String value) {
            addCriterion("isCommend like", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendNotLike(String value) {
            addCriterion("isCommend not like", value, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendIn(List<String> values) {
            addCriterion("isCommend in", values, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendNotIn(List<String> values) {
            addCriterion("isCommend not in", values, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendBetween(String value1, String value2) {
            addCriterion("isCommend between", value1, value2, "iscommend");
            return (Criteria) this;
        }

        public Criteria andIscommendNotBetween(String value1, String value2) {
            addCriterion("isCommend not between", value1, value2, "iscommend");
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