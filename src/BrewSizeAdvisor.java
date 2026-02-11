import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();

        if (volume > 350) {
            System.out.print("Large");
        } else if (volume >= 200) {
            System.out.print("Medium");
        } else if (volume >= 0) {
            System.out.print("Small");
        } else {
            System.out.print("Invalid Input");
        }

        sc.close();
    }
}
