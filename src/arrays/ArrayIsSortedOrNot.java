package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNot
{

    public static int checkArr(int len, int[] arr)
    {
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] >= arr[i - 1])
            {

            }
            else
            {
                return 1;
            }
        }
        return 0;

    }

    public static boolean isSortedOrNot(int len, int[] arr)
    {

        int[] arr1 = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr1[i] = arr[i];
        }

        Arrays.sort(arr1);

        for(int i = 0 ; i < len ; i++)
        {
            if(arr[i] == arr1[i])
            {

            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];
        for(int i = 0 ; i < len ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sol = checkArr(len,arr);


        if(sol == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

//        boolean ans = isSortedOrNot(len,arr);
//
//        if(ans)
//        {
//            System.out.println(true);
//        }
//        else
//        {
//            System.out.println(false);
//        }



    }
}
