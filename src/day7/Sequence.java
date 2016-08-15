package src.day7;

import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * Created by vsanghav on 8/12/2016.
 */
public class Sequence<T> {

    private int SIZE_LIMIT = 0;
    private int count=0;
    private T[] data;
    SequenceIterator iterator;

    @SuppressWarnings("unchecked")
    public Sequence(Class<T> clazz,int size){
        this.SIZE_LIMIT = size;
        //data = new String[size];
        data = (T[]) Array.newInstance(clazz, size);
    }

    public Iterator<T> iterator(){
        return new SequenceIterator();
    }

    public void add(T o) throws SizeFull {
        if(count == SIZE_LIMIT)
            throw new SizeFull();
        else
            data[count] = o;
            count++;
    }

    public T get(int idx){
        return data[idx];
    }


    public int size(){
        return count;
    }

    class SequenceIterator implements Iterator<T>{


        int progress=0;

        @Override
        public boolean hasNext() {
            return progress < count;
        }

        @Override
        public T next() {
            return data[progress++];
        }

        public void remove(){

        }

        public int size(){
            return progress;
        }

    }



}
