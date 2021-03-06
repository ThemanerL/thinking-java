package thinkingjava.interfaces.practice;

import thinkingjava.interfaces.filters.Filter;

/**
 * @author 李重辰
 * @date 2018/10/11 16:43
 */
public class P11 extends Filter {
  public static void main(String[] args) {
    P11 p = new P11();
    System.out.println(p.reverseString("My name is Joey"));
  }

  /**
   * 将每一对字符进行互换
   *
   * @param s 传入一个字符串
   * @return 返回结果
   */
  private String reverseString(String s) {
    //一对互换。
    int pair = 2;
    char[] a = s.toCharArray();
    for (int i = 0; i < a.length - 1; i = i + pair) {
      char temp = a[i];
      a[i] = a[i + 1];
      a[i + 1] = temp;
    }
    return new String(a);
  }
}
