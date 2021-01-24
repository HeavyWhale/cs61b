public class HelloNumbers {
    public static void main(String[] args) {
        int count = 0;
        int x = 0;
        while (x < 10) {
            System.out.print(count + "\n");
            x++;
            count += x;
        }
    }
}
