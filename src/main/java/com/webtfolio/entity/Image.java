package com.webtfolio.entity;

public class Image {

	private int id;
	private String iamge;
	private int portfolioId;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(int id, String iamge, int portfolioId) {
		super();
		this.id = id;
		this.iamge = iamge;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIamge() {
		return iamge;
	}

	public void setIamge(String iamge) {
		this.iamge = iamge;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}
	
}
