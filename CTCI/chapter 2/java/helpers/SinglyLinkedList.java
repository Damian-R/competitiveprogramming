package helpers;

public class SinglyLinkedList {
  public Node head;

  // instantiate a new linked list with the node given
  public SinglyLinkedList(Node head) {
    this.head = head;
  }

  public void addNode(Node add) {
    Node trav = this.head;

    while(trav.next != null) {
      trav = trav.next;
    }

    trav.next = add;
  }

  public void print() {
    Node n = this.head;
    while (n != null) {
      System.out.print(n.d + " -> ");
      n = n.next;
    }
    System.out.print("NULL\n");
  }
}
