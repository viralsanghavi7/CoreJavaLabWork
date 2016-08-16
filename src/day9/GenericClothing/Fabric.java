package src.day9.GenericClothing;

import java.awt.*;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Fabric implements Colored {
    Color color;

    @Override
    public Color getColor() {
        return color;
    }

    public Fabric(Color color) {
        this.color = color;
    }
}
