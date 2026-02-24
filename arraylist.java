import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Pear");
        fruits.add("Chiku");
        fruits.add("Pineapple");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Mango");
        System.out.println("Fruits after removal: " + fruits);

        System.out.println("Size of fruits list: " + fruits.size());
        System.out.println("Contains apple?" + fruits.contains("Apple"));
    }
}
