package thinkingjava.innerclasses.practice;

import thinkingjava.innerclasses.DotNew;

/**
 * @author 李重辰
 * @date 2018/10/22 15:02
 */
class P5 {
  public static void main(String[] args) {
    DotNew dotNew = new DotNew();
    DotNew.Inner inner = dotNew.new Inner();
  }
}
