package com.antec.model.mapper;

import com.antec.model.entity.Areamaster;
import com.antec.model.entity.AreamasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreamasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int countByExample(AreamasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int deleteByExample(AreamasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int insert(Areamaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int insertSelective(Areamaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    List<Areamaster> selectByExample(AreamasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    Areamaster selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Areamaster record, @Param("example") AreamasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Areamaster record, @Param("example") AreamasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Areamaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areaMaster
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Areamaster record);
}