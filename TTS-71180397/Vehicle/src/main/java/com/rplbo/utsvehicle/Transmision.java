package com.rplbo.utsvehicle;

public class Transmision {
    private String transType;
    private int numSpeed;

    public Transmision(String transType, int numSpeed) {
        this.transType = transType;
        this.numSpeed = numSpeed;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public int getNumSpeed() {
        return numSpeed;
    }

    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }
}
