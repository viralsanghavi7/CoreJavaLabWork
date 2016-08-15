package src.day7;

/**
 * Created by vsanghav on 8/11/2016.
 */
public class Target {

    private String name;
    private int contact;
    private int age;
    private int workExperience;
    private String city;

    private Target(){}

    private boolean isValid(){
        if(this.name==null || (this.age < this.workExperience) || String.valueOf(this.contact).length() < 5)
                return false;
        return true;
    }

    public static class Builder{
        private Target t;


        public Target build(){
            if(t.isValid()==true)
                return t;
            else
                return null;
        }

        public Builder(){
            t = new Target();
        }

        public Target.Builder name(String name){
            t.name = name;
            return this;
        }

        public Target.Builder contact(int contact){
            t.contact = contact;
            return this;
        }

        public Target.Builder age(int age){
            t.age = age;
            return this;
        }

        public Target.Builder workExperience(int workExperience){
            t.workExperience = workExperience;
            return this;
        }

        public Target.Builder city(String city){
            t.city = city;
            return this;
        }

    }





}
