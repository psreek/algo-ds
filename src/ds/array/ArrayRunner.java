package ds.array;
import java.util.*;

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
    public static int printklargest(int[] arr ,int k)
    {
        if(arr.length < k) {
            System.out.println("Invalid Case");
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for(int i=0;i<k;i++)
            {
                minHeap.add(arr[i]);
            }
            for(int i=k; i<arr.length; i++)
            {
                if(arr[i]>minHeap.peek())
                {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
            }
            return minHeap.peek();

    }
    public static void print_N_mostFrequentNumber(int[] arr,int k)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0; i<arr.length;i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
//                (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
//        );
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
        for(Map.Entry<Integer, Integer> value: map.entrySet())
        {
            pq.offer(value);
            if (pq.size() > k)
                System.out.println(pq.poll());
        }
        System.out.println(pq);
        for(int i=0;i<k;i++)
        {
            System.out.println(pq.poll().getKey());
        }



    }
    static void findElements(int arr[], int n)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            // If current element is smaller
            // than first then update both
            // first and second
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }

        /* If arr[i] is in between
        first and second
        then update second */
            else if (arr[i] > second)
                second = arr[i];
        }

        for (int i = 0; i < n; i++)
            if (arr[i] < second)
                System.out.print(arr[i] + " ") ;
    }



    public static int kthSmallestUsingHeap(int[][] matrix, int k)
    {
        int n = matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.add(matrix[i][j]);
            }
        }

        int ans = -1;
        // remove the min element k times
        for (int i = 0; i < k; i++) {
            ans = pq.poll();
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {5,3,7,2,1,8,6};
        int sum = 10;
        int n = arr.length;
        sumoftwonumber(arr,n,sum);
        System.out.println();
        sumoftwonumberInHash(arr,n,sum);
        int arrr[] = {12, 35, 1, 10, 34, 1};
        int k = 2;
        System.out.println();
        System.out.println(printklargest(arrr, k));
        System.out.println();
        int a[] = {3, 1, 4, 4, 5, 2, 6, 1};
        int kk = 2;
        print_N_mostFrequentNumber(a, kk);
        System.out.println();
        int rr[] = { 2, -6, 3, 5, 1};
        int nn = rr.length;
        findElements(rr, nn);
        int mat[][] = {
                {10, 12, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 48},
                {32, 33, 39, 50},
        };
        int mm=3;
        System.out.println();
        System.out.println(kthSmallestUsingHeap(mat,mm));
    }
}
