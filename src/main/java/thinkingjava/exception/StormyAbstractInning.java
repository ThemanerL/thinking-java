package thinkingjava.exception;

interface Storm {
  void event() throws RainedOut;

  void rainHard() throws RainedOut;
}

/**
 * @author 李重辰
 * @date 2019/4/14 16:34
 */
public class StormyAbstractInning extends AbstractInning implements Storm {
  // OK to add new exceptions for constructors, but you
  // must deal with the base constructor exceptions:
  public StormyAbstractInning()
      throws RainedOut, BaseballException {
  }

  public StormyAbstractInning(String s)
      throws BaseballException {
  }

  public static void main(String[] args) {
    try {
      StormyAbstractInning si = new StormyAbstractInning();
      si.atBat();
      si.walk();
    } catch (PopFoul e) {
      System.out.println("Pop foul");
    } catch (RainedOut e) {
      System.out.println("Rained out");
    } catch (BaseballException e) {
      System.out.println("Generic baseball exception");
    }
    // Strike not thrown in derived version.
    try {
      // What happens if you upcast?
      AbstractInning i = new StormyAbstractInning();
      i.atBat();
      // You must catch the exceptions from the
      // base-class version of the method:
    } catch (Strike e) {
      System.out.println("Strike");
    } catch (Foul e) {
      System.out.println("Foul");
    } catch (RainedOut e) {
      System.out.println("Rained out");
    } catch (BaseballException e) {
      System.out.println("Generic baseball exception");
    }
  }

  // Regular methods must conform to base class:
  //  @Override
  //  public void walk() throws PopFoul {} //Compile error
  // Interface CANNOT add exceptions to existing
  // methods from the base class:
  //! public void event() throws RainedOut {}
  // If the method doesn’t already exist in the
  // base class, the exception is OK:
  @Override
  public void rainHard() throws RainedOut {
  }

  // You can choose to not throw any exceptions,
  // even if the base version does:
  @Override
  public void event() {
  }

  // Overridden methods can throw inherited exceptions:
  @Override
  public void atBat() throws PopFoul {
  }
}

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class AbstractInning {
  public AbstractInning() throws BaseballException {
  }

  public void event() throws BaseballException {
    // Doesn’t actually have to throw anything
  }

  public abstract void atBat() throws Strike, Foul;

  public void walk() {
  } // Throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}