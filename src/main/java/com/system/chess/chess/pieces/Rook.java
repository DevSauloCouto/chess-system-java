package com.system.chess.chess.pieces;

import com.system.chess.boardgame.Board;
import com.system.chess.chess.ChessPiece;
import com.system.chess.chess.EColor;


public class Rook extends ChessPiece {

    public Rook(Board board, EColor color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

}
