package io.vertx.starter

import io.vertx.core.AbstractVerticle

/**
 * @author Richard Gomez
 */
class MainVerticle : AbstractVerticle() {

  override fun start() {
    vertx.createHttpServer()
      .requestHandler { it.response().end("Hello Vert.x!") }
      .listen(8080)
  }
}
