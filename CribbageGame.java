package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class CribbageGame extends Scoring {

    public static void main(String [] args)
    {
        ArrayList<Card> deck = new ArrayList<>();
        ArrayList<Card> player1Hand = new ArrayList<>();
        ArrayList<Card> player2Hand = new ArrayList<>();
        ArrayList<Card> player3Hand = new ArrayList<>();
        ArrayList<Card> player1NewHand = new ArrayList<>();
        ArrayList<Card> player2NewHand = new ArrayList<>();
        ArrayList<Card> player3NewHand = new ArrayList<>();
        ArrayList<Card> cribList = new ArrayList<>();
        ArrayList<Card> playedCards = new ArrayList<>();
        ArrayList<Card> topOfDeck = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int pegIndex;
        int player1Score = 0;
        int player2Score = 0;
        int player3Score = 0;
        int cardTotal = 0;

        Card d2 = new Card("d2","2","d",2);
        Card s2 = new Card("s2","2","s",2);
        Card c2 = new Card("c2","2","c",2);
        Card h2 = new Card("h2","2","h",2);
        Card d3 = new Card("d3","3","d",3);
        Card s3 = new Card("s3","3","s",3);
        Card c3 = new Card("c3","3","c",3);
        Card h3 = new Card("h3","3","h",3);
        Card d4 = new Card("d4","4","d",4);
        Card s4 = new Card("s4","4","s",4);
        Card c4 = new Card("c4","4","c",4);
        Card h4 = new Card("h4","4","h",4);
        Card d5 = new Card("d5","5","d",5);
        Card s5 = new Card("s5","5","s",5);
        Card c5 = new Card("c5","5","c",5);
        Card h5 = new Card("h5","5","h",5);
        Card d6 = new Card("d6","6","d",6);
        Card s6 = new Card("s6","6","s",6);
        Card c6 = new Card("c6","6","c",6);
        Card h6 = new Card("h6","6","h",6);
        Card d7 = new Card("d7","7","d",7);
        Card s7 = new Card("s7","7","s",7);
        Card c7 = new Card("c7","7","c",7);
        Card h7 = new Card("h7","7","h",7);
        Card d8 = new Card("d8","8","d",8);
        Card s8 = new Card("s8","8","s",8);
        Card c8 = new Card("c8","8","c",8);
        Card h8 = new Card("h8","8","h",8);
        Card d9 = new Card("d9","9","d",9);
        Card s9 = new Card("s9","9","s",9);
        Card c9 = new Card("c9","9","c",9);
        Card h9 = new Card("h9","9","h",9);
        Card d10 = new Card("d10","10","d",10);
        Card s10 = new Card("s10","10","s",10);
        Card c10 = new Card("c10","10","c",10);
        Card h10 = new Card("h10","10","h",10);
        Card dJ = new Card("dJ","J","d",10);
        Card sJ = new Card("sJ","J","s",10);
        Card cJ = new Card("cJ","J","c",10);
        Card hJ = new Card("hJ","J","h",10);
        Card dQ = new Card("dQ","Q","d",10);
        Card sQ = new Card("sQ","Q","s",10);
        Card cQ = new Card("cQ","Q","c",10);
        Card hQ = new Card("hQ","Q","h",10);
        Card dK = new Card("dK","K","d",10);
        Card sK = new Card("sK","K","s",10);
        Card cK = new Card("cK","K","c",10);
        Card hK = new Card("hK","K","h",10);
        Card dA = new Card("dA","A","d",1);
        Card sA = new Card("sA","A","s",1);
        Card cA = new Card("cA","A","c",1);
        Card hA = new Card("hA","A","h",1);

        deck.add(d2);
        deck.add(s2);
        deck.add(c2);
        deck.add(h2);
        deck.add(d3);
        deck.add(s3);
        deck.add(c3);
        deck.add(h3);
        deck.add(d4);
        deck.add(s4);
        deck.add(c4);
        deck.add(h4);
        deck.add(d5);
        deck.add(s5);
        deck.add(c5);
        deck.add(h5);
        deck.add(d6);
        deck.add(s6);
        deck.add(c6);
        deck.add(h6);
        deck.add(d7);
        deck.add(s7);
        deck.add(c7);
        deck.add(h7);
        deck.add(d8);
        deck.add(s8);
        deck.add(c8);
        deck.add(h8);
        deck.add(d9);
        deck.add(s9);
        deck.add(c9);
        deck.add(h9);
        deck.add(d10);
        deck.add(s10);
        deck.add(c10);
        deck.add(h10);
        deck.add(dJ);
        deck.add(sJ);
        deck.add(cJ);
        deck.add(hJ);
        deck.add(dQ);
        deck.add(sQ);
        deck.add(cQ);
        deck.add(hQ);
        deck.add(dK);
        deck.add(sK);
        deck.add(cK);
        deck.add(hK);
        deck.add(dA);
        deck.add(sA);
        deck.add(cA);
        deck.add(hA);

        System.out.println("How many players are playing?");
        int numPlayers = sc.nextInt();

        if(numPlayers > 2) {
            for (int i = 0; i < 5; i++) {
                pegIndex = (int)(Math.random() * (deck.size()));
                player1Hand.add(deck.get(pegIndex));
                player1NewHand.add(deck.get(pegIndex));
                deck.remove(deck.get(pegIndex));
            }

            for (int i = 0; i < 5; i++) {
                pegIndex = (int)(Math.random() * (deck.size()));
                player2Hand.add(deck.get(pegIndex));
                player2NewHand.add(deck.get(pegIndex));
                deck.remove(deck.get(pegIndex));
            }
            for (int i = 0; i < 5; i++) {
                pegIndex = (int)(Math.random() * (deck.size()));
                player3Hand.add(deck.get(pegIndex));
                player3NewHand.add(deck.get(pegIndex));
                deck.remove(deck.get(pegIndex));
            }
        } else {
            for (int i = 0; i < 6; i++) {
                pegIndex = (int)(Math.random() * (deck.size()));
                player1Hand.add(deck.get(pegIndex));
                player1NewHand.add(deck.get(pegIndex));
                deck.remove(deck.get(pegIndex));
            }

            for (int i = 0; i < 6; i++) {
                pegIndex = (int)(Math.random() * (deck.size()));
                player2Hand.add(deck.get(pegIndex));
                player2NewHand.add(deck.get(pegIndex));
                deck.remove(deck.get(pegIndex));
            }
        }

        topOfDeck.add(deck.get((int)(Math.random() * (deck.size()))));

        System.out.println("Player 1's Initial Hand: ");

        for(Card card : player1Hand)
            System.out.print(card.cardStr + " ");

        System.out.println();
        System.out.println();

        System.out.println("!! Throughout the game to input card, type lowercase suit followed by the number !!\n");

        String discardACard;
        boolean cardIsInHand = false;
        while(cardIsInHand == false) {
            System.out.println("Choose a card in your hand to discard: ");
            discardACard = sc.next();
            for(int i = 0; i < player1Hand.size(); i++)
            {
                if (player1Hand.get(i).cardStr.equals(discardACard))
                {
                    cardIsInHand = true;
                    cribList.add(player1Hand.get(i));
                    player1Hand.remove(player1Hand.get(i));
                    player1NewHand.remove(player1NewHand.get(i));
                }
            }
        }

        System.out.println();
        System.out.println("Player 1's New Hand: ");

        for(Card card : player1Hand)
            System.out.print(card.cardStr + " ");

        System.out.println();
        System.out.println();

        if(numPlayers == 2) {
            cardIsInHand = false;
            while(cardIsInHand == false) {
                System.out.println("Choose another card in your hand to discard: ");
                discardACard = sc.next();
                for(int i = 0; i < player1Hand.size(); i++)
                {
                    if (player1Hand.get(i).cardStr.equals(discardACard))
                    {
                        cardIsInHand = true;
                        cribList.add(player1Hand.get(i));
                        player1Hand.remove(player1Hand.get(i));
                        player1NewHand.remove(player1NewHand.get(i));
                    }
                }
            }
        }

        System.out.println("\n Do you want to end your turn?\n");

        System.out.println("Player 2's Initial Hand: ");

        for(Card card : player2Hand)
            System.out.print(card.cardStr + " ");

        System.out.println();
        System.out.println();

        cardIsInHand = false;
        while(cardIsInHand == false) {
            System.out.println("Choose a card in your hand to discard: ");
            discardACard = sc.next();
            for(int i = 0; i < player2Hand.size(); i++)
            {
                if (player2Hand.get(i).cardStr.equals(discardACard))
                {
                    cardIsInHand = true;
                    cribList.add(player2Hand.get(i));
                    player2Hand.remove(player2Hand.get(i));
                    player2NewHand.remove(player2NewHand.get(i));
                }
            }
        }

        System.out.println();
        System.out.println("Player 2's New Hand: ");

        for(Card card : player2Hand)
            System.out.print(card.cardStr + " ");

        System.out.println();
        System.out.println();

        if(numPlayers == 2) {
            cardIsInHand = false;
            while(cardIsInHand == false) {
                System.out.println("Choose another card in your hand to discard: ");
                discardACard = sc.next();
                for(int i = 0; i < player2Hand.size(); i++)
                {
                    if (player2Hand.get(i).cardStr.equals(discardACard))
                    {
                        cardIsInHand = true;
                        cribList.add(player2Hand.get(i));
                        player2Hand.remove(player2Hand.get(i));
                        player2NewHand.remove(player2NewHand.get(i));
                    }
                }
            }
        }

        System.out.println("\n Do you want to end your turn?\n");

        if(numPlayers > 2) {
            System.out.println("Player 3's Initial Hand: ");

            for(Card card : player3Hand)
                System.out.print(card.cardStr + " ");

            System.out.println();
            System.out.println();

            cardIsInHand = false;
            while(cardIsInHand == false) {
                System.out.println("Choose a card in your hand to discard: ");
                discardACard = sc.next();
                for(int i = 0; i < player3Hand.size(); i++)
                {
                    if (player3Hand.get(i).cardStr.equals(discardACard))
                    {
                        cardIsInHand = true;
                        cribList.add(player3Hand.get(i));
                        player3Hand.remove(player3Hand.get(i));
                        player3NewHand.remove(player3NewHand.get(i));
                    }
                }
            }

            System.out.println();
            System.out.println("Player 3's New Hand: ");

            for(Card card : player3Hand)
                System.out.print(card.cardStr + " ");

            System.out.println();
            System.out.println();

            System.out.println("\n Do you want to end your turn?\n");
        }

        cribList.add(topOfDeck.get(0));
        player1NewHand.add(topOfDeck.get(0));
        player2NewHand.add(topOfDeck.get(0));
        player3NewHand.add(topOfDeck.get(0));

        for (int j = 0; j < 4; j++)
        {
            System.out.println("Player 1 it is your turn!");
            System.out.println("Player 1's current hand: ");

            for(Card card : player1Hand)
                System.out.print(card.cardStr + " ");

            System.out.println();
            System.out.println();

            System.out.println("Cards that are currently placed: ");

            for(Card card : playedCards)
                System.out.print(card.cardStr + " ");

            System.out.println();
            System.out.println();

            cardIsInHand = false;
            while(cardIsInHand == false) {
                System.out.println("Player 1 please play a card from your hand: ");
                discardACard = sc.next();
                for(int i = 0; i < player1Hand.size(); i++)
                {
                    if (player1Hand.get(i).cardStr.equals(discardACard))
                    {
                        cardIsInHand = true;
                        cardTotal += player1Hand.get(i).cardValue;

                        if(cardTotal > 31)
                        {
                            if(numPlayers > 2) {
                                player2Score++;
                                player3Score++;
                            } else {
                                player2Score++;
                            }
                            playedCards.clear();
                            cardTotal = player1Hand.get(i).cardValue;
                        }

                        playedCards.add(player1Hand.get(i));
                        player1Hand.remove(player1Hand.get(i));
                    }
                }
            }

            player1Score = player1Score + score15or31(playedCards) + scoreAPair(playedCards, playedCards.get(playedCards.size() - 1).rankStr);

            System.out.println("Player 1's current score: " + player1Score);
            System.out.println("Do you want to end your turn?\n");

            System.out.println("Player 2's it is now your turn: ");
            System.out.println("Player 2's current hand: ");

            for(Card card : player2Hand)
                System.out.print(card.cardStr + " ");

            System.out.println();
            System.out.println();

            System.out.println("Cards that are currently placed: ");

            for(Card card : playedCards)
                System.out.print(card.cardStr + " ");

            System.out.println();
            System.out.println();

            cardIsInHand = false;
            while(cardIsInHand == false) {
                System.out.println("Player 2 please play a card from your hand: ");
                discardACard = sc.next();
                for(int i = 0; i < player2Hand.size(); i++)
                {
                    if (player2Hand.get(i).cardStr.equals(discardACard))
                    {
                        cardIsInHand = true;
                        cardTotal += player2Hand.get(i).cardValue;

                        if(cardTotal > 31)
                        {
                            if(numPlayers > 2) {
                                player1Score++;
                                player3Score++;
                            } else {
                                player1Score++;
                            }
                            playedCards.clear();
                            cardTotal = player2Hand.get(i).cardValue;
                        }
                        playedCards.add(player2Hand.get(i));
                        player2Hand.remove(player2Hand.get(i));
                    }
                }
            }

            player2Score = player2Score + score15or31(playedCards) + scoreAPair(playedCards, playedCards.get(playedCards.size() - 1).rankStr);

            System.out.println("Player 2's current score: " + player2Score);
            System.out.println("Do you want to end your turn?\n");

            if(numPlayers > 2) {
                System.out.println("Player 3's it is now your turn: ");
                System.out.println("Player 3's current hand: ");

                for(Card card : player3Hand)
                    System.out.print(card.cardStr + " ");

                System.out.println();
                System.out.println();

                System.out.println("Cards that are currently placed: ");

                for(Card card : playedCards)
                    System.out.print(card.cardStr + " ");

                System.out.println();
                System.out.println();

                cardIsInHand = false;
                while(cardIsInHand == false) {
                    System.out.println("Player 3 please play a card from your hand: ");
                    discardACard = sc.next();
                    for(int i = 0; i < player3Hand.size(); i++)
                    {
                        if (player3Hand.get(i).cardStr.equals(discardACard))
                        {
                            cardIsInHand = true;
                            cardTotal += player3Hand.get(i).cardValue;

                            if(cardTotal > 31)
                            {
                                player1Score++;
                                player2Score++;
                                playedCards.clear();
                                cardTotal = player3Hand.get(i).cardValue;
                            }

                            playedCards.add(player3Hand.get(i));
                            player3Hand.remove(player3Hand.get(i));
                        }
                    }
                }

                player3Score = player3Score + score15or31(playedCards) + scoreAPair(playedCards, playedCards.get(playedCards.size() - 1).rankStr);

                System.out.println("Player 3's current score: " + player3Score);
                System.out.println("Do you want to end your turn?\n");
            }
        }

        System.out.println("Player 1's Final Hand: ");

        for(Card card : player1NewHand)
            System.out.print(card.cardStr + " ");

        System.out.println();
           
        player1Score = player1Score + nobsPhase(player1NewHand) + checkPairPlays(player1NewHand) + score15(player1NewHand, 0, 0) + score31(player1NewHand, 0, 0);

        System.out.println("Player 1's Score: " + player1Score);
        System.out.println();

        System.out.println("Player 2's Final Hand: ");

        for(Card card : player2NewHand)
            System.out.print(card.cardStr + " ");

        System.out.println();

        player2Score = player2Score + nobsPhase(player2NewHand) + checkPairPlays(player2NewHand) + score15(player2NewHand, 0, 0) + score31(player2NewHand, 0, 0) + goPhase();

        System.out.println("Player 2's Score: " + player2Score);
        System.out.println();

        if(numPlayers > 2) {
            System.out.println("Player 3's Final Hand: ");

            for(Card card : player1NewHand)
                System.out.print(card.cardStr + " ");

            System.out.println();

            player3Score = player3Score + nobsPhase(player3NewHand) + checkPairPlays(player3NewHand) + score15(player3NewHand, 0, 0) + score31(player3NewHand, 0, 0);

            System.out.println("Player 3's Score: " + player3Score);
            System.out.println();
        }
        System.out.println("Crib Hand: ");

        for(Card card : cribList)
            System.out.print(card.cardStr + " ");

        System.out.println();

        System.out.println("Player 1's Final Score: " + player1Score);
        System.out.println("Player 2's Final Score: " + player2Score);
        if(numPlayers > 2) {
            System.out.println("Player 3's Final Score: " + player3Score);
        }
        if(numPlayers == 2) {
            if(player1Score > player2Score) {
                System.out.println("Player 1 wins with a score of " + player1Score + "!");
            } else if (player1Score < player2Score) {
                System.out.println("Player 2 wins with a score of " + player2Score + "!");
            } else {
                System.out.println("Player 1 and 2 tie with scores of " + player1Score + " and " + player2Score + "!");
            }
        } else if(numPlayers > 2) {
            if(player1Score > player2Score && player1Score > player3Score) {
                System.out.println("Player 1 wins with a score of " + player1Score + "!");
            } else if (player2Score > player1Score && player2Score > player3Score) {
                System.out.println("Player 2 wins with a score of " + player2Score + "!");
            } else if (player3Score > player1Score && player3Score > player2Score) {
                System.out.println("Player 3 wins with a score of " + player3Score + "!");
            } else if (player1Score == player2Score && player1Score == player3Score) {
                System.out.println("Player 1, 2, and 3 tie with scores of " + player1Score + " and " + player2Score + player3Score + "!");
            } else if (player1Score == player2Score) {
                System.out.println("Player 1 and 2 tie with scores of " + player1Score + " and " + player2Score + "!");
            } else if (player1Score == player3Score) {
                System.out.println("Player 1 and 3 tie with scores of " + player1Score + " and " + player3Score + "!");
            } else if(player2Score == player3Score) {
                System.out.println("Player 2 and 2 tie with scores of " + player2Score + " and " + player3Score + "!");
            }
        }

    }
}
