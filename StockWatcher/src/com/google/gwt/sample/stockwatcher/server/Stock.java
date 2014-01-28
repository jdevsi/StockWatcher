package com.google.gwt.sample.stockwatcher.server;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.users.User;


// Hello I am Zoe changing
// changing stuff 

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Stock {

  @PrimaryKey
  @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
  private Long id;
  @Persistent
  private User user;
  @Persistent
  private String s;
  @Persistent
  private Date createDate;

  public Stock() {
    this.createDate = new Date();
  }

  public Stock(User user, String s) {
    this();
    this.user = user;
    this.s = s;
  }

  public Long getId() {
    return this.id;
  }

  public User getUser() {
    return this.user;
  }

  public String getSymbol() {
    return this.s;
  }

  public Date getCreateDate() {
    return this.createDate;
  }



  public void setUser(User zoe) { // changed this from user to u
	  // change 
	  // nope changing it to zoe
	  //change
    this.user = zoe;


  }

  public void setSymbol(String s) { //changed this from symbol to s
	  // cool stuff
    this.s = s;
  }
}
