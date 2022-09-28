package com.nofirst.javacatas;

public class Player {
    private String name;
    private Integer points;

    public Player(String name, Integer points) {
        this.name = name;
        this.points = points;
    }

    public void earnPoints(Integer points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }
}
