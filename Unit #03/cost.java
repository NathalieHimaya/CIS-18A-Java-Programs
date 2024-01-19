class electronics {
  double TV, laptop, gameconsole;
}

class cost{
    public static void main(String[] args) {
        electronics e = new electronics();

        double shipTV, shipLaptop, shipGC;

        e.TV = 15.0;
        e.laptop = 7.0;
        e.gameconsole = 5.0;

        shipTV = e.TV * 1.25;
        shipLaptop = e.laptop * 1.25;
        shipGC = e.gameconsole * 1.25;

        System.out.println("The TV weighs " + e.TV + " so the total shipping is $" + shipTV);
        System.out.println("The Laptop weighs " + e.laptop + " so the total shipping is $" + shipLaptop);
        System.out.println("The Game Console weighs " + e.gameconsole + " so the total shipping is $" + shipGC);
        
    }
}