package ds.linkedlist;
public class RunnerLinkedList {
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addAtFront(4);
        ll.addAtFront(3);
        ll.addAtFront(2);
        ll.addAtFront(1);
        //ll.deleteFromFront();
        ll.addAtLast(6);
        ll.addAtLast(33);
        ll.addAtFront(44);
        ll.addAtPosition(5,4);
        //ll.deleteFromLast();
        //ll.deleteFromPosition(4);


        System.out.println(ll);
        ll.Even();
//        System.out.println(ll);
        //ll.Odd();
        System.out.println(ll);

    }
}
