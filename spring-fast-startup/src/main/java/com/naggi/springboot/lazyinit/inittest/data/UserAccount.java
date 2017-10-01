package com.naggi.springboot.lazyinit.inittest.data;
// default package
// Generated 2015/08/20 19:15:06 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UserAccount generated by hbm2java
 */
public class UserAccount implements java.io.Serializable {


  private int userAccountId;
  private String loginId;
  private String password;
  private String address;
  private Integer age;
  private String sirName;
  private String familyName;
  private Boolean deleteFlag;
  private Date updatedDate;
  private Date createdDate;
  private Integer createdUser;
  private Integer updatedUser;

  public UserAccount() {}


  public UserAccount(int userAccountId) {
    this.userAccountId = userAccountId;
  }

  public UserAccount(int userAccountId, String loginId, String password, String address,
      Integer age, String sirName, String familyName, Boolean deleteFlag, Date updatedDate,
      Date createdDate, Integer createdUser, Integer updatedUser) {
    this.userAccountId = userAccountId;
    this.loginId = loginId;
    this.password = password;
    this.address = address;
    this.age = age;
    this.sirName = sirName;
    this.familyName = familyName;
    this.deleteFlag = deleteFlag;
    this.updatedDate = updatedDate;
    this.createdDate = createdDate;
    this.createdUser = createdUser;
    this.updatedUser = updatedUser;
  }

  public int getUserAccountId() {
    return this.userAccountId;
  }

  public void setUserAccountId(int userAccountId) {
    this.userAccountId = userAccountId;
  }

  public String getLoginId() {
    return this.loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getSirName() {
    return this.sirName;
  }

  public void setSirName(String sirName) {
    this.sirName = sirName;
  }

  public String getFamilyName() {
    return this.familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Boolean getDeleteFlag() {
    return this.deleteFlag;
  }

  public void setDeleteFlag(Boolean deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public Date getUpdatedDate() {
    return this.updatedDate;
  }

  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Date getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Integer getCreatedUser() {
    return this.createdUser;
  }

  public void setCreatedUser(Integer createdUser) {
    this.createdUser = createdUser;
  }

  public Integer getUpdatedUser() {
    return this.updatedUser;
  }

  public void setUpdatedUser(Integer updatedUser) {
    this.updatedUser = updatedUser;
  }



}