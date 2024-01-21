class Pizza{
    public static void main(String[] args) {
        int pizza [][] = {
            {2, 2},
            {5, 4},
            {10, 8},
            {12, 10},
            {15, 12}
        };
        
        double discount = 0;

        for(int i = 1; i < 5; i++){
            System.out.println("When you order " + pizza[i][1] + " pizzas, ");
            System.out.println("You get a discount of " + pizza[i][0] + " dollars. ");
                for(int j = 0; j < 1; j++){
                    pizza[i][j] = pizza [i][0] / pizza [i][j];
                    System.out.println("Each pizza discount " + pizza[i][j] + " dollars. \n");
                    discount += pizza [i][j];
                }
        }
        discount /=5;
        System.out.println("Average pizza discount is " + discount + " dollars. \n");
    }
}