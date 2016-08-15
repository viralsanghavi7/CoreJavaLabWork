package src.day7;

/**
 * Created by vsanghav on 8/12/2016.
 */
public class BuilderMain {


    public static void main(String[] args){

        Target.Builder obj1 = new Target.Builder();
        printMessage(obj1);

        Target.Builder obj2 = new Target.Builder().name("Mr Sad").contact(99887766).age(25).workExperience(35).city("Mexico City");
        printMessage(obj2);

        Target.Builder obj3 = new Target.Builder().name("Mr Happy").contact(99887766).age(25).workExperience(4).city("Adis Ababa");
        printMessage(obj3);

    }

    public static void printMessage(Target.Builder obj){
        if(obj.build()==null)
            System.out.println("Object creation unsuccessfull");
        else
            System.out.println("Successful!");

    }
}
