package src.day6;

/**
 * Created by vsanghav on 8/10/2016.
 */
public class Photography {

    public static void main(String[] args){

        Photographer[] pics = new Photographer[2];
        pics[0] = new PhoneFrontCamera();
        pics[1] = new DSLRCamera();

        for(int i=0;i<2;i++){
            pics[i].prepareScene();
            System.out.println(pics[i].takePhotograph());
        }


    }
}
