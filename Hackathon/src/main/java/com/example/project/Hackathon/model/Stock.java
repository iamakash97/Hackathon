package com.example.project.Hackathon.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Stock {
	
	
	
	int stockId;
	String companyName;
	float currentPrice;
	float prevPrice;
	Date date ;
	Date lastUpdatedTime;
	String lastUser;
	ShareHolder selectedShareHolder;
	Market selectedMarket;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	
	@Column
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Column
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	@Column
	public float getPrevPrice() {
		return prevPrice;
	}
	public void setPrevPrice(float prevPrice) {
		this.prevPrice = prevPrice;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	@Column(length=50)
	public String getLastUser() {
		return lastUser;
	}
	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}
	
	@ManyToOne
	@JoinColumn(name ="holderId")
	public ShareHolder getSelectedShareHolder() {
		return selectedShareHolder;
	}
	public void setSelectedShareHolder(ShareHolder selectedShareHolder) {
		this.selectedShareHolder = selectedShareHolder;
	}
	

	@ManyToOne
	@JoinColumn(name ="marketId")
	public Market getSelectedMarket() {
		return selectedMarket;
	}
	public void setSelectedMarket(Market selectedMarket) {
		this.selectedMarket = selectedMarket;
	}
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", companyName=" + companyName + ", currentPrice=" + currentPrice
				+ ", prevPrice=" + prevPrice + ", date=" + date + ", lastUpdatedTime=" + lastUpdatedTime + ", lastUser="
				+ lastUser + ", selectedShareHolder=" + selectedShareHolder + "]";
	}
	
}
