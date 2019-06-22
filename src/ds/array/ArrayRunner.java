package ds.array;

import java.util.Scanner;
public class ArrayRunner {


    /*
    * Weapons
    * 1. Nested for loop
    * 2. 2 points navigation
    * 3. Sorting
    * 4. Hash map
    *
    * */


    public static boolean isPalindrome(char[] arr){
        /*
        * while(s<e)
        * if a[s] != a[e]
        *   return false;
        * s++ e--
        * */

        int s= 0;
        int e= arr.length-1;
        while(s<e)
        {
            if (arr[s] != arr[e])
                return false;
            s++;
            e--;

        }
        return true;
    }

    static void alternateMerge(int ar[], int arr[], int n1, int n2, int newArr[])
    {
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2)
        {

            newArr[k++] = ar[i++];
            newArr[k++] = arr[j++];

        }

        // Store remaining elements of first array
        while (i < n1)
            newArr[k++] = ar[i++];

        // Store remaining elements of second array
        while (j < n2)
            newArr[k++] = arr[j++];
    }

    public static void substringPrint(char arr[])

    {
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length - i; j++) {
                int temp = j + i - 1;
                for (int k = j; k <= temp; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }

    }

    public static void  SumEqualInArry(int arr[])
    {
        /*
        Given a set of numbers and a sum, find the numbers whose sum is equal to the given number
         */


    }

    public static void main(String args[])
    {
        char [] arr = {'a','b','x'};
        System.out.println(isPalindrome(arr));
        substringPrint(arr);



//        int ar[] = {4,5,6,7,8,9};
//        int arr[] = {1,2,3,4};
//        int n1= ar.length;
//        int n2= arr.length;
//        System.out.println(n1);
//        System.out.println(n2);
//        int newArr[] = new int[n1+n2];
//
//        alternateMerge(ar, arr, n1, n2, newArr);
//        System.out.println("Array after merging");
//        for (int i = 0; i < n1 + n2; i++)
//            System.out.print( newArr[i] + " ");


    }
}
