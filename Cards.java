package assignment;

class Card {
    String cardStr;
    String rankStr;
    String suitStr;
    int cardValue;

    Card(String cardString, String rank, String suit, int value) {
        this.cardStr = cardString;
        this.rankStr = rank;
        this.suitStr = suit;
        this.cardValue = value;
    }
}
