import helpers.SinglyLinkedList;
import helpers.Node;
import java.util.HashMap;

class removeDups {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList(new Node(5));
    list.addNode(new Node(3));
    list.addNode(new Node(3));
    list.addNode(new Node(4));
    list.addNode(new Node(6));
    list.addNode(new Node(3));
    list.addNode(new Node(6));
    list.addNode(new Node(6));
    list.print();
    removeDuplicates(list);
    list.print();
  }

  public static void removeDuplicates(SinglyLinkedList list) {
    HashMap<Integer, Boolean> seen = new HashMap<>();
    Node travel = list.head;
    Node previous = travel;

    while (travel != null) {
      if (seen.get(travel.d) == null) {
        seen.put(travel.d, true);
        previous = travel;
      } else {
        previous.next = travel.next;
      }
      travel = travel.next;
    }
  }
}
