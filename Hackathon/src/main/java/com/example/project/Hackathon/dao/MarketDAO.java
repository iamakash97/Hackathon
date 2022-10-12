package com.example.project.Hackathon.dao;
import  com.example.project.Hackathon.model.*;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Hackathon.model.Market;

public interface MarketDAO{

	 List<Stock> getListOfStocksForShareHolder(int Id,Date effDate,Date endDate);
	 
	 ShareHolder getShareHolderAndStocks(int shareHolderId,Date effDate,Date endDate);
	
	
}
