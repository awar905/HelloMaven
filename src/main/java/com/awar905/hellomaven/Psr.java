package com.awar905.hellomaven;

import java.util.Optional;

/**
 * Paper Scissors Rock API
 *
 * Contains Base Types and Moves to implement.
 * Should not be implemented than the `Psr` class
 * @see com.awar905.hellomaven.Psr
 */
interface PsrAPI {
  /**
   * All possible moves in Paper Scissors Rock
   */
  public enum Move {
    PAPER,
    SCISSORS,
    ROCK;
  } 

  /**
   * Method to implement getting next move
   */
  public Move getMove();
}

public abstract class Psr implements PsrAPI {
  public static Optional<Move> intToMove(int value) {
    switch(value) {
      case 0:
        return Optional.of(Move.PAPER);
      case 1:
        return Optional.of(Move.SCISSORS);
      case 2:
        return Optional.of(Move.ROCK);
      default:
        // I'm using null because it is easy to detect and there is only one possible
        // error that can occur. So creating a custom error is unecessary
        return Optional.empty();
    }
  }

  /**
   * Determine the winner of the round given their respective moves
   *
   * @param player1 The move decided of the first player
   * @param player2 The move decided by the second player
   *
   * @return 0 is returned when there is a tie.
   *         1 is returned when player1 wins. 
   *         2 is returned when player2 wins. 
   *         No other result is a valid return value.
   */
  public static int getWinner(Move player1, Move player2) {
    // Same move results in a tie
    if(player1 == player2) return 0;

    // Paper > Rock
    // Scissors > Paper
    // Rock > Scissors
    switch(player1) {
      case PAPER:
        return player2 == Move.ROCK ? 1 : 2;
      case SCISSORS:
        return player2 == Move.PAPER ? 1 : 2;
      case ROCK:
        return player2 == Move.SCISSORS ? 1 : 2;
    }

    // This should be unreachable
    return 0;
  }
}
