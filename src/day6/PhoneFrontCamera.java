package src.day6;

/**
 * Created by vsanghav on 8/10/2016.
 */
public class PhoneFrontCamera implements Photographer {
    @Override
    public void prepareScene() {
        System.out.println("Get ready for selfie");
    }

    @Override
    public String takePhotograph() {
        return "This is the best selfie taken in billion years";
    }
}
