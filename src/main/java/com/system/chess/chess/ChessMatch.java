package com.system.chess.chess;

import com.system.chess.boardgame.Board;
import com.system.chess.boardgame.Position;
import com.system.chess.chess.pieces.King;
import com.system.chess.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        this.initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                chessPieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return chessPieces;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, EColor.WHITE), new Position(2, 1));
        board.placePiece(new King(board, EColor.WHITE), new Position(0, 4));
        board.placePiece(new King(board, EColor.BLACK), new Position(7, 4));
    }


}
