/**
 * User:    mengxin
 * Date:    23/05/17
 * Project: unitTestDemo
 */
public class JUnitTest {

    @org.junit.Test
    public void test(){
        int i = 20;
        int j = 21;
        int k = Test.add(i, j);
        assert k==41;
        System.out.print("Junit test finish\n");
    }
}
