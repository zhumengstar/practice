package google;

/**
 * @author:zhumeng
 * @desc:
 **/
public class LinkedListReverser {
    public Node reserserLinkedList(Node head) {
        Node newHead = reserserLinkedList(head.getNext());
    }
}
