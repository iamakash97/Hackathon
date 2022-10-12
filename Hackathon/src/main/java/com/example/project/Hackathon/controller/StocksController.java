package com.example.project.Hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Hackathon.model.Stock;
import com.example.project.Hackathon.service.StockService;

import org.springframework.ui.Model;

@RestController
@RequestMapping("/stocks")
public class StocksController {
	
	StockService stockService;
	@GetMapping("/getSharesForPerson")
	public List<Stock> getStocksForShareHolder(@RequestParam("shareHolderId") int shareHolderId, @RequestParam("effectiveDate") int effectiveDate, @RequestParam("endDate") int endDate){
		List<Stock> stockList = stockService.getListOfStocksForShareHolder(shareHolderId, effectiveDate, endDate);
		//theModel.addAttribute("stocks", stockList);
		return stockList;
	}
}
