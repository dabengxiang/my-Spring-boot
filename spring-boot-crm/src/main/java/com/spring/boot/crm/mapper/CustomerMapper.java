package com.spring.boot.crm.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.boot.crm.tb.TbCustomer;

import java.util.List;

/**
 * project name : my-Spring-boot
 * Date:2018/6/30
 * Author: yc.guo
 * DESC:
 */
public interface CustomerMapper extends JpaRepository<TbCustomer,Long> {
    
}
