package com.hq.diego.repository.dao.generate;

import com.hq.diego.repository.model.generate.TRudyChannelRoute;
import com.hq.diego.repository.model.generate.TRudyChannelRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TRudyChannelRouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    long countByExample(TRudyChannelRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int deleteByExample(TRudyChannelRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int insert(TRudyChannelRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int insertSelective(TRudyChannelRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    List<TRudyChannelRoute> selectByExampleWithRowbounds(TRudyChannelRouteExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    List<TRudyChannelRoute> selectByExample(TRudyChannelRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    TRudyChannelRoute selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") TRudyChannelRoute record, @Param("example") TRudyChannelRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int updateByExample(@Param("record") TRudyChannelRoute record, @Param("example") TRudyChannelRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int updateByPrimaryKeySelective(TRudyChannelRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    int updateByPrimaryKey(TRudyChannelRoute record);
}