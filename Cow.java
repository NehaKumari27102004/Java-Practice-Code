package Constructor;

public class Cow {
    // Private instance class

    private String name;
    private int age;
    private String colour;

    //Default constructor
    public Cow() {
        this.name = "Moti";
        this.age = 4;
        this.colour = "White";
    }

    //getter method

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColour(){
        return colour;
    }

    //Main method

    public static void main(String[] args){
        Cow myCow= new Cow();
        System.out.println("Cow name is: " + myCow.getName());
        System.out.println("Cow age is:" + myCow.getAge());
        System.out.println("Cow colour is:" + myCow.getColour());
    }
}

