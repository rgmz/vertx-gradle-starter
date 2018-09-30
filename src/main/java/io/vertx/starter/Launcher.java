package io.vertx.starter;

import io.vertx.core.Vertx;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

/**
 * @author Richard Gomez
 */
public class Launcher extends io.vertx.core.Launcher {

  private static final Logger LOG = LoggerFactory.getLogger(Launcher.class);

  public static void main(String[] args) {
    new Launcher().dispatch(args);
  }

  @Override
  public void afterStartingVertx(Vertx vertx) {
    super.afterStartingVertx(vertx);

    LOG.info("Hello, Vert.x Launcher!");
  }
}
