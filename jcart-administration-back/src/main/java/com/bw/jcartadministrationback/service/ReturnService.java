package com.bw.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.bw.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.bw.jcartadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
