package com.spring.boot.crm.service;

import com.spring.boot.crm.Interface.CustomerService;
import com.spring.boot.crm.mapper.CustomerMapper;
import com.spring.boot.crm.tb.TbCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * project name : my-Spring-boot
 * Date:2018/6/30
 * Author: yc.guo
 * DESC:
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerMapper customerMapper;
    
    
    @Override
    public List<TbCustomer> findAll() {
        return customerMapper.findAll();
    }
}
