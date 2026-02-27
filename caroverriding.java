class car{
    int reliability(){
        return 0;
    }
}

class ford extends car{
    int reliability(){
        return 3;
    }
}

class tata extends car{
    int reliability(){
        return 4;
    }
}

class mahindra extends car{
    int reliability(){
        return 5;
    }
}

public class caroverriding {
    public static void main(String[] args) {
        car  b = new ford();
        car c = new tata();
        car d = new mahindra();
        System.out.println("Ford car reliability: "+b.reliability());
        System.out.println("Tata car reliability: "+c.reliability());
        System.out.println("Mahindra car reliability: "+d.reliability());
    }
}
