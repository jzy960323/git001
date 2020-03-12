package com.bw.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.bw.jcartadministrationback.dto.in.CustomerSearchInDTO;
import com.bw.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import com.bw.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
