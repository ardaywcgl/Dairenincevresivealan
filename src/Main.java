import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int r;
            double alan,cevre,pi = 3.14;
                System.out.println("Dairenin yarıçapını giriniz:");
                r = input.nextInt();
                cevre = 2 * pi * r;
                alan = pi * (r*r);
                System.out.println("Dairenin çevresi" + cevre );
                System.out.println("Dairenin alanı" + alan );

    }
}