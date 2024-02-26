package com.mycompany.couturecorner;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import javafx.scene.control.TextField;

import org.hibernate.Session; 
import org.hibernate.Transaction; 
import org.hibernate.query.Query; 

/**
 * JavaFX App
 */
public class App extends Application {
    
public String name;
public String phoneNumbr1;
public String email;
public String city;
public String street;

    @Override
    public void start(Stage stage) {
   

 
 //insert new student


 
    //text1
     Text text1 = new Text(); 
     text1.setText("Welcome To");
     text1.setTranslateY(58);
     text1.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,40));
     Color c =Color.rgb(237, 128, 146);
     text1.setFill(c);
   
    //logo
    Image logoImage = new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\CoutureCorner_logo.png");
    ImageView logo = new ImageView(logoImage);//Setting the image view 
    logo.setFitHeight(280); 
    logo.setFitWidth(280);
    
    //BackgroundImage
    BackgroundImage backgroundImage = new BackgroundImage(
    new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\Background.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
    Background background = new Background(backgroundImage);


    //VBox1
    VBox box1 =new VBox();
    box1.setPadding(new Insets(109,60,60,60));
    box1.getChildren().addAll(text1);
    box1.setAlignment(Pos.CENTER);
    
    //Button login
    Button login =new Button("login");
    login.setPrefHeight(20);
    login.setPrefWidth(79);
    login.setStyle("-fx-background-color: #faf4b7; -fx-text-fill: #000000; -fx-font-weight: 200; " +
                "-fx-font-size: 17; -fx-border-color: #c570b0; -fx-font-family: Georgia");
    
  
    
    //VBox4
    HBox box4=new HBox(10);
    box4.setPadding(new Insets(10,10,80,10));
    box4.getChildren().addAll(login);
    box4.setAlignment(Pos.CENTER);
    
     
    //BorderPane
    BorderPane root1 =new BorderPane();
    root1.setTop(box1);
    root1.setCenter(logo);
    root1.setBottom(box4);
    root1.setBackground(background);
    
    
    //scene1
        Scene scene = new Scene(root1, 400,600);
        stage.setTitle("CoutureCorner");
        stage.setScene(scene);
        stage.show();
    
    
   
   
    
        ///////////////////--------------------SECOND SCENE---------------------/////////////
        
        
    
    //BackgroundImage
    BackgroundImage backgroundImage2 = new BackgroundImage(
    new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\Background.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
    Background background2 = new Background(backgroundImage2);
        
    //BorderPane    
    BorderPane root2 = new BorderPane();
    root2.setBackground(background);

    //stackpane
    StackPane stackPane=new StackPane();
     
        //VBox
        VBox inputFields = new VBox(5);
        inputFields.setSpacing(10);
        inputFields.setPadding(new Insets(10,10,10,10));

        //Label and TextField
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(new Font(" Georgia",15));
        nameLabel.setTextFill(Color.BLACK);
        TextField nameTextField = new TextField();
      
        name = nameTextField.getText();

        Label emailLabel = new Label("Email:");
        emailLabel.setFont(new Font(" Georgia",15));
        emailLabel.setTextFill(Color.BLACK);
        TextField emailTextField = new TextField();
        
        email = emailTextField.getText();
        
 
        
        Label phoneLabel = new Label("Phone Number:");
        phoneLabel.setFont(new Font(" Georgia",15));
        phoneLabel.setTextFill(Color.BLACK);
        TextField phoneTextField = new TextField();
        
        phoneNumbr1=phoneTextField.getText();
 

        Label streetLabel = new Label("Street:");
        streetLabel.setFont(new Font(" Georgia",15));
        streetLabel.setTextFill(Color.BLACK);
        TextField streetTextField = new TextField();
        
        street = streetTextField.getText();
 

        Label cityLabel = new Label("City:");
        cityLabel.setFont(new Font(" Georgia",15));
        cityLabel.setTextFill(Color.BLACK);
        TextField cityTextField = new TextField();
        
        
        city  = cityTextField.getText();
        
 

        inputFields.getChildren().addAll(nameLabel, nameTextField, emailLabel, emailTextField, phoneLabel, phoneTextField, 
     streetLabel, streetTextField, cityLabel, cityTextField);
        inputFields.setAlignment(Pos.CENTER_LEFT);
        root2.setCenter(inputFields);

      
        
       
        //Button submitButton
        Button submitButton  =new Button("login");
        submitButton .setPrefHeight(20);
        submitButton .setPrefWidth(110);
        submitButton .setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #000000; -fx-font-weight: 200; " +
                "-fx-font-size: 16; -fx-border-color: #c570b0; -fx-font-family: Georgia");
        
        //VBox
        VBox.setMargin(submitButton, new Insets(10,10,15,10));
        VBox button = new VBox(5);
        button.setAlignment(Pos.CENTER);
        button.getChildren().addAll(stackPane,submitButton);
        root2.setBottom(button);
   
        
        
        //color
        Color Color1= Color.rgb(255, 255, 153,0.4);
        Color Color2= Color.rgb(255, 153, 160);
        
        //Rectangle
        Rectangle warning = new Rectangle(290,50);
        warning.setFill(Color1);
        warning.setStroke(Color2);
        warning.setStrokeWidth(2);
        warning.setVisible(false);
        Text warningText = new Text();
        warningText.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,18));
        warningText.setFill(Color.BLACK);
        warningText.setVisible(false);
        
        
        stackPane.getChildren().addAll(warning,warningText);
        
        //mouse Action
        submitButton.setOnMouseClicked(e -> {
            
 
            if (nameTextField.getText().isEmpty()) {
                warningText.setText("You must enter your name!");
            }else if (emailTextField.getText().isEmpty()){
                warningText.setText("You must enter the Email");
            }else if (phoneTextField.getText().isEmpty()){
                warningText.setText("You must enter your phone number!");
            }else if(phoneTextField.getText().length() != 10 || !(phoneTextField.getText().substring(0,2).equals("05"))){
                warningText.setText("Please enter a valid phone number!");
            }else if (streetTextField.getText().isEmpty()){
                warningText.setText("You must enter the street");
            }else if (cityTextField.getText().isEmpty()){
                warningText.setText("You must enter the city");
            }else {
                //new Rating().start(new Stage());
                new Menu().start(stage);
            }
            
            warning.setVisible(true);
            warningText.setVisible(true);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(4), event -> {
            warning.setVisible(false);
            warningText.setVisible(false);
            }));
            timeline.play();
            
            customer st1 = new customer();
            
            System.out.println(name+"\n"+phoneNumbr1+"\n"+email+"\n"+city+"\n"+street);
        
          
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            
            st1.setCustomerName(nameTextField.getText());
            st1.setPhoneNumbr(phoneTextField.getText());
            st1.setEmail(emailTextField.getText());
            st1.setCity(cityTextField.getText());
            st1.setStreet(streetTextField.getText());
            
            
            
            String sId2 = (String) session.save(st1);
            tx.commit();
            session.close();
            
           
         });
        
        //login Action
        login.setOnMouseClicked(e->
                {
                    Scene scene2 = new Scene(root2, 400, 600);
                    stage.setScene(scene2);
                    stage.setTitle("CoutureCorner");
                    stage.show();
                
                });
        
    }

    

    public static void main(String[] args) {
        launch();
    }

}