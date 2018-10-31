package thinkingjava.chapter10.practice;

/**
 * @author 李重辰
 * @date 2018/10/22 20:22
 */
public class P10 {
    private P10interface getInstance (boolean flag){
        if(flag){
            class P10Inner implements P10interface{
                public void print() {
                    System.out.println("P9Inner.print");
                }
            }
            return new P10Inner();
        }
        return null;
    }

    public static void main(String[] args) {
        P10 p10 = new P10();
        p10.getInstance(true).print();
    }
}

interface P10interface{
    /**
     * 接口中的类必须用javadoc注释
     */
    void print();
}