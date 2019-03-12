package com.davina.service.impl;

import com.davina.dao.IProductDao;
import com.davina.domain.Product;
import com.davina.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    //注入dao
    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAllProduct();
    }
}
