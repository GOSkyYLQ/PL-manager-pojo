package LightningProtection.pojo;

        import java.util.ArrayList;
        import java.util.Date;
        import java.util.List;

public class ta_construction_unitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ta_construction_unitExample() {
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

        public Criteria andUnit_nameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnit_nameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnit_nameEqualTo(String value) {
            addCriterion("unit_name =", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameLessThan(String value) {
            addCriterion("unit_name <", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameLike(String value) {
            addCriterion("unit_name like", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameNotLike(String value) {
            addCriterion("unit_name not like", value, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameIn(List<String> values) {
            addCriterion("unit_name in", values, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_nameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unit_name");
            return (Criteria) this;
        }

        public Criteria andUnit_addressIsNull() {
            addCriterion("unit_address is null");
            return (Criteria) this;
        }

        public Criteria andUnit_addressIsNotNull() {
            addCriterion("unit_address is not null");
            return (Criteria) this;
        }

        public Criteria andUnit_addressEqualTo(String value) {
            addCriterion("unit_address =", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressNotEqualTo(String value) {
            addCriterion("unit_address <>", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressGreaterThan(String value) {
            addCriterion("unit_address >", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressGreaterThanOrEqualTo(String value) {
            addCriterion("unit_address >=", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressLessThan(String value) {
            addCriterion("unit_address <", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressLessThanOrEqualTo(String value) {
            addCriterion("unit_address <=", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressLike(String value) {
            addCriterion("unit_address like", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressNotLike(String value) {
            addCriterion("unit_address not like", value, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressIn(List<String> values) {
            addCriterion("unit_address in", values, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressNotIn(List<String> values) {
            addCriterion("unit_address not in", values, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressBetween(String value1, String value2) {
            addCriterion("unit_address between", value1, value2, "unit_address");
            return (Criteria) this;
        }

        public Criteria andUnit_addressNotBetween(String value1, String value2) {
            addCriterion("unit_address not between", value1, value2, "unit_address");
            return (Criteria) this;
        }
        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLea_mobileIsNull() {
            addCriterion("lea_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLea_mobileIsNotNull() {
            addCriterion("lea_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLea_mobileEqualTo(String value) {
            addCriterion("lea_mobile =", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileNotEqualTo(String value) {
            addCriterion("lea_mobile <>", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileGreaterThan(String value) {
            addCriterion("lea_mobile >", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("lea_mobile >=", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileLessThan(String value) {
            addCriterion("lea_mobile <", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileLessThanOrEqualTo(String value) {
            addCriterion("lea_mobile <=", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileLike(String value) {
            addCriterion("lea_mobile like", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileNotLike(String value) {
            addCriterion("lea_mobile not like", value, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileIn(List<String> values) {
            addCriterion("lea_mobile in", values, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileNotIn(List<String> values) {
            addCriterion("lea_mobile not in", values, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileBetween(String value1, String value2) {
            addCriterion("lea_mobile between", value1, value2, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andLea_mobileNotBetween(String value1, String value2) {
            addCriterion("lea_mobile not between", value1, value2, "lea_mobile");
            return (Criteria) this;
        }

        public Criteria andHea_mobileIsNull() {
            addCriterion("hea_mobile is null");
            return (Criteria) this;
        }

        public Criteria andHea_mobileIsNotNull() {
            addCriterion("head_mobile is not null");
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

        public Criteria andHeaIsNull() {
            addCriterion("hea is null");
            return (Criteria) this;
        }

        public Criteria andHeaIsNotNull() {
            addCriterion("hea is not null");
            return (Criteria) this;
        }

        public Criteria andHeaEqualTo(String value) {
            addCriterion("hea =", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaNotEqualTo(String value) {
            addCriterion("hea <>", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaGreaterThan(String value) {
            addCriterion("hea >", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaGreaterThanOrEqualTo(String value) {
            addCriterion("hea >=", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaLessThan(String value) {
            addCriterion("hea <", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaLessThanOrEqualTo(String value) {
            addCriterion("hea <=", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaLike(String value) {
            addCriterion("hea like", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaNotLike(String value) {
            addCriterion("hea not like", value, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaIn(List<String> values) {
            addCriterion("hea in", values, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaNotIn(List<String> values) {
            addCriterion("hea not in", values, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaBetween(String value1, String value2) {
            addCriterion("hea between", value1, value2, "hea");
            return (Criteria) this;
        }

        public Criteria andHeaNotBetween(String value1, String value2) {
            addCriterion("hea not between", value1, value2, "hea");
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