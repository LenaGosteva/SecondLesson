import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),  krol = 11;
        int volk = 2;
        for (int i = 1; i <=n ; i++) {
            if (i%2 != 0){
                krol *= 3;
            }
            if(i%2 == 0){
               krol -= 10*volk;
            }
            if (i%7 ==0){
                volk += 1;
            }
        }
        System.out.println(volk +" "+ krol);

    }
}
