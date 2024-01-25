package com.system.chess.application;

import com.system.chess.chess.ChessMatch;
import com.system.chess.chess.ChessPiece;
import com.system.chess.chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println("");
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println("");
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }


    }

}
