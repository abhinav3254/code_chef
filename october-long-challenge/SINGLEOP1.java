import java.util.Scanner;

public class SINGLEOP1 {
    static int[] arr;
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int testCase = sc.nextInt();


//        String s = sc.nextLine();
//        System.out.println(Integer.parseInt(s, 2));

            for (int i = 0; i < testCase; i++) {
                int lenOfS = sc.nextInt();
                int s = sc.nextInt();
                String name = ""+s;
                int val = Integer.parseInt(name,2);
//            System.out.println(val);
                int size = val+1;
                arr = new int[size];

                for (int j = 0; j < arr.length; j++) {
                    int k = (int) Math.pow(2, j);
                    arr[j] = val^(val/k);
                }

                int max = 0;
                int index = -1;
                for (int j = 0; j < arr.length; j++) {
                    if (max<arr[j]) {
                        max = arr[j];
                        index = j;
                    }
                }
                System.out.println(index);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int s = sc.nextInt();
//            String ss = ""+s;
//
//            int val = 0;
//            int count = 0;
//
//            for (int j = ss.length()-1; j >=0 ; j--) {
//                if (ss.charAt(j) == '1') {
//                    val += Math.pow(2,count);
//                }
//                count++;
//            }
//            int max = -Integer.MIN_VALUE;
//            int y = 0;
//
//            for (int j = 1; j <ss.length() ; j++) {
//                int temp = (val/(int) Math.pow(2,j));
//                temp = val^temp;
//
//                if(temp > max) {
//                    max = temp;
//                    y = i;
//                }
//            }
//            System.out.println(y+1);
//        }
//    }

}
