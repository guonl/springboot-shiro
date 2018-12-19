package com.guonl.dao;

import com.guonl.po.SysAuthority;
import com.guonl.po.SysAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthorityMapper {
    long countByExample(SysAuthorityExample example);

    int deleteByExample(SysAuthorityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAuthority record);

    int insertSelective(SysAuthority record);

    List<SysAuthority> selectByExample(SysAuthorityExample example);

    SysAuthority selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAuthority record, @Param("example") SysAuthorityExample example);

    int updateByExample(@Param("record") SysAuthority record, @Param("example") SysAuthorityExample example);

    int updateByPrimaryKeySelective(SysAuthority record);

    int updateByPrimaryKey(SysAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authority
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysAuthority selectOneByExample(SysAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authority
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<SysAuthority> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authority
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<SysAuthority> list, @Param("selective") SysAuthority.Column ... selective);
}