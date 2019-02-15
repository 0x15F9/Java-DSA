import java.util.ArrayList;

/**
 * GameOfLife
 * Credit goes to Mr. Gavin Sathan for the amazing logic to overcome the problem with summation near borders
 */
public class GameOfLife {
  public static void main(String[] args) {
    char dead = 'x';
    char live = 'o';
    int dimension, count;

    // If no argument provided, use 5 as default value
    try {
      dimension = Integer.parseInt(args[0]);
      count = Integer.parseInt(args[1]);
    } catch (Exception e) {
      dimension = 5;
      count = 5;
    }

    char[][] board = new char[dimension][dimension];

    populate(dimension, board, dead, live);
    for (int i = 0; i < count; i++) {
      display(dimension, board);
      mutate(dimension, board, dead, live);
    }
  }

  /**
   * Randomly inserts an Initial Population on the Board with equal probability of being alive or dead
   */
  public static void populate(int dimension, char[][] board, char dead_char, char live_char) {
    for (int i = 0; i < dimension; i++)
      for (int j = 0; j < dimension; j++)
        board[i][j] = Math.random()>0.5 ? live_char : dead_char;
  }

  /**
   * Displays the state of the board
   */
  public static void display(int dimension, char[][] board) {
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++)
        System.out.print(board[i][j]+" ");
      System.out.println();
    }
    System.out.println();
  }

  /**
   * This is where the Magic happens!
   */
  public static void mutate(int dimension, char[][] board, char dead, char live) {
    char[][] board_aug = new char[dimension+2][dimension+2];
    populate(dimension+2, board_aug, dead, dead);
    
    for (int i = 0; i < dimension; i++)
      for (int j = 0; j < dimension; j++)
        board_aug[i+1][j+1] = board[i][j];


    for (int i = 0; i < dimension; i++)
      for (int j = 0; j < dimension; j++) {
        int sum = getsum(dimension, board_aug, live, i+1, j+1);
        if(sum<2||sum>3) {
          board[i][j] = dead;
        } else if(sum==3) {
          board[i][j] = live;
        }
      }
}

  public static int getsum(int dimension, char[][] board, char which, int x, int y) {
    int sum = 0;

    for (int i = x-1; i < x+2; i++)
      for (int j = y-1; j < y+2; j++)
        if (!(i==x && j==y)) sum+= (board[i][j]==which) ? 1 : 0;

    return sum;
  }
}