package com.mycompany.couturecorner;

import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class RatingApp extends Application {
    
    //GUI
    Rating rating = new Rating();
    static int id = 0;

    @Override
    public void start(Stage stage) {
        VBox root1 = new VBox(10);
        root1.setAlignment(Pos.CENTER);
        Image bgImg = new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\Background.png");
        BackgroundImage backgroundImage = new BackgroundImage(
            bgImg,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        root1.setBackground(background);
        Scene scene1 = new Scene(root1,400,600);
        stage.setScene(scene1);
        stage.setTitle("CoutureCorner - Rating");
        stage.show();

        Text thanks = new Text("Thank you for choosing\nCoutureCorner!☻");
        thanks.setFill(Color.rgb(255,183,183));
        thanks.setStroke(Color.rgb(214,144,144));
        thanks.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,30));
        thanks.setTextAlignment(TextAlignment.CENTER);

        Text promptRating = new Text("How did you like it here?\nPlease rate your experience with us!");
        promptRating.setFill(Color.rgb(108,159,151));
        promptRating.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,21));
        promptRating.setTextAlignment(TextAlignment.CENTER);

        StackPane notePane = new StackPane();
        Rectangle noteRect = new Rectangle(300,45);
        noteRect.setFill(Color.rgb(255,183,183,0.4));
        noteRect.setArcHeight(20);
        noteRect.setArcWidth(20);
        Text note = new Text("Note: your input is greatly appreciated\nand will help us improve!");
        note.setFill(Color.rgb(214,144,144));
        note.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,16));
        note.setTextAlignment(TextAlignment.CENTER);
        notePane.getChildren().addAll(noteRect,note);

        Button rateOutfits = new Button("Rate Outfits");
        rateOutfits.setPrefWidth(200);
        rateOutfits.setPrefHeight(55);
        rateOutfits.setStyle("-fx-background-color: #cdf0ea; -fx-text-fill: #6c9f97; -fx-font-weight: 200; " +
                "-fx-font-size: 20; -fx-border-color: #6c9f97; -fx-font-family: Georgia");

        Button rateAccessories = new Button("Rate Accessories");
        rateAccessories.setPrefWidth(200);
        rateAccessories.setPrefHeight(55);
        rateAccessories.setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #c570b0; -fx-font-weight: 200; " +
                "-fx-font-size: 20; -fx-border-color: #c570b0; -fx-font-family: Georgia");

        Button rateWebsite = new Button("Rate Website");
        rateWebsite.setPrefWidth(200);
        rateWebsite.setPrefHeight(55);
        rateWebsite.setStyle("-fx-background-color: #faf4b7; -fx-text-fill: #c9bf56; -fx-font-weight: 200; " +
                "-fx-font-size: 20; -fx-border-color: #c9bf56; -fx-font-family: Georgia");

        Text noTY = new Text("No, Thank you.");
        noTY.setFill(Color.rgb(151,115,218));
        noTY.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,12));
        noTY.setTextAlignment(TextAlignment.CENTER);
        noTY.setUnderline(true);

        root1.getChildren().addAll(thanks,promptRating,notePane,rateOutfits,rateAccessories,rateWebsite,noTY);



        //second scene
        StackPane root2 = new StackPane();
        root2.setAlignment(Pos.CENTER);
        root2.setBackground(background);
        Scene scene2 = new Scene(root2,400,600);

        Text overallRating = new Text("Overall rating:");
        overallRating.setFill(Color.rgb(255,183,183));
        overallRating.setStroke(Color.rgb(214,144,144));
        overallRating.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,27));
        overallRating.setTextAlignment(TextAlignment.CENTER);

        Image unfilledStar = new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\starUnfill.png");

        ImageView star1 = new ImageView(unfilledStar);
        star1.setFitHeight(60);
        star1.setFitWidth(60);
        ImageView star2 = new ImageView(unfilledStar);
        star2.setFitHeight(60);
        star2.setFitWidth(60);
        ImageView star3 = new ImageView(unfilledStar);
        star3.setFitHeight(60);
        star3.setFitWidth(60);
        ImageView star4 = new ImageView(unfilledStar);
        star4.setFitHeight(60);
        star4.setFitWidth(60);
        ImageView star5 = new ImageView(unfilledStar);
        star5.setFitHeight(60);
        star5.setFitWidth(60);

        //HBox to hold the stars imageView
        HBox starsHBox = new HBox(5);
        starsHBox.setAlignment(Pos.CENTER);
        starsHBox.getChildren().addAll(star1,star2,star3,star4,star5);

        Text lblComments = new Text("Comments:");
        lblComments.setFill(Color.rgb(255,183,183));
        lblComments.setStroke(Color.rgb(214,144,144));
        lblComments.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,20));
        lblComments.setTextAlignment(TextAlignment.LEFT);

        TextArea commentsTA = new TextArea();
        commentsTA.setPrefColumnCount(15);
        commentsTA.setPrefRowCount(8);
        commentsTA.setWrapText(true);
        commentsTA.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,14));
        commentsTA.setStyle("-fx-background-color: #faf4b7; -fx-border-color: #c9bf56;");

        //HBox to hold the stars imageView
        HBox commentsHBox = new HBox(15);
        commentsHBox.setAlignment(Pos.TOP_CENTER);
        commentsHBox.getChildren().addAll(lblComments,commentsTA);
        commentsHBox.setPadding(new Insets(15,10,0,10));

        Button back = new Button("Back");
        back.setStyle("-fx-background-color: #ddd0ff; -fx-text-fill: #9773da; -fx-font-weight: 200; " +
                "-fx-font-size: 14; -fx-border-color: #9773da; -fx-font-family: Georgia");
        Button submit = new Button("Submit");
        submit.setStyle("-fx-background-color: #ddd0ff; -fx-text-fill: #9773da; -fx-font-weight: 200; " +
                "-fx-font-size: 14; -fx-border-color: #9773da; -fx-font-family: Georgia");
        Button done = new Button("Done");
        done.setStyle("-fx-background-color: #ddd0ff; -fx-text-fill: #9773da; -fx-font-weight: 200; " +
                "-fx-font-size: 14; -fx-border-color: #9773da; -fx-font-family: Georgia");

        HBox buttons = new HBox(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(back,submit,done);

        VBox actualScene = new VBox(20);
        actualScene.setAlignment(Pos.CENTER);
        actualScene.getChildren().addAll(overallRating,starsHBox,commentsHBox,buttons);

        Rectangle submitRect = new Rectangle(300,45);
        submitRect.setFill(Color.web("#faf4b7"));
        submitRect.setStroke(Color.web("#c570b0"));
        submitRect.setArcHeight(20);
        submitRect.setArcWidth(20);
        submitRect.setVisible(false);

        Text submitText = new Text("Your review has been submitted!");
        submitText.setFill(Color.web("#f6c6ea"));
        submitText.setStroke(Color.web("#c570b0"));
        submitText.setStrokeWidth(0.5);
        submitText.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,18));
        submitText.setTextAlignment(TextAlignment.CENTER);
        submitText.setVisible(false);

        Rectangle errorRect = new Rectangle(300,45);
        errorRect.setFill(Color.web("#faf4b7"));
        errorRect.setStroke(Color.web("#c570b0"));
        errorRect.setArcHeight(20);
        errorRect.setArcWidth(20);
        errorRect.setVisible(false);

        Text errorText = new Text("Please enter the required\ninformation to proceed!");
        errorText.setFill(Color.web("#f6c6ea"));
        errorText.setStroke(Color.web("#c570b0"));
        errorText.setStrokeWidth(0.5);
        errorText.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,18));
        errorText.setTextAlignment(TextAlignment.CENTER);
        errorText.setVisible(false);

        root2.getChildren().addAll(actualScene,submitRect,submitText,errorRect,errorText);



        //third scene
        VBox root3 = new VBox(10);
        root3.setAlignment(Pos.CENTER);
        root3.setBackground(background);
        Scene scene3 = new Scene(root3,400,600);

        Text okay = new Text("That's okay!\nWe appreciate you ordering\nfrom our website, and we hope\n to see you again!☻");
        okay.setFill(Color.rgb(225,159,173));
        //okay.setStroke(Color.rgb(197,98,118));
        //okay.setStrokeWidth(0.5);
        okay.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,27));
        okay.setTextAlignment(TextAlignment.CENTER);

        Image logoImg = new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\CoutureCorner_logo.png");
        ImageView logo1 = new ImageView(logoImg);
        logo1.setFitHeight(150);
        logo1.setFitWidth(150);

        root3.getChildren().addAll(okay,logo1);



        //fourth scene
        VBox root4 = new VBox(10);
        root4.setAlignment(Pos.CENTER);
        root4.setBackground(background);
        Scene scene4 = new Scene(root4,400,600);

        Text goodbye = new Text("Thank you for your input!\nWe appreciate you ordering\nfrom our website, and we hope\n to see you again!☻");
        goodbye.setFill(Color.rgb(225,159,173));
        goodbye.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,27));
        goodbye.setTextAlignment(TextAlignment.CENTER);

        ImageView logo2 = new ImageView(logoImg);
        logo2.setFitHeight(150);
        logo2.setFitWidth(150);

        root4.getChildren().addAll(goodbye,logo2);

        //all events are here
        
        //events that link the buttons of the first scene to other scenes
        rateOutfits.setOnAction( e -> {
            stage.setScene(scene2);
            star1.setImage(unfilledStar);
            star2.setImage(unfilledStar);
            star3.setImage(unfilledStar);
            star4.setImage(unfilledStar);
            star5.setImage(unfilledStar);
            commentsTA.setText("");
            rating.setRatingType("outfits");
        });
        rateAccessories.setOnAction( e -> {
            stage.setScene(scene2);
            star1.setImage(unfilledStar);
            star2.setImage(unfilledStar);
            star3.setImage(unfilledStar);
            star4.setImage(unfilledStar);
            star5.setImage(unfilledStar);
            commentsTA.setText("");
            rating.setRatingType("accessories");
        });
        rateWebsite.setOnAction( e -> {
            stage.setScene(scene2);
            star1.setImage(unfilledStar);
            star2.setImage(unfilledStar);
            star3.setImage(unfilledStar);
            star4.setImage(unfilledStar);
            star5.setImage(unfilledStar);
            commentsTA.setText("");
            rating.setRatingType("website");
        });
        noTY.setOnMouseClicked( e -> {
            stage.setScene(scene3);
        });
        

        //rating stars events
        Image filledStar = new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\starFill.png");
        star1.setOnMouseClicked( e -> {
            rating.setStars(1);
            star1.setImage(filledStar);
            star2.setImage(unfilledStar);
            star3.setImage(unfilledStar);
            star4.setImage(unfilledStar);
            star5.setImage(unfilledStar);
        });

        star2.setOnMouseClicked( e -> {
            rating.setStars(2);
            star1.setImage(filledStar);
            star2.setImage(filledStar);
            star3.setImage(unfilledStar);
            star4.setImage(unfilledStar);
            star5.setImage(unfilledStar);
        });

        star3.setOnMouseClicked( e -> {
            rating.setStars(3);
            star1.setImage(filledStar);
            star2.setImage(filledStar);
            star3.setImage(filledStar);
            star4.setImage(unfilledStar);
            star5.setImage(unfilledStar);
        });

        star4.setOnMouseClicked( e -> {
            rating.setStars(4);
            star1.setImage(filledStar);
            star2.setImage(filledStar);
            star3.setImage(filledStar);
            star4.setImage(filledStar);
            star5.setImage(unfilledStar);
        });

        star5.setOnMouseClicked( e -> {
            rating.setStars(5);
            star1.setImage(filledStar);
            star2.setImage(filledStar);
            star3.setImage(filledStar);
            star4.setImage(filledStar);
            star5.setImage(filledStar);
        });

        //events on buttons of the second scene
        back.setOnAction( e -> {stage.setScene(scene1);});
        submit.setOnAction( e -> {
            if (commentsTA.getText().isEmpty() || rating.getStars() == 0) {
                errorRect.setVisible(true);
                errorText.setVisible(true);
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
                    errorRect.setVisible(false);
                    errorText.setVisible(false);
                }));
                timeline.play();
            } else {
                rating.setComments(commentsTA.getText());
                submitRect.setVisible(true);
                submitText.setVisible(true);
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
                    submitRect.setVisible(false);
                    submitText.setVisible(false);
                }));
                timeline.play();
                Session session = HibernateUtil.getSessionFactory().openSession(); 
                //retrive last customer
                List<customer> cList = null; 
                String queryStr = "from customer"; 
                Query query = session.createQuery(queryStr); 
                cList = query.list(); 
                customer c=cList.get(id);
                System.out.println(c.getPhoneNumbr());
                session.close(); 
                
                //insert
                session = HibernateUtil.getSessionFactory().openSession(); 
                Transaction  tx = session.beginTransaction();
                rating.setRPhoneNumber(c.getPhoneNumbr());
                int rId = (Integer) session.save(rating);
                tx.commit();
                session.close();
            }
        });
        done.setOnAction( e ->{
            if (commentsTA.getText().isEmpty() || rating.getStars() == 0) {
                errorRect.setVisible(true);
                errorText.setVisible(true);
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
                    errorRect.setVisible(false);
                    errorText.setVisible(false);
                }));
                timeline.play();
            } else {
                stage.setScene(scene4);
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
    
}
