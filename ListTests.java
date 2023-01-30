import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
  @Test
  public void testFilter() {
    List<String> input = new ArrayList<String> ();
    input.add("apple");
    input.add("banana");
    input.add("fruit");
    StringChecker check = new StringChecker();
    assertEquals(outcome, ListExamples.filter(input, check));
  }
}

