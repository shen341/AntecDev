package com.antec.model.mapper;

import com.antec.model.entity.Eventkeyword;
import com.antec.model.entity.EventkeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventkeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int countByExample(EventkeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int deleteByExample(EventkeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int insert(Eventkeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int insertSelective(Eventkeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    List<Eventkeyword> selectByExample(EventkeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    Eventkeyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Eventkeyword record, @Param("example") EventkeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Eventkeyword record, @Param("example") EventkeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Eventkeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventKeyword
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Eventkeyword record);
}