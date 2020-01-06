package com.bdqn.meitao.dao;

import com.bdqn.meitao.pojo.Functions;
import com.bdqn.meitao.pojo.FunctionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionsMapper {
    long countByExample(FunctionsExample example);

    int deleteByExample(FunctionsExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Functions record);

    int insertSelective(Functions record);

    List<Functions> selectByExample(FunctionsExample example);
    
    List<Functions> selectByPrivilegeId(Integer pid);//去映射文件中配置该方法的映射

    Functions selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Functions record, @Param("example") FunctionsExample example);

    int updateByExample(@Param("record") Functions record, @Param("example") FunctionsExample example);

    int updateByPrimaryKeySelective(Functions record);

    int updateByPrimaryKey(Functions record);
}