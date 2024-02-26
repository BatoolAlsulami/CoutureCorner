package com.mycompany.couturecorner;
//outfit
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OutfitApp extends Application {
  
private static double price;
private static int item;
    Scene Winter;
   Scene summer;
  Scene scene;
       private static String choice="";
       
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
 
 public OutfitApp(double price,String choice){
 this.choice=choice;
 this.price=price;
 }
 
 public OutfitApp(){
 
 }
    @Override
    public void start(Stage stage) {
        Text l1=new Text("Outfit");l1.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,50));
        Font font=new Font(40);l1.setFill(Color.PINK);
        l1.setFont(font);
        Text l2=new Text("Summer Clothes");l2.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,50));
        Text l3=new Text("Winter Clothes");l3.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,50));
               Font font2=new Font(20);l2.setFill(Color.PINK);
            l2.setFont(font2);l3.setFill(Color.PINK);
            l3.setFont(font2);

        HBox title=new HBox();
        title.getChildren().add(l1);
        title.setAlignment(Pos.CENTER);
        Image img1=new Image("https://media.istockphoto.com/id/1257563298/photo/fashion-clothes-on-a-rack-in-a-light-background-indoors-place-for-text.jpg?b=1&s=612x612&w=0&k=20&c=2pLpczTxtUjys6Y33OKehWyqy8g98FlyCbJuUZVUv5k=");
        Image img2=new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQl8aqtTtCV-9wstvy12Xd-DTxxJcAmJFbUnRkL6AghWPRzsfPzibRRpA0yUs2MAs4Q38&usqp=CAU");
        ImageView imgv1=new ImageView(img1);
        ImageView imgv2=new ImageView(img2);
    //background 
BackgroundImage backgroundImage = new BackgroundImage(new Image("file:C:\\Users\\as1ke\\Desktop\\College\\7th semester\\Advanced Programming\\Project\\Background.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
    Background background = new Background(backgroundImage);
    /////////////////
       VBox vbox2=new VBox(); 
        vbox2.setAlignment(Pos.BOTTOM_LEFT);
        vbox2.setPadding(new Insets(30));
        imgv1.setFitHeight(180);
        imgv1.setFitWidth(220);
        Rectangle rimgv1=new Rectangle(220,180);
        StackPane stak=new StackPane(rimgv1,imgv1);
        imgv2.setFitHeight(180);
        imgv2.setFitWidth(220);
        //summer scene
Image imV1=new Image("https://cdn.dsmcdn.com/ty734/product/media/images/20230217/8/282505786/848270154/2/2_org_zoom.jpg");//skirt
Image imV2=new Image("https://www.bing.com/th?id=OIP.7XlNXlDO8iekoYrrj3bwMQHaLW&w=150&h=231&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");//bantal
Image imV3=new Image("https://th.bing.com/th/id/OPE.2xbvfgnXgPfxow300C300?w=178&h=231&o=5&dpr=1.3&pid=1.7");//dress blue
Image imV4=new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD_Piv9-kPLVsme7Oks8wqEngQNu1UOggqO-K7Yf-Ct5V-XoYHBsmWyuTKQTxHZ8BDGLI&usqp=CAU");//t shirt tr
Image imV5=new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVRK3IbpdiaV3kLm2kxJH5M_eVqsrJNM5lPA&usqp=CAU");//tshirt ramady
Image imV6=new Image("https://th.bing.com/th/id/OIP.05Hqoa9UeQaGVkyPth_UBQHaGh?w=233&h=204&c=7&r=0&o=5&dpr=1.3&pid=1.7");//black short
     
ImageView imv1=new ImageView();
ImageView imv2=new ImageView();
ImageView imv3=new ImageView();
ImageView imv4=new ImageView();
ImageView imv5=new ImageView();
ImageView imv6=new ImageView();

imv1.setFitHeight(140);
imv1.setFitWidth(140);
imv2.setFitHeight(140);
imv2.setFitWidth(140);
imv3.setFitHeight(140);
imv3.setFitWidth(140);
imv4.setFitHeight(140);
imv4.setFitWidth(140);
imv5.setFitHeight(140);
imv5.setFitWidth(140);
imv6.setFitHeight(140);
imv6.setFitWidth(140);

imv1.setImage(imV1);
imv2.setImage(imV2);
imv3.setImage(imV3);
imv4.setImage(imV4);imv5.setImage(imV5);imv6.setImage(imV6);

RadioButton rb1=new RadioButton("50.0 SR");
rb1.setOnAction(e->{
 price+=50.0 ;
 item+=1;
 choice+="Silk blue and white skirt\n";
});
RadioButton rb2=new RadioButton("80.0 SR");
rb2.setOnAction(e->{
 price+=80.0 ;
 item+=1;
 choice+="Satin multi-colored trousers\n";
});
RadioButton rb3=new RadioButton("120.0 SR");// Cotton  dress  T-shirt Short
        rb3.setOnAction(e->{
         price+=120.0 ;
         item+=1;
choice+="Cotton blue dress \n";
        });
        
RadioButton rb4=new RadioButton("40.0 SR");
rb4.setOnAction(e->{
       price+=40.0 ;
       item+=1;
choice+="Cotton white and brown t-shirt \n";
});
RadioButton rb5=new RadioButton("45.0 SR");
rb5.setOnAction(e->{
       price+=45.0 ;
       item+=1;
choice+="Cotton gray t-shirt\n ";
});
RadioButton rb6=new RadioButton("55.0 SR");
rb6.setOnAction(e->{
       price+=55.0 ;
       item+=1;
choice+="Cotton black shorts \n";
});
ToggleGroup togGrop=new ToggleGroup();
rb1.setToggleGroup(togGrop);rb2.setToggleGroup(togGrop);rb3.setToggleGroup(togGrop);
rb4.setToggleGroup(togGrop);rb5.setToggleGroup(togGrop);rb6.setToggleGroup(togGrop);

rb4.setStyle(" -fx-padding: 4px;-fx-text-fill: black;");
rb3.setStyle(" -fx-text-fill: black; -fx-padding: 4px;");
rb2.setStyle(" -fx-text-fill: black; -fx-padding: 4px;");
rb1.setStyle(" -fx-text-fill: black; -fx-padding: 4px;");
rb5.setStyle(" -fx-text-fill: black; -fx-padding: 4px;");
rb6.setStyle(" -fx-text-fill: black; -fx-padding: 4px;");

rb1.setAlignment(Pos.CENTER);rb2.setAlignment(Pos.CENTER);rb3.setAlignment(Pos.CENTER);
rb4.setAlignment(Pos.CENTER);rb5.setAlignment(Pos.CENTER);rb6.setAlignment(Pos.CENTER);





Text tit=new Text("Summer Clothes");  tit.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,40));
tit.setStyle("-fx-font-color: pink;"); tit.setFill(Color.PINK);

