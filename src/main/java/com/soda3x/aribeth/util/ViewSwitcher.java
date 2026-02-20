package com.soda3x.aribeth.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ViewSwitcher {
  private static BorderPane m_mainPane;
  private static final Map<String, Parent> cache = new HashMap<>();

  public static void setMainPane(BorderPane pane) {
    m_mainPane = pane;
  }

  public static void loadView(String fxmlPath) {
    Parent view = cache.get(fxmlPath);
    if (view == null) {
      try {
        URL url = ViewSwitcher.class.getResource("/fxml/" + fxmlPath);
        FXMLLoader loader = new FXMLLoader(url);
        view = loader.load();
        cache.put(fxmlPath, view);
      } catch (IOException e) {
        throw new RuntimeException("Failed to load FXML: " + fxmlPath, e);
      }
    }
    m_mainPane.setCenter(view);
  }
}