package com.example.project.Hackathon.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.project.Hackathon.dao.MarketDAO;
import com.example.project.Hackathon.model.ShareHolder;

public class ShareHolderServiceImpl extends StockShareHolderHelperService implements ShareHolderService  {
	
	@Autowired
	MarketDAO marketDAO; 
	
	@Override
	public ShareHolder getShareHolderAndStocks(int shareHolderId,int effDateInt,int endDateInt) {
		Date effectiveDate = getDateFromDateSkey(effDateInt);
		Date endDate = getDateFromDateSkey(endDateInt);
		return marketDAO.getShareHolderAndStocks(shareHolderId, effectiveDate, endDate);
	}
}
