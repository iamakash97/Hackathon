package com.example.project.Hackathon.service;

import java.util.List;

import com.example.project.Hackathon.model.Stock;

public interface StockService {
	
	List<Stock> getListOfStocksForShareHolder(int id, int effDate, int endDate);
}
