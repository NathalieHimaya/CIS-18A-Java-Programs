
// A program that uses the vehicle class

class Vehicle {
    int passengers, fuelcap, mpg;
}

// This class declares an object of type Vehicle

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        int range;

        //assign values to minivan
        miniVan.passengers = 7;
        miniVan.fuelcap = 16;
        miniVan.mpg = 21;

        //compute the range assuming a full tank of gas range
        range = miniVan.fuelcap * miniVan.mpg;
        System.out.println("Minivan can carry " + miniVan.passengers + 
        " with a range of " + range);
    }
}