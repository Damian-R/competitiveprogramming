import helpers.Node;
import helpers.SinglyLinkedList;

class Palindrome {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addNode(new Node(3));
    list.addNode(new Node(5));
    list.addNode(new Node(4));
    list.addNode(new Node(5));
    list.addNode(new Node(3));
    boolean result = palindrome(list);
    System.out.println(result);
  }

  static boolean palindrome(SinglyLinkedList list) {
    Node reverseHead = new Node(list.head.d);
    Node travel1 = list.head.next;
    while (travel1 != null) {
      Node n = new Node(travel1.d);
      n.next = reverseHead;
      reverseHead = n;
      travel1 = travel1.next;
    }

    travel1 = list.head;
    Node travel2 = reverseHead;

    while (travel1 != null) {
      if (travel1.d != travel2.d) return false;
      travel1 = travel1.next;
      travel2 = travel2.next;
    }
    return true;
  }
}

// 3 5 4 5 3
