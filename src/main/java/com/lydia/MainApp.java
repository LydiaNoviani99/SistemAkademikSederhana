/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia;

import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.
                setLocation(MainApp.class.
                        getResource("/layout/pilihBahasa.fxml"));
        loader.
                setResources(ResourceBundle.
                        getBundle("bundle/bundleBahasa"));
        AnchorPane ap = loader.load();
        Scene scene = new Scene(ap);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sistem Akademik Sederhana");
        primaryStage.show();
    }

}
