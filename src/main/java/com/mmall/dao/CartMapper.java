package com.mmall.dao;

import com.mmall.pojo.Cart;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectCartByUserId(Integer userId);

    Cart selectCartByUserIdProductId(Integer userId, Integer productId);

    int selectCartProductCount(Integer userId);

    Cart selectByPrimaryKey(Integer id);

    void checkedOrUncheckedProduct(Integer userId, Integer productId, Integer checked);

    void deleteByUserIdProductIds(Integer userId, List<?> productList);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    List<Cart> selectCheckedCartByUserId(Integer userId);
}