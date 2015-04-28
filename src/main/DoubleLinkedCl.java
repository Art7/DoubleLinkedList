package main;

/**
 * Created by Artur on 24.04.2015.
 */
public class DoubleLinkedCl<T> {

    private DoubleLinkedObj first;
    private DoubleLinkedObj last;

    public DoubleLinkedCl() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(T dd) {
        DoubleLinkedObj<T> ins = new DoubleLinkedObj(dd);
        if (isEmpty()) last = ins;
        else {
            ins.setNext(first);
            first.setPrevious(ins);
        }
        first = ins;
    }

    public void insertLast(T dd) {
        DoubleLinkedObj ins = new DoubleLinkedObj(dd);
        if (isEmpty()) first = ins;
        else {
            ins.setPrevious(last);
            last.setNext(ins);
        }
        last = ins;
    }

    public void display() {
        DoubleLinkedObj current = first;
        while (current != null) {
            current.display();
            current = current.getNext();
        }
        System.out.println();
    }

    public int getSize() {
        int i = 0;
        DoubleLinkedObj temp = first;
        if (isEmpty()) return i;
        else {
            while (temp != null) {
                i++;
                temp = temp.getNext();
            }
            return i;
        }
    }

    public void insertOnPosition(int position, T dd) {
        int size = getSize();
        if (position > size || position < 0) System.out.println("Неверная позиция");
        else {
            if (position == 0) insertFirst(dd);
            else if (position == size) insertLast(dd);
            else {
                int curpos = 1;
                DoubleLinkedObj temp = first;
                while (curpos != position) {
                    temp = temp.getNext();
                    curpos++;
                }
                DoubleLinkedObj ins = new DoubleLinkedObj(dd);
                ins.setNext(temp.getNext());
                ins.setPrevious(temp);
                temp.setNext(ins);
                ins.getNext().setPrevious(ins);
            }
        }
    }

    public DoubleLinkedObj delByData(T dd) {
        if (!isEmpty()) {
            DoubleLinkedObj<T> temp = first;
            while (!String.valueOf(temp.getTt()).equals(dd) && temp != null) {
                temp = temp.getNext();
                if (temp == null) {
                    System.out.println("Такой элемент не найден");
                    return null;
                }
            }
            if (first == temp) {
                first = temp.getNext();
                temp.getNext().setPrevious(null);
            } else if (last == temp) {
                last = temp.getPrevious();
                temp.getPrevious().setNext(null);
            } else {
                temp.getPrevious().setNext(temp.getNext());
                temp.getNext().setPrevious(temp.getPrevious());
            }
            return temp;
        } else {
            System.out.println("Список пуст");
            return null;
        }

    }

    public void displayByIndex(int index){
        if(index<0 || index>=getSize()) System.out.println("Индекс неверен");
        else {
            DoubleLinkedObj<T> temp = first;
            for(int i=0;i<index;i++) temp=temp.getNext();
            temp.display();
        }
    }

    public DoubleLinkedObj delByIndex(int index){
        if(isEmpty()) {
            System.out.println("Список пуст");
            return null;
        }
        else{
            if(index<0 || index>=getSize()) {
                System.out.println("Индекс неверен");
                return null;
            }
            else {
                DoubleLinkedObj<T> temp = first;
                if(getSize()==1){
                    last=null;
                    first=null;
                    return temp;
                }
                else{
                    for(int i=0;i<index;i++) temp=temp.getNext();
                    if(temp==first){
                        first = temp.getNext();
                        temp.getNext().setPrevious(null);
                    }
                    else if (temp==last){
                        last=temp.getPrevious();
                        temp.getPrevious().setNext(null);
                    }
                    else {
                        temp.getPrevious().setNext(temp.getNext());
                        temp.getNext().setPrevious(temp.getPrevious());
                    }
                    return temp;
                }

            }
        }
    }
}
