package com.hbc.data.trade.transfer.mapping.hbcbasedata.gen;

import com.hbc.data.trade.transfer.mapping.hbcbasedata.gen.bean.FinalGuideinagency;
import com.hbc.data.trade.transfer.mapping.hbcbasedata.gen.bean.FinalGuideinagencyCriteria.Criteria;
import com.hbc.data.trade.transfer.mapping.hbcbasedata.gen.bean.FinalGuideinagencyCriteria.Criterion;
import com.hbc.data.trade.transfer.mapping.hbcbasedata.gen.bean.FinalGuideinagencyCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FinalGuideinagencySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String countByExample(FinalGuideinagencyCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`guideinagency`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String deleteByExample(FinalGuideinagencyCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`guideinagency`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String insertSelective(FinalGuideinagency record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`guideinagency`");
        
        if (record.getGuideinagencyid() != null) {
            sql.VALUES("guideInAgencyId", "#{guideinagencyid,jdbcType=INTEGER}");
        }
        
        if (record.getUniquecode() != null) {
            sql.VALUES("uniqueCode", "#{uniquecode,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideid() != null) {
            sql.VALUES("guideId", "#{guideid,jdbcType=INTEGER}");
        }
        
        if (record.getAgencyid() != null) {
            sql.VALUES("agencyId", "#{agencyid,jdbcType=INTEGER}");
        }
        
        if (record.getGuidename() != null) {
            sql.VALUES("guideName", "#{guidename,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideareacode() != null) {
            sql.VALUES("guideAreaCode", "#{guideareacode,jdbcType=VARCHAR}");
        }
        
        if (record.getGuidemobile() != null) {
            sql.VALUES("guideMobile", "#{guidemobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSendtime() != null) {
            sql.VALUES("sendTime", "#{sendtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUsedtime() != null) {
            sql.VALUES("usedTime", "#{usedtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRegistertime() != null) {
            sql.VALUES("registerTime", "#{registertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getBindtime() != null) {
            sql.VALUES("bindTime", "#{bindtime,jdbcType=DATE}");
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
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String selectByExample(FinalGuideinagencyCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("guideInAgencyId");
        } else {
            sql.SELECT("guideInAgencyId");
        }
        sql.SELECT("uniqueCode");
        sql.SELECT("guideId");
        sql.SELECT("agencyId");
        sql.SELECT("guideName");
        sql.SELECT("guideAreaCode");
        sql.SELECT("guideMobile");
        sql.SELECT("sendTime");
        sql.SELECT("usedTime");
        sql.SELECT("registerTime");
        sql.SELECT("type");
        sql.SELECT("status");
        sql.SELECT("bindTime");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.FROM("`guideinagency`");
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
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FinalGuideinagency record = (FinalGuideinagency) parameter.get("record");
        FinalGuideinagencyCriteria example = (FinalGuideinagencyCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`guideinagency`");
        
        if (record.getGuideinagencyid() != null) {
            sql.SET("guideInAgencyId = #{record.guideinagencyid,jdbcType=INTEGER}");
        }
        
        if (record.getUniquecode() != null) {
            sql.SET("uniqueCode = #{record.uniquecode,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideid() != null) {
            sql.SET("guideId = #{record.guideid,jdbcType=INTEGER}");
        }
        
        if (record.getAgencyid() != null) {
            sql.SET("agencyId = #{record.agencyid,jdbcType=INTEGER}");
        }
        
        if (record.getGuidename() != null) {
            sql.SET("guideName = #{record.guidename,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideareacode() != null) {
            sql.SET("guideAreaCode = #{record.guideareacode,jdbcType=VARCHAR}");
        }
        
        if (record.getGuidemobile() != null) {
            sql.SET("guideMobile = #{record.guidemobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSendtime() != null) {
            sql.SET("sendTime = #{record.sendtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUsedtime() != null) {
            sql.SET("usedTime = #{record.usedtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRegistertime() != null) {
            sql.SET("registerTime = #{record.registertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getBindtime() != null) {
            sql.SET("bindTime = #{record.bindtime,jdbcType=DATE}");
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
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`guideinagency`");
        
        sql.SET("guideInAgencyId = #{record.guideinagencyid,jdbcType=INTEGER}");
        sql.SET("uniqueCode = #{record.uniquecode,jdbcType=VARCHAR}");
        sql.SET("guideId = #{record.guideid,jdbcType=INTEGER}");
        sql.SET("agencyId = #{record.agencyid,jdbcType=INTEGER}");
        sql.SET("guideName = #{record.guidename,jdbcType=VARCHAR}");
        sql.SET("guideAreaCode = #{record.guideareacode,jdbcType=VARCHAR}");
        sql.SET("guideMobile = #{record.guidemobile,jdbcType=VARCHAR}");
        sql.SET("sendTime = #{record.sendtime,jdbcType=TIMESTAMP}");
        sql.SET("usedTime = #{record.usedtime,jdbcType=TIMESTAMP}");
        sql.SET("registerTime = #{record.registertime,jdbcType=TIMESTAMP}");
        sql.SET("type = #{record.type,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("bindTime = #{record.bindtime,jdbcType=DATE}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        FinalGuideinagencyCriteria example = (FinalGuideinagencyCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(FinalGuideinagency record) {
        SQL sql = new SQL();
        sql.UPDATE("`guideinagency`");
        
        if (record.getUniquecode() != null) {
            sql.SET("uniqueCode = #{uniquecode,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideid() != null) {
            sql.SET("guideId = #{guideid,jdbcType=INTEGER}");
        }
        
        if (record.getAgencyid() != null) {
            sql.SET("agencyId = #{agencyid,jdbcType=INTEGER}");
        }
        
        if (record.getGuidename() != null) {
            sql.SET("guideName = #{guidename,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideareacode() != null) {
            sql.SET("guideAreaCode = #{guideareacode,jdbcType=VARCHAR}");
        }
        
        if (record.getGuidemobile() != null) {
            sql.SET("guideMobile = #{guidemobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSendtime() != null) {
            sql.SET("sendTime = #{sendtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUsedtime() != null) {
            sql.SET("usedTime = #{usedtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRegistertime() != null) {
            sql.SET("registerTime = #{registertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getBindtime() != null) {
            sql.SET("bindTime = #{bindtime,jdbcType=DATE}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("guideInAgencyId = #{guideinagencyid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guideinagency`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, FinalGuideinagencyCriteria example, boolean includeExamplePhrase) {
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