package thinkingjava.interfaces.factory;

import java.util.Random;

interface Gamb {
  Random RAND = new Random(System.currentTimeMillis());

  /**
   * 赌
   *
   * @return 赌博结果
   */
  String play();
}

interface GambFactory {
  /**
   * 实例化赌博
   *
   * @return 返回一个赌博游戏
   */
  Gamb getGambInstance();
}

/**
 * @author 李重辰
 * @date 2018/10/18 18:27
 */
public class P19 {
  private static void playGamb(GambFactory gambFactory) {
    System.out.println(gambFactory.getGambInstance().play());
  }

  public static void main(String[] args) {
    playGamb(new CoinFactory());
    playGamb(new DiceFactory());
  }
}

class Coin implements Gamb {
  private int resultLimt = 2;

  private int point = RAND.nextInt(resultLimt);

  @Override
  public String play() {
    return "你抛出了" + (point == 0 ? "反面" : "正面");
  }
}

class Dice implements Gamb {
  private int resultLimt = 6;

  private int point = RAND.nextInt(resultLimt);

  @Override
  public String play() {
    return "你抛出了" + point + "点";
  }
}

class CoinFactory implements GambFactory {
  @Override
  public Gamb getGambInstance() {
    return new Coin();
  }
}

class DiceFactory implements GambFactory {
  @Override
  public Gamb getGambInstance() {
    return new Dice();
  }
}