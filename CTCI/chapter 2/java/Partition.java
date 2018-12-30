import helpers.SinglyLinkedList;
import helpers.Node;

class Partition {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList(new Node(3));
    list.addNode(new Node(5));
    list.addNode(new Node(8));
    list.addNode(new Node(5));
    list.addNode(new Node(10));
    list.addNode(new Node(2));
    list.addNode(new Node(1));
    list.print();
    partition(list, 5);
    list.print();
  }

  static void partition(SinglyLinkedList list, int p) {
    Node bound = list.head;
    while (bound.next.d < p) bound = bound.next;

    Node travel = bound.next;

    while (travel.next != null) {
      if (travel.next.d < p) {
        Node move = new Node(travel.next.d);
        // remove node from here
        travel.next = travel.next.next;
        // and insert after bound
        move.next = bound.next;
        bound.next = move;
      }
      // avoid null ptr exceptions that could be caused on line 25 due to line 29 :)
      else if (travel.next != null) travel = travel.next;
    }
  }
}
