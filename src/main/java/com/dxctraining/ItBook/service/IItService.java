package com.dxctraining.ItBook.service;

import com.dxctraining.ItBook.entities.*;

public interface IItService {

	ItBook findBookById(int id);
	ItBook add(ItBook itbook);
	
	
	
}
