package com.spring.models;

public class ProductsVO   {
  /** 상품코드 */
  private String productCd;

  /** 상품명 */
  private String productName;
  
  /** 가격 */
  private int price;

  /** 재고수 */
  private int stock;
  
  private String productImg;

	public String getProductCd() {
		return productCd;
	}
	
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getproductImg() {
		return productImg;
	}
	
	public void setproductImg(String productImg) {
		this.productImg = productImg;
	}
}

