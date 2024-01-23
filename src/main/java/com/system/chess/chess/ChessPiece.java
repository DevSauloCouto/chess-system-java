package com.system.chess.chess;

import com.system.chess.boardgame.Board;
import com.system.chess.boardgame.Piece;

public class ChessPiece extends Piece {

    private EColor color;

    public ChessPiece() {
        super();
    }

    public ChessPiece(Board board, EColor color) {
        super(board);
        this.color = color;
    }

    public EColor getColor() {
        return color;
    }

}
