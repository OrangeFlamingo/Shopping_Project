package com.spring.models;

public class OrderVO   {
  /** 상품코드 */
  private String productCd;

  /** 주문수량 */
  private int orderCount;
  
  /** 배송지 주소 */
  private String address;
  

  /**
   * @return the productCd
   */
  public String getProductCd() {
    return productCd;
  }

  /**
   * @param productCd the productCd to set
   */
  public void setProductCd(String productCd) {
    this.productCd = productCd;
  }

  /**
   * @return the orderCount
   */
  public int getOrderCount() {
    return orderCount;
  }

  /**
   * @param orderCount the orderCount to set
   */
  public void setOrderCount(int orderCount) {
    this.orderCount = orderCount;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

}

