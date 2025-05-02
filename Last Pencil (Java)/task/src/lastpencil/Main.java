package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Game game = new Game();
        TextUI ui = new TextUI(sc, game);

        game.setPencilsOnTable(ui.howManyPencilsToStart());
        game.setFirstPlayer(new Player(ui.chooseFirstPlayer()));
        game.setSecondPlayer();

        while (true) {
            if (game.getPencilsOnTable() <= 0) {
                break;
            }
            game.printLines();
            game.printTurn();

            while (true) {
                game.setPencilsToRemove(ui.pencilsToRemove());
                if (game.enoughPencilsToRemove()){
                    break;
                }
                System.out.println("Too many pencils were taken");
            }


            game.updatePencilsOnTable();
            game.switchTurn();
        }
        game.winner();



    }
}
