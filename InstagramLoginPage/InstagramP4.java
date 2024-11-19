// Assignment - Part 4
// L00172671 - Oisin Gibson
// 14-03-2024
// For the purpose of this assigment the application below is meant for a hand held screen, ie moblie phone.

// Declare Imports
// Extras added for future Questions
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.*;
import java.util.*;

public class InstagramP4 extends Application {//open
   // Declare variables
   private Scene scene;
   private Label lbl1;
   private ImageView instaLogo;
   private TextField email, password;
   private Button login;
   private Button signUp;
   private Label lbl2;
   private VBox sceneLayout;

   @Override
   public void start(Stage primaryStage) {//open
   
      //Create the sceneLayout and set spacing to 5
      sceneLayout = new VBox(5);
      //Create the Label
      lbl1 = new Label("Instagram");
      //Set the Font
      lbl1.setFont(Font.font("Script MT Bold", FontWeight.BOLD, 40));
      //Set the alignment of the instaHeading
      lbl1.setAlignment(Pos.TOP_CENTER);
      //Set the Padding
      lbl1.setPadding(new Insets(0,0,40,0));
      //Set the max width
      lbl1.setMaxWidth(Double.MAX_VALUE);
      //Add the instaHeaading to the scenLayout
      sceneLayout.getChildren().add(lbl1);
      
      //Create email textFiled
      TextField email = new TextField("");
      //Set the padding
      sceneLayout.setPadding(new Insets(30,10,30,10));
      //Set the prompr text
      email.setPromptText("Email Address");
      //Set the MaxHeight
      email.setMaxHeight(30);
      //Set the MaxWidth
      email.setMaxWidth(Double.MAX_VALUE);
      //Add the email to the scenn layout
      sceneLayout.getChildren().add(email);
      
      //Create the password TextField
      PasswordField password = new PasswordField();
      //Set the prompt text
      password.setPromptText("Passowrd");
      //Set the MaxWidth
      password.setMaxWidth(Double.MAX_VALUE);
      //Add the password to the sceen layout
      sceneLayout.getChildren().add(password);
      
      //Create the Login Button
      login = new Button("Log In");
      //Set the text color
      login.setTextFill(Color.WHITE);
      //Set the background
      login.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
      //Set the MaxWidth
      login.setMaxWidth(Double.MAX_VALUE);
      //Add the login Button to the scenLayout
      sceneLayout.getChildren().add(login);
      
      //Create the account Label
      lbl2 = new Label("Do't have an account?");
      //Set the MaxWidth of the account Button
      lbl2.setMaxWidth(Double.MAX_VALUE);
      
      //Create the signUp Button
      signUp = new Button("Sign up");
      //Set the Text Color
      signUp.setTextFill(Color.LIGHTBLUE);
      //Set the Backgorund
      signUp.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
      
      //Create a HBox that contains lbl2 and signUp
      HBox lowerPart = new HBox();
      //Add a Border around the HBox
      lowerPart.setBorder(new Border(new BorderStroke(Color.LIGHTGREY,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
      //Set the Alignment
      lowerPart.setAlignment(Pos.CENTER);
      //Set the spacing
      lowerPart.setSpacing(5);
      //Add signUp and lbl2 to the HBox
      lowerPart.getChildren().addAll(lbl2,signUp);
      
      //Add the HBox to the sceneLayou
      sceneLayout.getChildren().add(lowerPart);
      
      //Create the Image
      Image instaLogo = new Image("image\\instagram.jpg");
      //Add the image
      ImageView imageSection = new ImageView(instaLogo);
      //Add the imageSection to the sceneLayout
      sceneLayout.getChildren().add(imageSection);
      
      //Set the main Background
      sceneLayout.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
      //Create the scene
      scene = new Scene(sceneLayout);
      //Set the Primary Stage
      primaryStage.setScene(scene);
      //Display
      primaryStage.show();
   }//close
   
   //Main not needed
   
}//close
      
      
      
