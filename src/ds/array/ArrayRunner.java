package ds.array;

import java.util.*;
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

    static void alternateMerge(char[] ar, int[] arr, int n1, int n2, char[] newArr)
    {
        /*
        Write a function that combines two lists by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].
         */
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2)
        {

            newArr[k++] = ar[i++];
            newArr[k++] = (char) arr[j++];

        }

        // Store remaining elements of first array
        while (i < n1)
            newArr[k++] = (char) ar[i++];

        // Store remaining elements of second array
        while (j < n2)
            newArr[k++] = (char) arr[j++];
    }

    public static void substringPrint(char arr[])

    {
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length - i; j++) {
                int temp = j + i - 1;
                for (int k = j; k <= temp; k++) {
                    System.out.print(arr[k]);

                  System.out.println(isPalindromelength(arr,k,temp));




                }
                System.out.println();
            }
        }

    }

    public static int isPalindromelength(char[] arr,int i, int j){
        /*
         * while(s<e)
         * if a[s] != a[e]
         *   return false;
         * s++ e--
         * */
       // System.out.println("hello");
        int s= i;
        int e= j;
        while(s<e)
        {
            if (arr[s] != arr[e])
                return -1;
            s++;
            e--;

        }
        return arr.length;


    }

    public static void  SumEqualInArry(int arr[],int sum)
    {
        /*
        Given a set of numbers and a sum, find the numbers whose sum is equal to the given number
         */


        int s, e;

        Arrays.sort(arr);
        s = 0;
        e = arr.length-1;
        while (s < e)
        {
            if(arr[s] + arr[e] == sum){
                System.out.println("the addition of"  + arr[s] +  "and "  + arr[e] +  "is"   + sum);
                s++;
                e--;
            }
            else if(arr[s] + arr[e] < sum)
                s++;
            else // arr[s] + arr[e] > sum
                e--;
        }



    }

      public  static void UnionArray(int[] arr,int[] arrr)
      {
          /*
          Find Union and Intersection of two unsorted arrays
          --for unsorted array sort the array first
          --
           */

          Arrays.sort(arr);
          Arrays.sort(arrr);
          int i=0, j= 0;

          while (i< arr.length && j< arrr.length)
          {
                  if (arr[i] < arrr[j])
                      System.out.print(arr[i++]);

                  else if (arrr[j] < arr[i])
                      System.out.print(arrr[j++]);
                  else {
                      System.out.print(arrr[j++]);
                      i++;
                  }

          }
          while (i< arr.length)
              System.out.print(arr[i++]);
          while (j< arrr.length)
              System.out.print(arrr[j++]);


      }






    public static void SelectionSort(int arr[]) {

        for (int i =0; i<arr.length-1;i++)
        {
            int min_idx = i;
            for (int j = i+1; j< arr.length; j++ ) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i]= temp;

        }
    }

    public static void BubleSort(int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                        arr[j+1]= arr[j];
                        arr[j] = temp;
                }

    }

    public static void InsertionSort(int arr[])
    {

       for (int i = 1;i < arr.length; i++) {
           int key = arr[i];
           int j = i -1;
           while(j >= 0 && arr[j]> key)
           {
               arr[j+1] = arr[j];
               j= j-1;
           }
           arr[j+1] = key;
       }

    }




    public static void main(String args[])
    {
        char [] arr = {'a','b','a','d'};
        System.out.println(isPalindrome(arr));
        //substringPrint(arr);

//        int arr1[] = {1, 7,4, 45, 9,6, 10, 8,8};
//        int n = 16;
//        SumEqualInArry(arr1,n);



//        char[] chr = {'a','b','c','d'};
//        int num[] = {1,2,3,4,5};
//        int n1= chr.length;
//        int n2= num.length;
//        System.out.println(n1);
//        System.out.println(n2);
//        char[] newArr = new char[n1 + n2];
//
//        alternateMerge(chr, num, n1, n2, newArr);
//        System.out.println("Array after merging");
//        for (int i = 0; i < n1 + n2; i++)
//            System.out.print( newArr[i] + " ");


        int ar1[] = {2,5,3,7,10,4};
        int ar2[] = {4,2,8,15,3,20};
        for (int i=0; i<ar2.length; i++)
            System.out.print(ar2[i]+ " ");
        System.out.println();
        //UnionArray(ar1,ar2);
        //BubleSort(ar2);
        //SelectionSort(ar2);
        InsertionSort(ar2);
        for (int i=0; i<ar2.length; i++)
            System.out.print(ar2[i]+ " ");







    }
}
