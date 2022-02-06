/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package game;

import game.Card.Suit;
import game.Card.Value;
import java.util.Scanner;

/**
 *
 * @author Harkeerat Kaur

 */


/**
 * This class models a simple card guessing game
 * Date: February 06,2022.
 * @author Harkeerat kaur
 */
public class Cardgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Value[] cardValues = Value.values();

        Suit[] cardSuits = Suit.values();
        
        Card[] hand = CardHandGenerator.generateHand(7, cardValues, cardSuits);



        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand");
        for (Card card : hand) {
            System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < cardSuits.length; i++) {
            System.out.println((i + 1) + ": " + cardSuits[i]);
        }
        int suitPosition = input.nextInt() - 1;

        System.out.println("Enter a value");
        for (int i = 0; i < cardValues.length; i++) {
            System.out.println((i + 1) + ": " + cardValues[i]);
        }

        int valuePosition = input.nextInt() - 1;

        Card userGuess = new Card(cardValues[valuePosition], 
                cardSuits[suitPosition]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit()== userGuess.getSuit()) {
                match = true;
                break;
            }
        }

        String response = match ? "Right guess" : "No match";

        System.out.println(response);
    }

}



