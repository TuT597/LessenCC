package AutoOpdracht;
import java.time.LocalDate;


class Car extends Vehicle implements CarInterface{
    private int maxSpeed;
    private String licencePlate;
    private String brand;
    private String model;
    private LocalDate registrationDate;
    
    public Car(int weight, String color, int maxSpeed, String licencePlate, String brand, String model, LocalDate registrationDate){
        this.weight = weight;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.registrationDate = registrationDate;
    }
    
    public Car(int weight, String color, int maxSpeed, String licencePlate, String brand, String model){
        this.weight = weight;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        
        this.registrationDate = LocalDate.now();
    }
}