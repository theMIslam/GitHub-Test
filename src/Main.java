import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int num = 7;

        if (num >10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("напишите число");
            int result = scanner.nextInt();
            System.out.println(result);
        }else {
            System.out.println("num < 10");
        }


    }
}