package com.enigma.robot_maven;

public enum Direction {
    NORTH("North"),
    EAST("East"),
    SOUTH("South"),
    WEST("West");

    private String name;

    private Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // turn right
    public Direction turnRight() {
        return values()[(this.ordinal() + 1) % values().length];
    }
    // turn left
    public Direction turnLeft() {
        return values()[(this.ordinal() + values().length -1) % values().length];
    }

}
