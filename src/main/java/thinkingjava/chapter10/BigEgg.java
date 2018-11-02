package thinkingjava.chapter10;

/**
 * 继承了某个外围类的时候，没有继承内部类，内部类没有什么变化，这两个内部类市完全独立的两个实体，各自在自己的命名空间内。
 * @author 李重辰
 * @date 2018/11/2 12:33
 */
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}

class Egg {
    private Yolk y;
    protected  class Yolk{
        public Yolk() {
            System.out.println("Egg.Yolk");
        }
    }
    public Egg() {
        System.out.println("Egg.Egg");
        y = new Yolk();
    }
}