tit.setFont(font2);
HBox titll=new HBox(2);
titll.getChildren().add(tit);
titll.setAlignment(Pos.CENTER);
titll.setStyle("-fx-font-color: pink;");
VBox hbo=new VBox(2);
Button bt=new Button("Back"); bt.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,40));
bt.setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #c570b0; -fx-font-weight: 200; " +
"-fx-font-size: 20; -fx-border-color: #c570b0; -fx-font-family: Georgia");
hbo.getChildren().addAll(imv1,rb1);
Button btb=new Button("Next"); btb.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,40));
btb.setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #c570b0; -fx-font-weight: 200; " +
"-fx-font-size: 20; -fx-border-color: #c570b0; -fx-font-family: Georgia");
HBox btnss=new HBox();btnss.getChildren().addAll(btb,bt);btnss.setAlignment(Pos.CENTER);
VBox hbo2=new VBox(2);
hbo2.getChildren().addAll(imv2,rb2);
VBox hbo3=new VBox(2);
VBox hbo4=new VBox(2);
VBox hbo5=new VBox(2);
VBox hbo6=new VBox(2);

hbo3.getChildren().addAll(imv3,rb3);
//hbo3.getChildren().addAll(imv7,imv8,imv9);
      hbo.setStyle("-fx-border-color: pink;"); hbo2.setStyle("-fx-border-color: pink;");
      hbo3.setStyle("-fx-border-color: pink;");hbo4.setStyle("-fx-border-color: pink;");
      hbo5.setStyle("-fx-border-color: pink;"); hbo6.setStyle("-fx-border-color: pink;");


hbo4.getChildren().addAll(imv4,rb4);
hbo5.getChildren().addAll(imv5,rb5);
hbo6.getChildren().addAll(imv6,rb6);
HBox hboxx1=new HBox();
HBox hboxx2=new HBox();
HBox hboxx3=new HBox();
hboxx1.getChildren().addAll(hbo,hbo2);hboxx1.setAlignment(Pos.CENTER);
hboxx2.getChildren().addAll(hbo3,hbo4);hboxx2.setAlignment(Pos.CENTER);
hboxx3.getChildren().addAll(hbo5,hbo6);hboxx3.setAlignment(Pos.CENTER);

