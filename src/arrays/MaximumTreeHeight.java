package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumTreeHeight
{
    public static int maxTreeHeight(int n, int[] arr)
    {
        int height = 0;
        int i = 0;
        if(n < 1)
        {
            return arr[i];
        }

        //Arrays.sort(arr);

        for(i = 0 ; i < arr.length ; i++)
        {
            if(height < arr[i])
            {
                height = height + arr[i];
            }
        }

        return height;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = maxTreeHeight(n,arr);

        System.out.println(ans);
    }
}
