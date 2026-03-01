public class multicatch {
    public static void main(String[] args){
        try{
            System.out.println("Inner try block started");
            int result = 10/0;
            String str = "hello";
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Caught ArithmeticException in inner try block");
        }
    
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException in outer try block" + e.getMessage());
        }

        finally{
             System.out.println("Finally outer block  ");
             }

    System.out.println("Program continues");
}
}

