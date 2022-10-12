package com.example.project.Hackathon.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.Hackathon.dao.MarketDAO;
import com.example.project.Hackathon.model.Stock;

public class StockServiceImpl extends StockShareHolderHelperService implements StockService {
	
	@Autowired
	MarketDAO marketDAO; 
	
	@Override
	public List<Stock> getListOfStocksForShareHolder(int id, int effDateInt, int endDateInt) {
		Date effectiveDate = getDateFromDateSkey(effDateInt);
		Date endDate = getDateFromDateSkey(endDateInt);
		return marketDAO.getListOfStocksForShareHolder(id, effectiveDate, endDate);
	}
}
