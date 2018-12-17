Main.java
 
package com.company;
 
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.toString());
        game.gameplay();
        System.out.println(game.toString());
        if(game.playerOneWins)
            System.out.println("first " + game.n);
        else if(game.playerTwoWins)
            System.out.println("second " + game.n);
        else System.out.println("botva");
    }
}
 
Deck.java
 
package com.company;
 
import java.util.ArrayList;
import java.util.Comparator;
 
public class Deck {
    ArrayList<Card>list = new ArrayList<>();
    Deck(){
        int i=0;
        while (i<10){
            Card card = new Card(i);
            list.add(card);
            i++;
        }
    }
    public void ShuffleDeck(){
        list.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                int a = (int)(Math.random()*10);
                if(a<5){
                    return 1;
                }
                else return -1;
            }
        });
    }
 
    @Override
    public String toString() {
        return "Deck{" +
                "list=" + list +
                '}';
    }
}
 
Card.java
 
package com.company;
 
public class Card {
    int rank;
    public Card(int rang) {
        this.rank= rang;
    }
    public int getRank() {
        return rank;
    }
 
    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                '}';
    }
}
 
Game.java
 
package com.company;
 
 
import java.util.ArrayDeque;
 
 
public class Game {
    boolean playerOneWins= false;
    boolean playerTwoWins= false;
    int n = 0;
    Deck deck= new Deck();
    ArrayDeque<Card>player1 = new ArrayDeque<>();
    ArrayDeque<Card>player2 = new ArrayDeque<>();
    Game(){
        int i = 0;
        deck.ShuffleDeck();
        while(i<5){
            player1.push(deck.list.get(i));
            player2.push(deck.list.get(i+5));
            i++;
        }
 
    }
    public void gameplay() {
        while (!(playerOneWins|| playerTwoWins|| (n >106))) {
            n++;
            if (player1.getFirst().getRank() >player2.getFirst().getRank()) {
                player1.addLast(player1.getFirst());
                player1.removeFirst();
                player1.addLast(player2.getFirst());
                player2.removeFirst();
                if (player2.isEmpty())
                    playerOneWins= true;
            }
            else {
                player2.addLast(player2.getFirst());
                player2.removeFirst();
                player2.addLast(player1.getFirst());
                player1.removeFirst();
                if (player1.isEmpty())
                    playerTwoWins= true;
            }
        }
    }
 
    @Override
    public String toString() {
        return "Game{" +
                "deck=" + deck +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}