package ds.BST;

public class BinarySearchTree {

    public Node insert(Node node, int val) {
        if(node == null) {
            node = new Node(val);
            return node;
        }

        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }
    public void inorder(Node node){
        if (node != null)
        {
            inorder(node.left);
            System.out.print(node.data+ " ");
            inorder(node.right);
        }
    }
    public Node delete(Node node,int val){
        if(node == null)
            return node;
        if (val<node.data)
            node.left = delete(node.left,val);
        else if(val>node.data)
            node.right = delete(node.right,val);
        else{
            if (node.left==null || node.right==null){
                Node temp = null;
                temp = node.left ==null? node.right:node.left;
                if(temp ==null)
                    return null;
                else
                    return temp;
            }
            else{
                Node successor = getSuccessor(node);
                node.data = successor.data;

                node.right = delete(node.right, successor.data);
                return node;
            }
        }



        return node;
    }
    public Node getSuccessor(Node node)
    {
        if(node == null) {
            return null;
        }

        Node temp = node.right;

        while(temp.left != null) {
            temp = temp.left;
        }

        return temp;
    }

}
