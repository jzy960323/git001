package com.jzy.jcartadministrationback.controller;

import com.jzy.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.jzy.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import com.jzy.jcartadministrationback.dto.out.PageOutDTO;
import com.jzy.jcartadministrationback.dto.out.ReturnListOutDTO;
import com.jzy.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
