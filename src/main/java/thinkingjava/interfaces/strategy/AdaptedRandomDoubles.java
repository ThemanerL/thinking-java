package thinkingjava.interfaces.strategy;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @author 李重辰
 * @date 2018/10/14 11:38
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
  private int count;

  private AdaptedRandomDoubles(int count) {
    this.count = count;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(new AdaptedRandomDoubles(7));
    while (s.hasNextDouble()) {
      System.out.println(s.nextDouble() + " ");
    }
  }

  @Override
  public int read(CharBuffer cb) {
    if (count-- == 0) {
      return -1;
    }
    String result = next() + " ";
    cb.append(result);
    return result.length();
  }
}
