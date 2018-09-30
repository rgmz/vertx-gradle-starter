package io.vertx.starter

import io.vertx.core.Vertx
import io.vertx.core.logging.Logger
import io.vertx.core.logging.LoggerFactory

object Launcher {
  @JvmStatic
  fun main(args: Array<String>) {
    LauncherClass().dispatch(args)
  }
}

/**
 * @author Richard Gomez
 */
class LauncherClass : io.vertx.core.Launcher() {

  companion object {
    val LOG: Logger = LoggerFactory.getLogger(LauncherClass::class.java)
  }

  override fun afterStartingVertx(vertx: Vertx?) {
    super.afterStartingVertx(vertx)

    LOG.info("Hello, Vert.x Launcher!")
  }
}
