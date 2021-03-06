package thinkingjava.innerclasses;

/**
 * 要想创建内部类的对象，不能按照你想象的方式去引用外部类的名字DotNew，而是必须使用外部类的对象来创建该内部类对象。
 * 这也解决了内部类名字作用域的问题，因此不能声明dn.new DotNew.Inner()
 * 在拥有外部类对象之前市不可能创建内部类对象的，这是因为内部类对象会暗暗地链接到创建它的外部类对象上，但是如果你
 * 创建的是嵌套类（静态内部类），那么它就不需要对外部类对象的引用
 *
 * @author 李重辰
 * @date 2018/10/22 10:58
 */
public class DotNew {
  public static void main(String[] args) {
    DotNew dotNew = new DotNew();
    DotNew.Inner dni = dotNew.new Inner();
  }

  public class Inner {
  }
}

