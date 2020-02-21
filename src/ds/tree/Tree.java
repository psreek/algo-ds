package ds.tree;

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
            return (size(node.left) + size(node.right) + 1);


    }

    int noOfLeavesNodes(Node node){
        if (node == null)
        return 0;
        else if (node.left == null && node.right == null)
            return 1;
        else
            return(noOfLeavesNodes(node.left) + noOfLeavesNodes(node.right));
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
    
}
