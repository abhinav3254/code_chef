import java.util.Scanner;

public class BUILDINGRACE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            float chefSpeed = (float) a/x;
            float chefinaSpeed = (float) b/y;

            if (chefinaSpeed == chefSpeed) {
                System.out.println("Both");
            } else if (chefinaSpeed > chefSpeed) {
                System.out.println("Chef");
            } else if (chefinaSpeed < chefSpeed) {
                System.out.println("Chefina");
            }

        }
    }
}
