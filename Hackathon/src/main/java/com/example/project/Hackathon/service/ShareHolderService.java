package com.example.project.Hackathon.service;

import com.example.project.Hackathon.model.ShareHolder;

public interface ShareHolderService {
	
	ShareHolder getShareHolderAndStocks(int shareHolderId,int effDate,int endDate);
}
