package Medium;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char [] [] board = new char[3][3];
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }

        // we have to input player's choice on the board
        // initialize things
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver){
            // print the board
            printBoard(board);
            System.out.println("Enter your choice in Row and Column: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row][col] == ' '){
                // space selected is empty, do things

                board[row][col] = player;   // marking X or O
                gameOver = haveWon(board, player);
                if (gameOver){
                    System.out.println("Player " +player+ " has won!!!");
                } else {
                    player = (player=='X') ? 'O' : 'X';     // switch players
                }

            } else{
                System.out.println("Wrong place selected");
            }
        }
    }

    private static boolean haveWon(char[][] board, char player) {
        // checking rows
        for (int row = 0; row < board.length; row++){
           if (board[row][0] == player && board[row][1] == player && board[row][2] == player){
               return true;
           }
        }
        // checking columns
        for (int col = 0; col < board[0].length; col++){
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        // checking diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + "|");
            }
            System.out.println();
        }
    }
}
