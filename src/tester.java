import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class tester{
  public static void main(String[] args){
    Result result = JUnitCore.runClasses(tester.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
  
  /* Example from the README */
  @Test
  public void validLocationsExtractRect() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{1,2},{3,4},{6,7}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 2, 0, 1));
  }
  
  @Test
  public void invalidLocationsXOrder() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 2, 0, 0, 1));
  }
  
  @Test
  public void invalidLocationsYTooBig() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 0, 1, 0, 2));
  }
  
  @Test
  public void hasTrue() {
    boolean[][] input = {{true,false},{false},{false,false,false,false}};
    assertFalse(extractAndTest.noneTrue(input));
  }
}
