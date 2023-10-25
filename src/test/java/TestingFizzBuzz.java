import org.junit.Test;
public class TestingFizzBuzz {
    @Test
    public void TestFizz() {
        String actual = FizzBuzz.CheckFizzBuzz(3);
        System.out.println(actual);
//        String expected = "Fizz";
//        Assert.assertEquals(expected,actual);
    }
}
