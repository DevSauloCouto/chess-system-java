package com.system.chess.application;

import com.system.chess.chess.ChessPiece;
import com.system.chess.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    public static ChessPosition readChessPosition(Scanner sc) {
        try {
            String position = sc.nextLine();
            Character column = position.charAt(0);
            Integer row = Integer.parseInt(position.substring(1));

            return new ChessPosition(column, row);
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8.");
        }
    }

    public static void printBoard(ChessPiece[][] chessPieces) {
        for (int i = 0; i < chessPieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < chessPieces.length; j++) {
                printPiece(chessPieces[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece chessPiece) {
        if (chessPiece == null) {
            System.out.print("-");
        } else {
            System.out.print(chessPiece);
        }
        System.out.print(" ");
    }

}
