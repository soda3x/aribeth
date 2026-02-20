package com.soda3x.aribeth;

import com.soda3x.aribeth.util.ViewSwitcher;

import atlantafx.base.theme.PrimerDark;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

  private static final int DEFAULT_WIDTH = 1280;
  private static final int DEFAULT_HEIGHT = 720;

  @Override
  public void start(Stage stage) throws Exception {
    Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
    Font.loadFont(getClass().getResourceAsStream("/fonts/Neverwinter.otf"), 16);
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
    BorderPane root = loader.load();

    ViewSwitcher.setMainPane(root);

    Scene scene = new Scene(root);

    stage.setScene(scene);
    stage.setTitle("Aribeth - Neverwinter Nights Mod Manager");
    stage.setWidth(DEFAULT_WIDTH);
    stage.setHeight(DEFAULT_HEIGHT);
    stage.show();
  }

  @Override
  public void stop() {

  }

  public static void main(String[] args) {
    launch();
  }
}