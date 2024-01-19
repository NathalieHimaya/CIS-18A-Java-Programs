
// A program that uses the vehicle class

class Vehicle {
    int passengers, fuelcap, mpg;

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

// This class declares an object of type Vehicle

class AddMath {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //assign values to minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to sports car
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

       System.out.println("Minivan can carry " + minivan.passengers + ". ");

       minivan.range();

       System.out.println("Sportscar can carry " + sportscar.passengers + ". ");

       sportscar.range();

    }
}