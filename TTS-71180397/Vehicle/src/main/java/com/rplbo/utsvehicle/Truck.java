package com.rplbo.utsvehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    @Override
    public void backward() {
        super.backward();
    }

    @Override
    public void brake() {
        super.brake();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }
}
