package com.example.project.Hackathon.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class StockShareHolderHelperService {
	
	public Date getDateFromDateSkey(int dateSkey)
    {
        try {
            return (new SimpleDateFormat("yyyyMMdd")).parse(String.valueOf(dateSkey));
        } catch (ParseException e) {
            return null;
        }
    }
}
