package ds.array;
import java.util.Arrays;
import java.util.HashSet;
public class ArrayRunner {
    public static void sumoftwonumber(int a[],int size_arry,int sum) {
        int l, r;

        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i +" ");

        }
        System.out.println();
        l = 0;
        r = size_arry - 1;
        while (l < r)
        {
            if (a[l] + a[r] == sum)
            {
                System.out.println("sum of two number " +a[l]+ "+" +a[r]+"=" +(a[l]+a[r]));
                l++;
                r--;
            }
            else if (a[l] + a[r] < sum){
                l++;
            }
            else {
                r--;
            }
        }


    }
    public static void sumoftwonumberInHash(int a[],int size_arry,int sum)
    {

        System.out.println();
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i=0; i<size_arry;i++)
        {
            int var = sum - a[i];
            if (hash.contains(var))
            {
                System.out.println("sum of two number " +var+ "+" +a[i]+"=" +(var+a[i]));
            }
            hash.add(a[i]);
        }
        for (int i : hash) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,3,7,2,1,8,6};
        int sum = 10;
        int n = arr.length;
        sumoftwonumber(arr,n,sum);
        System.out.println();
        sumoftwonumberInHash(arr,n,sum);
    }
}
