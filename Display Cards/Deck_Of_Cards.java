/*
 * Program: Random Card Selector
 * File: Deck_Of_Cards.java
 * Summary: Display 3 randomly chosen cards
 * Author: Vincent Christaldi
 * Date: 01/13/18
*/

package deck_of_cards;

//libraries to import
import java.util.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck_Of_Cards extends Application
{   //initial storage containers
    static ArrayList<Integer> deck = new ArrayList<>();
    static int[] cards = new int[3];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //methods to run program
        fillDeck();                     //fill/shuffle cards
        selectCards(cards);             //choose three cards
        Application.launch(args);       //launch window for display
    }
   
    //set up deck and shuffle it
    public static void fillDeck()
    {
        for(int c = 0; c <=52; ++c)
        {
            deck.add(c);
        }
        
        Collections.shuffle(deck);
    }
    //method to select cards at random
    public static void selectCards(int[] cards)
    {
        Random rand = new Random();                 //seed randomizer
        int card;                                   //current chosen card
        int index = 0;
        for(int i = 52;i > 49; --i)                 //take three cards
        {
            card = rand.nextInt(i);                 //randomly take card
            cards[index] = deck.get(card);
            deck.remove(card);                      //remove chosen card from list to prevent duplicate card
            index++;
        }
    }

    //display window method
     @Override
    public void start(Stage primaryStage) throws Exception
    {
        Pane card = new HBox(5);                                            //create new pane for each card
        Image card_Image;                                                   //create image variable
        for(int index = 0; index < cards.length; index++)                   
        {
            card_Image = new Image("/card/" + (cards[index]) + ".png");     //get card number from array
            card.getChildren().add(new ImageView(card_Image));              //place image on pane
        }
        Scene window = new Scene(card, 240,100);                             //set up new scene
        primaryStage.setScene(window);
        primaryStage.show();                                                //show the new scene
    }

    
}

