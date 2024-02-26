/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.couturecorner;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

/**
 *
 * @author shad7
 */
@Entity
public class customer implements java.io.Serializable{
    
 
 @Id
 @Column(name="PhoneNumber")
 private String PhoneNumbr;
 
  @Column(name="Email")
 private String Email;
  
   @Column(name="City")
 private String City;
   
    @Column(name="Street")
 private String Street;

     @Column(name="CustomerName")   
 private String customerName;
 
 
        public customer(String customerName, String PhoneNumbr, String Email, String City, String Street) {
            this.customerName = customerName;
            this.PhoneNumbr = PhoneNumbr;
            this.Email = Email;
            this.City = City;
            this.Street = Street;
        }

    public customer() {
    }

    public String getPhoneNumbr() {
        return PhoneNumbr;
    }

    public void setPhoneNumbr(String PhoneNumbr) {
        this.PhoneNumbr = PhoneNumbr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 

  @Override
   public String toString() {
       return customerName + "\n" + PhoneNumbr + "\n" + Email + "\n" + City + "\n" + Street;
    }
    
}
