import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

  Fibonacci fibonacci;

  @Before
    public void before(){
      fibonacci = new Fibonacci();
  }


  @Test
    public void canCalculationZero(){
      Assert.assertEquals(0,fibonacci.calculate(0));
  }

  @Test
  public void canCalculationOne(){
    Assert.assertEquals(1,fibonacci.calculate(1));
  }

  @Test
  public void canCalculationTwo(){
    Assert.assertEquals(1,fibonacci.calculate(2));
  }

  @Test
  public void canCalculationThree(){
    Assert.assertEquals(2,fibonacci.calculate(3));
  }

  @Test
  public void canCalculationFour(){
    Assert.assertEquals(3,fibonacci.calculate(4));
  }

  @Test
  public void canCalculationFive(){
    Assert.assertEquals(5,fibonacci.calculate(5));
  }

  @Test
  public void canCalculationSix(){
    Assert.assertEquals(8,fibonacci.calculate(6));
  }

  @Test
  public void canCalculationSeven(){
    Assert.assertEquals(13,fibonacci.calculate(7));
  }

  @Test
  public void canCalculationEight(){
    Assert.assertEquals(21,fibonacci.calculate(8));
  }

  @Test
  public void canCalculationNine(){
    Assert.assertEquals(34,fibonacci.calculate(9));
  }

  @Test
  public void canCalculationTen(){
    Assert.assertEquals(55,fibonacci.calculate(10));
  }
}

