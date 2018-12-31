import helpers.Node;
import helpers.SinglyLinkedList;
import java.util.Stack;

class Palindrome {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addNode(new Node(3));
    list.addNode(new Node(4));
    list.addNode(new Node(6));
    list.addNode(new Node(6));
    list.addNode(new Node(4));
    list.addNode(new Node(3));
    boolean result = palindrome(list);
    System.out.println(result);
  }

  static boolean palindrome(SinglyLinkedList list) {
    Stack<Integer> stack = new Stack<Integer>();

    Node fast = list.head;
    Node slow = list.head;

    while (fast != null && fast.next != null) {
      stack.push(slow.d);
      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast != null && fast.next == null) {
      slow = slow.next;
    }

    while (slow != null) {
      if (slow.d != stack.pop()) return false;
      slow = slow.next;
    }

    return stack.isEmpty();
  }
}

// 3 5 4 5 3
// 3 5 4 4 5 3
