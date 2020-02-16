package ds.linkedlist;

import java.awt.*;

public class Linklist {

    Node head;

    public Linklist() {
        this.head = null;
    }

    public void addAtFront(int data){
        // 1 2 3 4
        // 6 add at front
        //
        Node n = new Node(data);
        n.next = this.head;
        this.head = n;
    }

    public void addAtLast(int data){
        Node n = new Node(data);
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = n;




    }

    public void addAtPosition(int data, int pos){

        Node n = new Node(data);
        int i;
        Node temp = head;
        for ( i=0; i<pos -1; i++)
        {
            temp = temp.next;

        }
        n.next = temp.next;
        temp.next = n;
    }

    public void deleteFromFront(){
        // 1 2 3 4
        // null
        Node temp = head;
        head = head.next;
        temp.next= null;



    }

    public void deleteFromLast(){

        Node temp = head;
        Node pre = null;
        while (temp.next != null)
        {
            pre = temp;
            temp = temp.next;

        }
        pre.next = null;




    }

    public void deleteFromPosition(int pos){

        int i;
        Node temp = head;
        Node pre = null;
        for ( i=1; i<pos -1; i++)
        {
            temp = temp.next;

        }
        pre = temp.next;
        temp.next = pre.next;
        pre.next= null;





    }
    public void Even() {

        Node evenStart = null;
        Node evenEnd = null;
        Node currentNode = head;
        while(currentNode != null) {
            int element = currentNode.data;

            if(element % 2 == 0) {

                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }

            }
            currentNode = currentNode.next;
        }



    }
    public void Odd() {
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;
        while(currentNode != null) {

            int element = currentNode.data;
            if(element % 2 != 0) {
                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }

            }

            currentNode = currentNode.next;


        }

    }

    @Override
    public String toString() {
        String str = "";
        Node temp = this.head;

        while (temp != null){
            str += temp.toString();
            temp = temp.next;
        }
        return str;
    }
}
