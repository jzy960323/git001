package com.jzy.jcartstoreback.controller;

import com.jzy.jcartstoreback.dto.out.PageOutDTO;
import com.jzy.jcartstoreback.dto.out.ProductListOutDTO;
import com.jzy.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false, defaultValue = "0") Integer sortType,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(Integer productId){
        return null;
    }
}
