package com.hq.elva.dao.generate;

import com.hq.elva.entity.generate.TBasBkin;
import com.hq.elva.entity.generate.TBasBkinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TBasBkinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int countByExample(TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int deleteByExample(TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int deleteByPrimaryKey(String lbnkNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int insert(TBasBkin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int insertSelective(TBasBkin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    List<TBasBkin> selectByExampleWithBLOBs(TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    List<TBasBkin> selectByExample(TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    TBasBkin selectByPrimaryKey(String lbnkNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int updateByExampleSelective(@Param("record") TBasBkin record, @Param("example") TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") TBasBkin record, @Param("example") TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int updateByExample(@Param("record") TBasBkin record, @Param("example") TBasBkinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int updateByPrimaryKeySelective(TBasBkin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(TBasBkin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bas_bkin
     *
     * @mbggenerated Thu Nov 03 09:37:18 CST 2016
     */
    int updateByPrimaryKey(TBasBkin record);
}