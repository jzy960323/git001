package com.bw.service;

import com.bw.po.Administrator;

public interface AdministratorService {

    Administrator selectByUsername(String username);

}
