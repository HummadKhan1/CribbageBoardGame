package assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Scoring {
    public static int score15(ArrayList<Card> cardsPlayed, int totalScore, int x)
    {
        if (totalScore == 15) {
            System.out.println("15");
            return 2;
        }

        if (x == cardsPlayed.size())
            return 0;

        if (totalScore + cardsPlayed.get(x).cardValue < 16)
            return score15(cardsPlayed, totalScore + cardsPlayed.get(x).cardValue, x + 1) + score15(cardsPlayed, totalScore, x + 1);
        else
            return score15(cardsPlayed, totalScore, x + 1);
    }

    public static int score31(ArrayList<Card> cardsPlayed, int totalScore, int x) {
        if (totalScore == 31)
        {
            System.out.println("31");
            return 2;
        }

        if (x == cardsPlayed.size())
            return 0;

        if (totalScore + cardsPlayed.get(x).cardValue < 32)
            return score31(cardsPlayed, totalScore + cardsPlayed.get(x).cardValue, x + 1) + score31(cardsPlayed, totalScore, x + 1);
        else
            return score31(cardsPlayed, totalScore, x + 1);
    }

    public static int score15or31(ArrayList<Card> cardsPlayed) {
        int total = 0;

        for (Card card : cardsPlayed) total += card.cardValue;

        if (total == 15)
        {
            System.out.println("15");
            return 2;
        }
        else if (total == 31)
        {
            System.out.println("31");
            return 2;
        }
        else
            return 0;
    }

    public static int scoreAPair(ArrayList<Card> cardsPlayed, String cardString) {
        int total = 0;

        for (Card card : cardsPlayed) {
            // Find all pairs
            if (card.rankStr.equals(cardString))
                total++;
        }

        if (total == 2)
        {
            System.out.println("Pair");
            return 2;
        }
        else if (total == 3)
        {
            System.out.println("Pair royal");
            return 6;
        }
        else if (total == 4)
        {
            System.out.println("Double Pair Royal");
            return 12;
        }

        return 0;
    }

    public static int checkPairPlays(ArrayList<Card> cardsPlayed) {
        HashSet<String> scoreAccountedFor = new HashSet<>();
        int total = 0, score = 0;

        for (int i = 0; i < cardsPlayed.size(); i++)
        {
            if (total == 1)
            {
                score += 2;
                System.out.println("Pair");
            }
            else if (total == 2)
            {
                score += 6;
                System.out.println("Pair royal");
            }
            else if (total == 3)
            {
                score += 12;
                System.out.println("Double Pair Royal");
            }

            total = 0;

            if (scoreAccountedFor.contains(cardsPlayed.get(i).rankStr))
                continue;

            for (int j = 0; j < cardsPlayed.size(); j++)
            {
                if (cardsPlayed.get(i).rankStr.equals(cardsPlayed.get(j).rankStr) && j > i)
                {
                    total++;
                    scoreAccountedFor.add(cardsPlayed.get(i).rankStr);
                }

            }
        }

        return score;
    }

    public static int goPhase()
    {
        System.out.println("Go");
        return 1;
    }

    public static int nobsPhase(ArrayList<Card> cardsPlayed)
    {
        for(int i = 0; i < cardsPlayed.size() - 1; i++)
        {
            if(cardsPlayed.get(i).rankStr.equals("J") && cardsPlayed.get(i).suitStr.equals(cardsPlayed.get(cardsPlayed.size() - 1).suitStr))
            {
                System.out.println("Nobs");
                return 1;
            }
        }
        return 0;
    }
}
