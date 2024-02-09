import java.util.Scanner; 

public class FinalCafe extends displays{
    public static void orderSystem(){

        double coffee = 2.50, 
        espresso = 2.50, 
        latte = 2.50, 
        tea = 2.50, 
        dessert = 2.50, 
        total = 0;

        String[] foodName = new String[5];
        foodName[0] = "Coffee";
        foodName[1] = "Espresso";
        foodName[2] = "Latte";
        foodName[3] = "Tea";
        foodName[4] = "Dessert";

        Scanner quant = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);  // Create a Scanner object for choice
        System.out.print("Enter Option Number: ");
        int userChoice = choice.nextInt(); 
        if (userChoice < 1 || userChoice > 4) {System.out.println(("Invalid Selection. Choose a number between 1 - 4"));} 
        

                //Options
                switch (userChoice){ //User chooses to View Menu
                    case 1:
                    displayMenu();
                    Scanner order = new Scanner(System.in);
                    System.out.print("Enter Your Choice: ");
                    String userOrder = order.nextLine();

                 while (true) {
                    switch(userOrder){
                        case "1": // Coffee
                        System.out.println("You have selected: " + foodName[0]);
                        System.out.print("Enter desired Quantity: ");
                        double userQuant = quant.nextFloat();
                        total = total + userQuant*coffee;

                        System.out.println("Your total is $" + total + "");
                        break;
                        
                        case "2":  // Espresso
                        System.out.println("You have selected: " + foodName[1]);
                        System.out.print("Enter desired Quantity: ");
                        userQuant = quant.nextFloat();
                        total = total + userQuant*espresso;

                        System.out.println("Your total is $" + total + "");
                        break;

                        case "3": // Tea
                        System.out.println("You have selected: " + foodName[2]);
                        System.out.print("Enter desired Quantity: ");
                        userQuant = quant.nextFloat();
                        total = total + userQuant*latte;

                        System.out.println("Your total is $" + total + "");
                        break;

                        case "4": // Tea
                        System.out.println("You have selected: " + foodName[3]);
                        System.out.print("Enter desired Quantity: ");
                        userQuant = quant.nextFloat();
                        total = total + userQuant*tea;

                        System.out.println("Your total is $" + total + "");
                        break;

                        case "5":  // Dessert
                        System.out.println("You have selected: " + foodName[4]);
                        System.out.print("Enter desired Quantity: ");
                        userQuant = quant.nextFloat();
                        total = total + userQuant*dessert;

                        System.out.println("Your total is $" + total + "");
                        break;

                        case "6": // Exit
                        System.exit(0);

                        default:
                        break;

                     }
                break;
              }
              case 2: 
              System.exit(0);
         }
    }    

    // Main Method
    public static void main(String[] args) {   
        
        displayOptions(); //Calls the Option Display
        orderSystem(); //Calls the System Display

        //End of Order
        Scanner ans = new Scanner(System.in);
        System.out.println("Would like to order anything else? (Y/N)");
        String userAns = ans.nextLine();
        if (userAns.equalsIgnoreCase("Y")) {
            displayMenu();
            orderSystem();}
        else if (userAns.equalsIgnoreCase("N")) {
            System.exit(0);}
        else System.out.print("Invalid Choice");
    }
}

