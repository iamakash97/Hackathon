package com.example.project.Hackathon.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Market {

	int marketId;
	String marketName;
	int strartingTimeSkey;
	int endTimeSkey;
	List<Stock> stocks;
	Date LastUpdatedTime;
	String lastUser;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMarketId() {
		return marketId;
	}
	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}
	
	@Column(length=50)
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	
	@Column
	public int getStrartingTimeSkey() {
		return strartingTimeSkey;
	}
	public void setStrartingTimeSkey(int strartingTimeSkey) {
		this.strartingTimeSkey = strartingTimeSkey;
	}
	
	@Column
	public int getEndTimeSkey() {
		return endTimeSkey;
	}
	public void setEndTimeSkey(int endTimeSkey) {
		this.endTimeSkey = endTimeSkey;
	}
	
	@OneToMany(mappedBy= "selectedMarket", cascade = CascadeType.ALL)
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastUpdatedTime() {
		return LastUpdatedTime;
	}
	public void setLastUpdatedTime(Date lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
	}
	
	@Column(length=50)
	public String getLastUser() {
		return lastUser;
	}
	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}
	
	@Override
	public String toString() {
		return "Market [marketId=" + marketId + ", marketName=" + marketName + ", strartingTimeSkey="
				+ strartingTimeSkey + ", endTimeSkey=" + endTimeSkey + ", stocks=" + stocks + ", LastUpdatedTime="
				+ LastUpdatedTime + ", lastUser=" + lastUser + "]";
	}
	
	
	
}