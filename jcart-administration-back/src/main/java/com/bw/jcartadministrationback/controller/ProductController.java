package com.bw.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import com.bw.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.bw.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.bw.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.bw.jcartadministrationback.dto.out.PageOutDTO;
import com.bw.jcartadministrationback.dto.out.ProductListOutDTO;
import com.bw.jcartadministrationback.dto.out.ProductShowOutDTO;
import com.bw.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum) {
        Page<ProductListOutDTO> page = productService.search(productSearchInDTO, pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId) {
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO) {
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO) {
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId) {
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds) {
        productService.batchDelete(productIds);
    }

}
