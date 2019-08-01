package com.spring.models;


public class UserVO {

  /** 사용자 info */
  private String userId;
  private String userPassword;
  private String userName;
  private String userNum;
  private String address;
  
  
  /**
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * @param userId the userId to set
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  public String getUserNum() {
	  return userNum;
  }
  
  public void setUserNum(String userNum) {
	  this.userNum = userNum;
  }
  
  public String getAddress() {
	  return address;
  }
  
  public void setAddress(String address) {
	  this.address = address;
  }
  
}

