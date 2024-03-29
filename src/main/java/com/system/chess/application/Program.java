package com.system.chess.application;

import com.system.chess.chess.ChessException;
import com.system.chess.chess.ChessMatch;
import com.system.chess.chess.ChessPiece;
import com.system.chess.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println("");
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println("");
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                System.out.println("Press enter to continue");
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Press enter to continue");
                sc.nextLine();
            }
        }


    }

}
