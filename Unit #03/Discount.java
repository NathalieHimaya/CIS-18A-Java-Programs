class Food{
    int nuts, flour, veggies, grains,
    dnuts, dflour, dvegs, dgrains, total;
}

class Discount{
    public static void main(String bob[]){
        Food f = new Food();

        f.nuts = 20;
        f.flour = 20;
        f.veggies = 20;
        f.grains = 50;

        while(f.nuts >= 10){
            f.nuts = f.nuts / 10;
            f.dnuts = f.nuts * 3;
        }

        while(f.flour>= 20){
            f.flour = f.flour / 20;
            f.dflour = f.flour * 5;
        }

        while(f.veggies>= 10){
            f.veggies = f.veggies / 10;
            f.dvegs = f.veggies * 7;
        }

        while(f.grains>= 50){
            f.grains = f.grains / 50;
            f.dgrains = f.grains * 10;
        }

        f.total = f.dnuts + f.dflour + f.dvegs + f.dgrains;

        System.out.println("Total discount from fresh foods is " + f.total + " dollars.");
    }
}