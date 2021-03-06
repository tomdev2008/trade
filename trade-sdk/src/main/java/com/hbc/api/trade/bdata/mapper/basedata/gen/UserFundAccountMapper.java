package com.hbc.api.trade.bdata.mapper.basedata.gen;

import com.hbc.api.trade.bdata.mapper.basedata.gen.bean.UserFundAccount;
import com.hbc.api.trade.bdata.mapper.basedata.gen.bean.UserFundAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserFundAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @SelectProvider(type=UserFundAccountSqlProvider.class, method="countByExample")
    int countByExample(UserFundAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=UserFundAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserFundAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `user_fund_account`",
        "where u_account_id = #{uAccountId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String uAccountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `user_fund_account` (u_account_id, account_no, ",
        "is_default, user_id, ",
        "status, create_time, ",
        "update_time)",
        "values (#{uAccountId,jdbcType=VARCHAR}, #{accountNo,jdbcType=VARCHAR}, ",
        "#{isDefault,jdbcType=TINYINT}, #{userId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(UserFundAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @InsertProvider(type=UserFundAccountSqlProvider.class, method="insertSelective")
    int insertSelective(UserFundAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @SelectProvider(type=UserFundAccountSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="u_account_id", property="uAccountId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="account_no", property="accountNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_default", property="isDefault", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserFundAccount> selectByExample(UserFundAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "u_account_id, account_no, is_default, user_id, status, create_time, update_time",
        "from `user_fund_account`",
        "where u_account_id = #{uAccountId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="u_account_id", property="uAccountId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="account_no", property="accountNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_default", property="isDefault", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    UserFundAccount selectByPrimaryKey(String uAccountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UserFundAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserFundAccount record, @Param("example") UserFundAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `user_fund_account`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UserFundAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserFundAccount record);
}