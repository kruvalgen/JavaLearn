package com.kruvalgen.exercises.brickinthehole;

public class Brick {

    private int brickWidth;
    private int brickLength;
    private int brickHeight;



    public double brickDiagonal(){
        double b = (brickHeight * 2) + (brickWidth * 2);
        return Math.sqrt(b);
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

}
