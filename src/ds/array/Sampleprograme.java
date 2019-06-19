public class Sampleprograme {
    public  static void main(String[] args)
    {
        int ar[] = {4,5,6,7,8,9};
        int arr[] = {1,2,3,4};
        int n1= ar.length;
        int n2= arr.length;
        System.out.println(n1);
        System.out.println(n2);
        int newArr[] = new int[n1+n2];

        alternateMerge(ar, arr, n1, n2, newArr);
        System.out.println("Array after merging");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print( newArr[i] + " ");


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
}
