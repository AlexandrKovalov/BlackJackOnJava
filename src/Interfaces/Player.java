package Interfaces;

import models.CardImpl;

public interface Player {
    void takeCard(CardImpl card); //����� ����� �� ������

    int countValuesOfAllCardsOnHand(); //������� ����������� ����� � ������ �� �����

    boolean needCard(); //������� ����� �� ��� �����

    void showCardsOnHands(); //�������� ����� �� �����

    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();

}