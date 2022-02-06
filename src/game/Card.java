/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package game;
/**
 * This class models a simple card guessing game
 * Date: February 06,2022.
 * @author Harkeerat kaur
 */
public class Card {
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS, STAR
      }
    
    public enum Value {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
            EIGHT, NINE, TEN, JACK, QUEEN, KING, EMPEROR
       }
    
    private Value value;
    private Suit suit;
    

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    
    
    public Value getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

}

