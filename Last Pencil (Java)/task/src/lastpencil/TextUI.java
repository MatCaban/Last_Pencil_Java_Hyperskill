package lastpencil;

import java.util.Scanner;

public class TextUI {
    private Scanner sc;
    private String firstPlayerName;
    private String secondPlayerName;
    private Game game;

    public TextUI(Scanner sc, Game game) {
        this.game = game;
        this.sc = sc;
        this.firstPlayerName = "John";
        this.secondPlayerName = "Jack";
    }

    public int howManyPencilsToStart() {
        System.out.println("How many pencils would you like to use");

        return validateNumericInput();
    }

    public String chooseFirstPlayer() {
        System.out.printf("Who will be the first (%s, %s)%n", this.firstPlayerName, this.secondPlayerName);
        return validateValidPlayer();
    }

    public int pencilsToRemove() {

        return validateTakenPencils();
    }

    public int validateNumericInput(){
        int num = 0;

        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num < 0) {
                    System.out.println("The number of pencils should be numeric");
                } else if (num == 0) {
                    System.out.println("The number of pencils should be positive");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("The number of pencils should be numeric");
            }
        }
        return num;
    }

    public String validateValidPlayer() {
        String playerName = "";
        while (true) {
            playerName = sc.nextLine();
            if (playerName.equals(firstPlayerName)
            || playerName.equals(secondPlayerName)){
                break;
            } else {
                System.out.printf("Choose between %s and %s%n", this.firstPlayerName, this.secondPlayerName);
            }
        }
        return playerName;
    }

    public int validateTakenPencils() {
        int numOfPencils = 0;

        if (this.game.isBotTurn()) {
            return this.botTurn();
        }
        while (true) {
            try {
                numOfPencils = Integer.parseInt(sc.nextLine());
                if (numOfPencils > 3 || numOfPencils <= 0) {
                    System.out.println("Possible values: '1', '2', '3'");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Possible values: '1', '2', '3'");
            }
        }
        return numOfPencils;
    }

    // take responsibility for bot decisions

    public int botTurn() {
        int numOfPencils = 1;

        if (game.getPencilsOnTable() == 1 || game.shouldBotTakeOne()) {
            System.out.println("1");
            return numOfPencils;
        }

        if (game.shouldBotTakeRandom()) {
            numOfPencils = (int)(Math.random() * 3) + 1;
            System.out.println(numOfPencils);
            return numOfPencils;
        }

        if (game.shouldBotTakeThree()) {
            numOfPencils = 3;
            System.out.println(numOfPencils);
            return numOfPencils;
        }
        if (game.shouldBotTakeTwo()) {
            numOfPencils = 2;
            System.out.println(numOfPencils);
            return numOfPencils;
        }
        return numOfPencils;
    }
}
