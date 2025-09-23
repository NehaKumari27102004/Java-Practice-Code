package Object;

public class Car {

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInliters;

    int noOfSeats;

//Constructors
    Car(){
        noOfWheels=4;
        color="Black";
        maxSpeed=150;
        currentFuelInliters=2;
        noOfSeats=5;

    }

    public void Start(){
        if(currentFuelInliters==0){
            System.out.println("Car is out of fuel, can not start");
        }else if(currentFuelInliters <5){
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInliters--;
        }else{
            System.out.println("Car is driving, bruhhhhh...");
            currentFuelInliters--;
        }
        System.out.println("Car is driving");
        currentFuelInliters--;
    }
    public void drive(){
        if(currentFuelInliters==0){
            System.out.println("Car is out of fuel");
        }else if(currentFuelInliters <5){
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInliters--;
        }else{
            System.out.println("Car is driving");
            currentFuelInliters--;
        }
        System.out.println("Car is driving");
        currentFuelInliters--;
    }

    public void addFuel(float fuel){
        currentFuelInliters += fuel;
    }
    public float getCurrentFuelLevel() {
        return currentFuelInliters;
    }
}
