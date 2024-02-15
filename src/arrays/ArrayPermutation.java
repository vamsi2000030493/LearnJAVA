// leetCode : 1920 Build Array from Permutations

package arrays;

import java.util.Scanner;

public class ArrayPermutation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{0,2,1,5,3,4};

        int[] ans = permutation(arr);

        for(int num : ans)
        {
            System.out.print(num + " ");
        }
    }

    public static int[] permutation(int[] arr)
    {
        int[] result = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            result[i] = arr[arr[i]];
        }
        return result;
    }

}
