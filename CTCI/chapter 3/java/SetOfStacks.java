import java.util.EmptyStackException;
import java.util.Stack;

public class SetOfStacks {
  private static int STACK_CAPACITY = 5;
  private static int numElements = 0;
  private static Stack stackOfStacks;

  public static void main(String[] args) {
    stackOfStacks = new Stack();
    push(5);
  }

  private static void push(int item) {
    if (numElements % STACK_CAPACITY == 0) stackOfStacks.push(new Stack());
    Stack curStack = stackOfStacks.peek();
    curStack.push(item);
    numElements++;
  }

}
