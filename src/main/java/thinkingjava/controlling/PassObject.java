package thinkingjava.controlling;

/**
 * @author 李重辰
 */
public class PassObject {
  private static void f(Letter y) {
    y.c = 'z';
  }

  public static void main(String[] args) {
    Letter x = new Letter();
    x.c = 'a';
    System.out.println("1:x.c: " + x.c);
    Letter z = new Letter();
    z.c = 'p';
    f(z);
    System.out.println("2:z.c: " + z.c);
  }
}

class Letter {
  char c;
}
