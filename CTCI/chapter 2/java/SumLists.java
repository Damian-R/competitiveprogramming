import helpers.Node;
import helpers.SinglyLinkedList;

class SumLists {
  public static void main(String[] args) {
    SinglyLinkedList list1 = new SinglyLinkedList(new Node(7));
    list1.addNode(new Node(1));
    list1.addNode(new Node(9));
    SinglyLinkedList list2 = new SinglyLinkedList(new Node(5));
    list2.addNode(new Node(9));
    list2.addNode(new Node(2));
    list2.addNode(new Node(3));

    // 917 + 3295

    SinglyLinkedList result = sumLists(list1, list2);
    result.print();
  }

  static SinglyLinkedList sumLists(SinglyLinkedList list1, SinglyLinkedList list2) {
    int carry = 0;
    SinglyLinkedList result = new SinglyLinkedList();
    Node travel1 = list1.head;
    Node travel2 = list2.head;
    while (travel1 != null && travel2 != null) {
      int val1 = travel1.d;
      int val2 = travel2.d;
      int sum = val1 + val2;
      int carryHere = carry;
      if (sum > 9) {
        sum -= 10;
        carry = 1;
      } else carry = 0;
      result.addNode(new Node(sum + carryHere));
      travel1 = travel1.next;
      travel2 = travel2.next;
    }

    // add the rest of the digits in the case where # of digits varies
    while (travel1 != null || travel2 != null) {
      if (travel1 != null) {
        result.addNode(new Node(travel1.d + carry));
        travel1 = travel1.next;
      }
      if (travel2 != null) {
        result.addNode(new Node(travel2.d + carry));
        travel2 = travel2.next;
      }
      carry = 0;
    }

    return result;
  }
}
