package com.guonl.dao;

import com.guonl.po.SysDepartment;
import com.guonl.po.SysDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDepartmentMapper {
    long countByExample(SysDepartmentExample example);

    int deleteByExample(SysDepartmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDepartment record);

    int insertSelective(SysDepartment record);

    List<SysDepartment> selectByExample(SysDepartmentExample example);

    SysDepartment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDepartment record, @Param("example") SysDepartmentExample example);

    int updateByExample(@Param("record") SysDepartment record, @Param("example") SysDepartmentExample example);

    int updateByPrimaryKeySelective(SysDepartment record);

    int updateByPrimaryKey(SysDepartment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_department
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysDepartment selectOneByExample(SysDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_department
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<SysDepartment> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_department
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<SysDepartment> list, @Param("selective") SysDepartment.Column ... selective);
}