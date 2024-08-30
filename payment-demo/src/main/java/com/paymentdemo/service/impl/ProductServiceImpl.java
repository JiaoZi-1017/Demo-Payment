package com.paymentdemo.service.impl;

import com.paymentdemo.entity.Product;
import com.paymentdemo.mapper.ProductMapper;
import com.paymentdemo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
