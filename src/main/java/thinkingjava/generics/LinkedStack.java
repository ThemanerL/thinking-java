package thinkingjava.generics;

/**
 * @author 李重辰
 * @date 2019/12/24 17:43
 */
public class LinkedStack<T> {
  private Node<T> top = new Node<>();

  public void push(T item) {
    top = new Node<>(item, top);
  }

  public T pop() {
    T result = top.item;
    if (!top.isEnd()) {
      top = top.next;
    }
    return result;
  }

  private static class Node<T> {
    T item;
    Node<T> next;

    public Node() {
      item = null;
      next = null;
    }

    public Node(T item, Node<T> next) {
      this.item = item;
      this.next = next;
    }

    boolean isEnd() {
      return item == null && next == null;
    }
  }
}

class LinkedStackTest {
  public static void main(String[] args) {
    LinkedStack<Integer> stack = new LinkedStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    Integer s;
    while ((s = stack.pop()) != null) {
      System.out.println(s);
    }
  }
}