
package ds.tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class Tree {
    public Node root;

    public Tree(Node root) {
        this.root = root;
    }

    void inOrder(Node node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);

    }

    void preOrder(Node node){
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);

    }

    void postOrder(Node node){
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");


    }

    int size(Node node){
        if (node == null)
            return 0;
        else
            return (size(node.left) + size(node.right) +1);


    }

    int noOfLeafsNodes(Node node){
        if (node == null)
        return 0;
        else if (node.left == null && node.right == null)
            return 1;
        else
            return(noOfLeafsNodes(node.left) + noOfLeafsNodes(node.right));
    }
    int sumOfAllNodes(Node node){
        if (node == null)
            return 0;
        else
            return (node.data + sumOfAllNodes(node.left) + sumOfAllNodes(node.right));
    }
    int sumOfleftLeafs(Node node) {
        int sum =0;
        if (node == null)
            return 0;
        if (node.left != null) {
            if (node.left.right == null && node.left.left == null)
                sum += node.left.data;
        }
            sum+=sumOfleftLeafs(node.left);
            sum+=sumOfleftLeafs(node.right);
        return sum;

    }
    int sumOfRightLeafs(Node node){
        int sum =0;
        if (node == null)
            return 0;
        if (node.right != null) {
            if (node.right.right == null && node.right.left == null)
                sum += node.right.data;
        }
        sum+=sumOfRightLeafs(node.left);
        sum+=sumOfRightLeafs(node.right);
        return sum;

    }

    int height(Node node)

    {
        if (node == null)
        return 0;
        //
        else {
            int left = height(node.left);
            int right = height(node.right);

            if (left >= right)
                return left + 1;
            else
                return right + 1;
        }


    }

    void printLevelOrder(Node node)
    {
        int h= height(node);
        int i;
        for (i=1;i<=h;i++)
        {
            printGivenLevel(node, i);
        }
    }

    void printGivenLevel(Node node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1)
        {
            printGivenLevel(node.left, level-1);
            printGivenLevel(node.right, level-1);
        }

    }
    void printLevelOrderQueue(Node node)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
            {
                q.add(temp.left);
            }
            if (temp.right !=null)
            {
                q.add(temp.right);
            }


        }

    }
    void inOrderstack(Node node)
    {
        Stack<Node> s = new Stack<Node>();
        Node curr = node;
        while(curr!=null || s.size()>0)
        {
            while(curr!=null)
            {
                s.push(curr);
                curr = curr.left;
            }
            curr= s.pop();
            System.out.print(curr.data+ " ");
            curr= curr.right;
        }


    }
    void rightview(Node node)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()) {
            int n = q.size();
            int i;
            for (i = 1; i <= n; i++) {
                Node temp = q.poll();

                if (i ==1)
                    System.out.println(temp.data + " ");
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);


            }
        }
    }

}
