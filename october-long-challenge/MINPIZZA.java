import java.util.Scanner;

public class MINPIZZA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int ans = n*x;

            if (ans%4!=0) {
                System.out.println((ans/4)+1);
            } else {
                System.out.println(ans/4);
            }

        }
    }
}
