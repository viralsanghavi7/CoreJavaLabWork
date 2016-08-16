package src.day9.GenericClothing;

import java.awt.*;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Sock implements Colored,Sized {

    private int size;
    private Color color;

    public Sock(int size, Color color){
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public String toString(){
        return "This sock has color = " + color.toString() + " and size =  "+ size;
    }
}
