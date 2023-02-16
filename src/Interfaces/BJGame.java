package Interfaces;

import models.PlayerImpl;

public interface BJGame {
    //��������� ������� � ����
    void addPlayerToGame(PlayerImpl player);

    //������� ��� ����� ������� �� ������
    void giveToPlayerTwoCardsOnStart();

    //������� ����� ���� ��� ��������� �������
    void giveCardToPlayerIfNeed();

    //���������� ����������
    void determineWinner();

    int countPlayersInGame();
}
