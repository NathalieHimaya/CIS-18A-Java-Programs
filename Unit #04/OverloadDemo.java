class Overload {
    void ovlDemo() {
        System.out.println("No parameters");
    }

    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(int a, int b){
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo{
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        

        ob.ovlDemo(2);
        

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ov(4,6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.err.println("Result of ob.ovDemo(1.1, 2.32:)" + resD);
        
    }
}