package src.day7;

import java.util.Iterator;

/**
 * Created by vsanghav on 8/12/2016.
 */
public class Sequence {

    private int SIZE_LIMIT = 0;
    private int count=0;
    private String[] data;
    SequenceIterator iterator;

    public Sequence(int size){
        this.SIZE_LIMIT = size;
        data = new String[size];
    }

    public Iterator<String> iterator(){
        return new SequenceIterator<String>();
    }

    public void add(Object o) throws SizeFull {
        if(count == SIZE_LIMIT)
            throw new SizeFull();
        else
            data[count] = (String) o;
            count++;
    }

    public Object get(int idx){
        return data[idx];
    }


    public int size(){
        return count;
    }

    class SizeFull extends Exception{

        public SizeFull(){
            System.out.println("The container is full with data, no space to accept new entry");
        }
    }

    class SequenceIterator<E> implements Iterator<E>{


        int progress=0;

        @Override
        public boolean hasNext() {
            return progress < count;
        }

        @Override
        public E next() {
            return (E)data[progress++];
        }

        public void remove(){

        }

        public int size(){
            return progress;
        }

    }



}
