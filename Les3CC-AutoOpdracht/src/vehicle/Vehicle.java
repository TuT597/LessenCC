package vehicle;

import car.Car;

public abstract class Vehicle {
    private int weight;
    private String color;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
