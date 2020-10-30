package com.qf.ssm.controller;

import com.qf.ssm.entity.Product;
import com.qf.ssm.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;
    @GetMapping("/list")
    public List<Product> List(){
        List<Product> products = null;
          try{
             products=productService.selectAll();
                }catch (Exception e){

          }
        return products;
    }
}
