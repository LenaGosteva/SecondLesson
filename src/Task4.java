import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), s = 0, min = 9;
        while (N != 0){
            s = N%10;
            if (s<min){
                min = s;
            }
            N /= 10;
        }
        System.out.println(min);

    }
}
