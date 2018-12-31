import helpers.Node;
import helpers.SinglyLinkedList;

class Intersection {
  public static void main(String[] args) {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();

    Node a = new Node(3); // node that the lists intersect on

    list1.addNode(new Node(1));
    list1.addNode(a);
    list2.addNode(new Node(3));
    list2.addNode(new Node(8));
    list2.addNode(a);
    list1.addNode(new Node(6));
    list1.addNode(new Node(4));
    list2.addNode(new Node(5));

    System.out.println(intersection(list1, list2) == a);
  }

  static Node intersection(SinglyLinkedList list1, SinglyLinkedList list2) {
    int len1 = size(list1);
    int len2 = size(list2);
    Node travel1;
    Node travel2;
    int diff;
    if (len1 > len2) {
      travel1 = list1.head;
      travel2 = list2.head;
      diff = len1 - len2;
    } else {
      travel1 = list2.head;
      travel2 = list1.head;
      diff = len2 - len1;
    }

    for (int i = 0; i < diff; i++) travel1 = travel1.next;

    while (travel1 != null) {
      if (travel1 == travel2) return travel1;
      travel1 = travel1.next;
      travel2 = travel2.next;
    }

    return null;
  }

  static int size(SinglyLinkedList list) {
    Node travel = list.head;
    int size = 0;
    while (travel != null) {
      size++;
      travel = travel.next;
    }
    return size;
  }
}
