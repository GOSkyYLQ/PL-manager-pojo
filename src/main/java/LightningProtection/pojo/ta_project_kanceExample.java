package LightningProtection.pojo;

import java.util.ArrayList;
import java.util.List;

public class ta_project_kanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ta_project_kanceExample() {
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

        public Criteria andPro_passwIsNull() {
            addCriterion("pro_passw is null");
            return (Criteria) this;
        }

        public Criteria andPro_passwIsNotNull() {
            addCriterion("pro_passw is not null");
            return (Criteria) this;
        }

        public Criteria andPro_passwEqualTo(String value) {
            addCriterion("pro_passw =", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwNotEqualTo(String value) {
            addCriterion("pro_passw <>", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwGreaterThan(String value) {
            addCriterion("pro_passw >", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwGreaterThanOrEqualTo(String value) {
            addCriterion("pro_passw >=", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwLessThan(String value) {
            addCriterion("pro_passw <", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwLessThanOrEqualTo(String value) {
            addCriterion("pro_passw <=", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwLike(String value) {
            addCriterion("pro_passw like", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwNotLike(String value) {
            addCriterion("pro_passw not like", value, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwIn(List<String> values) {
            addCriterion("pro_passw in", values, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwNotIn(List<String> values) {
            addCriterion("pro_passw not in", values, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwBetween(String value1, String value2) {
            addCriterion("pro_passw between", value1, value2, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andPro_passwNotBetween(String value1, String value2) {
            addCriterion("pro_passw not between", value1, value2, "pro_passw");
            return (Criteria) this;
        }

        public Criteria andGroup_memberIsNull() {
            addCriterion("group_member is null");
            return (Criteria) this;
        }

        public Criteria andGroup_memberIsNotNull() {
            addCriterion("group_member is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_memberEqualTo(String value) {
            addCriterion("group_member =", value, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberNotEqualTo(String value) {
            addCriterion("group_member <>", value, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberGreaterThan(String value) {
            addCriterion("group_member >", value, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberGreaterThanOrEqualTo(String value) {
            addCriterion("group_member >=", value, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberLessThan(String value) {
            addCriterion("group_member <", value, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberLessThanOrEqualTo(String value) {
            addCriterion("group_member <=", value, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberIn(List<String> values) {
            addCriterion("group_member in", values, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberNotIn(List<String> values) {
            addCriterion("group_member not in", values, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberBetween(String value1, String value2) {
            addCriterion("group_member between", value1, value2, "group_member");
            return (Criteria) this;
        }

        public Criteria andGroup_memberNotBetween(String value1, String value2) {
            addCriterion("group_member not between", value1, value2, "group_member");
            return (Criteria) this;
        }
        public Criteria andKance_timeIsNull() {
            addCriterion("kance_time is null");
            return (Criteria) this;
        }

        public Criteria andKance_timeIsNotNull() {
            addCriterion("kance_time is not null");
            return (Criteria) this;
        }

        public Criteria andKance_timeEqualTo(String value) {
            addCriterion("kance_time =", value, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeNotEqualTo(String value) {
            addCriterion("kance_time <>", value, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeGreaterThan(String value) {
            addCriterion("kance_time>", value, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeGreaterThanOrEqualTo(String value) {
            addCriterion("kance_time >=", value, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeLessThan(String value) {
            addCriterion("kance_time <", value, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeLessThanOrEqualTo(String value) {
            addCriterion("kance_time <=", value, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeIn(List<String> values) {
            addCriterion("kance_time in", values, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeNotIn(List<String> values) {
            addCriterion("kance_time not in", values, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeBetween(String value1, String value2) {
            addCriterion("kance_time between", value1, value2, "kance_time");
            return (Criteria) this;
        }

        public Criteria andKance_timeNotBetween(String value1, String value2) {
            addCriterion("kance_time not between", value1, value2, "kance_time");
            return (Criteria) this;
        }

        public Criteria andPaper_handleIsNull() {
            addCriterion("paper_handle is null");
            return (Criteria) this;
        }

        public Criteria andPaper_handleIsNotNull() {
            addCriterion("paper_handle is not null");
            return (Criteria) this;
        }

        public Criteria andPaper_handleEqualTo(String value) {
            addCriterion("paper_handle =", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleNotEqualTo(String value) {
            addCriterion("paper_handle <>", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleGreaterThan(String value) {
            addCriterion("paper_handle >", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleGreaterThanOrEqualTo(String value) {
            addCriterion("paper_handle >=", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleLessThan(String value) {
            addCriterion("paper_handle <", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleLessThanOrEqualTo(String value) {
            addCriterion("paper_handle <=", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleLike(String value) {
            addCriterion("paper_handle like", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleNotLike(String value) {
            addCriterion("paper_handle not like", value, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleIn(List<String> values) {
            addCriterion("paper_handle in", values, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleNotIn(List<String> values) {
            addCriterion("paper_handle not in", values, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleBetween(String value1, String value2) {
            addCriterion("paper_handle between", value1, value2, "paper_handle");
            return (Criteria) this;
        }

        public Criteria andPaper_handleNotBetween(String value1, String value2) {
            addCriterion("paper_handle not between", value1, value2, "paper_handle");
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