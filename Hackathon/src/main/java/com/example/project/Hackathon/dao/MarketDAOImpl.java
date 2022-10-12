package com.example.project.Hackathon.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.project.Hackathon.model.Stock;

@Repository
public class MarketDAOImpl implements MarketDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public List<Stock> getListOfStocksForShareHolder(int Id, Date effDate, Date endDate) {
		String query = "select s from Stock s where selectedShareHolder.shareHolderId=:Id and date BETWEEN :effDate and :endDate";
		TypedQuery<Stock> stocks = entityManager.createQuery(query, Stock.class).setParameter("shareHolderId", Id).setParameter("startDate", effDate).setParameter("endDate", endDate);
		return stocks.getResultList();
		
	}

}
