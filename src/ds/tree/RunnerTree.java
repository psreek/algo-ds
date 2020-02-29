package ds.tree;

public class RunnerTree {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);





        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left= node6;
        node5.left = node7;

        Tree tree = new Tree(node1);


       System.out.println(tree.size(tree.root));


        System.out.println(tree.noOfLeavesNodes(tree.root));
        System.out.print("inorder traversals:");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("preorder traversals:");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("postorder traversals:");
        tree.postOrder(tree.root);
        System.out.println();
        System.out.println("sum of all nodes in BT:"+tree.sumOfAllNodes(tree.root));
        System.out.println("sum of all left leafs in BT:"+tree.sumOfleftLeafs(tree.root));
        System.out.println("sum of all Right leafs in BT:"+tree.sumOfRightLeafs(tree.root));
        System.out.println("Height of  BT:"+tree.height(tree.root));
        System.out.println("Print tree node Level:");
        tree.printLevelOrder(tree.root);




    }
}
