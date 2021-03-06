package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Customer;
import org.springframework.stereotype.Component;


@Component(value = "CustomerMapper")
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}