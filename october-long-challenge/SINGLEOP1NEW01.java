import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SINGLEOP1NEW01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-->0) {
            String n = br.readLine();
            String s = br.readLine();

            int val = 0;
            int count = 0;

            for (int i = s.length()-1; i >=0 ; i--) {
                if (s.charAt(i) == '1') {
                 val += Math.pow(2,count);
                }
                count++;
            }

            int max = 0;
            int y = 0;

            for (int i = 0; i <= val ; i++) {
                int temp = (val/(int)(Math.pow(2,i)));
                temp = val^temp;
                if (temp == max) {
                    n = n;
                } else
                if (temp>max) {
                    max = temp;
                    y = i;
                }
            }
            System.out.println(y);
        }
    }
}
