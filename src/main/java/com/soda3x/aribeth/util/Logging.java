package com.soda3x.aribeth.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {

  private Logging() {
    // Disable no-args constructor
  }

  public static Logger getLogger(Object o) {
    return LogManager.getLogger(o.getClass());
  }

}
