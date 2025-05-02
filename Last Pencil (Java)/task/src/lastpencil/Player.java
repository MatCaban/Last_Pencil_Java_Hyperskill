package lastpencil;

public class Player {
    String name;
    boolean isMyTurn;
    boolean amIBot;

    public Player(){}

    public Player(String name) {
        this.name = name;
        this.isMyTurn = false;
        this.amIBot = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMyTurn() {
        return isMyTurn;
    }

    public void setIsMyTurn(boolean myTurn) {
        isMyTurn = myTurn;
    }

}
