/**
 * @see http://groovy.codehaus.org/api/groovy/util/GroovyTestCase.html
 * @see http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html
 */
class TestJUnit extends GroovyTestCase {
  void testSanity() {
    def n = 1 + 1
    assertTrue n * 2 == 4
    def str = 'test'
    assertEquals str, str
  }
}
