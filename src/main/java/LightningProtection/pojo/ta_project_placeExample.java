package LightningProtection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ta_project_placeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ta_project_placeExample() {
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

        public Criteria andPro_placeIsNull() {
            addCriterion("pro_place is null");
            return (Criteria) this;
        }

        public Criteria andPro_placeIsNotNull() {
            addCriterion("pro_place is not null");
            return (Criteria) this;
        }

        public Criteria andPro_placeEqualTo(String value) {
            addCriterion("pro_place =", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeNotEqualTo(String value) {
            addCriterion("pro_place <>", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeGreaterThan(String value) {
            addCriterion("pro_place >", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_place >=", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeLessThan(String value) {
            addCriterion("pro_place <", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeLessThanOrEqualTo(String value) {
            addCriterion("pro_place <=", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeLike(String value) {
            addCriterion("pro_place like", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeNotLike(String value) {
            addCriterion("pro_place not like", value, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeIn(List<String> values) {
            addCriterion("pro_place in", values, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeNotIn(List<String> values) {
            addCriterion("pro_place not in", values, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeBetween(String value1, String value2) {
            addCriterion("pro_place between", value1, value2, "pro_place");
            return (Criteria) this;
        }

        public Criteria andPro_placeNotBetween(String value1, String value2) {
            addCriterion("pro_place not between", value1, value2, "pro_place");
            return (Criteria) this;
        }

        public Criteria andContact_wayIsNull() {
            addCriterion("contact_way is null");
            return (Criteria) this;
        }

        public Criteria andContact_wayIsNotNull() {
            addCriterion("contact_way is not null");
            return (Criteria) this;
        }

        public Criteria andContact_wayEqualTo(String value) {
            addCriterion("contact_way =", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayNotEqualTo(String value) {
            addCriterion("contact_way <>", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayGreaterThan(String value) {
            addCriterion("contact_way >", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayGreaterThanOrEqualTo(String value) {
            addCriterion("contact_way >=", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayLessThan(String value) {
            addCriterion("contact_way <", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayLessThanOrEqualTo(String value) {
            addCriterion("contact_way <=", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayLike(String value) {
            addCriterion("contact_way like", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayNotLike(String value) {
            addCriterion("contact_way not like", value, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayIn(List<String> values) {
            addCriterion("contact_way in", values, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayNotIn(List<String> values) {
            addCriterion("contact_way not in", values, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayBetween(String value1, String value2) {
            addCriterion("contact_way between", value1, value2, "contact_way");
            return (Criteria) this;
        }

        public Criteria andContact_wayNotBetween(String value1, String value2) {
            addCriterion("contact_way not between", value1, value2, "contact_way");
            return (Criteria) this;
        }
        public Criteria andSuperior_deptIsNull() {
            addCriterion("superior_dept is null");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptIsNotNull() {
            addCriterion("superior_dept is not null");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptEqualTo(String value) {
            addCriterion("Superior_dept =", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptNotEqualTo(String value) {
            addCriterion("Superior_dept <>", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptGreaterThan(String value) {
            addCriterion("Superior_dept >", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptGreaterThanOrEqualTo(String value) {
            addCriterion("Superior_dept >=", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptLessThan(String value) {
            addCriterion("Superior_dept <", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptLessThanOrEqualTo(String value) {
            addCriterion("Superior_dept <=", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptLike(String value) {
            addCriterion("Superior_dept like", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptNotLike(String value) {
            addCriterion("Superior_dept not like", value, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptIn(List<String> values) {
            addCriterion("Superior_dept in", values, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptNotIn(List<String> values) {
            addCriterion("Superior_dept not in", values, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptBetween(String value1, String value2) {
            addCriterion("Superior_dept between", value1, value2, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andSuperior_deptNotBetween(String value1, String value2) {
            addCriterion("Superior_dept not between", value1, value2, "Superior_dept");
            return (Criteria) this;
        }

        public Criteria andDept_leaderIsNull() {
            addCriterion("dept_leader is null");
            return (Criteria) this;
        }

        public Criteria andDept_leaderIsNotNull() {
            addCriterion("dept_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDept_leaderEqualTo(String value) {
            addCriterion("dept_leader =", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderNotEqualTo(String value) {
            addCriterion("dept_leader <>", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderGreaterThan(String value) {
            addCriterion("dept_leader >", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderGreaterThanOrEqualTo(String value) {
            addCriterion("dept_leader >=", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderLessThan(String value) {
            addCriterion("dept_leader <", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderLessThanOrEqualTo(String value) {
            addCriterion("dept_leader <=", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderLike(String value) {
            addCriterion("dept_leader like", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderNotLike(String value) {
            addCriterion("dept_leader not like", value, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderIn(List<String> values) {
            addCriterion("dept_leader in", values, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderNotIn(List<String> values) {
            addCriterion("dept_leader not in", values, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderBetween(String value1, String value2) {
            addCriterion("dept_leader between", value1, value2, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andDept_leaderNotBetween(String value1, String value2) {
            addCriterion("dept_leader not between", value1, value2, "dept_leader");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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