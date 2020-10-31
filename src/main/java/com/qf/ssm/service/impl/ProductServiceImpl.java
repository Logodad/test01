package com.qf.ssm.service.impl;

import com.qf.ssm.entity.Product;
import com.qf.ssm.mapper.ProductMapper;
import com.qf.ssm.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    public List<Product> findAll() {
        List<Product> products = productMapper.selectList();
        return products;
    }
}
