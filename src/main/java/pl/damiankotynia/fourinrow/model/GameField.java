package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class GameField implements Serializable {
    private int width;
    private int height;
    private int [][] gameBoard;

    public GameField(int width, int height) {
        this.width = width;
        this.height = height;
        gameBoard = new int[height][width];
        for(int i = 0; i<width; i++){
            for(int j = 0; j<height; j++){
                gameBoard[j][i] = 0;
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
