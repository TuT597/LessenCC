public class Vogel {
    public static void main(String[] args) {
        Parrot john = new Parrot();
        MockingJay doe = new MockingJay();
        
        System.out.println("Parrot: " + john.getName() + "\n" + john.getSound() + "\n" + john.getWeight());
        System.out.println("Mocking Jay: " + doe.getName() + "\n" + doe.getSound() + "\n" + doe.getWeight());
    }
}

abstract class vogelTemplate {
    private String name = "";
    private String sound = "";
    private int weight;
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setSound(String newSound){
        this.sound = newSound;
    }
    
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSound(){
        return this.sound;
    }
    
    public int getWeight(){
        return this.weight;
    }
}

class Parrot extends vogelTemplate {
    public Parrot() {
        this.setName("Parrot");
        this.setSound("Hello!");
        this.setWeight(873);
    }    
}

class MockingJay extends vogelTemplate {
    public MockingJay() {
        this.setName("Mocking Jay");
        this.setSound("Miep miep");
        this.setWeight(142);
    }
}

