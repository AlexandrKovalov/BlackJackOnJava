package models;

import Interfaces.BJGame;
import com.sun.tools.javac.Main;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class BJGameImpl implements BJGame {

    private static final Logger LOGGER = Logger.getLogger(BJGameImpl.class);

    PlayerImpl[] playersInGame = new PlayerImpl[10];
    DeckOfCardsImpl deck = new DeckOfCardsImpl();



    @Override
    public void addPlayerToGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }


    @Override
    public void giveToPlayerTwoCardsOnStart() {
        for (PlayerImpl player: playersInGame) {
            if (player != null) {
                player.takeCard(deck.randomCards());
                player.takeCard(deck.randomCards());
            }
        }
    }

    @Override
    public void giveCardToPlayerIfNeed() {
        for (PlayerImpl player: playersInGame) {
            if (player != null) {
                while (player.needCard()) {
                    player.takeCard(deck.randomCards());
                }
            }
        }
    }

    @Override
    public void determineWinner() {
        for (PlayerImpl player: playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }
        if (countPlayersInGame() == 0) {
            System.out.println("Победило казино");
            LOGGER.debug("Победа казино");
        }
        if (countPlayersInGame() == 1) {
            System.out.println("Победил игрок");
            for (PlayerImpl player: playersInGame) {
                if (player != null) {
                    if (player.isInGame()) {
                        player.showCardsOnHands();
                       LOGGER.debug("Победа игрока");

                    }
                }
            }
        }
        int bestValue = 0;
        if (countPlayersInGame() > 1) {

            for (PlayerImpl player: playersInGame) {
                if (player != null) {
                    if (bestValue < player.countValuesOfAllCardsOnHand()) {
                        bestValue = player.countValuesOfAllCardsOnHand();
                        player.showCardsOnHands();
                    }
                }
            }
        }
        for (PlayerImpl player: playersInGame) {
            if (player != null) {
                if (player.isInGame() && !player.isCroupier() && bestValue == player.countValuesOfAllCardsOnHand()) {
                    player.showCardsOnHands();
                }
            }
        }

    }



    @Override
    public int countPlayersInGame() {
        int players = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.isInGame()) {
                    players++;
                }
            }
        }
        return players;
    }
}
