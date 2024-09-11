public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
            }

    public static int multiples() {
    int i = 1;
    int sum = 0;

    while (i < 1000) {
        if (i % 3 == 0 || i % 5 == 0){
            sum += 1;
        }
        i++;
    }
    return sum;
    }
}

