package arrays;

import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class SecondMinAndMax
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];
        for(int i = 0 ; i < len ; i++)
        {
            arr[i] = sc.nextInt();
        }

        secondMaxAndMin(len,arr);
        //bruteForce(len,arr);
    }

    static void secondMaxAndMin(int len, int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            System.out.println("Invalid Array or Array length is not Capable");
        }
        else
        {
            int small = Integer.MAX_VALUE;
            int second_small = Integer.MAX_VALUE;

            int big = Integer.MIN_VALUE;
            int second_big = Integer.MIN_VALUE;

            for (int i = 0; i < len; i++) {
                small = min(small, arr[i]);
                big = max(big, arr[i]);
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < second_small && arr[i] != small) {
                    second_small = arr[i];
                }

                if (arr[i] > second_big && arr[i] != big) {
                    second_big = arr[i];
                }
            }

            System.out.println("Second smallest is " + second_small);
            System.out.println("Second largest is " + second_big);
        }

    }

    public static void bruteForce(int len, int[] arr)
    {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }

}
