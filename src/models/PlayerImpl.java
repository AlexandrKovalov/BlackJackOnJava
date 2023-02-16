package models;

import Interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {

    private boolean inGame;

    CardImpl[] cardsOnHand = new CardImpl[10];


    String name;

    int number = 0;


    public PlayerImpl(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void takeCard(CardImpl card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null) {
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int result = 0;
        for (CardImpl card: cardsOnHand) {
            if (card != null) {
               result += card.getValue();
            }

        }
        return result;
    }

    @Override
    public boolean needCard() {
        System.out.println("-----------Ваши карты---------");
        this.showCardsOnHands();
        System.out.println("Нужна ли вам еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHands() {
        for (CardImpl card: cardsOnHand) {
            if (card != null) {
                card.printCard();
            }
        }
    }

    @Override
    public boolean isInGame() {
        return false;
    }

    @Override
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public boolean isCroupier() {
        return false;
    }


}
