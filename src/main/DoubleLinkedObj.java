package main;

/**
 * Created by Artur on 24.04.2015.
 */
public class DoubleLinkedObj<T> {

    private T tt;
    private DoubleLinkedObj previous;
    private DoubleLinkedObj next;

    public DoubleLinkedObj(T tt){
        previous = null;
        next = null;
        this.tt = tt;
    }

    public void display(){
        System.out.print(String.valueOf(this.tt) + " ");
    }

    public void setPrevious(DoubleLinkedObj previous) {
        this.previous = previous;
    }

    public void setNext(DoubleLinkedObj next) {
        this.next = next;
    }

    public DoubleLinkedObj getPrevious() {
        return previous;
    }

    public DoubleLinkedObj getNext() {
        return next;
    }

    public T getTt() {
        return tt;
    }
}
