package com.bw.controller;

import com.bw.dto.in.*;
import com.bw.dto.out.AdministratorGetProfileOutDTO;
import com.bw.dto.out.AdministratorListOutDTO;
import com.bw.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @GetMapping("/sendPasswordResetCodeToEmail")
    public void sendPasswordResetCodeToEmail(@RequestParam String email){

    }

    @PostMapping("/resetPassword")
    public void resetPasswordByEmail(@RequestBody AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO){

    }

    @GetMapping("/sendPasswordResetCodeToMobile")
    public void sendPasswordResetCodeToMobile(@RequestParam String mobile){

    }

    @PostMapping("/resetPassword")
    public void resetPasswordByMobile(@RequestBody AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO){

    }
}
