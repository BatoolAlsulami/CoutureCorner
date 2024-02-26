package com.mycompany.couturecorner;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author alslm
 */
@Entity
public class OutFit implements java.io.Serializable {
     @Id
     @Column(name="OutFitID")
     private int OutFitID;
     @Column(name="Price")        
     private double Price;
     @Column(name="Size")
     private String Size;  
     @Column(name="productName")
     private String productName; 
     @Column(name="color")
     private String color; 
     @Column(name="material")
     private String material; 
     @Column(name="OutFitType")
     private String OutFitType; 



    public int getOutFitID() {
        return OutFitID;
    }

    public void setOutFitID(int OutFitID) {
        this.OutFitID = OutFitID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getSize() {
        return Size;
    }

    public OutFit(int OutFitID, double Price, String Size, String productName, String color, String material, String OutFitType) {
        this.OutFitID = OutFitID;
        this.Price = Price;
        this.Size = Size;
        this.productName = productName;
        this.color = color;
        this.material = material;
        this.OutFitType = OutFitType;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOutFitType() {
        return OutFitType;
    }

    public void setOutFitType(String OutFitType) {
        this.OutFitType = OutFitType;
    }
    public OutFit() {
    }
    public static void main(String[] args) {
//                    outfit fits1 = new outfit();
                    OutFit fits2 = new OutFit();
//                    outfit fits3 = new outfit();
//                    outfit fits4 = new outfit();
//                    outfit fits5 = new OutFit();
//                    outfit fits6 = new outfit();

//fits1.setId(64966);fits1.setColor("gray");fits1.setNamee("T-shirt");fits1.setOutFitType("summer");
//    fits1.setPrice("55.0"); fits1.setMatrial("Cotton");fits1.setSize("s");

    fits2.setOutFitID(63466);fits2.setColor("White and Light Brown"); 
    fits2.setProductName("T-shirt");
    fits2.setOutFitType("summer");
    fits2.setPrice(40.0); fits2.setMaterial("Cotton"); fits2.setSize("L");
         
        Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         //insert new student
         session = HibernateUtil.getSessionFactory().openSession();
         tx = session.beginTransaction();
         int sId2 = (Integer) session.save(fits2);
         tx.commit();
         session.close();
       
     
    }
//        
}