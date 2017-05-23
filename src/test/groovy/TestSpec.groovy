import spock.lang.Specification
/**
 * User:    mengxin
 * Date:    23/05/17
 * Project: Default (Template) Project
 */
class TestSpec extends Specification {
    def "test the class"() {
        given: "two integer"
        int i = 10
        int j = 11
        when: "add them"
        int k = Test.add(i,j)

        then: "k equal to the 21"
        k == 21
        System.out.print("Spock test finish\n")
    }
}