package com.dxctraining.fictionbook.service;

import com.dxctraining.fictionbook.entities.*;

public interface IFictionService {
	
	FictionBook add(FictionBook fiction);

	FictionBook findBookById(String fictionId1);
}
