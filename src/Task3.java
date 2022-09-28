import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums = n % 100;
        String result = String.valueOf(n);
        switch (nums) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                result += " TORTOV";
                break;
            default:
                switch (nums % 10) {
                    case 0:
                    case 6:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        result += " TORTOV";
                        break;
                    case 1:
                        result += " TORT";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result += " TORTA";
                        break;
                }
        }
        System.out.println(result);
    }

    }
