package AutoOpdracht;

interface VehicleInterface {
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getWeight(){
        return this.weight;
    }
}