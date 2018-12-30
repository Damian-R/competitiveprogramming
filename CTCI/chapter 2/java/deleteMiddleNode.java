import helpers.SinglyLinkedList;
import helpers.Node;

class deleteMiddleNode {
  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(5);
    Node c = new Node(4);
    Node d = new Node(6);
    Node e = new Node(2);
    SinglyLinkedList list = new SinglyLinkedList(a);
    list.addNode(b);
    list.addNode(c);
    list.addNode(d);
    list.addNode(e);
    list.print();
    deleteMiddleNode(c);
    list.print();
  }

  static void deleteMiddleNode(Node remove) {
    Node next = remove.next;
    remove.d = next.d;
    remove.next = next.next;
  }
}

// 3 5 6 2 2
