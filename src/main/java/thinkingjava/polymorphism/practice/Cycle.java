package thinkingjava.polymorphism.practice;

/**
 * @author 李重辰
 * @date 2018/10/1 22:49
 */
public class Cycle {
  public static void main(String[] args) {
    Cycle cycle = new Bicycle();
    cycle.ride();
  }

  public void ride() {
    System.out.println("Cycle.ride");
    this.wheels();
  }

  private void wheels() {
    System.out.println("Cycle.wheels");
  }
}

class Unicycle extends Cycle {
  @Override
  public void ride() {
    System.out.println("Unicycle.ride");
  }
}

class Bicycle extends Cycle {
  @Override
  public void ride() {
    System.out.println("Bicycle.ride");
  }
}

class Tricycle extends Cycle {
  @Override
  public void ride() {
    System.out.println("Tricycle.ride");
  }
}