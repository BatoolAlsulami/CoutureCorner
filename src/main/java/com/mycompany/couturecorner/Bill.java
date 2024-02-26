
package com.mycompany.couturecorner;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * JavaFX App
 */
@Entity
public class Bill implements Serializable {
    
      @Id
      @Column(name="BillID")
      private int billID;
      @Column(name="totalPrice")
      double TotalPrice;
      @Column(name="itemes")
      private int itemes;
      @Column(name="BPhoneNumber")
      private String BPhoneNumber=new String();
      
      //double TotalPrice = getPrice()+25 ;

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice+25 ;
    }

    public String getBPhoneNumber() {
        return BPhoneNumber;
    }
    
    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public void setBPhoneNumber(String BPhoneNumber) {
        this.BPhoneNumber = BPhoneNumber;
    }
       
    public Bill() {}
   
    public Bill(double Price,int itemes) {
        
        this.itemes +=itemes;
        //this.Price = Price;
        //this.choice += choice;
        TotalPrice += Price+25;
       

    }

    public double getTotalPrice() {
        return TotalPrice;
    }

   

    public int getItemes() {
        return itemes;
    }

    public void setItemes(int itemes) {
        this.itemes = itemes;
    }

}