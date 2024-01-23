package com.system.chess.boardgame;

public class Board {

    private Integer rows;

    private Integer columns;

    private Piece[][] pieces;

    public Board() {}

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[this.rows][this.columns];
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public Piece piece(Integer row, Integer column) {
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

}