HBox btn=new HBox(5);
btn.getChildren().addAll(bt,btb);btn.setAlignment(Pos.CENTER);
VBox vbox1=new VBox();
//vbox1.setStyle("-fx-border-color:pink;");//-fx-background-color:#feecec;
vbox1.getChildren().addAll(hboxx1,hboxx2,hboxx3);vbox1.setAlignment(Pos.CENTER);
//vbox1.setPadding(new Insets(20));
vbox1.setAlignment(Pos.CENTER);
BorderPane border=new BorderPane();
//vbox1.setStyle("-fx-background-color:white;");
border.setTop(titll);
border.setCenter(vbox1); 
border.setBottom(btn);border.setAlignment(title, Pos.TOP_CENTER);

border.setAlignment(btn, Pos.TOP_CENTER);
border.setPadding(new Insets(5));///////----!!////////styling the btn
border.setBackground(background);
bt.setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #c570b0; -fx-font-weight: 200; " +
"-fx-font-size: 20; -fx-border-color: #c570b0; -fx-font-family: Georgia");
border.setStyle("-fx-background-color:#feecec;");
bt.setOnMouseClicked(e->{
    AccessoriesInterface ss=new AccessoriesInterface();
      double total = ss.getprice()+price;
    String t=ss.getchoice()+choice;
     int itemm =item+ss.getitem();
     Bill bill =new Bill(total,  itemm);
     BillApp bi =new BillApp(bill,t);
     border.setStyle("-fx-background-Color:BEIGE;");
     stage.setScene(scene);
});

btb.setOnMouseClicked(e ->{
    AccessoriesInterface ss=new AccessoriesInterface();
      double total = ss.getprice()+price;
    String t=ss.getchoice()+choice;
     int itemm =item+ss.getitem();
     Bill bill =new Bill(total,  itemm);
     BillApp bi =new BillApp(bill,t);
     bi.start(stage);
});
           summer=new Scene (border,400,600);
           stage.setTitle("CoutureCorner");
           
        //summer action     
        imgv1.setOnMouseClicked(e->{
        //Stage s=new Stage();
        stage.setTitle("CoutureCorner - Summer Clothes");
        stage.setScene(summer);
        stage.show();
        });
        ///////////////////////////////////////
        //winter scene 
         Text lb1=new Text("Winter Clothes"); lb1.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,50));
         lb1.setFont(font2); lb1.setFill(Color.PINK);

         VBox lbla=new VBox();lbla.setAlignment(Pos.CENTER);
         lbla.getChildren().add(lb1);
        Image im1=new Image("https://www.bing.com/th?id=OPE.Gn8gfQcmCSHbdA300C300&pid=21.1&w=136&h=136&qlt=100&dpr=1%D9%AB3");//glove 
         Image im2=new Image("https://th.bing.com/th/id/OIP.RVFSV04iv55-g0b03Ps5ngAAAA?w=147&h=187&c=7&r=0&o=5&dpr=1.3&pid=1.7");//red kanza
         Image im3=new Image("https://www.bing.com/th?id=OPE.f24SObZHF%2f6UDg300C300&pid=21.1&w=142&h=142&qlt=100&dpr=1%D9%AB3");// error
         Image im4=new Image("https://www.bing.com/th?id=OPE.ygaSzr44cBNd1A300C300&pid=21.1&w=142&h=142&qlt=100&dpr=1%D9%AB3");// pantes
         Image im5=new Image("https://www.bing.com/th?id=OPE.nKGZQgtVjZ%2bpVA300C300&pid=21.1&w=142&h=142&qlt=100&dpr=1%D9%AB3");
         Image im6=new Image("https://cdn-images.farfetch-contents.com/21/51/02/35/21510235_51695788_1000.jpg") ; //jack ba resh
//         
      ImageView imagv1=new ImageView();imagv1.setImage(im1);
      ImageView imagv2=new ImageView();imagv2.setImage(im2);
      ImageView imagv3=new ImageView();imagv3.setImage(im3);
      ImageView imagv4=new ImageView();imagv4.setImage(im4);
      ImageView imagv5=new ImageView();imagv5.setImage(im5);
      ImageView imagv6=new ImageView();imagv6.setImage(im6);
   imagv1.setFitHeight(140);imagv1.setFitWidth(140);   imagv2.setFitHeight(140);imagv2.setFitWidth(140);
   imagv3.setFitHeight(140);imagv3.setFitWidth(140);   imagv4.setFitHeight(140);imagv4.setFitWidth(140);
   imagv5.setFitHeight(140);imagv5.setFitWidth(140);   imagv6.setFitHeight(140);imagv6.setFitWidth(140);

     VBox vbox1l=new VBox();     VBox vbox12=new VBox();     VBox vbox13=new VBox();
     VBox vbox14=new VBox();     VBox vbox15=new VBox();     VBox vbox16=new VBox();
