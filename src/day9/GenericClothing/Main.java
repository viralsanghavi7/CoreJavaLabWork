package src.day9.GenericClothing;

import java.awt.*;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Main {


    public static void main(String[] args){


        Glove g1 = new Glove(10, Color.BLACK);
        Glove g2 = new Glove(10, Color.BLUE);
        Sock s1 = new Sock(8, Color.PINK);
        Sock s2 = new Sock(15,Color.GRAY);
        Fabric f = new Fabric(Color.GREEN);
        GlassVase gv = new GlassVase(15);


        ClothingPair<?>[] pairs = {
                new ClothingPair<>(g1, g2),
                new ClothingPair<>(s1, s2),
                new ClothingPair<>(g1, s1)
               // new ClothingPair<>(f,s1),
        };


        for(ClothingPair<?> pair: pairs){
            System.out.println(pair.isSameClass());
        }

        for(ClothingPair<?> pair: pairs){
            System.out.println(pair.isMatched());
        }
    }
}
