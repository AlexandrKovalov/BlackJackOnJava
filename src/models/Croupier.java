package models;

public class Croupier extends PlayerImpl{
    public Croupier(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean needCard() {
        if (countValuesOfAllCardsOnHand() > 17) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isInGame() {
        return true;
    }

    @Override
    public void setInGame(boolean inGame) {
        super.setInGame(inGame);
    }


    @Override
    public boolean isCroupier() {
        return true;
    }
}
