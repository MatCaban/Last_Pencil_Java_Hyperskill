# Last Pencil

A simple "Last Pencil" game implemented in Java.

## Project Description

This project is an implementation of the text-based game "Last Pencil," where two players (a human and a computer bot) take turns removing 1 to 3 pencils from a table. The player who takes the last pencil loses.

This project was developed as an exercise on the Hyperskill platform to practice basic Java programming concepts, including:

* Handling user input and output.
* Input data validation.
* Implementing game logic and player turns.
* Creating a simple bot with a implemented strategy.

## Technologies Used

* **Java**

## How to Run the Game

1.  Ensure you have the Java Development Kit (JDK) installed on your system.
2.  Download the project's source code.
3.  Open a terminal or command prompt and navigate to the project directory.
4.  Compile the source code using the command:
    ```
    javac Main.java
    ```
5.  Run the game using the command:
    ```
    java Main.java
    ```

## How to Play

1.  Upon starting the game, you will be prompted to enter the initial number of pencils on the table. Enter an integer and press Enter.
2.  Next, you will choose who goes first: "John" (human) or "Jack" (computer bot). Enter the name of the chosen player and press Enter.
3.  Players take turns. During your turn, enter the number of pencils you want to take (1, 2, or 3) and press Enter.
4.  If you enter an invalid number of pencils (not 1, 2, or 3, or a number greater than the current number of pencils), the game will notify you, and you will have to repeat your turn.
5.  The game continues until only one pencil remains on the table. The player who takes it loses.

## Bot Implementation (Jack)

The computer bot "Jack" is implemented with consideration for winning strategies defined in the project assignment. Its goal is to leave a number of pencils on the table such that the opponent is forced to take the last one in their next turn.

## Further Information

This project was developed for educational purposes and to demonstrate basic Java language concepts.

Thank you for trying my game!
