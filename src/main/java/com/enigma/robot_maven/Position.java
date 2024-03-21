package com.enigma.robot_maven;

public class Position {
    private Integer coordinateX;
    private Integer coordinateY;

    public Position(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void toRight() {
        this.coordinateX += 1;
    }

    public void toLeft() {
        this.coordinateX -= 1;
    }

    public void toTop() {
        this.coordinateY += 1;
    }

    public void toBottom() {
        this.coordinateY -= 1;
    }

    @Override
    public String toString() {
        return coordinateX + ", " + coordinateY;
    }

}
