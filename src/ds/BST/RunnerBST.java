package ds.BST;

public class RunnerBST {
    public static void main(String[] args)
    {
        BinarySearchTree bt = new BinarySearchTree();
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        Node root = null;
        root = bt.insert(root,50);
        root = bt.insert(root,30);
        root = bt.insert(root,40);
        root = bt.insert(root,20);
        root = bt.insert(root,70);
        root = bt.insert(root,80);
        root = bt.insert(root,60);
        root = bt.insert(root,75);
        bt.inorder(root);
        root = bt.delete(root,20);
        System.out.println();
        bt.inorder(root);
        System.out.println();
        root = bt.delete(root,80);
        System.out.println();
        bt.inorder(root);


    }
}
