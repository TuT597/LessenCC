package AutoOpdracht;

interface CarInterface{
    public void setLicensePlate(String newLicensePlate){
        this.licensePlate = newLicensePlate;
    }
    
    public void printInfo(){
        System.out.println("Car info:");
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.maxSpeed);
        System.out.println(this.weight);
        System.out.println(this.licensePlate);
        System.out.println(this.registrationDate);
    }
}