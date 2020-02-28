package com.jzy.jcartstoreback.controller;

import com.jzy.jcartstoreback.dto.in.AddressCreateInDTO;
import com.jzy.jcartstoreback.dto.in.AddressUpdateInDTO;
import com.jzy.jcartstoreback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getMyAddresses")
    public List<AddressListOutDTO> getMyAddresses(Integer customerId){
        return null;
    }

    @PostMapping("/createMy")
    public Integer createMy(@RequestBody AddressCreateInDTO addressCreateInDTO, Integer customerId){
        return null;
    }

    @PostMapping("/updateMy")
    public void updateMy(@RequestBody AddressUpdateInDTO addressUpdateInDTO){

    }
}
