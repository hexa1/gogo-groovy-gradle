package app

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Main Application class
 */
class Main {
  static final Logger LOG = LoggerFactory.getLogger(Main)

  /**
   * Main method
   *
   */// tag::main[]
  static void main(String[] args) {
    LOG.debug 'A debug message'
    LOG.warn 'A warning message'
    LOG.info 'An info message'
    LOG.error 'An error message'
    LOG.trace 'A trace message'
  }
  // end::main[]
} // Main
