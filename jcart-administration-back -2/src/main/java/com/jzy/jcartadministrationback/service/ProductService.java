package com.jzy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.jzy.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.jzy.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.jzy.jcartadministrationback.dto.out.ProductListOutDTO;
import com.jzy.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
