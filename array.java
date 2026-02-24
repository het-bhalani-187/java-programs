public class array {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        // number is here the temporary name for num array
        for (int number : num){
            System.out.println(number);
        }
    }
}
