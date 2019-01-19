package google;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author:zhumeng
 * @desc:
 **/
public class LinkedListDeletor {
    public Node deleteIfEquals(Node head, int value) {

        while (head!=null&&head.getValue() == value) {
            head = head.getNext();
        }
        if (head == null) {
            return null;
        }
        Node prev = head;
        //Loop invariant:list nodes from head up to prev has been
        //processed.(Nodes with values equal to value are deleted.
        while (prev.getNext() != null) {
            //prev.getNext().getNext()
            if (prev.getNext().getValue() == value) {
                //delete it
                prev.setNext(prev.getNext().getNext());
            } else {
                prev = prev.getNext();
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListDeletor deletor=new LinkedListDeletor();
        LinkedListCreator creator=new LinkedListCreator();

        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(1,2,3,4,5,3,2,3)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2,2,2,1,2,3,4,5,3,2,3)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList()),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2,2,2,2,2,2,2,2)),2));
        Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkedList(Arrays.asList(2)),1));
    }
}
