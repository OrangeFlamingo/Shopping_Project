package com.spring.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserVO implements Serializable {

  /** 사용자 ID */
  private String userId;

  /** 사용자 PW */
  private String userPassword;

  /** 사용자명 */
  private String userName;

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

  /**
   * @return the userPassword
   */
  public String getUserPassword() {
    return userPassword;
  }

  /**
   * @param userPassword the userPassword to set
   */
  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

}

