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

}
