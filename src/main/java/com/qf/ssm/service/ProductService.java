package com.qf.ssm.service;

import com.qf.ssm.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> selectAll();
}
