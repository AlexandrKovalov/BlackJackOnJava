package models;

import Interfaces.Card;

public class CardImpl implements Card {
    private int value;
    private String nameCard;

    public CardImpl( String nameCard, int value) {
        this.nameCard = nameCard;
        this.value = value;

    }

    @Override
    public void printCard() {
        System.out.println(nameCard);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getNameCard() {
        return nameCard;
    }
}
