package com.zh.test;

/**
 * Test0630
 * @author Zhaohui
 * @date 2020/6/30
 */
public class Test0630 {

    public static String tictactoe(String[] board) {
        int len = board.length;
        char[][] charBoard = new char[len][len];
        boolean isFull = true;
        // String[]转换为char[][]
        for (int i = 0; i < len; i++)
            charBoard[i] = board[i].toCharArray();
        int countDiagX = 0;
        int countDiagO = 0;
        int countAntiDiagX = 0;
        int countAntiDiagO = 0;
        int[] rowCountX = new int[len];
        int[] rowCountO = new int[len];
        int[] colCountX = new int[len];
        int[] colCountO = new int[len];
        for (int i = 0; i < len; i++) {
            if (charBoard[i][i]=='X') countDiagX++;
            if (charBoard[i][i]=='O') countDiagO++;
            if (charBoard[i][len-i-1]=='X') countAntiDiagX++;
            if (charBoard[i][len-i-1]=='O') countAntiDiagO++;
            for (int j = 0; j < len; j++) {
                if (charBoard[i][j] == 'X') {
                    rowCountX[i]++;
                    colCountX[j]++;
                }
                else if (charBoard[i][j] == 'O') {
                    rowCountO[i]++;
                    colCountO[j]++;
                }
                else {
                    isFull = false;
                }
            }
        }
        if (countDiagX == len || countAntiDiagX == len) return "X";
        if (countDiagO == len || countAntiDiagO == len) return "O";
        for (int i = 0; i < len; i++)
            if (rowCountX[i] == len || colCountX[i] == len)
                return "X";
        for (int i = 0; i < len; i++)
            if (rowCountO[i] == len || colCountO[i] == len)
                return "O";
        if (isFull) return "Draw";
        return "Pending";
    }

    public static void main(String[] args) {
        String[] board = {"O X"," XO","X O"};
        System.out.println(tictactoe(board));
    }
}
