package src.day7;
import src.day7.Target.Builder;

/**
 * Created by vsanghav on 8/12/2016.
 */
public class BuilderMain {


    public static void main(String[] args){


        Builder obj1 = new Builder();
        printMessage(obj1);

        Builder obj2 = new Builder().name("Mr Sad").contact(99887766).age(25).workExperience(35).city("Mexico City");
        printMessage(obj2);

        Builder obj3 = new Builder().name("Mr Happy").contact(99887766).age(25).workExperience(4).city("Adis Ababa");
        printMessage(obj3);

        Builder obj4 = new Builder().name("Mr missingField").contact(9845321).workExperience(5);
        printMessage(obj4);



    }

    public static void printMessage(Target.Builder obj){
        if(obj.build()==null)
            System.out.println("Object creation unsuccessfull");
        else
            System.out.println("Successful!");

    }
}
