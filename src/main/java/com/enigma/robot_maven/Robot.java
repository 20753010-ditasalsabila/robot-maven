package com.enigma.robot_maven;

public class Robot {
    private Direction direction;
    private Position position;

    public Robot(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public void run(String command) {
        String[] commands = command.split("");
        for (String c : commands) {
            Command commandEnum = Command.valueOf(c);
            move(commandEnum);
            System.out.println(this);
        }
    }

    private void move(Command command) {
        switch (command) {
            case A:
                forward();
                break;
            case L:
                this.direction = direction.turnLeft();
                break;
            case R:
                this.direction = direction.turnRight();
                break;
        }
    }

    public void forward() {
        switch (direction) {
            case NORTH:
                this.position.toTop();
                break;
            case EAST:
                this.position.toRight();
                break;
            case SOUTH:
                this.position.toBottom();
                break;
            case WEST:
                this.position.toLeft();
                break;
        }
    }

    @Override
    public String toString() {
        return direction + " -> " + position;
    }

}
