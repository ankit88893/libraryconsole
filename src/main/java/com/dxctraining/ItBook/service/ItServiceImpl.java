package com.dxctraining.ItBook.service;

import com.dxctraining.ItBook.dao.IItDao;
import com.dxctraining.ItBook.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ItServiceImpl implements IItService {

    @Autowired
   private IItDao dao;
    
    @Override
    public ItBook add(ItBook itbook) {
        itbook = dao.add(itbook);
        return itbook;
    }

    @Override
    public ItBook findBookById(int id) {
    	ItBook itbook = dao.findBookById(id);
        return itbook;
    }
}