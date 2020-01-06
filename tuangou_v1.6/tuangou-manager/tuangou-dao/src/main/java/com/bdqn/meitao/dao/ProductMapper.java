package com.bdqn.meitao.dao;

import com.bdqn.meitao.pojo.Product;
import com.bdqn.meitao.pojo.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
	//根据页码和页面行数查询当前页数据
	List<Product> selectByPage(@Param("rows") int rows, @Param("offset") int offset);
	
	List<Product> selectHot(int hot);
	
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}