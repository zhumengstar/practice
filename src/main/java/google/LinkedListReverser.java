package google;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author:zhumeng
 * @desc:
 **/
public class LinkedListReverser {
    /**
     * Reverses a linked list 递归反转
     *
     * @param head the linked list to reverse
     * @return head of the reversed linked list
     */
    public Node reverserLinkedList(Node head) {
        //size==0 or size==1
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node newHead = reverserLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverser reverser = new LinkedListReverser();
        Node.printLinkedList(reverser.reverserLinkedList(creator.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(reverser.reverserLinkedList(creator.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(reverser.reverserLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(reverser.reverserLinkedList(creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))).getValue());

        reverser.reverserLinkedList(creator.createLargeListedList(1000000));


    }
}
