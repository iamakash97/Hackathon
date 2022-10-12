package com.example.project.Hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Hackathon.model.ShareHolder;
import com.example.project.Hackathon.model.Stock;
import com.example.project.Hackathon.service.ShareHolderService;

@RestController
@RequestMapping("/shareHolders")
public class ShareHolderController {
	
	@Autowired
	ShareHolderService shareHolderService;
	
	@GetMapping("/getStocks")
	public ShareHolder getShareHolderAndStocks(@RequestParam("shareHolderId") int shareHolderId, @RequestParam("effectiveDate") int effectiveDate, @RequestParam("endDate") int endDate){
		ShareHolder shareHolder = shareHolderService.getShareHolderAndStocks(shareHolderId, effectiveDate, endDate);
		//theModel.addAttribute("shareHolder", shareHolder);
		return shareHolder;
	}
	
}
