import java.util.Iterator;

public class Groep<T> implements GroepInterface<T>, Iterable<T> {
    
    //Still need to make a main method that tests all the methods
    public static void main (String[] args) {
        Groep<Integer> bezoekers = new Groep<>(2);
        
        System.out.println(bezoekers.getCapaciteit());
    }
    
    Object[] groep;
    int index = 0;
    
    Groep(int grootte) {
        this.groep = new Object[grootte];
    }
    
    Groep() {
        this(1);
    }
    
    //Check if groep array is full when adding a new entry and double its size.
    public void add(T nieuw) {
        if (index == groep.length - 1) {
            Object[] groepTwee = new Object[groep.length * 2];
            
            int counter = 0;
            for (Object i : groep) {
                groepTwee[counter] = i;
                counter++;
            }
            
            groep = groepTwee;
        }             
            groep[index] = nieuw;
            index++;
    }
    
    //Returns the value of the given array index
    @SuppressWarnings("unchecked")
    public T get (int i){
        return (T) groep[i];
    }
    
    
    //Returns the size of the groep array
    public int getCapaciteit() {
        return groep.length;
    }
    
    
    //Checks if groep is empty or not and returns true or false
    public boolean isLeeg() {
        return (this.index == 0);
    }
    
    
    //Empties the groep array
    public void maakLeeg() {
        for (int i = 0; i < index; i++) {
            groep[i] = null;
        }
        index = 0;
    }
    
    public Iterator<T> iterator() {
        return this.new GroepIterator();
    }
    
    private class GroepIterator implements Iterator<T> {
        int teller = 0;
        
        public T next() {
            return get(teller++);
        }
    
        public boolean hasNext() {
            return teller < index;
        }
    }   
}