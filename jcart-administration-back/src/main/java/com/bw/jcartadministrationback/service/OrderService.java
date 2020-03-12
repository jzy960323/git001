package com.bw.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.bw.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.bw.jcartadministrationback.dto.out.OrderListOutDTO;
import com.bw.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.bw.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
