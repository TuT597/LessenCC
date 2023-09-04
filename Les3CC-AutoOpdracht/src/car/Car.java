package car;

import vehicle.Vehicle;
import java.util.Date;

public class Car extends Vehicle {
    private int maxSpeed;
    private String licensePlate;
    private String brand;
    private String model;
    private String registrationDate;

    //Setters for Vehicle abstract class
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    //Setters for car concrete class
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    //Getters for Vehicle abstract class
    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    //Getters for concrete Car clas
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}


