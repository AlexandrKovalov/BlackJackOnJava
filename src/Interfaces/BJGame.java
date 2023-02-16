package Interfaces;

import models.PlayerImpl;

public interface BJGame {
    //добавляем игроков в игру
    void addPlayerToGame(PlayerImpl player);

    //раздаем две карты игрокам на старте
    void giveToPlayerTwoCardsOnStart();

    //раздаем карты пока это требуется игрокам
    void giveCardToPlayerIfNeed();

    //определяем победителя
    void determineWinner();

    int countPlayersInGame();
}
