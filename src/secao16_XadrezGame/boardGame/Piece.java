/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao16_XadrezGame.boardGame;

/**
 *
 * @author Jean
 */
public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public Piece() {
    }

    protected Board getBoard() {
        return board;
    }

    public boolean[][] possibleMoves() {
        return new boolean[0][0];
    }

    public boolean possibleMove(Position position) {
        return true;
    }

    public boolean isThereAnyPossibleMove() {
        return true;
    }
}
