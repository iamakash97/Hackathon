package com.example.project.Hackathon.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class ShareHolder {

	int Id;
	String name;
	Date dateOfBirth;
	float fundBalance;
	float invested;
	float profit;
	float loss;
	Date lastUpdatedTime;
	String lastUser;
	List<Stock> stockList;
	String password;
	
	@Column(length=50)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	@Column(length=100)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Column
	public float getFundBalance() {
		return fundBalance;
	}
	public void setFundBalance(float fundBalance) {
		this.fundBalance = fundBalance;
	}
	
	@Column
	public float getInvested() {
		return invested;
	}
	public void setInvested(float invested) {
		this.invested = invested;
	}
	
	@Column
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	
	@Column
	public float getLoss() {
		return loss;
	}
	public void setLoss(float loss) {
		this.loss = loss;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	@Column(length=100)
	public String getLastUser() {
		return lastUser;
	}
	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}
	
	@OneToMany(mappedBy= "selectedShareHolder", cascade = CascadeType.ALL)
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	
	
	@Override
	public String toString() {
		return "ShareHolder [Id=" + Id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", fundBalance="
				+ fundBalance + ", invested=" + invested + ", profit=" + profit + ", loss=" + loss
				+ ", lastUpdatedTime=" + lastUpdatedTime + ", lastUser=" + lastUser + ", stockList=" + stockList + "]";
	}
	
	
}
