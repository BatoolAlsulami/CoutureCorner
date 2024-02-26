package com.mycompany.couturecorner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Menu extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(5);
        root.setAlignment(Pos.CENTER);
        Image bgImg = new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\Background.png");
        BackgroundImage backgroundImage = new BackgroundImage(
            bgImg,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        root.setBackground(background);
        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("CoutureCorner");
        stage.setScene(scene);
        stage.show();

        Text wdynText = new Text("What do you need?");
        wdynText.setFill(Color.rgb(108,159,151));
        wdynText.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,40));
        VBox.setMargin(wdynText,new Insets(0,0,5,0));

        ImageView announceRect = new ImageView("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\announcementRibbon.png");
        announceRect.setFitWidth(300);
        announceRect.setFitHeight(83);

        Text discountAnnounce = new Text("DISCOUNT THIS WEEK 20%");
        discountAnnounce.setFill(Color.rgb(151,115,218));
        discountAnnounce.setStroke(Color.rgb(81,41,154));
        discountAnnounce.setStrokeWidth(0.3);
        discountAnnounce.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,15));
        StackPane announcement = new StackPane();
        StackPane.setMargin(discountAnnounce,new Insets(0,0,30,0));

        announcement.getChildren().addAll(announceRect,discountAnnounce);

        Text outfits = new Text("Outfits");
        outfits.setFill(Color.rgb(255,183,183));
        outfits.setStroke(Color.rgb(214,144,144));
        outfits.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,25));

        StackPane SPOutfits = new StackPane();
        Rectangle outfitRect = new Rectangle(244,165.75);
        outfitRect.setFill(Color.rgb(250,244,183));
        outfitRect.setStroke(Color.rgb(201, 191, 86));
        outfitRect.setArcWidth(10);
        outfitRect.setArcHeight(10);

        ImageView outfitImg = new ImageView("https://static.vecteezy.com/system/resources/previews/024/495/430/large_2x/colourful-clothes-on-clothing-rack-pastel-colorful-closet-in-shopping-store-or-bedroom-rainbow-color-clothes-choice-on-hangers-home-wardrobe-concept-ai-generated-image-free-photo.jpg");
        outfitImg.setFitWidth(234);
        outfitImg.setFitHeight(155.75);
        SPOutfits.getChildren().addAll(outfitRect,outfitImg);

        Text accessories = new Text("Accessories");
        accessories.setFill(Color.rgb(255,183,183));
        accessories.setStroke(Color.rgb(214,144,144));
        accessories.setFont(Font.font("Georgia", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR,25));
        VBox.setMargin(accessories,new Insets(20,0,0,0));

        StackPane SPAccessories = new StackPane();
        Rectangle accessoriesRect = new Rectangle(244,160);
        accessoriesRect.setFill(Color.rgb(250,244,183));
        accessoriesRect.setStroke(Color.rgb(201, 191, 86));
        accessoriesRect.setArcWidth(10);
        accessoriesRect.setArcHeight(10);

        ImageView accessoriesImg = new ImageView("https://cache.net-a-porter.com/content/images/story-head-content-24thOctober2022-1666086890596.jpeg/w1900_q65.jpeg");
        accessoriesImg.setFitWidth(234);
        accessoriesImg.setFitHeight(150);
        SPAccessories.getChildren().addAll(accessoriesRect,accessoriesImg);

        root.getChildren().addAll(announcement,outfits,SPOutfits,accessories,SPAccessories);

        //events
        outfitImg.setOnMouseClicked(e -> {
            new OutfitApp().start(stage);
        });
        accessoriesImg.setOnMouseClicked(e -> {
            new AccessoriesInterface().start(stage);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}