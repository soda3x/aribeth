package com.soda3x.aribeth.controllers;

import com.soda3x.aribeth.util.ViewSwitcher;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainController {

  @FXML
  private BorderPane rootPane;

  @FXML
  public void initialize() {
    // Initialize the switcher with the root pane
    ViewSwitcher.setMainPane(rootPane);

    // Load the default view (Library)
    ViewSwitcher.loadView("library.fxml");
  }

  @FXML
  private void showLibrary() {
    ViewSwitcher.loadView("library.fxml");
  }

  @FXML
  private void showModpacks() {
    ViewSwitcher.loadView("modpacks.fxml");
  }

  @FXML
  private void showNWSync() {
    ViewSwitcher.loadView("nwsync.fxml");
  }

  @FXML
  private void showSettings() {
    ViewSwitcher.loadView("settings.fxml");
  }
}
