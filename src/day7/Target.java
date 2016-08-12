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

        public Builder(String name, int contact, int age, int workExperience, String city){
            t = new Target();
            t.name = name;
            t.contact = contact;
            t.age = age;
            t.workExperience = workExperience;
            t.city = city;
        }

        public Target build(){
            if(t.isValid()==true)
                return t;
            else
                return null;
        }

        public Builder(){
            t = new Target();
        }

        public void setName(String name){
            t.name = name;
        }

        public void setContact(int contact){
            t.contact = contact;
        }

        public void setAge(int age){
            t.age = age;
        }

        public void setWorkExperience(int workExperience){
            t.workExperience = workExperience;
        }

        public void setCity(String city){
            t.city = city;
        }

    }





}
