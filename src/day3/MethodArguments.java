package src.day3;

/**
 * Created by vsanghav on 8/3/2016.
 */
public class MethodArguments {

    private String[] textNumbers = new String[]{"zero","one", "two", "three", "four","five","six","seven","eight","nine","ten"};

    public int addUp(String a, String b){
                return textToNum(a)+textToNum(b);
    }


    private int textToNum(String text){

        for(int i=0;i<this.textNumbers.length;i++){
            if(this.textNumbers[i].equals(text))
                return i;
        }

        return 0;
    }
    public int addUp(int a, int b){
        return a+b;
    }
    public double addUp(double a, double b){
        System.out.println("in double");
        return a+b;
    }

    public static void main(String[] args){
        MethodArguments obj = new MethodArguments();
        System.out.println(obj.addUp(3.2, 2.2));
        System.out.println(obj.addUp(1, 4));
        System.out.println(obj.addUp("one", "three"));
        System.out.println(obj.addUp(2, 3.5));
    }
}
