/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package com.mycompany.couturecorner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
 
 
 
/**
* JavaFX App
*/
public class AccessoriesInterface extends Application {
 
   
       
    
    private static double price;
  
    private static String choice="";
  
    private static int ID=0;
   
    private static int item;
   
      public int getitem(){
        return item;
    }
   
     public void setitem(int price){
        this.item=item;
    }
   
    
    public double getprice(){
        return price;
    }
   
     public void setprice(double price){
        this.price=price;
    }
   
       public String getchoice(){
        return choice;
    }
      
         public void setpID(double price){
        this.price=price;
    }
   
       public String getID(){
        return choice;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return   " price=" + price + "\n choice=" + choice+item;
    }
    
     public void setchoice(String choice){
        this.choice=choice;
     }
    
     public AccessoriesInterface(double price,String choice,int ID,int item){
         this.choice=choice;
         this.price=price;
         this.ID=ID;
         this.item=item;
     }
    
     public AccessoriesInterface(){
       
     }
 
   
    @Override
    public void start(Stage stage) {
          /*
        Button b=new Button("click here");
        b.setOnAction(e->{
              accessories obj1=new accessories();
              obj1.start(primaryStage);
        });
        */
      
       BorderPane border = new BorderPane();
     
        Image ear1 = new Image("https://i.etsystatic.com/28224219/r/il/d2f903/3550597597/il_300x300.3550597597_cq7e.jpg");
        ImageView imageView = new ImageView(ear1);
        imageView.setFitHeight(115);
        imageView.setFitWidth(115);
       
       
        Image neac1 = new Image("https://enamelcopenhagen.com/cdn/shop/products/Necklace_Naomi-Necklaces-N93G-925S_GP-1_2048x.jpg?v=1672749439");
        ImageView imageView2 = new ImageView(neac1);
        imageView2.setFitHeight(115);
        imageView2.setFitWidth(115);
       
         Image hand1 = new Image("https://alphajewelleries.pk/wp-content/uploads/2023/02/1-6.png");
        ImageView imageView3 = new ImageView(hand1);
        imageView3.setFitHeight(115);
        imageView3.setFitWidth(115);
       
         Image leg1 = new Image("https://jbevans.ca/cdn/shop/files/PRIYA-ANKLET-JB705-HPG-GOLDGOLD-LADIES-ACCESSORIES-JENNY-BIRD-JB-Evans-Fashions-Footwear-3_2048x.webp?v=1684941216");
        ImageView imageView4 = new ImageView(leg1);
        imageView4.setFitHeight(115);
        imageView4.setFitWidth(115);
       
          Image ring1 = new Image("https://i.pinimg.com/736x/a5/4e/44/a54e4440b0381f8686072ba7dbc7b1fb.jpg");
        ImageView imageView5 = new ImageView(ring1);
        imageView5.setFitHeight(115);
        imageView5.setFitWidth(115);
       
           Image  neack2 = new Image("https://i.etsystatic.com/18723677/r/il/318896/5623005968/il_fullxfull.5623005968_4k09.jpg");
        ImageView imageView6 = new ImageView(neack2);
        imageView6.setFitHeight(115);
        imageView6.setFitWidth(115);
       
        Image  ear2 = new Image(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEyqIGpI-Nhp52GLaQKB1MmhLh3JSb-H0rmg&usqp=CAU");
        ImageView imageView7 = new ImageView(ear2);
        imageView7.setFitHeight(115);
        imageView7.setFitWidth(115);
       
        Image  ring2 = new Image("https://www.darbydiamonds.com/cdn/shop/products/il_fullxfull.3308700279_molb_91c9b13e-aed4-44f7-b2f7-ccb8d57d1d1b.jpg?v=1666012427&width=320");
        ImageView imageView8 = new ImageView(ring2);
        imageView8.setFitHeight(115);
        imageView8.setFitWidth(115);
       
         Image  hand2 = new Image("https://www.undertherose.co.uk/wp-content/uploads/2017/10/Web-Res-UTR-40.jpg ");
        ImageView imageView9 = new ImageView(hand2);
        imageView9.setFitHeight(115);
        imageView9.setFitWidth(115);
       
       RadioButton earb = new RadioButton("12.5 RS   ");
       earb.setOnAction(e -> {
            if (earb.isSelected()){
        price+=12.5;
        ID=117895;
        item+=1;
        choice +="Silver metal earrings\n";}
             else {  price=0;choice ="";ID=0;item=0;}
       
        });
      
       
      RadioButton neackb = new RadioButton("21.5 RS   ");
       neackb.setOnAction(e -> {
            if (neackb.isSelected()){
        price +=21.5;
        ID=219575;
        item+=1;
        choice +="Golden metal necklace\n";}
           else {  price=0;choice ="";ID=0;item=0;}
        });
     
      
       RadioButton handb = new RadioButton("25.33 RS   ");
        handb.setOnAction(e -> {
             if (handb.isSelected()){
        price+=25.33;
        ID=318563;
        item+=1;
        choice +="Silver Zirconia braclet\n";}
          else {  price=0;choice ="";ID=0;item=0;}
        });
      
       
       RadioButton legb = new RadioButton("10.45 RS   ");
       legb.setOnAction(e -> {
            if (legb.isSelected()){
        price+=10.45;
        ID=137785;
        item+=1;
        choice +="Golden Zirconia anklet\n";}
                 else {  price=0;choice ="";ID=0;item=0;}
        });
      
       
       RadioButton ringb = new RadioButton("15.55 RS   ");
       ringb.setOnAction(e -> {
            if (ringb.isSelected()){
        price +=15.55;
        ID=239932;
        item+=1;
        choice +="Silver steel ring\n";}
                 else {  price=0;choice ="";ID=0;item=0;}
        });
      
       
      RadioButton neack2b = new RadioButton("32.00 RS   ");
       neack2b.setOnAction(e -> {
            if (neack2b.isSelected()){
        price +=32.00;
        ID=330345;
        item+=1;
        choice +="Golden Zirconia necklace\n";}
              else {  price=0;choice ="";ID=0;item=0;}
        });
     
 
      RadioButton earb2 = new RadioButton("17.22 RS   ");
        earb2.setOnAction(e -> {
             if (earb2.isSelected()){
        price +=17.22;
        ID=128564;
        item+=1;
        choice +="golden steel earring\n";}
                 else {  price=0;choice =""; ID=0;item=0;}
        });
     
      
      RadioButton ring2b = new RadioButton("12.5 RS   ");
      ring2b.setOnAction(e -> {
          if (ring2b.isSelected()){
        price +=12.5;
        ID=229984;
        item+=1;
        choice +="Silver steel ring\n";}
              else {  price=0;choice ="";ID=0;item=0;}
        });
     
      
      RadioButton hand2b = new RadioButton("22.25 RS     ");
       hand2b.setOnAction(e -> {
            if (hand2b.isSelected()){
        price +=22.25;
        ID=322243;
        item+=1;
        choice +="Golden metal braclet\n";}
             else {  price=0;choice ="";ID=0;item=0;}
        });
     
      
      Button next = new Button("Done");
      next.setStyle("-fx-background-color: pink; -fx-text-fill: red; -fx-padding: 4px;");
  
     next.setOnAction(e->{
      OutfitApp outfit =new OutfitApp() ;
        double total  = outfit.getprice()+price;
       String t=outfit.getchoice()+choice;
         int itemm = outfit.getitem()+item; 
      Bill bill =new Bill( total, itemm);
      BillApp b =new BillApp(bill,t);
      b.start(stage);});
   
      
      Button prev = new Button(">>>");
      prev.setStyle("-fx-background-color: pink; -fx-text-fill: red; -fx-padding: 4px;");
     
      prev.setOnAction(e->{
          OutfitApp outfit =new OutfitApp() ;
        double total  = outfit.getprice()+price;
       String t=outfit.getchoice()+choice;
         int itemm = outfit.getitem()+item; 
      Bill bill =new Bill(total, itemm);
      BillApp b =new BillApp(bill,t);
      outfit.start(stage);   
      });
      
      
      HBox twobuttons=new HBox(20);
      twobuttons.getChildren().addAll(next,prev);
      twobuttons.setAlignment(Pos.CENTER);
      twobuttons.setStyle("-fx-border-color: pink;");
     
      
      
        VBox v1=new VBox(2);
        v1.getChildren().addAll(imageView,earb);
        v1.setAlignment(Pos.CENTER);
        v1.setStyle("-fx-border-color: pink;");
       
          VBox v2=new VBox(2);
        v2.getChildren().addAll(imageView2,neackb);
        v2.setAlignment(Pos.CENTER);
        v2.setStyle("-fx-border-color: pink;");
       
         VBox v3=new VBox(2);
        v3.getChildren().addAll(imageView3,handb);
        v3.setAlignment(Pos.CENTER);
        v3.setStyle("-fx-border-color: pink;");
       
         VBox v4=new VBox(2);
        v4.getChildren().addAll(imageView4,legb);
        v4.setAlignment(Pos.CENTER);
        v4.setStyle("-fx-border-color: pink;");
       
           VBox v5=new VBox(2);
        v5.getChildren().addAll(imageView5,ringb);
        v5.setAlignment(Pos.CENTER);
        v5.setStyle("-fx-border-color: pink;");
       
        VBox v6=new VBox(2);
        v6.getChildren().addAll(imageView6,neack2b);
        v6.setAlignment(Pos.CENTER);
        v6.setStyle("-fx-border-color: pink;");
       
         VBox v7=new VBox(2);
        v7.getChildren().addAll(imageView7,earb2);
        v7.setAlignment(Pos.CENTER);
        v7.setStyle("-fx-border-color: pink;");
       
         VBox v8=new VBox(2);
        v8.getChildren().addAll(imageView8,ring2b);
        v8.setAlignment(Pos.CENTER);
        v8.setStyle("-fx-border-color: pink;");
       
         VBox v9=new VBox(2);
        v9.getChildren().addAll(imageView9,hand2b);
        v9.setAlignment(Pos.CENTER);
        v9.setStyle("-fx-border-color: pink;");
       
        VBox bigleft=new VBox(2);
        bigleft.getChildren().addAll(v1,v2,v3);
         bigleft.setStyle("-fx-border-color: pink;");
        bigleft.setStyle("-fx-background-color: white");
       
         VBox center=new VBox(2);
        center.getChildren().addAll(v7,v8,v9);
        center.setStyle("-fx-border-color: pink;");
        center.setStyle("-fx-background-color: white");
       
         VBox bigright=new VBox(2);
        bigright.getChildren().addAll(v4,v5,v6);
        bigright.setStyle("-fx-border-color: pink;");
        bigright.setStyle("-fx-background-color: white");
       
        HBox h1=new HBox(8);
        h1.getChildren().addAll(bigleft,center,bigright);
        h1.setStyle("-fx-border-color: pink;");
       
        
         Text t1=new Text("accessories");
        t1.setFont(Font.font("Georgia", 20));
        HBox text1=new HBox();
        text1.getChildren().addAll(t1);
        text1.setAlignment(Pos.CENTER);
        text1.setStyle("-fx-border-color: pink;");
        t1.setFill(Color.PINK);
       
        border.setCenter(h1);
        border.setBottom(twobuttons);
        border.setTop(text1);
       
        
     Group root = new Group(border); //Creating a Group object
     Scene scene = new Scene(root);
     scene.setFill(Color.BEIGE); //setting color to the scene
     stage.setTitle("CoutureCorner - Accessories");
     //Setting the title to Stage.
     stage.setScene(scene); //Adding the scene to Stage
     stage.show();
   
     //============================================================================
       Accessories obj1 = new Accessories();
       
       
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction tx = session.beginTransaction();
       
       /*Accessories earbobj = new Accessories();
       earbobj.setpID(117895);
       earbobj.setchoice("Name:earing , Material:Silver metal");
       earbobj.setprice(12.5);
       
       int sId2 = (Integer) session.save(earbobj);
       tx.commit();
       session.close();*/
      


     //===========================================================================
     
       /*Accessories neackbobj = new Accessories();
       neackbobj.setpID(219575);
       neackbobj.setchoice("Name:necklace , Material:golden metal");
       neackbobj.setprice(21.5);
       
       int sId3 = (Integer) session.save(neackbobj);
       tx.commit();
       session.close();*/
       
       //=================================================================================
       
       
       /*Accessories handbobj = new Accessories();
       handbobj.setpID(318563);
       handbobj.setchoice("Name:braclet , Material:Silver Zirconia");
       handbobj.setprice(25.33);
       
       int sId4 = (Integer) session.save(handbobj);
       tx.commit();*/
       
       
       //=====================================================================
       
       /*Accessories legbobj = new Accessories();
       legbobj.setpID(137785);
       legbobj.setchoice("Name:anklet , Material:golden Zirconia");
       legbobj.setprice(10.45);
       
       int sId5 = (Integer) session.save(legbobj);
       tx.commit();
       session.close();*/
       //=======================================================================
      
       /*Accessories ringbobj = new Accessories();
       ringbobj.setpID(239932);
       ringbobj.setchoice("Name:ring , Material:Silver steel");
       ringbobj.setprice(15.55);
       
       int sId6 = (Integer) session.save(ringbobj);
       tx.commit();
       session.close();*/
       //======================================================================
       
       /*Accessories neack2bobj = new Accessories();
       neack2bobj.setpID(330345);
       neack2bobj.setchoice("Name:necklace , Material:golden Zirconia");
       neack2bobj.setprice(32.00);
       
        int sId7 = (Integer) session.save(neack2bobj);
       tx.commit();
       session.close();*/
       
       //=====================================================================
       
       /*Accessories earb2obj = new Accessories();
       earb2obj.setpID(128564);
       earb2obj.setchoice("Name:earing , Material:golden steel");
       earb2obj.setprice(17.22);
       
       int sId8 = (Integer) session.save(earb2obj);
       tx.commit();
       session.close();*/
       
       //=========================================================================
       
       /*Accessories ring2bobj = new Accessories();
       ring2bobj.setpID(229984);
       ring2bobj.setchoice("Name:ring , Material:Silver steel");
       ring2bobj.setprice(12.5);
       
       int sId9 = (Integer) session.save(ring2bobj);
       tx.commit();
       session.close();*/
       //=======================================================================

       /*Accessories hand2bobj = new Accessories();
       hand2bobj.setpID(322243);
       hand2bobj.setchoice("Name:braclet , Material:golden metal");
       hand2bobj.setprice(22.25);
       
       int sId10 = (Integer) session.save(hand2bobj);
       tx.commit();
       session.close();*/

       //====================================================
       
 
    }

    public static int getItem() {
        return item;
    }
 
    public static void main(String[] args) {
        launch();
    }}