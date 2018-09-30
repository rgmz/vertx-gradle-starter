package io.vertx.starter

import io.vertx.core.Launcher
import io.vertx.core.Vertx
import io.vertx.core.logging.Logger
import io.vertx.core.logging.LoggerFactory

/**
 * @author Richard Gomez
 */
class Launcher : Launcher() {

  companion object {
    val LOG: Logger = LoggerFactory.getLogger(Launcher::class.java)
  }

  override fun afterStartingVertx(vertx: Vertx?) {
    super.afterStartingVertx(vertx)

    LOG.info("Hello, Vert.x Launcher!")
  }
}
