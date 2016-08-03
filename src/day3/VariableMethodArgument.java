package src.day3;

/**
 * Created by vsanghav on 8/3/2016.
 */
public class VariableMethodArgument {

    private String[] textNumbers = new String[]{"zero","one", "two", "three", "four","five","six","seven","eight","nine","ten"};

    public int addUp(String... args){
        int sum=0;
        for(int i=0;i<args.length;i++)
            sum = sum + textToNum(args[i]);
        return sum;
    }

    private int textToNum(String text){

        for(int i=0;i<this.textNumbers.length;i++){
            if(this.textNumbers[i].equals(text))
                return i;
        }

        return 0;
    }

    public int addUp(int... args){
        int sum = 0;
        for(int i=0;i<args.length;i++)
            sum = sum + args[i];
        return sum;
    }



    public double addUp(double... args){
        double sum = 0;
        for(int i=0;i<args.length;i++)
            sum = sum + args[i];
        return sum;
    }


    public static void main(String[] args){
        VariableMethodArgument obj = new VariableMethodArgument();
        System.out.println(obj.addUp(3.2, 2.2,1));
        System.out.println(obj.addUp(1, 4,3,5,6,7));
        System.out.println(obj.addUp("one", "three","seven"));
        System.out.println(obj.addUp("one"));
        System.out.println(obj.addUp(2, 3.5));
    }

}
