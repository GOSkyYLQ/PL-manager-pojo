package LightningProtection.pojo;

import java.util.ArrayList;
import java.util.List;

public class ta_projectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ta_projectExample() {
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

        public Criteria andPro_nameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andPro_nameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andPro_nameEqualTo(String value) {
            addCriterion("pro_name =", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameGreaterThan(String value) {
            addCriterion("pro_name >", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameLessThan(String value) {
            addCriterion("pro_name <", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameLike(String value) {
            addCriterion("pro_name like", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameNotLike(String value) {
            addCriterion("pro_name not like", value, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameIn(List<String> values) {
            addCriterion("pro_name in", values, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_nameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "pro_name");
            return (Criteria) this;
        }

        public Criteria andPro_headerIsNull() {
            addCriterion("pro_header is null");
            return (Criteria) this;
        }

        public Criteria andPro_headerIsNotNull() {
            addCriterion("pro_header is not null");
            return (Criteria) this;
        }

        public Criteria andPro_headerEqualTo(String value) {
            addCriterion("pro_header =", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerNotEqualTo(String value) {
            addCriterion("pro_header <>", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerGreaterThan(String value) {
            addCriterion("pro_header >", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerGreaterThanOrEqualTo(String value) {
            addCriterion("pro_header >=", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerLessThan(String value) {
            addCriterion("pro_header <", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerLessThanOrEqualTo(String value) {
            addCriterion("pro_header <=", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerLike(String value) {
            addCriterion("pro_header like", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerNotLike(String value) {
            addCriterion("pro_header not like", value, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerIn(List<String> values) {
            addCriterion("pro_header in", values, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerNotIn(List<String> values) {
            addCriterion("pro_header not in", values, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerBetween(String value1, String value2) {
            addCriterion("pro_header between", value1, value2, "pro_header");
            return (Criteria) this;
        }

        public Criteria andPro_headerNotBetween(String value1, String value2) {
            addCriterion("pro_header not between", value1, value2, "pro_header");
            return (Criteria) this;
        }

        public Criteria andHea_mobileIsNull() {
            addCriterion("hea_mobile is null");
            return (Criteria) this;
        }

        public Criteria andHea_mobileIsNotNull() {
            addCriterion("hea_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andHea_mobileEqualTo(String value) {
            addCriterion("hea_mobile =", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileNotEqualTo(String value) {
            addCriterion("hea_mobile <>", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileGreaterThan(String value) {
            addCriterion("hea_mobile >", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("hea_mobile >=", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileLessThan(String value) {
            addCriterion("hea_mobile <", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileLessThanOrEqualTo(String value) {
            addCriterion("hea_mobile <=", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileLike(String value) {
            addCriterion("hea_mobile like", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileNotLike(String value) {
            addCriterion("hea_mobile not like", value, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileIn(List<String> values) {
            addCriterion("hea_mobile in", values, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileNotIn(List<String> values) {
            addCriterion("hea_mobile not in", values, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileBetween(String value1, String value2) {
            addCriterion("hea_mobile between", value1, value2, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileNotBetween(String value1, String value2) {
            addCriterion("hea_mobile not between", value1, value2, "hea_mobile");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(String value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(String value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(String value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<String> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }
        public Criteria andPro_budgetIsNull() {
            addCriterion("pro_budget is null");
            return (Criteria) this;
        }

        public Criteria andPro_budgetIsNotNull() {
            addCriterion("pro_budget is not null");
            return (Criteria) this;
        }

        public Criteria andPro_budgetEqualTo(String value) {
            addCriterion("pro_budget =", value, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetNotEqualTo(String value) {
            addCriterion("pro_budget <>", value, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetGreaterThan(String value) {
            addCriterion("pro_budget>", value, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetGreaterThanOrEqualTo(String value) {
            addCriterion("pro_budget >=", value, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetLessThan(String value) {
            addCriterion("pro_budget <", value, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetLessThanOrEqualTo(String value) {
            addCriterion("pro_budget <=", value, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetIn(List<String> values) {
            addCriterion("pro_budget in", values, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetNotIn(List<String> values) {
            addCriterion("pro_budget not in", values, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetBetween(String value1, String value2) {
            addCriterion("pro_budget between", value1, value2, "pro_budget");
            return (Criteria) this;
        }

        public Criteria andPro_budgetNotBetween(String value1, String value2) {
            addCriterion("pro_budget not between", value1, value2, "pro_budget");
            return (Criteria) this;
        }
        public Criteria andPro_statusIsNull() {
            addCriterion("pro_status is null");
            return (Criteria) this;
        }

        public Criteria andPro_statusIsNotNull() {
            addCriterion("pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andPro_statusEqualTo(String value) {
            addCriterion("pro_status =", value, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusNotEqualTo(String value) {
            addCriterion("pro_status <>", value, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusGreaterThan(String value) {
            addCriterion("pro_status>", value, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusGreaterThanOrEqualTo(String value) {
            addCriterion("pro_status >=", value, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusLessThan(String value) {
            addCriterion("pro_status <", value, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusLessThanOrEqualTo(String value) {
            addCriterion("pro_status <=", value, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusIn(List<String> values) {
            addCriterion("pro_status in", values, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusNotIn(List<String> values) {
            addCriterion("pro_status not in", values, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusBetween(String value1, String value2) {
            addCriterion("pro_status between", value1, value2, "pro_status");
            return (Criteria) this;
        }

        public Criteria andPro_statusNotBetween(String value1, String value2) {
            addCriterion("pro_status not between", value1, value2, "pro_status");
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