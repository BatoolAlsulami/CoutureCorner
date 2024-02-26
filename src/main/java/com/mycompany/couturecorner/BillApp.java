package com.mycompany.couturecorner;

import java.util.Date;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author as1ke
 */
public class BillApp extends Application {
    
    Bill bill = new Bill();
    static int id = 0;
    private double Price ;
    private String choice="";

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public BillApp(Bill bill, String choice) {
        this.bill = bill;
        this.choice += choice;
    }
    
     @Override
    public void start(Stage stage) {
        stage.setTitle("CoutureCorner - Bill");
        
        customer cstmr = new customer();
        
        stage.setWidth(440);
        
      
         BackgroundImage backgroundImage = new BackgroundImage(
    new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\Background.png"),
              BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
    Background background = new Background(backgroundImage);
        
      VBox Bill = new VBox(30) ;
      Bill.setPadding(new Insets(10, 30, 0, 30));
//      Bill.setStyle("-fx-border-color: pink;");
    
      Text titel = new Text("         your order:  ");
      Color c =Color.rgb(237, 128, 146);
      titel.setFill(c);
      titel.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC, 30));
      
     

       
       
      VBox Block = new VBox(10) ; 
      Block.setStyle("-fx-background-color: gray;");
      Text otfitTitle = new Text("  otfits and accessories:");  
      otfitTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.REGULAR, 15));
      Label l1=  new Label(choice);
      l1.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC, 15));
      Block.getChildren().addAll(otfitTitle,l1);
       
      Image imagePay = new Image("https://www.swalif.net/swalifsite/wp-content/uploads/%D8%A2%D8%A8%D9%84-%D8%A8%D8%A7%D9%8A.png");
      ImageView imageVieww = new ImageView(imagePay);//Setting the image view
      imageVieww.setFitHeight(50); //setting the fit height and width of the image view
      imageVieww.setFitWidth(80);
     
       
      HBox BlockForPrices = new HBox(10) ; 
      BlockForPrices.setStyle("-fx-background-color: gray;"); 
      Text priceTitle = new Text(" the total price is : \n and total items are : ");
      priceTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.REGULAR, 20));
       Label l2=  new Label(""+ bill.getTotalPrice() +"\n"+bill.getItemes() );
      l2.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.REGULAR, 20));
      BlockForPrices.getChildren().addAll(priceTitle,l2,imageVieww);
      
      
   // another Scene   
      Text text1 = new Text(); 
     text1.setText("thanks for choosing our\nshop !");
     Date date = new Date(); //to print date on bill
     
     text1.setTranslateY(50);
     text1.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,30));
     text1.setFill(c);
   
  
     Session session = HibernateUtil.getSessionFactory().openSession(); 
        //retrive last customer
        List<customer> cList = null; 
        String queryStr = "from customer"; 
        Query query = session.createQuery(queryStr); 
        cList = query.list(); 
        cstmr=cList.get(id);
        System.out.println(cstmr);
        session.close(); 
        
                //insert
                session = HibernateUtil.getSessionFactory().openSession(); 
                Transaction  tx = session.beginTransaction();
                bill.setBPhoneNumber(cstmr.getPhoneNumbr());
                int rId = (Integer) session.save(bill);
                tx.commit();
                session.close();
    
    VBox box1 =new VBox(8);
    box1.setPadding(new Insets(109,60,60,20));
    Label dd =new Label("\n\n   \n     date is "+ date);
    Label customer =new Label("\nyour information : "+cstmr.toString());
      customer.setAlignment(Pos.CENTER);
      Button rateButton  =new Button("Rate your experience");
        rateButton .setPrefHeight(20);
        rateButton .setPrefWidth(200);
        rateButton .setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #000000; -fx-font-weight: 200; " +
                "-fx-font-size: 16; -fx-border-color: #c570b0; -fx-font-family: Georgia");
    dd.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.REGULAR, 15));
    box1.getChildren().addAll(text1,dd,customer,rateButton);

   rateButton.setOnAction(e->{
       new RatingApp().start(stage);
   });

    BorderPane root2 =new BorderPane();
    root2.setTop(box1);
    
   
    root2.setBackground(background);
    
      imageVieww.setOnMouseClicked(e->{
        id++;
        stage.setTitle("CoutureCorner - Payment");
        stage.setWidth(400);
        var Finalscene = new Scene(root2, 400, 600);
        stage.setScene(Finalscene);
        stage.show();
        });
      
      Bill.getChildren().addAll(titel,Block);
      
      BorderPane root = new BorderPane();
      root.setPadding(new Insets(50, 50, 50, 50));
//      root.setStyle("-fx-background-color: pink; ");
       root.setBackground(background);
      root.setCenter(Bill);
      root.setBottom(BlockForPrices);
        var scene = new Scene(root, 400, 600);
        stage.setScene(scene);
        stage.show();
    }

   

    public static void main(String[] args) {
        launch();
    }
    
}
