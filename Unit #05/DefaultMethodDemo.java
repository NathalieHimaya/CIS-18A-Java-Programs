public interface MyIf{
    default int getAdminID(){
        return 1;
    }
}

class myIFImp implements myIf{
    public int getUserID(){
        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String args[]){
        myIFImp obj = new MyIFImp();

        System.out.println("User ID is " + obj.getUserID());

        System.out.println("Administarator ID is "+ ob.getAdminID());
    }
}