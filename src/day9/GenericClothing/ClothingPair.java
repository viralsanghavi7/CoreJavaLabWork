package src.day9.GenericClothing;

/**
 * Created by vsanghav on 8/16/2016.
 */
    public class ClothingPair<T extends Colored & Sized> {

    T first;
    T second;

    public ClothingPair(T first,T second){


            this.first = first;
            this.second = second;

    }

    public boolean isSameClass(){

        if(first.getClass().equals( second.getClass())==true)
            return true;
        return false;
    }

    public boolean isMatched(){

        if(isSameClass()==true && (first.getSize()==second.getSize()) && (first.getColor() == second.getColor()))
            return true;
        return false;
    }
}
