package google;

import java.util.Arrays;

/**
 * @author:zhumeng
 * @desc:
 **/
public class Loop_LinkedListReverser {
    public Node reverseLinkedList(Node head) {
        if (head == null) {

        }
        Node newHead = null;
        Node curHead = head;
        //loop invariant 循环不变式
        //newHead points to the linked list already reversed
        //curHead points to the linked list not yet reversed
        while (curHead != null) {
            //curHead==null
            //Loop invariant holds.
            Node next = curHead.getNext();//next=null

            curHead.setNext(newHead); //curHead.next reversed
            newHead = curHead;        //newHead points to last node
            curHead = next;           //curHead=null
            //Loop invariant hold.
        }
        //Loop invariant holds.
        return newHead;
    }


    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        Loop_LinkedListReverser reverser = new Loop_LinkedListReverser();
        Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(reverser.reverseLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));

        reverser.reverseLinkedList(creator.createLargeListedList(10000000));
        System.out.println("done");
    }

}
