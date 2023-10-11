import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Queue implements QueueInterface{
    
    ArrayList<Integer> fifo = new ArrayList<>(0);
    
    public void add(int value){
        //Add item to list
        fifo.add(value);
    }
    
    public int remove(int index){
        //Remove item at index from list
        return fifo.remove(index);
    }
    
    public int peek(){
        //Return first item in list
        return fifo.get(0);
    }
    
    public boolean isEmpty(){
        //Check if list is empty
        return fifo.isEmpty();
    }
    
    public int size(){
        //Return list length
        return fifo.size();
    }
    
    public void print(){
        //Print out list
        for (int i : fifo) {
            System.out.print(i);
        }
    }
    
    public void clear(){
        //Clear list
        fifo.clear();
    }
    
    public void clear(int n){
        //Clear item at n from list
        fifo.remove(n);
    }
    
    public void printReverse(){
        //Print out list in reversed order
        Collections.reverse(fifo);
        
        for (int i : fifo) {
            System.out.print(i);
        }
        
        Collections.reverse(fifo);
    }
    
    public void jumpTheQueue(int n, int index){
        //Place n at index of list
        fifo.add(index, n);
    }
    
    public String toString(){
        //Return list as string
        return fifo.toString();
    }
    
    @Override public boolean equals(Object q){
        //See if list equals other list
        if(q == null) return false;
        if(this == q) return true;
        if(!(q instanceof Queue other)) return false;
        if(fifo.size() != other.fifo.size())return false;
        
        for (int i = 0; i < fifo.size(); i++){
            if (fifo.get(i) != other.fifo.get(i)){
                return false;
            }
        }
        
        return true;
    }
    
    public int indexOf(int value){
        //Check index of given value
        return fifo.indexOf(value);
    }
    
    public int lastIndexOf(int value){
        //Check last index of given value
        return fifo.lastIndexOf(value);
    }  
}