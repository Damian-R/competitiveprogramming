import helpers.Node;
import helpers.SinglyLinkedList;

import java.util.HashSet;

class LoopDetection {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    Node c = new Node(4);
    Node d = new Node(6);
    Node e = new Node(2);

    c.next = d;
    d.next = e;
    e.next = c; // loop starts at c

    list.addNode(new Node(3));
    list.addNode(new Node(5));
    list.addNode(c);

    Node loopStart = detectLoop(list);

    System.out.println(loopStart == c);
  }

  // non-optimal space
  static Node detectLoop(SinglyLinkedList list) {
    HashSet<Node> set = new HashSet<Node>();
    Node travel = list.head;

    while (travel != null) {
      if (set.contains(travel)) return travel;
      set.add(travel);
      travel = travel.next;
    }

    return null;
  }
}
