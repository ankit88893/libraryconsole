package com.dxctraining.fictionbook.dao;

import com.dxctraining.fictionbook.entities.*;

public interface IFictionDao {

	FictionBook add(FictionBook fiction);

	FictionBook findBookById(String id);

}
