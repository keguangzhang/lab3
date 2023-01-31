import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
/* 
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, input1);
  }
*/
  @Test
  public void testReversed2() {
    int[] input = {1, 2, 3, 4, 5, 6, 7};
    assertArrayEquals(new int[] {7, 6, 5, 4, 3, 2, 1}, 
            ArrayExamples.reversed(input));
    for (int i = 0; i < input.length; i++) {
      System.out.print("{");
      System.out.print(ArrayExamples.reversed(input)[i] + "," );
      System.out.print("}");
    }
         
            
  }

  @Test
  public void testReversed3() {
    int[] input = {0};
    assertArrayEquals(new int[] {0}, 
            ArrayExamples.reversed(input));
            for (int i = 0; i < input.length; i++) {
              System.out.print("{");
              System.out.print(ArrayExamples.reversed(input)[i] + "," );
              System.out.print("}");
            }
}

/* 
  @Test
  public void testAverage() {
    double[] input = { 1 };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverage2() {
    double[] input = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test public void testAverage3() {
    double[] input = {1, 1, 1, 1, 1};
    assertEquals(0.25, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }
*/

}
