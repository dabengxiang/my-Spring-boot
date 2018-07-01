package com.spring.boot.crm.Interface;

import com.spring.boot.crm.tb.TbCustomer;

import java.util.List;

/**
 * project name : my-Spring-boot
 * Date:2018/6/30
 * Author: yc.guo
 * DESC:
 */
public interface CustomerService {
    public List<TbCustomer> findAll();
}
