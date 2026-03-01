import java.util.Vector;
public class vec {
    public static void main(String[] args) {
        Vector<String> number = new Vector<>();

        number.add("100");
        number.add("200");
        number.add("300");

        System.out.println("Numbers: " + number);

        number.remove(2);

        System.out.println("Numbers after removal: " + number);

        System.out.println("Size of numbers vector: " + number.size());
        System.out.println("Contains 200? " + number.contains(200));
    }
}
