package com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean;

import com.hbc.data.trade.transfer.util.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinalOrderOptimizationCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public FinalOrderOptimizationCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
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

        public Criteria andOrderoptimizationidIsNull() {
            addCriterion("orderOptimizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidIsNotNull() {
            addCriterion("orderOptimizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidEqualTo(String value) {
            addCriterion("orderOptimizationId =", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidNotEqualTo(String value) {
            addCriterion("orderOptimizationId <>", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidGreaterThan(String value) {
            addCriterion("orderOptimizationId >", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidGreaterThanOrEqualTo(String value) {
            addCriterion("orderOptimizationId >=", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidLessThan(String value) {
            addCriterion("orderOptimizationId <", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidLessThanOrEqualTo(String value) {
            addCriterion("orderOptimizationId <=", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidLike(String value) {
            addCriterion("orderOptimizationId like", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidNotLike(String value) {
            addCriterion("orderOptimizationId not like", value, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidIn(List<String> values) {
            addCriterion("orderOptimizationId in", values, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidNotIn(List<String> values) {
            addCriterion("orderOptimizationId not in", values, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidBetween(String value1, String value2) {
            addCriterion("orderOptimizationId between", value1, value2, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOrderoptimizationidNotBetween(String value1, String value2) {
            addCriterion("orderOptimizationId not between", value1, value2, "orderoptimizationid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidIsNull() {
            addCriterion("optimizationOrderId is null");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidIsNotNull() {
            addCriterion("optimizationOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidEqualTo(String value) {
            addCriterion("optimizationOrderId =", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidNotEqualTo(String value) {
            addCriterion("optimizationOrderId <>", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidGreaterThan(String value) {
            addCriterion("optimizationOrderId >", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidGreaterThanOrEqualTo(String value) {
            addCriterion("optimizationOrderId >=", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidLessThan(String value) {
            addCriterion("optimizationOrderId <", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidLessThanOrEqualTo(String value) {
            addCriterion("optimizationOrderId <=", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidLike(String value) {
            addCriterion("optimizationOrderId like", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidNotLike(String value) {
            addCriterion("optimizationOrderId not like", value, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidIn(List<String> values) {
            addCriterion("optimizationOrderId in", values, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidNotIn(List<String> values) {
            addCriterion("optimizationOrderId not in", values, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidBetween(String value1, String value2) {
            addCriterion("optimizationOrderId between", value1, value2, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andOptimizationorderidNotBetween(String value1, String value2) {
            addCriterion("optimizationOrderId not between", value1, value2, "optimizationorderid");
            return (Criteria) this;
        }

        public Criteria andClientpriceIsNull() {
            addCriterion("clientPrice is null");
            return (Criteria) this;
        }

        public Criteria andClientpriceIsNotNull() {
            addCriterion("clientPrice is not null");
            return (Criteria) this;
        }

        public Criteria andClientpriceEqualTo(Integer value) {
            addCriterion("clientPrice =", value, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceNotEqualTo(Integer value) {
            addCriterion("clientPrice <>", value, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceGreaterThan(Integer value) {
            addCriterion("clientPrice >", value, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientPrice >=", value, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceLessThan(Integer value) {
            addCriterion("clientPrice <", value, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceLessThanOrEqualTo(Integer value) {
            addCriterion("clientPrice <=", value, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceIn(List<Integer> values) {
            addCriterion("clientPrice in", values, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceNotIn(List<Integer> values) {
            addCriterion("clientPrice not in", values, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceBetween(Integer value1, Integer value2) {
            addCriterion("clientPrice between", value1, value2, "clientprice");
            return (Criteria) this;
        }

        public Criteria andClientpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("clientPrice not between", value1, value2, "clientprice");
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

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGuidepriceIsNull() {
            addCriterion("guidePrice is null");
            return (Criteria) this;
        }

        public Criteria andGuidepriceIsNotNull() {
            addCriterion("guidePrice is not null");
            return (Criteria) this;
        }

        public Criteria andGuidepriceEqualTo(Integer value) {
            addCriterion("guidePrice =", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotEqualTo(Integer value) {
            addCriterion("guidePrice <>", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceGreaterThan(Integer value) {
            addCriterion("guidePrice >", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("guidePrice >=", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceLessThan(Integer value) {
            addCriterion("guidePrice <", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceLessThanOrEqualTo(Integer value) {
            addCriterion("guidePrice <=", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceIn(List<Integer> values) {
            addCriterion("guidePrice in", values, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotIn(List<Integer> values) {
            addCriterion("guidePrice not in", values, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceBetween(Integer value1, Integer value2) {
            addCriterion("guidePrice between", value1, value2, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("guidePrice not between", value1, value2, "guideprice");
            return (Criteria) this;
        }

        public Criteria andMatchorderidIsNull() {
            addCriterion("matchOrderId is null");
            return (Criteria) this;
        }

        public Criteria andMatchorderidIsNotNull() {
            addCriterion("matchOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andMatchorderidEqualTo(String value) {
            addCriterion("matchOrderId =", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidNotEqualTo(String value) {
            addCriterion("matchOrderId <>", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidGreaterThan(String value) {
            addCriterion("matchOrderId >", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidGreaterThanOrEqualTo(String value) {
            addCriterion("matchOrderId >=", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidLessThan(String value) {
            addCriterion("matchOrderId <", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidLessThanOrEqualTo(String value) {
            addCriterion("matchOrderId <=", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidLike(String value) {
            addCriterion("matchOrderId like", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidNotLike(String value) {
            addCriterion("matchOrderId not like", value, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidIn(List<String> values) {
            addCriterion("matchOrderId in", values, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidNotIn(List<String> values) {
            addCriterion("matchOrderId not in", values, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidBetween(String value1, String value2) {
            addCriterion("matchOrderId between", value1, value2, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchorderidNotBetween(String value1, String value2) {
            addCriterion("matchOrderId not between", value1, value2, "matchorderid");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeIsNull() {
            addCriterion("matchOrderType is null");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeIsNotNull() {
            addCriterion("matchOrderType is not null");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeEqualTo(Integer value) {
            addCriterion("matchOrderType =", value, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeNotEqualTo(Integer value) {
            addCriterion("matchOrderType <>", value, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeGreaterThan(Integer value) {
            addCriterion("matchOrderType >", value, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("matchOrderType >=", value, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeLessThan(Integer value) {
            addCriterion("matchOrderType <", value, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeLessThanOrEqualTo(Integer value) {
            addCriterion("matchOrderType <=", value, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeIn(List<Integer> values) {
            addCriterion("matchOrderType in", values, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeNotIn(List<Integer> values) {
            addCriterion("matchOrderType not in", values, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeBetween(Integer value1, Integer value2) {
            addCriterion("matchOrderType between", value1, value2, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchordertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("matchOrderType not between", value1, value2, "matchordertype");
            return (Criteria) this;
        }

        public Criteria andMatchguideidIsNull() {
            addCriterion("matchGuideId is null");
            return (Criteria) this;
        }

        public Criteria andMatchguideidIsNotNull() {
            addCriterion("matchGuideId is not null");
            return (Criteria) this;
        }

        public Criteria andMatchguideidEqualTo(Integer value) {
            addCriterion("matchGuideId =", value, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidNotEqualTo(Integer value) {
            addCriterion("matchGuideId <>", value, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidGreaterThan(Integer value) {
            addCriterion("matchGuideId >", value, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("matchGuideId >=", value, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidLessThan(Integer value) {
            addCriterion("matchGuideId <", value, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidLessThanOrEqualTo(Integer value) {
            addCriterion("matchGuideId <=", value, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidIn(List<Integer> values) {
            addCriterion("matchGuideId in", values, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidNotIn(List<Integer> values) {
            addCriterion("matchGuideId not in", values, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidBetween(Integer value1, Integer value2) {
            addCriterion("matchGuideId between", value1, value2, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchguideidNotBetween(Integer value1, Integer value2) {
            addCriterion("matchGuideId not between", value1, value2, "matchguideid");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateIsNull() {
            addCriterion("matchOrderServiceDate is null");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateIsNotNull() {
            addCriterion("matchOrderServiceDate is not null");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateEqualTo(String value) {
            addCriterion("matchOrderServiceDate =", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateNotEqualTo(String value) {
            addCriterion("matchOrderServiceDate <>", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateGreaterThan(String value) {
            addCriterion("matchOrderServiceDate >", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateGreaterThanOrEqualTo(String value) {
            addCriterion("matchOrderServiceDate >=", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateLessThan(String value) {
            addCriterion("matchOrderServiceDate <", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateLessThanOrEqualTo(String value) {
            addCriterion("matchOrderServiceDate <=", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateLike(String value) {
            addCriterion("matchOrderServiceDate like", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateNotLike(String value) {
            addCriterion("matchOrderServiceDate not like", value, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateIn(List<String> values) {
            addCriterion("matchOrderServiceDate in", values, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateNotIn(List<String> values) {
            addCriterion("matchOrderServiceDate not in", values, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateBetween(String value1, String value2) {
            addCriterion("matchOrderServiceDate between", value1, value2, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andMatchorderservicedateNotBetween(String value1, String value2) {
            addCriterion("matchOrderServiceDate not between", value1, value2, "matchorderservicedate");
            return (Criteria) this;
        }

        public Criteria andIsmatchIsNull() {
            addCriterion("isMatch is null");
            return (Criteria) this;
        }

        public Criteria andIsmatchIsNotNull() {
            addCriterion("isMatch is not null");
            return (Criteria) this;
        }

        public Criteria andIsmatchEqualTo(Integer value) {
            addCriterion("isMatch =", value, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchNotEqualTo(Integer value) {
            addCriterion("isMatch <>", value, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchGreaterThan(Integer value) {
            addCriterion("isMatch >", value, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("isMatch >=", value, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchLessThan(Integer value) {
            addCriterion("isMatch <", value, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchLessThanOrEqualTo(Integer value) {
            addCriterion("isMatch <=", value, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchIn(List<Integer> values) {
            addCriterion("isMatch in", values, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchNotIn(List<Integer> values) {
            addCriterion("isMatch not in", values, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchBetween(Integer value1, Integer value2) {
            addCriterion("isMatch between", value1, value2, "ismatch");
            return (Criteria) this;
        }

        public Criteria andIsmatchNotBetween(Integer value1, Integer value2) {
            addCriterion("isMatch not between", value1, value2, "ismatch");
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

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `orderoptimization`
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `orderoptimization`
     *
     * @mbggenerated
     */
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