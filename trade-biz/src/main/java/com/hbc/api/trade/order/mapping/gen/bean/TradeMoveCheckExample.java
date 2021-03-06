package com.hbc.api.trade.order.mapping.gen.bean;

import com.hbc.api.trade.bdata.common.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeMoveCheckExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public TradeMoveCheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
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
     * This method corresponds to the database table `trade_move_check`
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
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
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
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `trade_move_check`
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessIsNull() {
            addCriterion("is_move_success is null");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessIsNotNull() {
            addCriterion("is_move_success is not null");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessEqualTo(Integer value) {
            addCriterion("is_move_success =", value, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessNotEqualTo(Integer value) {
            addCriterion("is_move_success <>", value, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessGreaterThan(Integer value) {
            addCriterion("is_move_success >", value, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_move_success >=", value, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessLessThan(Integer value) {
            addCriterion("is_move_success <", value, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("is_move_success <=", value, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessIn(List<Integer> values) {
            addCriterion("is_move_success in", values, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessNotIn(List<Integer> values) {
            addCriterion("is_move_success not in", values, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessBetween(Integer value1, Integer value2) {
            addCriterion("is_move_success between", value1, value2, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsMoveSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("is_move_success not between", value1, value2, "isMoveSuccess");
            return (Criteria) this;
        }

        public Criteria andIsInInfoIsNull() {
            addCriterion("is_in_info is null");
            return (Criteria) this;
        }

        public Criteria andIsInInfoIsNotNull() {
            addCriterion("is_in_info is not null");
            return (Criteria) this;
        }

        public Criteria andIsInInfoEqualTo(Integer value) {
            addCriterion("is_in_info =", value, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoNotEqualTo(Integer value) {
            addCriterion("is_in_info <>", value, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoGreaterThan(Integer value) {
            addCriterion("is_in_info >", value, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_in_info >=", value, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoLessThan(Integer value) {
            addCriterion("is_in_info <", value, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoLessThanOrEqualTo(Integer value) {
            addCriterion("is_in_info <=", value, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoIn(List<Integer> values) {
            addCriterion("is_in_info in", values, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoNotIn(List<Integer> values) {
            addCriterion("is_in_info not in", values, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoBetween(Integer value1, Integer value2) {
            addCriterion("is_in_info between", value1, value2, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andIsInInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_in_info not between", value1, value2, "isInInfo");
            return (Criteria) this;
        }

        public Criteria andInfoFlagIsNull() {
            addCriterion("info_flag is null");
            return (Criteria) this;
        }

        public Criteria andInfoFlagIsNotNull() {
            addCriterion("info_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInfoFlagEqualTo(Integer value) {
            addCriterion("info_flag =", value, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagNotEqualTo(Integer value) {
            addCriterion("info_flag <>", value, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagGreaterThan(Integer value) {
            addCriterion("info_flag >", value, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_flag >=", value, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagLessThan(Integer value) {
            addCriterion("info_flag <", value, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagLessThanOrEqualTo(Integer value) {
            addCriterion("info_flag <=", value, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagIn(List<Integer> values) {
            addCriterion("info_flag in", values, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagNotIn(List<Integer> values) {
            addCriterion("info_flag not in", values, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagBetween(Integer value1, Integer value2) {
            addCriterion("info_flag between", value1, value2, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("info_flag not between", value1, value2, "infoFlag");
            return (Criteria) this;
        }

        public Criteria andInfoDescIsNull() {
            addCriterion("info_desc is null");
            return (Criteria) this;
        }

        public Criteria andInfoDescIsNotNull() {
            addCriterion("info_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDescEqualTo(String value) {
            addCriterion("info_desc =", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotEqualTo(String value) {
            addCriterion("info_desc <>", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescGreaterThan(String value) {
            addCriterion("info_desc >", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescGreaterThanOrEqualTo(String value) {
            addCriterion("info_desc >=", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescLessThan(String value) {
            addCriterion("info_desc <", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescLessThanOrEqualTo(String value) {
            addCriterion("info_desc <=", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescLike(String value) {
            addCriterion("info_desc like", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotLike(String value) {
            addCriterion("info_desc not like", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescIn(List<String> values) {
            addCriterion("info_desc in", values, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotIn(List<String> values) {
            addCriterion("info_desc not in", values, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescBetween(String value1, String value2) {
            addCriterion("info_desc between", value1, value2, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotBetween(String value1, String value2) {
            addCriterion("info_desc not between", value1, value2, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `trade_move_check`
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
     * This class corresponds to the database table `trade_move_check`
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