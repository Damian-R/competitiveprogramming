import helpers.SinglyLinkedList;
import helpers.Node;

class ReturnKthToLast {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList(new Node(5)); // fifth to last
    list.addNode(new Node(4)); // fourth to last
    list.addNode(new Node(5)); // third to last
    list.addNode(new Node(2)); // second to last
    list.addNode(new Node(6)); // first to last
    Node kthToLast = returnKthToLast(list, 2);
    System.out.println(kthToLast.d);
  }

  static Node returnKthToLast(SinglyLinkedList list, int k) {
    Node travel = list.head;
    Node follow = list.head;

    for (int i = 0; i < k-1; i++) travel = travel.next;

    while (travel.next != null) {
      travel = travel.next;
      follow = follow.next;
    }

    return follow;
  }
}
