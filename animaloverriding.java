class ani{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class cat extends ani{
    void eat(){
        System.out.println("Cat is eating");
    }
}

class dog extends ani{
    void eat(){
        System.out.println("dog is eating");
    }
}

class sparrow extends ani{
    void eat(){
        System.out.println("sparrow is eating");
    }
}

public class animaloverriding {
    public static void main(String[] args) {
        ani  b = new cat();
        ani c = new dog();
        ani d = new sparrow();
        b.eat();
        c.eat();
        d.eat();
    }
}
