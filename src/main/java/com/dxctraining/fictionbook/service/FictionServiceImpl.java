package com.dxctraining.fictionbook.service;

import com.dxctraining.fictionbook.dao.IFictionDao;
import com.dxctraining.fictionbook.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FictionServiceImpl implements IFictionService {

    @Autowired
    private IFictionDao dao;
    
    @Override
    public FictionBook add(FictionBook fiction) {
        fiction = dao.add(fiction);
        return fiction;
    }

    @Override
    public FictionBook findBookById(String id) {
    	FictionBook fiction = dao.findBookById(id);
        return fiction;
    }
}

