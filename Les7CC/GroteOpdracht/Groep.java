public class Groep<T> implements GroepInterface<T>, Iterable<T> {
    
    //Still need to make a main method that tests all the methods
    
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
                counter++
            }
            
            groep = groepTwee;
        }             
            groep[index] = nieuw;
            index++;
    }
    
    //Returns the value of the given array index
    public T get (int i){
        if (i <= groep.length) {
            if (groep[i] != null) {
                return (T) groep[i];
            } else {
                return "Index not set";
            }
        } else {
            return "Index out of bounds";
        }
    }
    
    
    //Returns the size of the groep array
    public int getCapaciteit() {
        return groep.length;
    }
    
    
    //Checks if groep is empty or not and returns true or false
    public boolean isLeeg {
        return (this.index == 0);
    }
    
    
    //Empties the groep array
    public void maakLeeg() {
        for (Object i : groep) {
            if (i != null) i = null;
        }
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