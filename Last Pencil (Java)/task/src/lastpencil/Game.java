package lastpencil;

import java.util.ArrayList;

public class Game {
    private int pencilsOnTable;
    private int pencilsToRemove;
    private Player firstPlayer;
    private Player secondPlayer;



    public Game() {
        secondPlayer = new Player();

    }

    public void setPencilsOnTable(int pencilsOnTable) {
        this.pencilsOnTable = pencilsOnTable;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
        this.firstPlayer.setIsMyTurn(true);
    }

    public void setSecondPlayer() {
        if (firstPlayer.getName().equals("John")) {
            this.secondPlayer.setName("Jack");
        } else if (firstPlayer.getName().equals("Jack")) {
            this.secondPlayer.setName("John");
        }
        this.secondPlayer.setIsMyTurn(false);
    }

    public void setPencilsToRemove(int pencils) {
        this.pencilsToRemove = pencils;
    }

    public int getPencilsOnTable() {
        return pencilsOnTable;
    }

    public int getPencilsToRemove() {
        return pencilsToRemove;
    }

    public void updatePencilsOnTable() {
        this.pencilsOnTable -= pencilsToRemove;
    }


    // printing pencils on tbale based on variable pencils on table
    public void printLines(){
        for (int i =0; i < this.pencilsOnTable; i++) {
            System.out.print("|");
        }
        System.out.println();
    }


    // printing who is on turn base od isMyTurn() return value true/false
    public void printTurn() {
        String name = firstPlayer.isMyTurn()
                ? firstPlayer.getName()
                : secondPlayer. getName();

        System.out.printf("%s's turn%n", name);
    }




    public void switchTurn() {
        if (firstPlayer.isMyTurn) {
            firstPlayer.setIsMyTurn(false);
            secondPlayer.setIsMyTurn(true);
        } else {
            firstPlayer.setIsMyTurn(true);
            secondPlayer.setIsMyTurn(false);
        }
    }

    // checking if there is enough pencils on table for removing
    public boolean enoughPencilsToRemove() {
        return this.pencilsOnTable >= this.pencilsToRemove;
    }

    public void winner() {
        String name = firstPlayer.isMyTurn() ? firstPlayer.getName() : secondPlayer.getName();
        System.out.printf("%s won%n", name);
    }


    // decide if player name is jack and if he is on turn
    // Jack is always bot
    public boolean isBotTurn() {
        return firstPlayer.isMyTurn && firstPlayer.getName().equals("Jack")
                || secondPlayer.isMyTurn && secondPlayer.getName().equals("Jack");
    }

    // decide if bot is in losing strategy, so it can take random number of pencils

    public boolean shouldBotTakeRandom() {
        return  this.pencilsOnTable % 4 == 1;
    }

    // decide if bot is in winning strategy and should take 3 pencils

    public boolean shouldBotTakeThree() {
        return this.pencilsOnTable % 4 == 0;
    }

    // decide if bot is in winning strategy and should take 2 pencils
    public boolean shouldBotTakeTwo() {
        return this.pencilsOnTable % 4 == 3;
    }

    // decide if bot is in winning strategy and should take 1 pencil
    public boolean shouldBotTakeOne() {
        return this.pencilsOnTable % 4 == 2;
    }
}