//  vbox1l.setStyle("-fx-background-color:pink;");  vbox12.setStyle("-fx-background-color:pink;");
//  vbox13.setStyle("-fx-background-color:pink;");  vbox14.setStyle("-fx-background-color:pink;");
//  vbox15.setStyle("-fx-background-color:pink;");  vbox16.setStyle("-fx-background-color:pink;");



RadioButton rdb1=new RadioButton("25.0 SR");rdb1.setAlignment(Pos.CENTER);
rdb1.setOnAction(e->{
       price+=25.0 ;
       item+=1;
choice+="Black gloves\n";//
});

RadioButton rdb2=new RadioButton("50.0 SR");rdb2.setAlignment(Pos.CENTER);
rdb2.setOnAction(e->{
       price+=50.0 ;
       item+=1;
choice+="Wool black jacket\n";//Woolen jacket
});

RadioButton rdb3=new RadioButton("70.0 SR");rdb3.setAlignment(Pos.CENTER);
rdb3.setOnAction(e->{
       price+=70.0 ;
       item+=1;
choice+="Leather black rain jacket\n";//Rain jacket ط¬ظ„ط¯ 
});

RadioButton rdb4=new RadioButton("80.0 SR");rdb4.setAlignment(Pos.CENTER);
rdb4.setOnAction(e->{
       price+=80.0 ;
       item+=1;
choice+="Black pants\n";//pants ظ‚ط·ظ†
});

RadioButton rdb5=new RadioButton("150.0 SR");
rdb5.setOnAction(e->{
       price+=150.0 ;
       item+=1;
choice+="Wool and cotton multi-colored sweater\n";//sweater طµظˆظپ ظˆظ‚ط·ظ†
});
RadioButton rdb6=new RadioButton("350.0 SR");rdb5.setAlignment(Pos.CENTER); rdb6.setAlignment(Pos.CENTER);
rdb6.setOnAction(e->{
       price+=350.0 ;
       item+=1;
choice+="Leather beige heavy jacket\n ";//Heavy jacket ط¬ظ„ط¯
});
ToggleGroup togGropd=new ToggleGroup();
rdb1.setToggleGroup(togGropd);rdb2.setToggleGroup(togGropd);rdb3.setToggleGroup(togGropd);
rdb1.setToggleGroup(togGropd);rdb5.setToggleGroup(togGropd);rdb6.setToggleGroup(togGropd);

rdb2.setStyle("  -fx-padding: 4px;");
rdb3.setStyle(" -fx-padding: 4px;");
rdb4.setStyle("  -fx-padding: 4px;");
rdb5.setStyle(" -fx-padding: 4px;");
rdb6.setStyle(" -fx-padding: 4px;");
rdb1.setStyle("  -fx-padding: 4px;");

vbox1l.getChildren().addAll(imagv1,rdb1);   vbox12.getChildren().addAll(imagv2,rdb2);
vbox13.getChildren().addAll(imagv3,rdb3);
vbox14.getChildren().addAll(imagv4,rdb4);
vbox15.getChildren().addAll(imagv5,rdb5);
vbox16.getChildren().addAll(imagv6,rdb6);
 vbox1l.setStyle("-fx-border-color:pink;"); vbox12.setStyle("-fx-border-color:pink;"); vbox13.setStyle("-fx-border-color:pink;");
 vbox14.setStyle("-fx-border-color:pink;"); vbox15.setStyle("-fx-border-color:pink;"); vbox16.setStyle("-fx-border-color:pink;");

