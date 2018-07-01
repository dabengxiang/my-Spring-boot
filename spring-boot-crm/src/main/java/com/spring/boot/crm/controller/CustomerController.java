package com.spring.boot.crm.controller;

import com.spring.boot.crm.Interface.CustomerService;
import com.spring.boot.crm.tb.TbCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * project name : my-Spring-boot
 * Date:2018/6/30
 * Author: yc.guo
 * DESC:
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    
    @RequestMapping("/list")
    public String  findAll(Map<String,Object> map) {
        List<TbCustomer> list = customerService.findAll();
        
        map.put("customerList",list);
        return "/customer.html";
    }
    
}
