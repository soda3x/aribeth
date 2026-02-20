package com.soda3x.aribeth.controllers;

import atlantafx.base.theme.CupertinoDark;
import atlantafx.base.theme.CupertinoLight;
import atlantafx.base.theme.Dracula;
import atlantafx.base.theme.NordDark;
import atlantafx.base.theme.NordLight;
import atlantafx.base.theme.PrimerDark;
import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class SettingsController {

  @FXML
  private ChoiceBox<String> themeChoiceBox;

  @FXML
  public void initialize() {
    themeChoiceBox.setItems(FXCollections.observableArrayList(
        "Primer Dark",
        "Primer Light",
        "Nord Dark",
        "Nord Light",
        "Cupertino Dark",
        "Cupertino Light",
        "Dracula"));
    themeChoiceBox.getSelectionModel().select(0);
    themeChoiceBox.getSelectionModel().selectedIndexProperty().addListener(
        (ObservableValue<? extends Number> ov, Number prev, Number next) -> {
          selectTheme();
        });
  }

  private void selectTheme() {
    switch (themeChoiceBox.getSelectionModel().getSelectedIndex()) {
      case 0:
        Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
        break;
      case 1:
        Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
        break;
      case 2:
        Application.setUserAgentStylesheet(new NordDark().getUserAgentStylesheet());
        break;
      case 3:
        Application.setUserAgentStylesheet(new NordLight().getUserAgentStylesheet());
        break;
      case 4:
        Application.setUserAgentStylesheet(new CupertinoDark().getUserAgentStylesheet());
        break;
      case 5:
        Application.setUserAgentStylesheet(new CupertinoLight().getUserAgentStylesheet());
        break;
      case 6:
        Application.setUserAgentStylesheet(new Dracula().getUserAgentStylesheet());
        break;
      default:
        Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
    }
  }
}