HBox hb1=new HBox();HBox hb2=new HBox();HBox hb3=new HBox();
hb1.getChildren().addAll(vbox1l,vbox12);hb1.setAlignment(Pos.CENTER);
hb2.getChildren().addAll(vbox13,vbox14);hb2.setAlignment(Pos.CENTER);
hb3.getChildren().addAll(vbox15,vbox16);hb3.setAlignment(Pos.CENTER);
////background 
//BackgroundImage backgroundImage = new BackgroundImage(new Image("file:C:\\Users\\alslm\\OneDrive\\ط³ط·ط­ ط§ظ„ظ…ظƒطھط¨\\JavaFX\\captur\\bCGOUND.jpg"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
//    Background background = new Background(backgroundImage);
Button b=new Button("Back");b.setAlignment(Pos.CENTER);
Button next=new Button("Done");next.setAlignment(Pos.CENTER);

     
      
 next.setOnAction(e->{
     AccessoriesInterface ss=new AccessoriesInterface();
      double total = ss.getprice()+price;
    String t=ss.getchoice()+choice;
     int itemm =item+ss.getitem();
     Bill bill =new Bill(total,  itemm);
     BillApp bi =new BillApp(bill,t);
     bi.start(stage);   });
 
 
b.setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #c570b0; -fx-font-weight: 200; " +
"-fx-font-size: 20; -fx-border-color: #c570b0; -fx-font-family: Georgia");
next.setStyle("-fx-background-color: #f6c6ea; -fx-text-fill: #c570b0; -fx-font-weight: 200; " +
"-fx-font-size: 20; -fx-border-color: #c570b0; -fx-font-family: Georgia");next.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,40));
b.setFont(Font.font("Georgia",FontWeight.EXTRA_LIGHT,FontPosture.REGULAR,40));

b.setOnAction(e-> {
    AccessoriesInterface ss=new AccessoriesInterface();
      double total = ss.getprice()+price;
    String t=ss.getchoice()+choice;
     int itemm =item+ss.getitem();
     Bill bill =new Bill(total,  itemm);
     BillApp bi =new BillApp(bill,t);
    stage.setScene(scene);
});
VBox vvbo=new VBox();//backgrounf
vvbo.getChildren().addAll(hb1,hb2,hb3);//PADING 20
b.setAlignment(Pos.CENTER);vvbo.setAlignment(Pos.CENTER);
HBox btns=new HBox(5);btns.getChildren().addAll(next,b);btns.setAlignment(Pos.CENTER);
         BorderPane borderWin=new BorderPane();//borderWin.setStyle("-fx-background-color:#feecec;");
//          borderWin.setPadding(new Insets(5));
borderWin.setBackground(background);

         borderWin.setTop(lbla);
        borderWin.setCenter(vvbo); borderWin.setBottom(btns);b.setAlignment(Pos.CENTER);
        vvbo.setAlignment(Pos.CENTER);border.setAlignment(btns, Pos.TOP_CENTER);
borderWin.setPadding(new Insets(5));
         Winter=new Scene (borderWin,400,600);

         //winter action 
          imgv2.setOnMouseClicked(e->{
           stage.setTitle("CoutureCorner - Winter Clothes");
           stage.setScene(Winter);
           stage.show();
          });
          
          
          ///fo the first scene
     VBox vbox=new VBox(); 
          vbox.getChildren().add(l2);
     vbox.getChildren().add( stak);
     vbox.getChildren().add( l3);
     vbox.getChildren().add( imgv2);
  vbox.setAlignment(Pos.CENTER);
//  vbox.setPadding(new Insets(20));
  ///pane for all
     BorderPane Allitem=new BorderPane();
    Allitem.setStyle("-fx-border-color:pink;");

     Allitem.setTop(title);
    Allitem.setBottom(vbox2);  
     Allitem.setCenter(vbox);
