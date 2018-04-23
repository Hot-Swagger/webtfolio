package com.webtfolio.entity;

public class Image {

	private int id;
	private String image;
	private boolean mainImage;
	private int order;
	private int portfolioId;
	
	private Portfolio portfolio;
	
	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(String image, boolean mainImage, int order, int portfolioId) {
		super();
		this.image = image;
		this.mainImage = mainImage;
		this.order = order;
		this.portfolioId = portfolioId;
	}

	public Image(int id, String image, boolean mainImage, int order, int portfolioId) {
		super();
		this.id = id;
		this.image = image;
		this.mainImage = mainImage;
		this.order = order;
		this.portfolioId = portfolioId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isMainImage() {
		return mainImage;
	}

	public void setMainImage(boolean mainImage) {
		this.mainImage = mainImage;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

}
