package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array of Primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;

        System.out.println(arr[1]);

        //input using for-loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //print arrays using toString()
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        //Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }


}
