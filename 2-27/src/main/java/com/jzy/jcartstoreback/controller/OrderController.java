package com.jzy.jcartstoreback.controller;

import com.jzy.jcartstoreback.dto.in.OrderProductInDTO;
import com.jzy.jcartstoreback.dto.out.OrderListOutDTO;
import com.jzy.jcartstoreback.dto.out.OrderShowOutDTO;
import com.jzy.jcartstoreback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(List<OrderProductInDTO> orderproducts, Integer customerId){
        return null;
    }

    @GetMapping("/getMyWithPage")
    public PageOutDTO<OrderListOutDTO> getMyWithPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                     Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Integer orderId){
        return null;
    }
}
