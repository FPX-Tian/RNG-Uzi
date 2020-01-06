package com.bdqn.meitao.dao;

import com.bdqn.meitao.pojo.Privilege;
import com.bdqn.meitao.pojo.PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegeMapper {
    long countByExample(PrivilegeExample example);

    int deleteByExample(PrivilegeExample example);

    int deleteByPrimaryKey(Integer privilegeId);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    List<Privilege> selectByExample(PrivilegeExample example);
    
    //根据角色id查找角色拥有的权限
    List<Privilege> selectPrivilegeByRoleId(int id);//到PrivilegeMapper.xml文件中对此方法进行映射配置

    Privilege selectByPrimaryKey(Integer privilegeId);

    int updateByExampleSelective(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByExample(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}