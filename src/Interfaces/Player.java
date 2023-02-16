package Interfaces;

import models.CardImpl;

public interface Player {
    void takeCard(CardImpl card); //взять карту из колоды

    int countValuesOfAllCardsOnHand(); //считаем колличество очков в картах на руках

    boolean needCard(); //сказать нужна ли еще карта

    void showCardsOnHands(); //показать карты на руках

    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();

}
