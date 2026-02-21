package com.soda3x.aribeth.db;

import com.soda3x.aribeth.util.Logging;

public class DatabaseManager {

  private static DatabaseManager m_instance;

  private DatabaseManager() {
    // Disable no-args constructor
  }

  public static DatabaseManager getInstance() {
    if (m_instance == null) {
      m_instance = new DatabaseManager();
    }
    return m_instance;
  }

  public void init() {
    Logging.getLogger(this).info("Initialising database...");
  }

  public void close() {
    Logging.getLogger(this).info("Closing database...");
  }

}
