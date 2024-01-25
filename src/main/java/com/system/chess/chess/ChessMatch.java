package com.system.chess.chess;

import com.system.chess.boardgame.Board;
import com.system.chess.boardgame.Piece;
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

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();

        validateSourcePosition(source);

        Piece capturedPiece = makeMove(source, target);

        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove(Position sourcePosition, Position targetPosition) {
        Piece piece = board.removePiece(sourcePosition);
        Piece pieceCaptured = board.removePiece(targetPosition);

        board.placePiece(piece, targetPosition);

        return pieceCaptured;
    }

    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("There is no piece on source position");
        }
    }

    private void placeNewPiece(Character column, Integer row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(board, EColor.WHITE));
        placeNewPiece('e', 8, new King(board, EColor.WHITE));
        placeNewPiece('e', 1, new King(board, EColor.BLACK));
    }


}
