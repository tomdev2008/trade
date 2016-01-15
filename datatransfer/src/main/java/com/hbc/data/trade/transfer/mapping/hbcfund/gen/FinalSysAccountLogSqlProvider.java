package com.hbc.data.trade.transfer.mapping.hbcfund.gen;

import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountLog;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountLogCriteria.Criteria;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountLogCriteria.Criterion;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountLogCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FinalSysAccountLogSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String countByExample(FinalSysAccountLogCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`sysaccountlog`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String deleteByExample(FinalSysAccountLogCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`sysaccountlog`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String insertSelective(FinalSysAccountLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`sysaccountlog`");
        
        if (record.getSysaccountlogid() != null) {
            sql.VALUES("sysAccountLogId", "#{sysaccountlogid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            sql.VALUES("orderId", "#{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideid() != null) {
            sql.VALUES("guideId", "#{guideid,jdbcType=INTEGER}");
        }
        
        if (record.getAgentid() != null) {
            sql.VALUES("agentId", "#{agentid,jdbcType=INTEGER}");
        }
        
        if (record.getAgencyid() != null) {
            sql.VALUES("agencyId", "#{agencyid,jdbcType=INTEGER}");
        }
        
        if (record.getUserpassportid() != null) {
            sql.VALUES("userPassportId", "#{userpassportid,jdbcType=VARCHAR}");
        }
        
        if (record.getOpuserid() != null) {
            sql.VALUES("opUserId", "#{opuserid,jdbcType=VARCHAR}");
        }
        
        if (record.getOpusertype() != null) {
            sql.VALUES("opUserType", "#{opusertype,jdbcType=INTEGER}");
        }
        
        if (record.getBiztype() != null) {
            sql.VALUES("bizType", "#{biztype,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=INTEGER}");
        }
        
        if (record.getBizcomment() != null) {
            sql.VALUES("bizComment", "#{bizcomment,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String selectByExample(FinalSysAccountLogCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("sysAccountLogId");
        } else {
            sql.SELECT("sysAccountLogId");
        }
        sql.SELECT("orderId");
        sql.SELECT("guideId");
        sql.SELECT("agentId");
        sql.SELECT("agencyId");
        sql.SELECT("userPassportId");
        sql.SELECT("opUserId");
        sql.SELECT("opUserType");
        sql.SELECT("bizType");
        sql.SELECT("price");
        sql.SELECT("bizComment");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.FROM("`sysaccountlog`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FinalSysAccountLog record = (FinalSysAccountLog) parameter.get("record");
        FinalSysAccountLogCriteria example = (FinalSysAccountLogCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`sysaccountlog`");
        
        if (record.getSysaccountlogid() != null) {
            sql.SET("sysAccountLogId = #{record.sysaccountlogid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            sql.SET("orderId = #{record.orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideid() != null) {
            sql.SET("guideId = #{record.guideid,jdbcType=INTEGER}");
        }
        
        if (record.getAgentid() != null) {
            sql.SET("agentId = #{record.agentid,jdbcType=INTEGER}");
        }
        
        if (record.getAgencyid() != null) {
            sql.SET("agencyId = #{record.agencyid,jdbcType=INTEGER}");
        }
        
        if (record.getUserpassportid() != null) {
            sql.SET("userPassportId = #{record.userpassportid,jdbcType=VARCHAR}");
        }
        
        if (record.getOpuserid() != null) {
            sql.SET("opUserId = #{record.opuserid,jdbcType=VARCHAR}");
        }
        
        if (record.getOpusertype() != null) {
            sql.SET("opUserType = #{record.opusertype,jdbcType=INTEGER}");
        }
        
        if (record.getBiztype() != null) {
            sql.SET("bizType = #{record.biztype,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=INTEGER}");
        }
        
        if (record.getBizcomment() != null) {
            sql.SET("bizComment = #{record.bizcomment,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`sysaccountlog`");
        
        sql.SET("sysAccountLogId = #{record.sysaccountlogid,jdbcType=VARCHAR}");
        sql.SET("orderId = #{record.orderid,jdbcType=VARCHAR}");
        sql.SET("guideId = #{record.guideid,jdbcType=INTEGER}");
        sql.SET("agentId = #{record.agentid,jdbcType=INTEGER}");
        sql.SET("agencyId = #{record.agencyid,jdbcType=INTEGER}");
        sql.SET("userPassportId = #{record.userpassportid,jdbcType=VARCHAR}");
        sql.SET("opUserId = #{record.opuserid,jdbcType=VARCHAR}");
        sql.SET("opUserType = #{record.opusertype,jdbcType=INTEGER}");
        sql.SET("bizType = #{record.biztype,jdbcType=INTEGER}");
        sql.SET("price = #{record.price,jdbcType=INTEGER}");
        sql.SET("bizComment = #{record.bizcomment,jdbcType=VARCHAR}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        FinalSysAccountLogCriteria example = (FinalSysAccountLogCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(FinalSysAccountLog record) {
        SQL sql = new SQL();
        sql.UPDATE("`sysaccountlog`");
        
        if (record.getOrderid() != null) {
            sql.SET("orderId = #{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideid() != null) {
            sql.SET("guideId = #{guideid,jdbcType=INTEGER}");
        }
        
        if (record.getAgentid() != null) {
            sql.SET("agentId = #{agentid,jdbcType=INTEGER}");
        }
        
        if (record.getAgencyid() != null) {
            sql.SET("agencyId = #{agencyid,jdbcType=INTEGER}");
        }
        
        if (record.getUserpassportid() != null) {
            sql.SET("userPassportId = #{userpassportid,jdbcType=VARCHAR}");
        }
        
        if (record.getOpuserid() != null) {
            sql.SET("opUserId = #{opuserid,jdbcType=VARCHAR}");
        }
        
        if (record.getOpusertype() != null) {
            sql.SET("opUserType = #{opusertype,jdbcType=INTEGER}");
        }
        
        if (record.getBiztype() != null) {
            sql.SET("bizType = #{biztype,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=INTEGER}");
        }
        
        if (record.getBizcomment() != null) {
            sql.SET("bizComment = #{bizcomment,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("sysAccountLogId = #{sysaccountlogid,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccountlog`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, FinalSysAccountLogCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}