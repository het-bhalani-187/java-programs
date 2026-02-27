class calc{
    int add(int a,int b){
        return a/b;
    }
    // int add(int a,int b, int c){
    //     return a+b+c;
    // }
    double add(double a,double b){
        return a/b;
    }
    
}



public class overloading {
    public static void main(String[] args) {
        calc c =new calc();
        System.out.println(c.add(4,2));
        System.out.println(c.add(4.32,2.42));
        //System.out.println(c.add(4,2,6));
        
    }
}
