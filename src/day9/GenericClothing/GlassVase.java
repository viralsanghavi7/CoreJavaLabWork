package src.day9.GenericClothing;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class GlassVase implements Sized {

    int size;

    @Override
    public int getSize() {
        return size;
    }

    public GlassVase(int size){
        this.size = size;
    }
}
