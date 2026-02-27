public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer strr = new StringBuffer("World");

        strr.append("earth");
        System.out.println("After append: " + strr);

        strr.insert(5,"done");
        System.out.println("After insert: " + strr);

        strr.replace(5, 10, "Earth");
        System.out.println("After replace: " + strr);

        strr.delete(2,7);
        System.out.println("After delete: " + strr);

        strr.reverse();
        System.out.println("After reverse: " + strr);
    }
}
