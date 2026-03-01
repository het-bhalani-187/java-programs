public class gc {
    public static void main(String[] args) {
        gc obj = new gc();
        obj = null;
        System.gc();
    }
}