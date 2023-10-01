import java.util.Scanner;

public class TicTacToe{

    private final int SIZE = 3;
    private char[][] board;
    private char currentPlayer;
    private Scanner scanner;

    public TicTacToe() {
        board = new char[SIZE][SIZE];
        currentPlayer = 'X'; // Start with player X
        scanner = new Scanner(System.in);
    }

    public void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean checkWin() {
        // Check horizontal, vertical & diagonal wins
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    public void play() {
        initializeBoard();
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != '-') {
                System.out.println("Invalid position, try again!");
                continue;
            }
            board[row][col] = currentPlayer;
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a tie!");
                break;
            }
            changePlayer();
        }
    }

    public static void main(String[] args) {
        new TicTacToe().play();
    }
}
