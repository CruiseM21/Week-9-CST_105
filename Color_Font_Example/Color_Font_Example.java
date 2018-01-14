/*
 * Program: Color And Font Example
 * File: Color_Font_Example.java
 * Summary: Display 5 rows of text in set font and random color
 * Author: Vincent Christaldi
 * Date: 01/14/18
 */
package color_font_example;

//files to import
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Color_Font_Example extends Application
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Application.launch(args);                   //launch program

    }

    @Override
    //set up scene
    public void start(Stage primaryStage)
    {
        Pane pText = new HBox(1);                   //create new pane with spacing between each label
        pText.setPadding(new Insets(12));           //set padding so pane fits in window
        Label lbl_Word = new Label("Java");         //create label to display text
        
        //loop to iterate through each label
        for (int index = 0; index < 5; index++)
        {
            lbl_Word.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));        //set the font info
            lbl_Word.setTextFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));    //randomize color values
            lbl_Word.setRotate(90);                                                                         //rotate the label 90 degrees
            pText.getChildren().add(lbl_Word);                                                              //add label to pane
            lbl_Word = new Label("Java");                                                                   //create new label for window
        }
        //set up window
        Scene window = new Scene(pText, 250, 60);       //create scene
        primaryStage.setTitle("Font/Color Example");    //set title
        primaryStage.setScene(window);                  //set the scene with the stage
        primaryStage.show();                            //show stage with all added nodes
    }

}
