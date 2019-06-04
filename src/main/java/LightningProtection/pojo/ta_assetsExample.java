package LightningProtection.pojo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ta_assetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ta_assetsExample() {
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

        public Criteria andIdEqualTo(int value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(int value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(int value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(int value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(int value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(int value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(int value1, int value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(int value1, int value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssets_nameIsNull() {
            addCriterion("assets_name is null");
            return (Criteria) this;
        }

        public Criteria andAssets_nameIsNotNull() {
            addCriterion("assets_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssets_nameEqualTo(String value) {
            addCriterion("assets_name =", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameNotEqualTo(String value) {
            addCriterion("assets_name <>", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameGreaterThan(String value) {
            addCriterion("assets_name >", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameGreaterThanOrEqualTo(String value) {
            addCriterion("assets_name >=", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameLessThan(String value) {
            addCriterion("assets_name <", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameLessThanOrEqualTo(String value) {
            addCriterion("assets_name <=", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameLike(String value) {
            addCriterion("assets_name like", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameNotLike(String value) {
            addCriterion("assets_name not like", value, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameIn(List<String> values) {
            addCriterion("assets_name in", values, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameNotIn(List<String> values) {
            addCriterion("assets_name not in", values, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameBetween(String value1, String value2) {
            addCriterion("assets_name between", value1, value2, "assets_name");
            return (Criteria) this;
        }

        public Criteria andAssets_nameNotBetween(String value1, String value2) {
            addCriterion("assets_name not between", value1, value2, "assets_name");
            return (Criteria) this;
        }

        public Criteria andUsed_deptIsNull() {
            addCriterion("used_dept is null");
            return (Criteria) this;
        }

        public Criteria andUsed_deptIsNotNull() {
            addCriterion("used_dept is not null");
            return (Criteria) this;
        }

        public Criteria andUsed_deptEqualTo(String value) {
            addCriterion("used_dept =", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptNotEqualTo(String value) {
            addCriterion("used_dept <>", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptGreaterThan(String value) {
            addCriterion("used_dept >", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptGreaterThanOrEqualTo(String value) {
            addCriterion("used_dept >=", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptLessThan(String value) {
            addCriterion("used_dept <", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptLessThanOrEqualTo(String value) {
            addCriterion("used_dept <=", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptLike(String value) {
            addCriterion("used_dept like", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptNotLike(String value) {
            addCriterion("used_dept not like", value, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptIn(List<String> values) {
            addCriterion("used_dept in", values, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptNotIn(List<String> values) {
            addCriterion("used_dept not in", values, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptBetween(String value1, String value2) {
            addCriterion("used_dept between", value1, value2, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_deptNotBetween(String value1, String value2) {
            addCriterion("used_dept not between", value1, value2, "used_dept");
            return (Criteria) this;
        }

        public Criteria andUsed_userIsNull() {
            addCriterion("used_user is null");
            return (Criteria) this;
        }

        public Criteria andUsed_userIsNotNull() {
            addCriterion("used_user is not null");
            return (Criteria) this;
        }

        public Criteria andUsed_userEqualTo(String value) {
            addCriterion("used_user =", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userNotEqualTo(String value) {
            addCriterion("used_user <>", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userGreaterThan(String value) {
            addCriterion("used_user >", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userGreaterThanOrEqualTo(String value) {
            addCriterion("used_user >=", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userLessThan(String value) {
            addCriterion("used_user <", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userLessThanOrEqualTo(String value) {
            addCriterion("used_user <=", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userLike(String value) {
            addCriterion("used_user like", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userNotLike(String value) {
            addCriterion("used_user not like", value, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userIn(List<String> values) {
            addCriterion("used_user in", values, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userNotIn(List<String> values) {
            addCriterion("used_user not in", values, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userBetween(String value1, String value2) {
            addCriterion("used_user between", value1, value2, "used_user");
            return (Criteria) this;
        }

        public Criteria andUsed_userNotBetween(String value1, String value2) {
            addCriterion("used_user not between", value1, value2, "used_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceEqualTo(BigInteger value) {
            addCriterion("purchase_price =", value, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceNotEqualTo(BigInteger value) {
            addCriterion("purchase_price <>", value, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceGreaterThan(BigInteger value) {
            addCriterion("purchase_price >", value, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceGreaterThanOrEqualTo(BigInteger value) {
            addCriterion("purchase_price >=", value, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceLessThan(BigInteger value) {
            addCriterion("purchase_price <", value, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceLessThanOrEqualTo(BigInteger value) {
            addCriterion("purchase_price <=", value, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceIn(List<BigInteger> values) {
            addCriterion("purchase_price in", values, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceNotIn(List<BigInteger> values) {
            addCriterion("purchase_price not in", values, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceBetween(BigInteger value1, BigInteger value2) {
            addCriterion("purchase_price between", value1, value2, "purchase_price");
            return (Criteria) this;
        }

        public Criteria andPurchase_priceNotBetween(BigInteger value1, BigInteger value2) {
            addCriterion("purchase_price not between", value1, value2, "purchase_price");
            return (Criteria) this;
        }
        public Criteria andPurchase_dateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateEqualTo(String value) {
            addCriterion("purchase_date =", value, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateNotEqualTo(BigInteger value) {
            addCriterion("purchase_date <>", value, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateGreaterThan(String value) {
            addCriterion("purchase_date>", value, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_date >=", value, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateLessThan(String value) {
            addCriterion("purchase_date <", value, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateLessThanOrEqualTo(String value) {
            addCriterion("purchase_date <=", value, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateIn(List<String> values) {
            addCriterion("purchase_date in", values, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateNotIn(List<String> values) {
            addCriterion("purchase_date not in", values, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateBetween(String value1, String value2) {
            addCriterion("purchase_date between", value1, value2, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_dateNotBetween(String value1, String value2) {
            addCriterion("purchase_date not between", value1, value2, "purchase_date");
            return (Criteria) this;
        }

        public Criteria andPurchase_userIsNull() {
            addCriterion("purchase_user is null");
            return (Criteria) this;
        }

        public Criteria andPurchase_userIsNotNull() {
            addCriterion("purchase_user is not null");
            return (Criteria) this;
        }

        public Criteria andPurchase_userEqualTo(String value) {
            addCriterion("purchase_user =", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userNotEqualTo(String value) {
            addCriterion("purchase_user <>", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userGreaterThan(String value) {
            addCriterion("purchase_user >", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_user >=", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userLessThan(String value) {
            addCriterion("purchase_user <", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userLessThanOrEqualTo(String value) {
            addCriterion("purchase_user <=", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userLike(String value) {
            addCriterion("purchase_user like", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userNotLike(String value) {
            addCriterion("purchase_user not like", value, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userIn(List<String> values) {
            addCriterion("purchase_user in", values, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userNotIn(List<String> values) {
            addCriterion("purchase_user not in", values, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userBetween(String value1, String value2) {
            addCriterion("purchase_user between", value1, value2, "purchase_user");
            return (Criteria) this;
        }

        public Criteria andPurchase_userNotBetween(String value1, String value2) {
            addCriterion("purchase_user not between", value1, value2, "purchase_user");
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