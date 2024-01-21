class AvgTest{
    public static void main(String[] args) {
        int testscores [] = { 89, 91, 76, 
                              83, 90, 79};
        int average, sum;
        
        // initialize  sum
        sum = 0;
        for (int i = 0; i < testscores.length; i++) { //set i = 0 and i for the length of the array
            sum += testscores[i]; //Adds up values of the array
        }

        average = sum / testscores.length;

        System.out.println(" The average test score is: " + average);
    }
}