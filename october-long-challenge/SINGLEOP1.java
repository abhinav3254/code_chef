import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SINGLEOP1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j = 0;j<t;j++) {
            String n = br.readLine();
            int s = Integer.parseInt(br.readLine());
            int x = binaryToDecimal(s);
            int []arr = new int[x+1];
            for (int i = 0; i <= x; i++) {
                arr[i] = x^(x/(pow(i,2)));
            }
//        System.out.println(Arrays.toString(arr));
            int index = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {

                } else if (max<arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println(index);
        }
    }


    static public int pow(int power , int base) {
        int ans = 1;
        while (power > 0){
            if ((power&1)==1){
                // if == 0 there is no point to calculate ans
                ans = ans * base;
            }
            base = base * base;
            // keep dividing power by 2 using right shift
            power = power >> 1;
        }
        return ans;
    }

    static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    /*
    *
    *
    * Fails on this test case
    3
    10101
    5
    1011011
    * */

    /*
    *
    * public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j = 0;j<t;j++) {
            String n = br.readLine();
            String s = br.readLine();
            int x = Integer.parseInt(s,2);
            int []arr = new int[x+1];
            for (int i = 0; i <= x; i++) {
                arr[i] = x^(x/((int) Math.pow(2,i)));
            }
//        System.out.println(Arrays.toString(arr));
            int index = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {

                } else if (max<arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
    * */
}
