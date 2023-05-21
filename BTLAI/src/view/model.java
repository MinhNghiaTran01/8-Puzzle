/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Nghia
 */

public class model {
    int [] UP = {-1, 0};
    int [] DOWN = {1, 0};
    int [] LEFT = {0,-1};
    int [] RIGHT = {0, 1};
    int [] blankPos = new int[2];;
    int[][] DIRECTIONS = {UP, DOWN, LEFT, RIGHT};
    
    int [][] board = new int[3][3];
    int boardSize = 3;
    public model() {
    }
    


    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    boolean checkWin() {
        String win = "123456780";
        String state = "";
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                state+=String.valueOf(board[i][j]);
            }
        }
        if(win.equals(state)) return true;
        return false;
    }

    int[][] getDIRECTIONS() {
        return DIRECTIONS;
    }
    
    
    // tao model moi cho trang thai tiep theo
    public model simulateMove() {
        model tmp = new model();
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                tmp.board[i][j] = this.board[i][j];
            }
        }
        tmp.blankPos[0] = this.blankPos[0];
        tmp.blankPos[1] = this.blankPos[1];
        return tmp;
    }

    
    // di chuyen den trang thai tiep theo
    public boolean move(int[] dir){
        int newBlankPosRow = this.blankPos[0] + dir[0];
        int newBlankPosCol = this.blankPos[1] + dir[1];
        
        if (newBlankPosRow < 0 || newBlankPosRow >= this.boardSize
                || newBlankPosCol < 0 || newBlankPosCol >= this.boardSize) {
            return false;
        }
        
        this.board[this.blankPos[0]][this.blankPos[1]] = this.board[newBlankPosRow][newBlankPosCol];
        this.board[newBlankPosRow][newBlankPosCol] = 0;
        this.blankPos[0] = newBlankPosRow;
        this.blankPos[1] = newBlankPosCol;
        return true;
    }
    
    // dung de chuyển đổi bảng từ dạng ma trận về dạng chuỗi String
    public String transfer(){
        String a ="";
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                a+= String.valueOf(board[i][j]);
            }
        }
        return a;
    }
}