//     Allitem.setStyle("-fx-background-Color:BEIGE;");
     Allitem.setBackground(background);

         scene = new Scene(Allitem, 400,600);
         scene.setFill(Color.BEIGE);  

        stage.setScene(scene);
        stage.show();
        
        //Insert outfit items
         
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction tx = session.beginTransaction();
       
       /*OutFit obj1 = new OutFit();
       obj1.setOutFitID(64966);
       obj1.setPrice(55.0);
       obj1.setSize("L");
       obj1.setProductName("T-shirt");
       obj1.setColor("Gray");
       obj1.setMaterial("Cotton");
       obj1.setOutFitType("summer");
       
       int sId2 = (Integer) session.save(obj1);
       tx.commit();
       session.close();*/
      


     //===========================================================================
     
       /*OutFit obj2 = new OutFit();
       obj2.setOutFitID(63466);
       obj2.setPrice(40.0);
       obj2.setSize("M");
       obj2.setProductName("T-shirt");
       obj2.setColor("White");
       obj2.setMaterial("Cotton");
       obj2.setOutFitType("summer");
       
       int sId2 = (Integer) session.save(obj2);
       tx.commit();
       session.close();*/
       
       //=================================================================================
       
       /*OutFit obj3 = new OutFit();
       obj3.setOutFitID(64406);
       obj3.setPrice(40.0);
       obj3.setSize("S");
       obj3.setProductName("Dress");
       obj3.setColor("Blue");
       obj3.setMaterial("Cotton");
       obj3.setOutFitType("summer");
       
       int sId2 = (Integer) session.save(obj3);
       tx.commit();
       session.close();*/
       
       
       //=====================================================================
       
        /*OutFit obj4 = new OutFit();
       obj4.setOutFitID(64477);
       obj4.setPrice(80.0);
       obj4.setSize("S");
       obj4.setProductName("Trousers");
       obj4.setColor("Multi");
       obj4.setMaterial("Satin");
       obj4.setOutFitType("summer");
       
       int sId2 = (Integer) session.save(obj4);
       tx.commit();
       session.close();*/
        
       //=======================================================================
       
       /*OutFit obj5 = new OutFit();
       obj5.setOutFitID(64366);
       obj5.setPrice(50.0);
       obj5.setSize("XL");
       obj5.setProductName("Skirt");
       obj5.setColor("Blue");
       obj5.setMaterial("Silk");
       obj5.setOutFitType("summer");
       
       int sId2 = (Integer) session.save(obj5);
       tx.commit();
       session.close();*/
       
       //======================================================================
       
       /*OutFit obj6 = new OutFit();
       obj6.setOutFitID(62966);
       obj6.setPrice(55.0 );
       obj6.setSize("S");
       obj6.setProductName("Shorts");
       obj6.setColor("Black");
       obj6.setMaterial("Cotton");
       obj6.setOutFitType("summer");
       
       int sId2 = (Integer) session.save(obj6);
       tx.commit();
       session.close();*/
       
       //=====================================================================
       
       /*OutFit obj7 = new OutFit();
       obj7.setOutFitID(95843);
       obj7.setPrice(25.0);
       obj7.setSize("S");
       obj7.setProductName("Gloves");
       obj7.setColor("Black");
       obj7.setMaterial("wool");
       obj7.setOutFitType("winter");
       
       int sId7 = (Integer) session.save(obj7);
       tx.commit();
       session.close();*/
       
       //=========================================================================
       
       /*OutFit obj8 = new OutFit();
       obj8.setOutFitID(95553);
       obj8.setPrice(50.0);
       obj8.setSize("S");
       obj8.setProductName("jacket");
       obj8.setColor("Black");
       obj8.setMaterial("Wool");
       obj8.setOutFitType("winter");
       
       int sId8 = (Integer) session.save(obj8);
       tx.commit();
       session.close();*/
       
       
       //=======================================================================

       /*OutFit obj9 = new OutFit();
       obj9.setOutFitID(95812);
       obj9.setPrice(70.0);
       obj9.setSize("M");
       obj9.setProductName("Rain jacket");
       obj9.setColor("Black");
       obj9.setMaterial("leather");
       obj9.setOutFitType("winter");
       
       int sId9 = (Integer) session.save(obj9);
       tx.commit();
       session.close();*/

       //====================================================
       
       /*OutFit obj10 = new OutFit();
       obj10.setOutFitID(95819);
       obj10.setPrice( 80.0);
       obj10.setSize("M");
       obj10.setProductName("pants");
       obj10.setColor("Black");
       obj10.setMaterial("cotton");
       obj10.setOutFitType("winter");
       
       int sId10 = (Integer) session.save(obj10);
       tx.commit();
       session.close();*/
       
       //=======================================================================
       
       /*OutFit obj11 = new OutFit();
       obj11.setOutFitID(95820);
       obj11.setPrice( 150.0);
       obj11.setSize("M");
       obj11.setProductName("sweater");
       obj11.setColor("multi");
       obj11.setMaterial("Wool");
       obj11.setOutFitType("winter");
       
       int sId10 = (Integer) session.save(obj11);
       tx.commit();
       session.close();*/
       
       //=======================================================================
       
       /*OutFit obj12 = new OutFit();
       obj12.setOutFitID(95503);
       obj12.setPrice( 350.0);
       obj12.setSize("M");
       obj12.setProductName("jacket");
       obj12.setColor("beige");
       obj12.setMaterial("leather");
       obj12.setOutFitType("winter");
       
       int sId10 = (Integer) session.save(obj12);
       tx.commit();
       session.close();*/
       
    }

    public int getitem() {
        return item;
    }

    

    public static void main(String[] args) {
        launch();
    }

}