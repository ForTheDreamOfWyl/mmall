package com.mmall.dao;

import com.mmall.pojo.Product;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectByNameAndProductId(String productName, Integer productId);

    List<Product> selectByNameAndCategoryIds(String name, List<Integer> categoryIds);

    List<Product> selectList();
}