package models;

import Interfaces.Card;
import Interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {

    CardImpl[] cards = new CardImpl[52];

    public DeckOfCardsImpl() {
        cards[0] = new CardImpl("двойка треф", 2);
        cards[1] = new CardImpl("двойка червей", 2);
        cards[2] = new CardImpl("двойка пик", 2);
        cards[3] = new CardImpl("двойка бубен", 2);

        cards[4] = new CardImpl("тройка треф", 3);
        cards[5] = new CardImpl("тройка червей",3 );
        cards[6] = new CardImpl("тройка пик", 3);
        cards[7] = new CardImpl("тройка бубен", 3);

        cards[8] = new CardImpl("четверка треф", 4);
        cards[9] = new CardImpl("четверка червей", 4);
        cards[10] = new CardImpl("четверка пик", 4);
        cards[11] = new CardImpl("четверка бубен", 4);

        cards[12] = new CardImpl("пятерка треф", 5);
        cards[13] = new CardImpl("пятерка червей", 5);
        cards[14] = new CardImpl("пятерка пик", 5);
        cards[15] = new CardImpl("пятерка бубен", 5);

        cards[16] = new CardImpl("шестерка треф", 6);
        cards[17] = new CardImpl("шестерка червей", 6);
        cards[18] = new CardImpl("шестерка пик", 6);
        cards[19] = new CardImpl("шестерка бубен", 6);

        cards[20] = new CardImpl("семерка треф", 7);
        cards[21] = new CardImpl("семерка червей", 7);
        cards[22] = new CardImpl("семерка пик", 7);
        cards[23] = new CardImpl("семерка бубен", 7);

        cards[24] = new CardImpl("восьмерка треф", 8);
        cards[25] = new CardImpl("восьмерка червей", 8);
        cards[26] = new CardImpl("восьмерка пик", 8);
        cards[27] = new CardImpl("восьмерка бубен", 8);

        cards[28] = new CardImpl("девятка треф", 9);
        cards[29] = new CardImpl("девятка червей", 9);
        cards[30] = new CardImpl("девятка пик", 9);
        cards[31] = new CardImpl("девятка бубен", 9);

        cards[32] = new CardImpl("десятка треф", 10);
        cards[33] = new CardImpl("десятка червей", 10);
        cards[34] = new CardImpl("десятка пик", 10);
        cards[35] = new CardImpl("десятка бубен", 10);

        cards[36] = new CardImpl("валет треф", 10);
        cards[37] = new CardImpl("валет червей", 10);
        cards[38] = new CardImpl("валет пик", 10);
        cards[39] = new CardImpl("валет бубен", 10);

        cards[40] = new CardImpl("дама треф", 10);
        cards[41] = new CardImpl("дама червей", 10);
        cards[42] = new CardImpl("дама пик", 10);
        cards[43] = new CardImpl("дама бубен", 10);

        cards[44] = new CardImpl("король треф", 10);
        cards[45] = new CardImpl("король червей", 10);
        cards[46] = new CardImpl("король пик", 10);
        cards[47] = new CardImpl("король бубен", 10);

        cards[48] = new CardImpl("туз треф", 11);
        cards[49] = new CardImpl("туз червей", 11);
        cards[50] = new CardImpl("туз пик", 11);
        cards[51] = new CardImpl("туз бубен", 11);
    }

    @Override
    public CardImpl randomCards() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 51);
        return cards[randomIndex];
    }
}
