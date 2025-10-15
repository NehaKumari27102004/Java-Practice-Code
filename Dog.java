package Constructor;
// Parameterized Constructor
  /*  public class Dog {
        private String name;
        private String color;
        private int age;


        public Dog(String name, String color, int age){
            this.name=name;
            this.color=color;
            this.age=age;
        }

        public static void main(String[] args){
            Dog myDog= new Dog("Shadow", "White", 6);
            System.out.println("The Dog name is"+ " " + myDog.name);
            System.out.println("The dog color is" + " " + myDog.color);
            System.out.println("The dog age is"+ " " + myDog.age);
        }
    }

   */




// Question:-1-----------Write a Java program where the "Dog" class tracks the number of times a dog barks.

/*
    public class Dog{
        private String name;
        private int barksCount;

        public Dog(String name){
            this.name=name;
            this.barksCount=0;
        }

        public void bark(){
            barksCount++;
            System.out.println(name + " " + "Say, Woof!");
        }

        // Setter method

        public void setName(){
            this.name=name;
        }
        public void setBarksCount(){
            this.barksCount=barksCount;
        }

        //Getter method

        public String getName(){
            return name;
        }

        public int getBarksCount(){
            return barksCount;
        }

        //----Main Methods---------

        public static void main(String[] args){
            Dog myDog1=new Dog("Puppy");
            Dog myDog2=new Dog("Buddy");

            myDog1.bark();
            myDog1.bark();
            myDog1.bark();
            myDog2.bark();

            System.out.println(myDog1.getName()+ " " + "is Barked" + myDog1.getBarksCount() + " " + "times");
            System.out.println(myDog2.getName()+ " " + "is Barked" + myDog2.getBarksCount() + " " + "times");
        }
    }

 */





/*-------------------------Question:- 2--------------------------------
------------Write a Java program where the "Dog" class supports a method to determine if the dog is trained.---------
 */

public class Dog{
    private String name;
    private String training;

    
}