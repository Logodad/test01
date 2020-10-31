package com.qf.ssm.controller;

import com.qf.ssm.entity.Product;
import com.qf.ssm.mapper.ProductMapper;
import com.qf.ssm.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;
    /*直接调用*/

    @GetMapping("/list")
    @ResponseBody
    public List<Product> findAll(){
        System.out.println("测试专用");
        List<Product> all=null;
        try{
             all= productService.findAll();
        }catch (Exception e){

        }
        return all;
    }
}
