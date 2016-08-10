package src.day6;

/**
 * Created by vsanghav on 8/10/2016.
 */
public class DSLRCamera implements Photographer{
    @Override
    public void prepareScene() {
        System.out.println("Get ready for marriage photo shoot");
    }

    @Override
    public String takePhotograph() {
        return "You both look great together";
    }
}
