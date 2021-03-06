package com.hbc.api.trade.bdata.mapper.guide.gen;

import com.hbc.api.trade.bdata.mapper.guide.gen.bean.GuideActivity;
import com.hbc.api.trade.bdata.mapper.guide.gen.bean.GuideActivityExample;
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
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GuideActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @SelectProvider(type=GuideActivitySqlProvider.class, method="countByExample")
    int countByExample(GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=GuideActivitySqlProvider.class, method="deleteByExample")
    int deleteByExample(GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `guide_activity`",
        "where guide_activity_id = #{guideActivityId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guideActivityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `guide_activity` (guide_activity_id, guide_id, ",
        "access_key, channel, ",
        "op_type, user_type, ",
        "device_type, device_name, ",
        "os_version, app_version, ",
        "network, carrier_operator, ",
        "manufacturer, op_time, ",
        "mac_address, imei, ",
        "resolution, imsi, ",
        "idfa, idfv, update_time, ",
        "create_time, content)",
        "values (#{guideActivityId,jdbcType=INTEGER}, #{guideId,jdbcType=VARCHAR}, ",
        "#{accessKey,jdbcType=VARCHAR}, #{channel,jdbcType=VARCHAR}, ",
        "#{opType,jdbcType=INTEGER}, #{userType,jdbcType=INTEGER}, ",
        "#{deviceType,jdbcType=INTEGER}, #{deviceName,jdbcType=VARCHAR}, ",
        "#{osVersion,jdbcType=VARCHAR}, #{appVersion,jdbcType=VARCHAR}, ",
        "#{network,jdbcType=VARCHAR}, #{carrierOperator,jdbcType=VARCHAR}, ",
        "#{manufacturer,jdbcType=VARCHAR}, #{opTime,jdbcType=BIGINT}, ",
        "#{macAddress,jdbcType=VARCHAR}, #{imei,jdbcType=VARCHAR}, ",
        "#{resolution,jdbcType=VARCHAR}, #{imsi,jdbcType=VARCHAR}, ",
        "#{idfa,jdbcType=VARCHAR}, #{idfv,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{content,jdbcType=LONGVARCHAR})"
    })
    int insert(GuideActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @InsertProvider(type=GuideActivitySqlProvider.class, method="insertSelective")
    int insertSelective(GuideActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @SelectProvider(type=GuideActivitySqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="guide_activity_id", property="guideActivityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guide_id", property="guideId", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_key", property="accessKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="op_type", property="opType", jdbcType=JdbcType.INTEGER),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.INTEGER),
        @Result(column="device_type", property="deviceType", jdbcType=JdbcType.INTEGER),
        @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_version", property="osVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_version", property="appVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="network", property="network", jdbcType=JdbcType.VARCHAR),
        @Result(column="carrier_operator", property="carrierOperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="manufacturer", property="manufacturer", jdbcType=JdbcType.VARCHAR),
        @Result(column="op_time", property="opTime", jdbcType=JdbcType.BIGINT),
        @Result(column="mac_address", property="macAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="imei", property="imei", jdbcType=JdbcType.VARCHAR),
        @Result(column="resolution", property="resolution", jdbcType=JdbcType.VARCHAR),
        @Result(column="imsi", property="imsi", jdbcType=JdbcType.VARCHAR),
        @Result(column="idfa", property="idfa", jdbcType=JdbcType.VARCHAR),
        @Result(column="idfv", property="idfv", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<GuideActivity> selectByExampleWithBLOBs(GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @SelectProvider(type=GuideActivitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="guide_activity_id", property="guideActivityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guide_id", property="guideId", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_key", property="accessKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="op_type", property="opType", jdbcType=JdbcType.INTEGER),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.INTEGER),
        @Result(column="device_type", property="deviceType", jdbcType=JdbcType.INTEGER),
        @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_version", property="osVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_version", property="appVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="network", property="network", jdbcType=JdbcType.VARCHAR),
        @Result(column="carrier_operator", property="carrierOperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="manufacturer", property="manufacturer", jdbcType=JdbcType.VARCHAR),
        @Result(column="op_time", property="opTime", jdbcType=JdbcType.BIGINT),
        @Result(column="mac_address", property="macAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="imei", property="imei", jdbcType=JdbcType.VARCHAR),
        @Result(column="resolution", property="resolution", jdbcType=JdbcType.VARCHAR),
        @Result(column="imsi", property="imsi", jdbcType=JdbcType.VARCHAR),
        @Result(column="idfa", property="idfa", jdbcType=JdbcType.VARCHAR),
        @Result(column="idfv", property="idfv", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GuideActivity> selectByExample(GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "guide_activity_id, guide_id, access_key, channel, op_type, user_type, device_type, ",
        "device_name, os_version, app_version, network, carrier_operator, manufacturer, ",
        "op_time, mac_address, imei, resolution, imsi, idfa, idfv, update_time, create_time, ",
        "content",
        "from `guide_activity`",
        "where guide_activity_id = #{guideActivityId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="guide_activity_id", property="guideActivityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guide_id", property="guideId", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_key", property="accessKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="op_type", property="opType", jdbcType=JdbcType.INTEGER),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.INTEGER),
        @Result(column="device_type", property="deviceType", jdbcType=JdbcType.INTEGER),
        @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_version", property="osVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_version", property="appVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="network", property="network", jdbcType=JdbcType.VARCHAR),
        @Result(column="carrier_operator", property="carrierOperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="manufacturer", property="manufacturer", jdbcType=JdbcType.VARCHAR),
        @Result(column="op_time", property="opTime", jdbcType=JdbcType.BIGINT),
        @Result(column="mac_address", property="macAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="imei", property="imei", jdbcType=JdbcType.VARCHAR),
        @Result(column="resolution", property="resolution", jdbcType=JdbcType.VARCHAR),
        @Result(column="imsi", property="imsi", jdbcType=JdbcType.VARCHAR),
        @Result(column="idfa", property="idfa", jdbcType=JdbcType.VARCHAR),
        @Result(column="idfv", property="idfv", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    GuideActivity selectByPrimaryKey(Integer guideActivityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=GuideActivitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GuideActivity record, @Param("example") GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=GuideActivitySqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") GuideActivity record, @Param("example") GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=GuideActivitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GuideActivity record, @Param("example") GuideActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=GuideActivitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GuideActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @Update({
        "update `guide_activity`",
        "set guide_id = #{guideId,jdbcType=VARCHAR},",
          "access_key = #{accessKey,jdbcType=VARCHAR},",
          "channel = #{channel,jdbcType=VARCHAR},",
          "op_type = #{opType,jdbcType=INTEGER},",
          "user_type = #{userType,jdbcType=INTEGER},",
          "device_type = #{deviceType,jdbcType=INTEGER},",
          "device_name = #{deviceName,jdbcType=VARCHAR},",
          "os_version = #{osVersion,jdbcType=VARCHAR},",
          "app_version = #{appVersion,jdbcType=VARCHAR},",
          "network = #{network,jdbcType=VARCHAR},",
          "carrier_operator = #{carrierOperator,jdbcType=VARCHAR},",
          "manufacturer = #{manufacturer,jdbcType=VARCHAR},",
          "op_time = #{opTime,jdbcType=BIGINT},",
          "mac_address = #{macAddress,jdbcType=VARCHAR},",
          "imei = #{imei,jdbcType=VARCHAR},",
          "resolution = #{resolution,jdbcType=VARCHAR},",
          "imsi = #{imsi,jdbcType=VARCHAR},",
          "idfa = #{idfa,jdbcType=VARCHAR},",
          "idfv = #{idfv,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where guide_activity_id = #{guideActivityId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(GuideActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guide_activity`
     *
     * @mbggenerated
     */
    @Update({
        "update `guide_activity`",
        "set guide_id = #{guideId,jdbcType=VARCHAR},",
          "access_key = #{accessKey,jdbcType=VARCHAR},",
          "channel = #{channel,jdbcType=VARCHAR},",
          "op_type = #{opType,jdbcType=INTEGER},",
          "user_type = #{userType,jdbcType=INTEGER},",
          "device_type = #{deviceType,jdbcType=INTEGER},",
          "device_name = #{deviceName,jdbcType=VARCHAR},",
          "os_version = #{osVersion,jdbcType=VARCHAR},",
          "app_version = #{appVersion,jdbcType=VARCHAR},",
          "network = #{network,jdbcType=VARCHAR},",
          "carrier_operator = #{carrierOperator,jdbcType=VARCHAR},",
          "manufacturer = #{manufacturer,jdbcType=VARCHAR},",
          "op_time = #{opTime,jdbcType=BIGINT},",
          "mac_address = #{macAddress,jdbcType=VARCHAR},",
          "imei = #{imei,jdbcType=VARCHAR},",
          "resolution = #{resolution,jdbcType=VARCHAR},",
          "imsi = #{imsi,jdbcType=VARCHAR},",
          "idfa = #{idfa,jdbcType=VARCHAR},",
          "idfv = #{idfv,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where guide_activity_id = #{guideActivityId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GuideActivity record);
}