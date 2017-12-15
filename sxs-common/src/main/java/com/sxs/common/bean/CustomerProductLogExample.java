package com.sxs.common.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerProductLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerProductLogExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
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

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customerName =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customerName >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customerName <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customerName like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customerName not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customerName in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customerPhone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customerPhone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customerPhone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customerPhone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customerPhone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customerPhone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customerPhone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customerPhone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customerPhone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customerPhone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customerPhone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customerPhone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterionForJDBCDate("orderTime =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderTime <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("orderTime >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderTime >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterionForJDBCDate("orderTime <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderTime <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterionForJDBCDate("orderTime in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderTime not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderTime between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderTime not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("sendTime =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("sendTime <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("sendTime >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendTime >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("sendTime <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("sendTime <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("sendTime in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("sendTime not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("sendTime between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("sendTime not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("companyName =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("companyName <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("companyName like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("companyName not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("companyName in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andTbAccNoIsNull() {
            addCriterion("tbAccNo is null");
            return (Criteria) this;
        }

        public Criteria andTbAccNoIsNotNull() {
            addCriterion("tbAccNo is not null");
            return (Criteria) this;
        }

        public Criteria andTbAccNoEqualTo(String value) {
            addCriterion("tbAccNo =", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoNotEqualTo(String value) {
            addCriterion("tbAccNo <>", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoGreaterThan(String value) {
            addCriterion("tbAccNo >", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbAccNo >=", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoLessThan(String value) {
            addCriterion("tbAccNo <", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoLessThanOrEqualTo(String value) {
            addCriterion("tbAccNo <=", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoLike(String value) {
            addCriterion("tbAccNo like", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoNotLike(String value) {
            addCriterion("tbAccNo not like", value, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoIn(List<String> values) {
            addCriterion("tbAccNo in", values, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoNotIn(List<String> values) {
            addCriterion("tbAccNo not in", values, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoBetween(String value1, String value2) {
            addCriterion("tbAccNo between", value1, value2, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbAccNoNotBetween(String value1, String value2) {
            addCriterion("tbAccNo not between", value1, value2, "tbAccNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoIsNull() {
            addCriterion("tbOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoIsNotNull() {
            addCriterion("tbOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoEqualTo(String value) {
            addCriterion("tbOrderNo =", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoNotEqualTo(String value) {
            addCriterion("tbOrderNo <>", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoGreaterThan(String value) {
            addCriterion("tbOrderNo >", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbOrderNo >=", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoLessThan(String value) {
            addCriterion("tbOrderNo <", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoLessThanOrEqualTo(String value) {
            addCriterion("tbOrderNo <=", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoLike(String value) {
            addCriterion("tbOrderNo like", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoNotLike(String value) {
            addCriterion("tbOrderNo not like", value, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoIn(List<String> values) {
            addCriterion("tbOrderNo in", values, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoNotIn(List<String> values) {
            addCriterion("tbOrderNo not in", values, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoBetween(String value1, String value2) {
            addCriterion("tbOrderNo between", value1, value2, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbOrderNoNotBetween(String value1, String value2) {
            addCriterion("tbOrderNo not between", value1, value2, "tbOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("orderNo <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("orderNo like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andWechartIsNull() {
            addCriterion("wechart is null");
            return (Criteria) this;
        }

        public Criteria andWechartIsNotNull() {
            addCriterion("wechart is not null");
            return (Criteria) this;
        }

        public Criteria andWechartEqualTo(String value) {
            addCriterion("wechart =", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotEqualTo(String value) {
            addCriterion("wechart <>", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartGreaterThan(String value) {
            addCriterion("wechart >", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartGreaterThanOrEqualTo(String value) {
            addCriterion("wechart >=", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartLessThan(String value) {
            addCriterion("wechart <", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartLessThanOrEqualTo(String value) {
            addCriterion("wechart <=", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartLike(String value) {
            addCriterion("wechart like", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotLike(String value) {
            addCriterion("wechart not like", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartIn(List<String> values) {
            addCriterion("wechart in", values, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotIn(List<String> values) {
            addCriterion("wechart not in", values, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartBetween(String value1, String value2) {
            addCriterion("wechart between", value1, value2, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotBetween(String value1, String value2) {
            addCriterion("wechart not between", value1, value2, "wechart");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customerSex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customerSex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(Short value) {
            addCriterion("customerSex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(Short value) {
            addCriterion("customerSex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(Short value) {
            addCriterion("customerSex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(Short value) {
            addCriterion("customerSex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(Short value) {
            addCriterion("customerSex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(Short value) {
            addCriterion("customerSex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<Short> values) {
            addCriterion("customerSex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<Short> values) {
            addCriterion("customerSex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(Short value1, Short value2) {
            addCriterion("customerSex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(Short value1, Short value2) {
            addCriterion("customerSex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andClothNoIsNull() {
            addCriterion("clothNo is null");
            return (Criteria) this;
        }

        public Criteria andClothNoIsNotNull() {
            addCriterion("clothNo is not null");
            return (Criteria) this;
        }

        public Criteria andClothNoEqualTo(String value) {
            addCriterion("clothNo =", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoNotEqualTo(String value) {
            addCriterion("clothNo <>", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoGreaterThan(String value) {
            addCriterion("clothNo >", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoGreaterThanOrEqualTo(String value) {
            addCriterion("clothNo >=", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoLessThan(String value) {
            addCriterion("clothNo <", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoLessThanOrEqualTo(String value) {
            addCriterion("clothNo <=", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoLike(String value) {
            addCriterion("clothNo like", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoNotLike(String value) {
            addCriterion("clothNo not like", value, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoIn(List<String> values) {
            addCriterion("clothNo in", values, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoNotIn(List<String> values) {
            addCriterion("clothNo not in", values, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoBetween(String value1, String value2) {
            addCriterion("clothNo between", value1, value2, "clothNo");
            return (Criteria) this;
        }

        public Criteria andClothNoNotBetween(String value1, String value2) {
            addCriterion("clothNo not between", value1, value2, "clothNo");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("orderAmount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("orderAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("orderAmount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("orderAmount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("orderAmount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderAmount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("orderAmount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderAmount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("orderAmount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("orderAmount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderAmount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderAmount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("depositAmount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("depositAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(BigDecimal value) {
            addCriterion("depositAmount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("depositAmount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("depositAmount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("depositAmount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(BigDecimal value) {
            addCriterion("depositAmount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("depositAmount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<BigDecimal> values) {
            addCriterion("depositAmount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("depositAmount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depositAmount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depositAmount not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andClothDescIsNull() {
            addCriterion("clothDesc is null");
            return (Criteria) this;
        }

        public Criteria andClothDescIsNotNull() {
            addCriterion("clothDesc is not null");
            return (Criteria) this;
        }

        public Criteria andClothDescEqualTo(String value) {
            addCriterion("clothDesc =", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescNotEqualTo(String value) {
            addCriterion("clothDesc <>", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescGreaterThan(String value) {
            addCriterion("clothDesc >", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescGreaterThanOrEqualTo(String value) {
            addCriterion("clothDesc >=", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescLessThan(String value) {
            addCriterion("clothDesc <", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescLessThanOrEqualTo(String value) {
            addCriterion("clothDesc <=", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescLike(String value) {
            addCriterion("clothDesc like", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescNotLike(String value) {
            addCriterion("clothDesc not like", value, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescIn(List<String> values) {
            addCriterion("clothDesc in", values, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescNotIn(List<String> values) {
            addCriterion("clothDesc not in", values, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescBetween(String value1, String value2) {
            addCriterion("clothDesc between", value1, value2, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andClothDescNotBetween(String value1, String value2) {
            addCriterion("clothDesc not between", value1, value2, "clothDesc");
            return (Criteria) this;
        }

        public Criteria andBodyStatusIsNull() {
            addCriterion("bodyStatus is null");
            return (Criteria) this;
        }

        public Criteria andBodyStatusIsNotNull() {
            addCriterion("bodyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBodyStatusEqualTo(Short value) {
            addCriterion("bodyStatus =", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotEqualTo(Short value) {
            addCriterion("bodyStatus <>", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusGreaterThan(Short value) {
            addCriterion("bodyStatus >", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("bodyStatus >=", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusLessThan(Short value) {
            addCriterion("bodyStatus <", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusLessThanOrEqualTo(Short value) {
            addCriterion("bodyStatus <=", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusIn(List<Short> values) {
            addCriterion("bodyStatus in", values, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotIn(List<Short> values) {
            addCriterion("bodyStatus not in", values, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusBetween(Short value1, Short value2) {
            addCriterion("bodyStatus between", value1, value2, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotBetween(Short value1, Short value2) {
            addCriterion("bodyStatus not between", value1, value2, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("sendStatus is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("sendStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(Short value) {
            addCriterion("sendStatus =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(Short value) {
            addCriterion("sendStatus <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(Short value) {
            addCriterion("sendStatus >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sendStatus >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(Short value) {
            addCriterion("sendStatus <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(Short value) {
            addCriterion("sendStatus <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<Short> values) {
            addCriterion("sendStatus in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<Short> values) {
            addCriterion("sendStatus not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(Short value1, Short value2) {
            addCriterion("sendStatus between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(Short value1, Short value2) {
            addCriterion("sendStatus not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andQycNumIsNull() {
            addCriterion("qycNum is null");
            return (Criteria) this;
        }

        public Criteria andQycNumIsNotNull() {
            addCriterion("qycNum is not null");
            return (Criteria) this;
        }

        public Criteria andQycNumEqualTo(String value) {
            addCriterion("qycNum =", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumNotEqualTo(String value) {
            addCriterion("qycNum <>", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumGreaterThan(String value) {
            addCriterion("qycNum >", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumGreaterThanOrEqualTo(String value) {
            addCriterion("qycNum >=", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumLessThan(String value) {
            addCriterion("qycNum <", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumLessThanOrEqualTo(String value) {
            addCriterion("qycNum <=", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumLike(String value) {
            addCriterion("qycNum like", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumNotLike(String value) {
            addCriterion("qycNum not like", value, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumIn(List<String> values) {
            addCriterion("qycNum in", values, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumNotIn(List<String> values) {
            addCriterion("qycNum not in", values, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumBetween(String value1, String value2) {
            addCriterion("qycNum between", value1, value2, "qycNum");
            return (Criteria) this;
        }

        public Criteria andQycNumNotBetween(String value1, String value2) {
            addCriterion("qycNum not between", value1, value2, "qycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumIsNull() {
            addCriterion("hycNum is null");
            return (Criteria) this;
        }

        public Criteria andHycNumIsNotNull() {
            addCriterion("hycNum is not null");
            return (Criteria) this;
        }

        public Criteria andHycNumEqualTo(String value) {
            addCriterion("hycNum =", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumNotEqualTo(String value) {
            addCriterion("hycNum <>", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumGreaterThan(String value) {
            addCriterion("hycNum >", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumGreaterThanOrEqualTo(String value) {
            addCriterion("hycNum >=", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumLessThan(String value) {
            addCriterion("hycNum <", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumLessThanOrEqualTo(String value) {
            addCriterion("hycNum <=", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumLike(String value) {
            addCriterion("hycNum like", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumNotLike(String value) {
            addCriterion("hycNum not like", value, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumIn(List<String> values) {
            addCriterion("hycNum in", values, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumNotIn(List<String> values) {
            addCriterion("hycNum not in", values, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumBetween(String value1, String value2) {
            addCriterion("hycNum between", value1, value2, "hycNum");
            return (Criteria) this;
        }

        public Criteria andHycNumNotBetween(String value1, String value2) {
            addCriterion("hycNum not between", value1, value2, "hycNum");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNull() {
            addCriterion("kcNum is null");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNotNull() {
            addCriterion("kcNum is not null");
            return (Criteria) this;
        }

        public Criteria andKcNumEqualTo(String value) {
            addCriterion("kcNum =", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotEqualTo(String value) {
            addCriterion("kcNum <>", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThan(String value) {
            addCriterion("kcNum >", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThanOrEqualTo(String value) {
            addCriterion("kcNum >=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThan(String value) {
            addCriterion("kcNum <", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThanOrEqualTo(String value) {
            addCriterion("kcNum <=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLike(String value) {
            addCriterion("kcNum like", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotLike(String value) {
            addCriterion("kcNum not like", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumIn(List<String> values) {
            addCriterion("kcNum in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotIn(List<String> values) {
            addCriterion("kcNum not in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumBetween(String value1, String value2) {
            addCriterion("kcNum between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotBetween(String value1, String value2) {
            addCriterion("kcNum not between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumIsNull() {
            addCriterion("qcNum is null");
            return (Criteria) this;
        }

        public Criteria andQcNumIsNotNull() {
            addCriterion("qcNum is not null");
            return (Criteria) this;
        }

        public Criteria andQcNumEqualTo(String value) {
            addCriterion("qcNum =", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumNotEqualTo(String value) {
            addCriterion("qcNum <>", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumGreaterThan(String value) {
            addCriterion("qcNum >", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumGreaterThanOrEqualTo(String value) {
            addCriterion("qcNum >=", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumLessThan(String value) {
            addCriterion("qcNum <", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumLessThanOrEqualTo(String value) {
            addCriterion("qcNum <=", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumLike(String value) {
            addCriterion("qcNum like", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumNotLike(String value) {
            addCriterion("qcNum not like", value, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumIn(List<String> values) {
            addCriterion("qcNum in", values, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumNotIn(List<String> values) {
            addCriterion("qcNum not in", values, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumBetween(String value1, String value2) {
            addCriterion("qcNum between", value1, value2, "qcNum");
            return (Criteria) this;
        }

        public Criteria andQcNumNotBetween(String value1, String value2) {
            addCriterion("qcNum not between", value1, value2, "qcNum");
            return (Criteria) this;
        }

        public Criteria andXwNumIsNull() {
            addCriterion("xwNum is null");
            return (Criteria) this;
        }

        public Criteria andXwNumIsNotNull() {
            addCriterion("xwNum is not null");
            return (Criteria) this;
        }

        public Criteria andXwNumEqualTo(String value) {
            addCriterion("xwNum =", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumNotEqualTo(String value) {
            addCriterion("xwNum <>", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumGreaterThan(String value) {
            addCriterion("xwNum >", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumGreaterThanOrEqualTo(String value) {
            addCriterion("xwNum >=", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumLessThan(String value) {
            addCriterion("xwNum <", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumLessThanOrEqualTo(String value) {
            addCriterion("xwNum <=", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumLike(String value) {
            addCriterion("xwNum like", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumNotLike(String value) {
            addCriterion("xwNum not like", value, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumIn(List<String> values) {
            addCriterion("xwNum in", values, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumNotIn(List<String> values) {
            addCriterion("xwNum not in", values, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumBetween(String value1, String value2) {
            addCriterion("xwNum between", value1, value2, "xwNum");
            return (Criteria) this;
        }

        public Criteria andXwNumNotBetween(String value1, String value2) {
            addCriterion("xwNum not between", value1, value2, "xwNum");
            return (Criteria) this;
        }

        public Criteria andYwNumIsNull() {
            addCriterion("ywNum is null");
            return (Criteria) this;
        }

        public Criteria andYwNumIsNotNull() {
            addCriterion("ywNum is not null");
            return (Criteria) this;
        }

        public Criteria andYwNumEqualTo(String value) {
            addCriterion("ywNum =", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumNotEqualTo(String value) {
            addCriterion("ywNum <>", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumGreaterThan(String value) {
            addCriterion("ywNum >", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumGreaterThanOrEqualTo(String value) {
            addCriterion("ywNum >=", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumLessThan(String value) {
            addCriterion("ywNum <", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumLessThanOrEqualTo(String value) {
            addCriterion("ywNum <=", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumLike(String value) {
            addCriterion("ywNum like", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumNotLike(String value) {
            addCriterion("ywNum not like", value, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumIn(List<String> values) {
            addCriterion("ywNum in", values, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumNotIn(List<String> values) {
            addCriterion("ywNum not in", values, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumBetween(String value1, String value2) {
            addCriterion("ywNum between", value1, value2, "ywNum");
            return (Criteria) this;
        }

        public Criteria andYwNumNotBetween(String value1, String value2) {
            addCriterion("ywNum not between", value1, value2, "ywNum");
            return (Criteria) this;
        }

        public Criteria andXbNumIsNull() {
            addCriterion("xbNum is null");
            return (Criteria) this;
        }

        public Criteria andXbNumIsNotNull() {
            addCriterion("xbNum is not null");
            return (Criteria) this;
        }

        public Criteria andXbNumEqualTo(String value) {
            addCriterion("xbNum =", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumNotEqualTo(String value) {
            addCriterion("xbNum <>", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumGreaterThan(String value) {
            addCriterion("xbNum >", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumGreaterThanOrEqualTo(String value) {
            addCriterion("xbNum >=", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumLessThan(String value) {
            addCriterion("xbNum <", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumLessThanOrEqualTo(String value) {
            addCriterion("xbNum <=", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumLike(String value) {
            addCriterion("xbNum like", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumNotLike(String value) {
            addCriterion("xbNum not like", value, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumIn(List<String> values) {
            addCriterion("xbNum in", values, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumNotIn(List<String> values) {
            addCriterion("xbNum not in", values, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumBetween(String value1, String value2) {
            addCriterion("xbNum between", value1, value2, "xbNum");
            return (Criteria) this;
        }

        public Criteria andXbNumNotBetween(String value1, String value2) {
            addCriterion("xbNum not between", value1, value2, "xbNum");
            return (Criteria) this;
        }

        public Criteria andTwNumIsNull() {
            addCriterion("twNum is null");
            return (Criteria) this;
        }

        public Criteria andTwNumIsNotNull() {
            addCriterion("twNum is not null");
            return (Criteria) this;
        }

        public Criteria andTwNumEqualTo(String value) {
            addCriterion("twNum =", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumNotEqualTo(String value) {
            addCriterion("twNum <>", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumGreaterThan(String value) {
            addCriterion("twNum >", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumGreaterThanOrEqualTo(String value) {
            addCriterion("twNum >=", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumLessThan(String value) {
            addCriterion("twNum <", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumLessThanOrEqualTo(String value) {
            addCriterion("twNum <=", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumLike(String value) {
            addCriterion("twNum like", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumNotLike(String value) {
            addCriterion("twNum not like", value, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumIn(List<String> values) {
            addCriterion("twNum in", values, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumNotIn(List<String> values) {
            addCriterion("twNum not in", values, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumBetween(String value1, String value2) {
            addCriterion("twNum between", value1, value2, "twNum");
            return (Criteria) this;
        }

        public Criteria andTwNumNotBetween(String value1, String value2) {
            addCriterion("twNum not between", value1, value2, "twNum");
            return (Criteria) this;
        }

        public Criteria andJkNumIsNull() {
            addCriterion("jkNum is null");
            return (Criteria) this;
        }

        public Criteria andJkNumIsNotNull() {
            addCriterion("jkNum is not null");
            return (Criteria) this;
        }

        public Criteria andJkNumEqualTo(String value) {
            addCriterion("jkNum =", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumNotEqualTo(String value) {
            addCriterion("jkNum <>", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumGreaterThan(String value) {
            addCriterion("jkNum >", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumGreaterThanOrEqualTo(String value) {
            addCriterion("jkNum >=", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumLessThan(String value) {
            addCriterion("jkNum <", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumLessThanOrEqualTo(String value) {
            addCriterion("jkNum <=", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumLike(String value) {
            addCriterion("jkNum like", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumNotLike(String value) {
            addCriterion("jkNum not like", value, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumIn(List<String> values) {
            addCriterion("jkNum in", values, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumNotIn(List<String> values) {
            addCriterion("jkNum not in", values, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumBetween(String value1, String value2) {
            addCriterion("jkNum between", value1, value2, "jkNum");
            return (Criteria) this;
        }

        public Criteria andJkNumNotBetween(String value1, String value2) {
            addCriterion("jkNum not between", value1, value2, "jkNum");
            return (Criteria) this;
        }

        public Criteria andHdNumIsNull() {
            addCriterion("hdNum is null");
            return (Criteria) this;
        }

        public Criteria andHdNumIsNotNull() {
            addCriterion("hdNum is not null");
            return (Criteria) this;
        }

        public Criteria andHdNumEqualTo(String value) {
            addCriterion("hdNum =", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumNotEqualTo(String value) {
            addCriterion("hdNum <>", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumGreaterThan(String value) {
            addCriterion("hdNum >", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumGreaterThanOrEqualTo(String value) {
            addCriterion("hdNum >=", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumLessThan(String value) {
            addCriterion("hdNum <", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumLessThanOrEqualTo(String value) {
            addCriterion("hdNum <=", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumLike(String value) {
            addCriterion("hdNum like", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumNotLike(String value) {
            addCriterion("hdNum not like", value, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumIn(List<String> values) {
            addCriterion("hdNum in", values, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumNotIn(List<String> values) {
            addCriterion("hdNum not in", values, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumBetween(String value1, String value2) {
            addCriterion("hdNum between", value1, value2, "hdNum");
            return (Criteria) this;
        }

        public Criteria andHdNumNotBetween(String value1, String value2) {
            addCriterion("hdNum not between", value1, value2, "hdNum");
            return (Criteria) this;
        }

        public Criteria andXcNumIsNull() {
            addCriterion("xcNum is null");
            return (Criteria) this;
        }

        public Criteria andXcNumIsNotNull() {
            addCriterion("xcNum is not null");
            return (Criteria) this;
        }

        public Criteria andXcNumEqualTo(String value) {
            addCriterion("xcNum =", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumNotEqualTo(String value) {
            addCriterion("xcNum <>", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumGreaterThan(String value) {
            addCriterion("xcNum >", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumGreaterThanOrEqualTo(String value) {
            addCriterion("xcNum >=", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumLessThan(String value) {
            addCriterion("xcNum <", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumLessThanOrEqualTo(String value) {
            addCriterion("xcNum <=", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumLike(String value) {
            addCriterion("xcNum like", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumNotLike(String value) {
            addCriterion("xcNum not like", value, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumIn(List<String> values) {
            addCriterion("xcNum in", values, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumNotIn(List<String> values) {
            addCriterion("xcNum not in", values, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumBetween(String value1, String value2) {
            addCriterion("xcNum between", value1, value2, "xcNum");
            return (Criteria) this;
        }

        public Criteria andXcNumNotBetween(String value1, String value2) {
            addCriterion("xcNum not between", value1, value2, "xcNum");
            return (Criteria) this;
        }

        public Criteria andZdNumIsNull() {
            addCriterion("zdNum is null");
            return (Criteria) this;
        }

        public Criteria andZdNumIsNotNull() {
            addCriterion("zdNum is not null");
            return (Criteria) this;
        }

        public Criteria andZdNumEqualTo(String value) {
            addCriterion("zdNum =", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumNotEqualTo(String value) {
            addCriterion("zdNum <>", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumGreaterThan(String value) {
            addCriterion("zdNum >", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumGreaterThanOrEqualTo(String value) {
            addCriterion("zdNum >=", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumLessThan(String value) {
            addCriterion("zdNum <", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumLessThanOrEqualTo(String value) {
            addCriterion("zdNum <=", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumLike(String value) {
            addCriterion("zdNum like", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumNotLike(String value) {
            addCriterion("zdNum not like", value, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumIn(List<String> values) {
            addCriterion("zdNum in", values, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumNotIn(List<String> values) {
            addCriterion("zdNum not in", values, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumBetween(String value1, String value2) {
            addCriterion("zdNum between", value1, value2, "zdNum");
            return (Criteria) this;
        }

        public Criteria andZdNumNotBetween(String value1, String value2) {
            addCriterion("zdNum not between", value1, value2, "zdNum");
            return (Criteria) this;
        }

        public Criteria andXkNumIsNull() {
            addCriterion("xkNum is null");
            return (Criteria) this;
        }

        public Criteria andXkNumIsNotNull() {
            addCriterion("xkNum is not null");
            return (Criteria) this;
        }

        public Criteria andXkNumEqualTo(String value) {
            addCriterion("xkNum =", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumNotEqualTo(String value) {
            addCriterion("xkNum <>", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumGreaterThan(String value) {
            addCriterion("xkNum >", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumGreaterThanOrEqualTo(String value) {
            addCriterion("xkNum >=", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumLessThan(String value) {
            addCriterion("xkNum <", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumLessThanOrEqualTo(String value) {
            addCriterion("xkNum <=", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumLike(String value) {
            addCriterion("xkNum like", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumNotLike(String value) {
            addCriterion("xkNum not like", value, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumIn(List<String> values) {
            addCriterion("xkNum in", values, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumNotIn(List<String> values) {
            addCriterion("xkNum not in", values, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumBetween(String value1, String value2) {
            addCriterion("xkNum between", value1, value2, "xkNum");
            return (Criteria) this;
        }

        public Criteria andXkNumNotBetween(String value1, String value2) {
            addCriterion("xkNum not between", value1, value2, "xkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumIsNull() {
            addCriterion("kjkNum is null");
            return (Criteria) this;
        }

        public Criteria andKjkNumIsNotNull() {
            addCriterion("kjkNum is not null");
            return (Criteria) this;
        }

        public Criteria andKjkNumEqualTo(String value) {
            addCriterion("kjkNum =", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumNotEqualTo(String value) {
            addCriterion("kjkNum <>", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumGreaterThan(String value) {
            addCriterion("kjkNum >", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumGreaterThanOrEqualTo(String value) {
            addCriterion("kjkNum >=", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumLessThan(String value) {
            addCriterion("kjkNum <", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumLessThanOrEqualTo(String value) {
            addCriterion("kjkNum <=", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumLike(String value) {
            addCriterion("kjkNum like", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumNotLike(String value) {
            addCriterion("kjkNum not like", value, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumIn(List<String> values) {
            addCriterion("kjkNum in", values, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumNotIn(List<String> values) {
            addCriterion("kjkNum not in", values, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumBetween(String value1, String value2) {
            addCriterion("kjkNum between", value1, value2, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andKjkNumNotBetween(String value1, String value2) {
            addCriterion("kjkNum not between", value1, value2, "kjkNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumIsNull() {
            addCriterion("sxfNum is null");
            return (Criteria) this;
        }

        public Criteria andSxfNumIsNotNull() {
            addCriterion("sxfNum is not null");
            return (Criteria) this;
        }

        public Criteria andSxfNumEqualTo(String value) {
            addCriterion("sxfNum =", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumNotEqualTo(String value) {
            addCriterion("sxfNum <>", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumGreaterThan(String value) {
            addCriterion("sxfNum >", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumGreaterThanOrEqualTo(String value) {
            addCriterion("sxfNum >=", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumLessThan(String value) {
            addCriterion("sxfNum <", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumLessThanOrEqualTo(String value) {
            addCriterion("sxfNum <=", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumLike(String value) {
            addCriterion("sxfNum like", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumNotLike(String value) {
            addCriterion("sxfNum not like", value, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumIn(List<String> values) {
            addCriterion("sxfNum in", values, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumNotIn(List<String> values) {
            addCriterion("sxfNum not in", values, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumBetween(String value1, String value2) {
            addCriterion("sxfNum between", value1, value2, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andSxfNumNotBetween(String value1, String value2) {
            addCriterion("sxfNum not between", value1, value2, "sxfNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumIsNull() {
            addCriterion("zhidNum is null");
            return (Criteria) this;
        }

        public Criteria andZhidNumIsNotNull() {
            addCriterion("zhidNum is not null");
            return (Criteria) this;
        }

        public Criteria andZhidNumEqualTo(String value) {
            addCriterion("zhidNum =", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumNotEqualTo(String value) {
            addCriterion("zhidNum <>", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumGreaterThan(String value) {
            addCriterion("zhidNum >", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumGreaterThanOrEqualTo(String value) {
            addCriterion("zhidNum >=", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumLessThan(String value) {
            addCriterion("zhidNum <", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumLessThanOrEqualTo(String value) {
            addCriterion("zhidNum <=", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumLike(String value) {
            addCriterion("zhidNum like", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumNotLike(String value) {
            addCriterion("zhidNum not like", value, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumIn(List<String> values) {
            addCriterion("zhidNum in", values, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumNotIn(List<String> values) {
            addCriterion("zhidNum not in", values, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumBetween(String value1, String value2) {
            addCriterion("zhidNum between", value1, value2, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andZhidNumNotBetween(String value1, String value2) {
            addCriterion("zhidNum not between", value1, value2, "zhidNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumIsNull() {
            addCriterion("xxfNum is null");
            return (Criteria) this;
        }

        public Criteria andXxfNumIsNotNull() {
            addCriterion("xxfNum is not null");
            return (Criteria) this;
        }

        public Criteria andXxfNumEqualTo(String value) {
            addCriterion("xxfNum =", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumNotEqualTo(String value) {
            addCriterion("xxfNum <>", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumGreaterThan(String value) {
            addCriterion("xxfNum >", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumGreaterThanOrEqualTo(String value) {
            addCriterion("xxfNum >=", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumLessThan(String value) {
            addCriterion("xxfNum <", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumLessThanOrEqualTo(String value) {
            addCriterion("xxfNum <=", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumLike(String value) {
            addCriterion("xxfNum like", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumNotLike(String value) {
            addCriterion("xxfNum not like", value, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumIn(List<String> values) {
            addCriterion("xxfNum in", values, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumNotIn(List<String> values) {
            addCriterion("xxfNum not in", values, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumBetween(String value1, String value2) {
            addCriterion("xxfNum between", value1, value2, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andXxfNumNotBetween(String value1, String value2) {
            addCriterion("xxfNum not between", value1, value2, "xxfNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumIsNull() {
            addCriterion("qxkNum is null");
            return (Criteria) this;
        }

        public Criteria andQxkNumIsNotNull() {
            addCriterion("qxkNum is not null");
            return (Criteria) this;
        }

        public Criteria andQxkNumEqualTo(String value) {
            addCriterion("qxkNum =", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumNotEqualTo(String value) {
            addCriterion("qxkNum <>", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumGreaterThan(String value) {
            addCriterion("qxkNum >", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumGreaterThanOrEqualTo(String value) {
            addCriterion("qxkNum >=", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumLessThan(String value) {
            addCriterion("qxkNum <", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumLessThanOrEqualTo(String value) {
            addCriterion("qxkNum <=", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumLike(String value) {
            addCriterion("qxkNum like", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumNotLike(String value) {
            addCriterion("qxkNum not like", value, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumIn(List<String> values) {
            addCriterion("qxkNum in", values, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumNotIn(List<String> values) {
            addCriterion("qxkNum not in", values, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumBetween(String value1, String value2) {
            addCriterion("qxkNum between", value1, value2, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andQxkNumNotBetween(String value1, String value2) {
            addCriterion("qxkNum not between", value1, value2, "qxkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumIsNull() {
            addCriterion("hbkNum is null");
            return (Criteria) this;
        }

        public Criteria andHbkNumIsNotNull() {
            addCriterion("hbkNum is not null");
            return (Criteria) this;
        }

        public Criteria andHbkNumEqualTo(String value) {
            addCriterion("hbkNum =", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumNotEqualTo(String value) {
            addCriterion("hbkNum <>", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumGreaterThan(String value) {
            addCriterion("hbkNum >", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumGreaterThanOrEqualTo(String value) {
            addCriterion("hbkNum >=", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumLessThan(String value) {
            addCriterion("hbkNum <", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumLessThanOrEqualTo(String value) {
            addCriterion("hbkNum <=", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumLike(String value) {
            addCriterion("hbkNum like", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumNotLike(String value) {
            addCriterion("hbkNum not like", value, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumIn(List<String> values) {
            addCriterion("hbkNum in", values, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumNotIn(List<String> values) {
            addCriterion("hbkNum not in", values, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumBetween(String value1, String value2) {
            addCriterion("hbkNum between", value1, value2, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andHbkNumNotBetween(String value1, String value2) {
            addCriterion("hbkNum not between", value1, value2, "hbkNum");
            return (Criteria) this;
        }

        public Criteria andXjNumIsNull() {
            addCriterion("xjNum is null");
            return (Criteria) this;
        }

        public Criteria andXjNumIsNotNull() {
            addCriterion("xjNum is not null");
            return (Criteria) this;
        }

        public Criteria andXjNumEqualTo(String value) {
            addCriterion("xjNum =", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumNotEqualTo(String value) {
            addCriterion("xjNum <>", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumGreaterThan(String value) {
            addCriterion("xjNum >", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumGreaterThanOrEqualTo(String value) {
            addCriterion("xjNum >=", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumLessThan(String value) {
            addCriterion("xjNum <", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumLessThanOrEqualTo(String value) {
            addCriterion("xjNum <=", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumLike(String value) {
            addCriterion("xjNum like", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumNotLike(String value) {
            addCriterion("xjNum not like", value, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumIn(List<String> values) {
            addCriterion("xjNum in", values, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumNotIn(List<String> values) {
            addCriterion("xjNum not in", values, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumBetween(String value1, String value2) {
            addCriterion("xjNum between", value1, value2, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXjNumNotBetween(String value1, String value2) {
            addCriterion("xjNum not between", value1, value2, "xjNum");
            return (Criteria) this;
        }

        public Criteria andXgNumIsNull() {
            addCriterion("xgNum is null");
            return (Criteria) this;
        }

        public Criteria andXgNumIsNotNull() {
            addCriterion("xgNum is not null");
            return (Criteria) this;
        }

        public Criteria andXgNumEqualTo(String value) {
            addCriterion("xgNum =", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumNotEqualTo(String value) {
            addCriterion("xgNum <>", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumGreaterThan(String value) {
            addCriterion("xgNum >", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumGreaterThanOrEqualTo(String value) {
            addCriterion("xgNum >=", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumLessThan(String value) {
            addCriterion("xgNum <", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumLessThanOrEqualTo(String value) {
            addCriterion("xgNum <=", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumLike(String value) {
            addCriterion("xgNum like", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumNotLike(String value) {
            addCriterion("xgNum not like", value, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumIn(List<String> values) {
            addCriterion("xgNum in", values, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumNotIn(List<String> values) {
            addCriterion("xgNum not in", values, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumBetween(String value1, String value2) {
            addCriterion("xgNum between", value1, value2, "xgNum");
            return (Criteria) this;
        }

        public Criteria andXgNumNotBetween(String value1, String value2) {
            addCriterion("xgNum not between", value1, value2, "xgNum");
            return (Criteria) this;
        }

        public Criteria andLwNumIsNull() {
            addCriterion("lwNum is null");
            return (Criteria) this;
        }

        public Criteria andLwNumIsNotNull() {
            addCriterion("lwNum is not null");
            return (Criteria) this;
        }

        public Criteria andLwNumEqualTo(String value) {
            addCriterion("lwNum =", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumNotEqualTo(String value) {
            addCriterion("lwNum <>", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumGreaterThan(String value) {
            addCriterion("lwNum >", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumGreaterThanOrEqualTo(String value) {
            addCriterion("lwNum >=", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumLessThan(String value) {
            addCriterion("lwNum <", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumLessThanOrEqualTo(String value) {
            addCriterion("lwNum <=", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumLike(String value) {
            addCriterion("lwNum like", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumNotLike(String value) {
            addCriterion("lwNum not like", value, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumIn(List<String> values) {
            addCriterion("lwNum in", values, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumNotIn(List<String> values) {
            addCriterion("lwNum not in", values, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumBetween(String value1, String value2) {
            addCriterion("lwNum between", value1, value2, "lwNum");
            return (Criteria) this;
        }

        public Criteria andLwNumNotBetween(String value1, String value2) {
            addCriterion("lwNum not between", value1, value2, "lwNum");
            return (Criteria) this;
        }

        public Criteria andTbActiveIsNull() {
            addCriterion("tbActive is null");
            return (Criteria) this;
        }

        public Criteria andTbActiveIsNotNull() {
            addCriterion("tbActive is not null");
            return (Criteria) this;
        }

        public Criteria andTbActiveEqualTo(Short value) {
            addCriterion("tbActive =", value, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveNotEqualTo(Short value) {
            addCriterion("tbActive <>", value, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveGreaterThan(Short value) {
            addCriterion("tbActive >", value, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("tbActive >=", value, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveLessThan(Short value) {
            addCriterion("tbActive <", value, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveLessThanOrEqualTo(Short value) {
            addCriterion("tbActive <=", value, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveIn(List<Short> values) {
            addCriterion("tbActive in", values, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveNotIn(List<Short> values) {
            addCriterion("tbActive not in", values, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveBetween(Short value1, Short value2) {
            addCriterion("tbActive between", value1, value2, "tbActive");
            return (Criteria) this;
        }

        public Criteria andTbActiveNotBetween(Short value1, Short value2) {
            addCriterion("tbActive not between", value1, value2, "tbActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveIsNull() {
            addCriterion("ljActive is null");
            return (Criteria) this;
        }

        public Criteria andLjActiveIsNotNull() {
            addCriterion("ljActive is not null");
            return (Criteria) this;
        }

        public Criteria andLjActiveEqualTo(Short value) {
            addCriterion("ljActive =", value, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveNotEqualTo(Short value) {
            addCriterion("ljActive <>", value, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveGreaterThan(Short value) {
            addCriterion("ljActive >", value, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("ljActive >=", value, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveLessThan(Short value) {
            addCriterion("ljActive <", value, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveLessThanOrEqualTo(Short value) {
            addCriterion("ljActive <=", value, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveIn(List<Short> values) {
            addCriterion("ljActive in", values, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveNotIn(List<Short> values) {
            addCriterion("ljActive not in", values, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveBetween(Short value1, Short value2) {
            addCriterion("ljActive between", value1, value2, "ljActive");
            return (Criteria) this;
        }

        public Criteria andLjActiveNotBetween(Short value1, Short value2) {
            addCriterion("ljActive not between", value1, value2, "ljActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveIsNull() {
            addCriterion("pjActive is null");
            return (Criteria) this;
        }

        public Criteria andPjActiveIsNotNull() {
            addCriterion("pjActive is not null");
            return (Criteria) this;
        }

        public Criteria andPjActiveEqualTo(Short value) {
            addCriterion("pjActive =", value, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveNotEqualTo(Short value) {
            addCriterion("pjActive <>", value, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveGreaterThan(Short value) {
            addCriterion("pjActive >", value, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("pjActive >=", value, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveLessThan(Short value) {
            addCriterion("pjActive <", value, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveLessThanOrEqualTo(Short value) {
            addCriterion("pjActive <=", value, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveIn(List<Short> values) {
            addCriterion("pjActive in", values, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveNotIn(List<Short> values) {
            addCriterion("pjActive not in", values, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveBetween(Short value1, Short value2) {
            addCriterion("pjActive between", value1, value2, "pjActive");
            return (Criteria) this;
        }

        public Criteria andPjActiveNotBetween(Short value1, Short value2) {
            addCriterion("pjActive not between", value1, value2, "pjActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveIsNull() {
            addCriterion("txActive is null");
            return (Criteria) this;
        }

        public Criteria andTxActiveIsNotNull() {
            addCriterion("txActive is not null");
            return (Criteria) this;
        }

        public Criteria andTxActiveEqualTo(Short value) {
            addCriterion("txActive =", value, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveNotEqualTo(Short value) {
            addCriterion("txActive <>", value, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveGreaterThan(Short value) {
            addCriterion("txActive >", value, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("txActive >=", value, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveLessThan(Short value) {
            addCriterion("txActive <", value, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveLessThanOrEqualTo(Short value) {
            addCriterion("txActive <=", value, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveIn(List<Short> values) {
            addCriterion("txActive in", values, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveNotIn(List<Short> values) {
            addCriterion("txActive not in", values, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveBetween(Short value1, Short value2) {
            addCriterion("txActive between", value1, value2, "txActive");
            return (Criteria) this;
        }

        public Criteria andTxActiveNotBetween(Short value1, Short value2) {
            addCriterion("txActive not between", value1, value2, "txActive");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveIsNull() {
            addCriterion("lk1Active is null");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveIsNotNull() {
            addCriterion("lk1Active is not null");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveEqualTo(Short value) {
            addCriterion("lk1Active =", value, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveNotEqualTo(Short value) {
            addCriterion("lk1Active <>", value, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveGreaterThan(Short value) {
            addCriterion("lk1Active >", value, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("lk1Active >=", value, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveLessThan(Short value) {
            addCriterion("lk1Active <", value, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveLessThanOrEqualTo(Short value) {
            addCriterion("lk1Active <=", value, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveIn(List<Short> values) {
            addCriterion("lk1Active in", values, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveNotIn(List<Short> values) {
            addCriterion("lk1Active not in", values, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveBetween(Short value1, Short value2) {
            addCriterion("lk1Active between", value1, value2, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk1ActiveNotBetween(Short value1, Short value2) {
            addCriterion("lk1Active not between", value1, value2, "lk1Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveIsNull() {
            addCriterion("lk2Active is null");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveIsNotNull() {
            addCriterion("lk2Active is not null");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveEqualTo(Short value) {
            addCriterion("lk2Active =", value, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveNotEqualTo(Short value) {
            addCriterion("lk2Active <>", value, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveGreaterThan(Short value) {
            addCriterion("lk2Active >", value, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("lk2Active >=", value, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveLessThan(Short value) {
            addCriterion("lk2Active <", value, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveLessThanOrEqualTo(Short value) {
            addCriterion("lk2Active <=", value, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveIn(List<Short> values) {
            addCriterion("lk2Active in", values, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveNotIn(List<Short> values) {
            addCriterion("lk2Active not in", values, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveBetween(Short value1, Short value2) {
            addCriterion("lk2Active between", value1, value2, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk2ActiveNotBetween(Short value1, Short value2) {
            addCriterion("lk2Active not between", value1, value2, "lk2Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveIsNull() {
            addCriterion("lk3Active is null");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveIsNotNull() {
            addCriterion("lk3Active is not null");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveEqualTo(Short value) {
            addCriterion("lk3Active =", value, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveNotEqualTo(Short value) {
            addCriterion("lk3Active <>", value, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveGreaterThan(Short value) {
            addCriterion("lk3Active >", value, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("lk3Active >=", value, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveLessThan(Short value) {
            addCriterion("lk3Active <", value, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveLessThanOrEqualTo(Short value) {
            addCriterion("lk3Active <=", value, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveIn(List<Short> values) {
            addCriterion("lk3Active in", values, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveNotIn(List<Short> values) {
            addCriterion("lk3Active not in", values, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveBetween(Short value1, Short value2) {
            addCriterion("lk3Active between", value1, value2, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andLk3ActiveNotBetween(Short value1, Short value2) {
            addCriterion("lk3Active not between", value1, value2, "lk3Active");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveIsNull() {
            addCriterion("hzkcActive is null");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveIsNotNull() {
            addCriterion("hzkcActive is not null");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveEqualTo(Short value) {
            addCriterion("hzkcActive =", value, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveNotEqualTo(Short value) {
            addCriterion("hzkcActive <>", value, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveGreaterThan(Short value) {
            addCriterion("hzkcActive >", value, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("hzkcActive >=", value, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveLessThan(Short value) {
            addCriterion("hzkcActive <", value, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveLessThanOrEqualTo(Short value) {
            addCriterion("hzkcActive <=", value, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveIn(List<Short> values) {
            addCriterion("hzkcActive in", values, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveNotIn(List<Short> values) {
            addCriterion("hzkcActive not in", values, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveBetween(Short value1, Short value2) {
            addCriterion("hzkcActive between", value1, value2, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andHzkcActiveNotBetween(Short value1, Short value2) {
            addCriterion("hzkcActive not between", value1, value2, "hzkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveIsNull() {
            addCriterion("lbkcActive is null");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveIsNotNull() {
            addCriterion("lbkcActive is not null");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveEqualTo(Short value) {
            addCriterion("lbkcActive =", value, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveNotEqualTo(Short value) {
            addCriterion("lbkcActive <>", value, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveGreaterThan(Short value) {
            addCriterion("lbkcActive >", value, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("lbkcActive >=", value, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveLessThan(Short value) {
            addCriterion("lbkcActive <", value, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveLessThanOrEqualTo(Short value) {
            addCriterion("lbkcActive <=", value, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveIn(List<Short> values) {
            addCriterion("lbkcActive in", values, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveNotIn(List<Short> values) {
            addCriterion("lbkcActive not in", values, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveBetween(Short value1, Short value2) {
            addCriterion("lbkcActive between", value1, value2, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andLbkcActiveNotBetween(Short value1, Short value2) {
            addCriterion("lbkcActive not between", value1, value2, "lbkcActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveIsNull() {
            addCriterion("pblActive is null");
            return (Criteria) this;
        }

        public Criteria andPblActiveIsNotNull() {
            addCriterion("pblActive is not null");
            return (Criteria) this;
        }

        public Criteria andPblActiveEqualTo(Short value) {
            addCriterion("pblActive =", value, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveNotEqualTo(Short value) {
            addCriterion("pblActive <>", value, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveGreaterThan(Short value) {
            addCriterion("pblActive >", value, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("pblActive >=", value, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveLessThan(Short value) {
            addCriterion("pblActive <", value, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveLessThanOrEqualTo(Short value) {
            addCriterion("pblActive <=", value, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveIn(List<Short> values) {
            addCriterion("pblActive in", values, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveNotIn(List<Short> values) {
            addCriterion("pblActive not in", values, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveBetween(Short value1, Short value2) {
            addCriterion("pblActive between", value1, value2, "pblActive");
            return (Criteria) this;
        }

        public Criteria andPblActiveNotBetween(Short value1, Short value2) {
            addCriterion("pblActive not between", value1, value2, "pblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveIsNull() {
            addCriterion("qblActive is null");
            return (Criteria) this;
        }

        public Criteria andQblActiveIsNotNull() {
            addCriterion("qblActive is not null");
            return (Criteria) this;
        }

        public Criteria andQblActiveEqualTo(Short value) {
            addCriterion("qblActive =", value, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveNotEqualTo(Short value) {
            addCriterion("qblActive <>", value, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveGreaterThan(Short value) {
            addCriterion("qblActive >", value, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("qblActive >=", value, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveLessThan(Short value) {
            addCriterion("qblActive <", value, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveLessThanOrEqualTo(Short value) {
            addCriterion("qblActive <=", value, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveIn(List<Short> values) {
            addCriterion("qblActive in", values, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveNotIn(List<Short> values) {
            addCriterion("qblActive not in", values, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveBetween(Short value1, Short value2) {
            addCriterion("qblActive between", value1, value2, "qblActive");
            return (Criteria) this;
        }

        public Criteria andQblActiveNotBetween(Short value1, Short value2) {
            addCriterion("qblActive not between", value1, value2, "qblActive");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("orderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("orderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("orderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("orderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("orderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("orderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("orderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("orderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("orderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("orderStatus not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andYdActiveIsNull() {
            addCriterion("ydActive is null");
            return (Criteria) this;
        }

        public Criteria andYdActiveIsNotNull() {
            addCriterion("ydActive is not null");
            return (Criteria) this;
        }

        public Criteria andYdActiveEqualTo(Short value) {
            addCriterion("ydActive =", value, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveNotEqualTo(Short value) {
            addCriterion("ydActive <>", value, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveGreaterThan(Short value) {
            addCriterion("ydActive >", value, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("ydActive >=", value, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveLessThan(Short value) {
            addCriterion("ydActive <", value, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveLessThanOrEqualTo(Short value) {
            addCriterion("ydActive <=", value, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveIn(List<Short> values) {
            addCriterion("ydActive in", values, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveNotIn(List<Short> values) {
            addCriterion("ydActive not in", values, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveBetween(Short value1, Short value2) {
            addCriterion("ydActive between", value1, value2, "ydActive");
            return (Criteria) this;
        }

        public Criteria andYdActiveNotBetween(Short value1, Short value2) {
            addCriterion("ydActive not between", value1, value2, "ydActive");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNull() {
            addCriterion("printCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintCountIsNotNull() {
            addCriterion("printCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintCountEqualTo(Integer value) {
            addCriterion("printCount =", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotEqualTo(Integer value) {
            addCriterion("printCount <>", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThan(Integer value) {
            addCriterion("printCount >", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("printCount >=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThan(Integer value) {
            addCriterion("printCount <", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountLessThanOrEqualTo(Integer value) {
            addCriterion("printCount <=", value, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountIn(List<Integer> values) {
            addCriterion("printCount in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotIn(List<Integer> values) {
            addCriterion("printCount not in", values, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountBetween(Integer value1, Integer value2) {
            addCriterion("printCount between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andPrintCountNotBetween(Integer value1, Integer value2) {
            addCriterion("printCount not between", value1, value2, "printCount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("imgUrl like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andDwNumIsNull() {
            addCriterion("dwNum is null");
            return (Criteria) this;
        }

        public Criteria andDwNumIsNotNull() {
            addCriterion("dwNum is not null");
            return (Criteria) this;
        }

        public Criteria andDwNumEqualTo(String value) {
            addCriterion("dwNum =", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumNotEqualTo(String value) {
            addCriterion("dwNum <>", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumGreaterThan(String value) {
            addCriterion("dwNum >", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumGreaterThanOrEqualTo(String value) {
            addCriterion("dwNum >=", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumLessThan(String value) {
            addCriterion("dwNum <", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumLessThanOrEqualTo(String value) {
            addCriterion("dwNum <=", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumLike(String value) {
            addCriterion("dwNum like", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumNotLike(String value) {
            addCriterion("dwNum not like", value, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumIn(List<String> values) {
            addCriterion("dwNum in", values, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumNotIn(List<String> values) {
            addCriterion("dwNum not in", values, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumBetween(String value1, String value2) {
            addCriterion("dwNum between", value1, value2, "dwNum");
            return (Criteria) this;
        }

        public Criteria andDwNumNotBetween(String value1, String value2) {
            addCriterion("dwNum not between", value1, value2, "dwNum");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andPrintStatusIsNull() {
            addCriterion("printStatus is null");
            return (Criteria) this;
        }

        public Criteria andPrintStatusIsNotNull() {
            addCriterion("printStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPrintStatusEqualTo(Short value) {
            addCriterion("printStatus =", value, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusNotEqualTo(Short value) {
            addCriterion("printStatus <>", value, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusGreaterThan(Short value) {
            addCriterion("printStatus >", value, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("printStatus >=", value, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusLessThan(Short value) {
            addCriterion("printStatus <", value, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusLessThanOrEqualTo(Short value) {
            addCriterion("printStatus <=", value, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusIn(List<Short> values) {
            addCriterion("printStatus in", values, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusNotIn(List<Short> values) {
            addCriterion("printStatus not in", values, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusBetween(Short value1, Short value2) {
            addCriterion("printStatus between", value1, value2, "printStatus");
            return (Criteria) this;
        }

        public Criteria andPrintStatusNotBetween(Short value1, Short value2) {
            addCriterion("printStatus not between", value1, value2, "printStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdIsNull() {
            addCriterion("customerProductId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdIsNotNull() {
            addCriterion("customerProductId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdEqualTo(Long value) {
            addCriterion("customerProductId =", value, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdNotEqualTo(Long value) {
            addCriterion("customerProductId <>", value, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdGreaterThan(Long value) {
            addCriterion("customerProductId >", value, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customerProductId >=", value, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdLessThan(Long value) {
            addCriterion("customerProductId <", value, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdLessThanOrEqualTo(Long value) {
            addCriterion("customerProductId <=", value, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdIn(List<Long> values) {
            addCriterion("customerProductId in", values, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdNotIn(List<Long> values) {
            addCriterion("customerProductId not in", values, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdBetween(Long value1, Long value2) {
            addCriterion("customerProductId between", value1, value2, "customerProductId");
            return (Criteria) this;
        }

        public Criteria andCustomerProductIdNotBetween(Long value1, Long value2) {
            addCriterion("customerProductId not between", value1, value2, "customerProductId");
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