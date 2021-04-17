package com.kruvalgen.exercises.brickinthehole;

public class Brick {

    private int brickWidth;
    private int brickLength;
    private int brickHeight;
    private double diagonalBrick;


    public double brickDiagonal(){
        double b = (brickHeight * 2) + (brickWidth * 2);
        diagonalBrick = Math.sqrt(b);
        return diagonalBrick;
    }



    public int getBrickWidth() {
        return brickWidth;
    }

    public void setBrickWidth(int brickWidth) {
        this.brickWidth = brickWidth;
    }

    public int getBrickLength() {
        return brickLength;
    }

    public void setBrickLength(int brickLength) {
        this.brickLength = brickLength;
    }

    public int getBrickHeight() {
        return brickHeight;
    }

    public void setBrickHeight(int brickHeight) {
        this.brickHeight = brickHeight;
    }

    public double getDiagonalBrick() {
        return diagonalBrick;
    }

    public void setDiagonalBrick(double diagonalBrick) {
        this.diagonalBrick = diagonalBrick;
    }
}
