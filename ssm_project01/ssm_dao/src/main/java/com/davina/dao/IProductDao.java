package com.davina.dao;

import com.davina.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    @Select("SELECT * FROM product")
    List<Product> findAllProduct();
}
