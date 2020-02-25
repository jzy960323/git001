package com.bw.controller;

import com.bw.dto.out.CustomerListOutDTO;
import com.bw.dto.out.CustomerShowOutDTO;
import com.bw.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(@RequestParam(required = false) String username,
                                                 @RequestParam(required = false) String realName,
                                                 @RequestParam(required = false) String mobile,
                                                 @RequestParam(required = false) String email,
                                                 @RequestParam(required = false) Byte status,
                                                 @RequestParam(required = false) Long createTimestamp,
                                                 @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

}
