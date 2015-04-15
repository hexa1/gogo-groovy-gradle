package app

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Main Application class
 */
class Main {

  static final Logger log = LoggerFactory.getLogger(Main.class)

  /**
   * Main method
   */
  static void main(String[] args) {
    println 'Hello World!'
    log.debug "A debug message"
    log.warn "A warning message"
    log.info "An info message"
    log.error "An error message"
    log.trace "A trace message"
  }
}
