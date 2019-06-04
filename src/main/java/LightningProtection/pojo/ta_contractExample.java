package LightningProtection.pojo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ta_contractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ta_contractExample() {
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

        public Criteria andContract_nameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContract_nameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContract_nameEqualTo(String value) {
            addCriterion("contract_name =", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameLessThan(String value) {
            addCriterion("contract_name <", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameLike(String value) {
            addCriterion("contract_name like", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameNotLike(String value) {
            addCriterion("contract_name not like", value, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameIn(List<String> values) {
            addCriterion("contract_name in", values, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contract_name");
            return (Criteria) this;
        }

        public Criteria andContract_nameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contract_name");
            return (Criteria) this;
        }

        public Criteria andSign_dateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSign_dateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSign_dateEqualTo(String value) {
            addCriterion("sign_date =", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateNotEqualTo(String value) {
            addCriterion("sign_date <>", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateGreaterThan(String value) {
            addCriterion("sign_date >", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateGreaterThanOrEqualTo(String value) {
            addCriterion("sign_date >=", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateLessThan(String value) {
            addCriterion("sign_date <", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateLessThanOrEqualTo(String value) {
            addCriterion("sign_date <=", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateLike(String value) {
            addCriterion("sign_date like", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateNotLike(String value) {
            addCriterion("sign_date not like", value, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateIn(List<String> values) {
            addCriterion("sign_date in", values, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateNotIn(List<String> values) {
            addCriterion("sign_date not in", values, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateBetween(String value1, String value2) {
            addCriterion("sign_date between", value1, value2, "sign_date");
            return (Criteria) this;
        }

        public Criteria andSign_dateNotBetween(String value1, String value2) {
            addCriterion("sign_date not between", value1, value2, "sign_date");
            return (Criteria) this;
        }

        public Criteria andContract_amountIsNull() {
            addCriterion("contract_amount is null");
            return (Criteria) this;
        }

        public Criteria andContract_amountIsNotNull() {
            addCriterion("contract_amount is not null");
            return (Criteria) this;
        }

        public Criteria andContract_amountEqualTo(BigInteger value) {
            addCriterion("contract_amount =", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountNotEqualTo(BigInteger value) {
            addCriterion("contract_amount <>", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountGreaterThan(BigInteger value) {
            addCriterion("contract_amount >", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountGreaterThanOrEqualTo(BigInteger value) {
            addCriterion("contract_amount >=", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountLessThan(BigInteger value) {
            addCriterion("contract_amount <", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountLessThanOrEqualTo(BigInteger value) {
            addCriterion("contract_amount <=", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountLike(BigInteger value) {
            addCriterion("contract_amount like", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountNotLike(BigInteger value) {
            addCriterion("contract_amount not like", value, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountIn(List<BigInteger> values) {
            addCriterion("contract_amount in", values, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountNotIn(List<BigInteger> values) {
            addCriterion("contract_amount not in", values, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountBetween(BigInteger value1, BigInteger value2) {
            addCriterion("contract_amount between", value1, value2, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andContract_amountNotBetween(BigInteger value1, BigInteger value2) {
            addCriterion("contract_amount not between", value1, value2, "contract_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountIsNull() {
            addCriterion("received_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceived_amountIsNotNull() {
            addCriterion("received_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceived_amountEqualTo(BigInteger value) {
            addCriterion("received_amount =", value, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountNotEqualTo(BigInteger value) {
            addCriterion("received_amount <>", value, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountGreaterThan(BigInteger value) {
            addCriterion("received_amount >", value, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountGreaterThanOrEqualTo(BigInteger value) {
            addCriterion("received_amount >=", value, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountLessThan(BigInteger value) {
            addCriterion("received_amount <", value, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountLessThanOrEqualTo(BigInteger value) {
            addCriterion("received_amount <=", value, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountIn(List<BigInteger> values) {
            addCriterion("received_amount in", values, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountNotIn(List<BigInteger> values) {
            addCriterion("received_amount not in", values, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountBetween(BigInteger value1, BigInteger value2) {
            addCriterion("received_amount between", value1, value2, "received_amount");
            return (Criteria) this;
        }

        public Criteria andReceived_amountNotBetween(BigInteger value1, BigInteger value2) {
            addCriterion("received_amount not between", value1, value2, "received_amount");
            return (Criteria) this;
        }
        public Criteria andReceivable_amountIsNull() {
            addCriterion("receivable_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountIsNotNull() {
            addCriterion("receivable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountEqualTo(BigInteger value) {
            addCriterion("receivable_amount =", value, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountNotEqualTo(BigInteger value) {
            addCriterion("receivable_amount <>", value, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountGreaterThan(BigInteger value) {
            addCriterion("receivable_amount>", value, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountGreaterThanOrEqualTo(BigInteger value) {
            addCriterion("receivable_amount >=", value, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountLessThan(BigInteger value) {
            addCriterion("receivable_amount <", value, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountLessThanOrEqualTo(BigInteger value) {
            addCriterion("receivable_amount <=", value, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountIn(List<BigInteger> values) {
            addCriterion("receivable_amount in", values, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountNotIn(List<BigInteger> values) {
            addCriterion("receivable_amount not in", values, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountBetween(BigInteger value1, BigInteger value2) {
            addCriterion("receivable_amount between", value1, value2, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andReceivable_amountNotBetween(BigInteger value1, BigInteger value2) {
            addCriterion("receivable_amount not between", value1, value2, "receivable_amount");
            return (Criteria) this;
        }

        public Criteria andPayment_methodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPayment_methodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_methodEqualTo(String value) {
            addCriterion("payment_method =", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodNotEqualTo(String value) {
            addCriterion("payment_method <>", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodGreaterThan(String value) {
            addCriterion("payment_method >", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_method >=", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodLessThan(String value) {
            addCriterion("payment_method <", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodLessThanOrEqualTo(String value) {
            addCriterion("payment_method <=", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodLike(String value) {
            addCriterion("payment_method like", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodNotLike(String value) {
            addCriterion("payment_method not like", value, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodIn(List<String> values) {
            addCriterion("payment_method in", values, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodNotIn(List<String> values) {
            addCriterion("payment_method not in", values, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodBetween(String value1, String value2) {
            addCriterion("payment_method between", value1, value2, "payment_method");
            return (Criteria) this;
        }

        public Criteria andPayment_methodNotBetween(String value1, String value2) {
            addCriterion("payment_method not between", value1, value2, "payment_method");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideIsNull() {
            addCriterion("invoice_provide is null");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideIsNotNull() {
            addCriterion("invoice_provide is not null");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideEqualTo(String value) {
            addCriterion("invoice_provide =", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideNotEqualTo(String value) {
            addCriterion("invoice_provide <>", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideGreaterThan(String value) {
            addCriterion("invoice_provide >", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_provide >=", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideLessThan(String value) {
            addCriterion("invoice_provide <", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideLessThanOrEqualTo(String value) {
            addCriterion("invoice_provide <=", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideLike(String value) {
            addCriterion("invoice_provide like", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideNotLike(String value) {
            addCriterion("invoice_provide not like", value, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideIn(List<String> values) {
            addCriterion("invoice_provide in", values, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideNotIn(List<String> values) {
            addCriterion("invoice_provide not in", values, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideBetween(String value1, String value2) {
            addCriterion("invoice_provide between", value1, value2, "invoice_provide");
            return (Criteria) this;
        }

        public Criteria andInvoice_provideNotBetween(String value1, String value2) {
            addCriterion("invoice_provide not between", value1, value2, "invoice_provide");
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