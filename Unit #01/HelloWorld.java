import java.util.Scanner;

class HelloWorld{
	public static void main (String args[]) throws java.io.IOException {
        // create a scanner object from system.in
        Scanner sc = new Scanner(System.in);
        // Ask the user their age
        System.out.println("How old are you? ");
        // Read a line of input and convert it to an Integer
        int age = Integer.parseInt(sc.nextLine());
        // Print what user wrote
        System.out.println("You wrote: " + age);
        // Use if statement lgoic
        if (age >= 21) System.out.println("You are 21 or over!");
        else System.out.println("You are under 21");
		
	}
}	