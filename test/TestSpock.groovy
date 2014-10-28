import spock.lang.Specification

/**
 * @see https://code.google.com/p/spock/wiki/SpockBasics
 */
class TestSpock extends Specification {
  /**
   * Can be: def "Test Sanity() { ... }"
   */
  def testSanity() {
    expect:
      input == output

    where:
      input | output
      1 + 2 | 3
  }
}
