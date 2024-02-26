package com.mycompany.couturecorner;

import javax.persistence.Column; 
import javax.persistence.Id; 
import javax.persistence.Entity; 

@Entity
public class Rating implements java.io.Serializable {
    //Attributes
    @Id
    @Column(name="ratingID")
    private int ratingID = 0;
    
    @Column(name="stars")
    private int stars=0;
    
    @Column(name="comments")
    private String comments = new String();
    
    @Column(name="ratingType")
    private String ratingType = new String();
    
    @Column(name="RPhoneNumber")
    private String RPhoneNumber = new String();
    
    //Constructor
    public Rating(){}

    //Setters & Getters
    public int getRatingID() {
        return ratingID;
    }

    public void setRatingID(int ratingID) {
        this.ratingID = ratingID;
    }

    public String getRPhoneNumber() {
        return RPhoneNumber;
    }

    public void setRPhoneNumber(String RPhoneNumber) {
        this.RPhoneNumber = RPhoneNumber;
    }
    
    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if(stars<=5 && stars > 0)
            this.stars = stars;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRatingType() {
        return ratingType;
    }

    public void setRatingType(String ratingType) {
        if(ratingType.equalsIgnoreCase("website"))
            this.ratingType = ratingType;
        if(ratingType.equalsIgnoreCase("outfits"))
            this.ratingType = ratingType;
        if(ratingType.equalsIgnoreCase("accessories"))
            this.ratingType = ratingType;
    }
}