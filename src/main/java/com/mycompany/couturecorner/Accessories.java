/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.couturecorner;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
/**
 *
 * @author shad7
 */
@Entity
public class Accessories implements java.io.Serializable {
    
    @Id
    @Column(name="accessoriesID")
    private int ID=0;
    
    @Column(name="Price")
    private double price=0.0;
   
    @Column(name="Choice")
    private String choice="";
   
    
    
    public double getprice(){
        return price;
    }
    
     public void setprice(double price){
        this.price=price;
    }
    
       public String getchoice(){
        return choice;
    }
       
       public void setchoice(String choice){
       this.choice=choice;
    }
       
         public void setpID(int ID){
        this.ID=ID;
    }
    
       public int getID(){
        return ID;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return   " price=" + price + "\n choice=" + choice;
    }
     
   
     
     public Accessories(double price,String choice,int ID){
         this.choice=choice;
         this.price=price;
         this.ID=ID;
        
     }
     
     public Accessories(){
        
     }

}

    
    
    
