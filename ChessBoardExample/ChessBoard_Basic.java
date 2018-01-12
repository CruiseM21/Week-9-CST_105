/*
 * Program: Basic chess board
 * File: ChessBoard_basic.java
 * Summary: Display simple chess board
 * Author: Vincent Christaldi
 * Date: 01/12/18
*/
package chessboard_basic;

//libraries to import
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.*;

public class ChessBoard_Basic
{

    //set up initial global constants
    public static int Rows = 8, Cols = 8;
    public static Color GrnSquare = Color.green;
    public static Color BlueSquare = Color.blue;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //set up initial window 
        JFrame Board = new JFrame();                    //new frame
        Board.setTitle("Basic Chess Board");            //title of frame
        Board.setSize(800,800);                         //window size
        Color Sq_Color;                                 //Current Square Color
        Container pane = Board.getContentPane();        //new pane for window
        Board.setLayout(new GridLayout( Rows, Cols));   //set up layout style
        Board.setDefaultCloseOperation(EXIT_ON_CLOSE);  //set up close action
        
        //design board
        for(int Row = 0; Row < Rows; ++Row)
        {
            //check for even or odd square
            if(Row%2 == 0) //even square
            {
                Sq_Color = GrnSquare;
            }
            else
            {
                Sq_Color = BlueSquare;
            }
            
            for(int Col = 0; Col < Cols; ++Col)
            {
                //create actual squares for board
                JPanel Square = new JPanel();           //create square
                Square.setBackground(Sq_Color);         //set square initial color
                //change square color as needed
                if(Sq_Color.equals(GrnSquare))
                {
                    Sq_Color = BlueSquare;
                }
                else
                {
                    Sq_Color = GrnSquare;
                }
                Board.add(Square);                      //add current square to pane
            }
        }
        
        //display final result
        Board.setVisible(true);
    }
    
}
