import java.util.EmptyStackException;

class StackMin {
  private static class MyStack {
    private static class StackNode {
      private int d;
      private StackNode next;
      private int min;

      public StackNode(int data, int min) {
        this.d = data;
        this.min = min;
      }
    }

    private StackNode top;

    public int pop() {
      if (top == null) throw new EmptyStackException();
      int item = top.d;
      top = top.next;
      return item;
    }

    public void push(int item) {
      int last = top == null ? item : min();
      int min = last < item ? last : item;
      StackNode t = new StackNode(item, min);
      t.next = top;
      top = t;
    }

    public int peek() {
      if (top == null) throw new EmptyStackException();
      return top.d;
    }

    public int min() {
      if (top == null) throw new EmptyStackException();
      return top.min;
    }

    public boolean isEmpty() {
      return top == null;
    }
  }

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(5);
    stack.push(2);
    stack.push(7);
    stack.push(5);
    System.out.println(stack.peek() + " " + stack.min());
    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println(stack.peek() + " " + stack.min());
  }
}
