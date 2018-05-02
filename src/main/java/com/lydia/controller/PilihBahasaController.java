/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class PilihBahasaController implements Initializable {

    private ResourceBundle rb;

    @FXML
    private ComboBox<String> comboLanguage;

    private ObservableList<String> languages;
    @FXML
    private AnchorPane apBahasa;

    public ObservableList<String> getLanguages() {
        if (languages == null) {
            languages = FXCollections.observableArrayList();
            languages.add("English");
            languages.add("Indonesia");
        }
        return languages;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.setComponentOutputText(rb);

        comboLanguage.setItems(getLanguages());
//
    }

    private void setComponentOutputText(ResourceBundle rb) {
        this.rb = rb;
//        comboLanguage.setPromptText("English");
    }

    @FXML
    private void btnGoOnAction(ActionEvent event) {
        if (comboLanguage.getValue().equalsIgnoreCase("english")) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource(
                        "/layout/Login.fxml"));
                loader.
                        setResources(ResourceBundle.
                                getBundle("bundle/bundleLanguage"));
                BorderPane pane = loader.load();
                LoginController loginController = loader.
                        getController();
                Scene scene = new Scene(pane);
                Stage secondStage = new Stage();
                secondStage.setScene(scene);
                secondStage.setTitle("Login");
                secondStage.initOwner(apBahasa.getScene().getWindow());
                secondStage.initModality(Modality.WINDOW_MODAL);

                secondStage.show();
            } catch (IOException ex) {
                Logger.getLogger(AddDataMahasiswaController.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } else if (comboLanguage.getValue().equalsIgnoreCase(
                "indonesia")) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource(
                        "/layout/Login.fxml"));
                loader.
                        setResources(ResourceBundle.
                                getBundle("bundle/bundleBahasa"));
                BorderPane pane = loader.load();
                LoginController loginController = loader.
                        getController();
                Scene scene = new Scene(pane);
                Stage secondStage = new Stage();
                secondStage.setScene(scene);
                secondStage.setTitle("Masuk");
                secondStage.initOwner(apBahasa.getScene().getWindow());
                secondStage.initModality(Modality.WINDOW_MODAL);

//        anchorPane.getScene().getWindow().hide();
                secondStage.show();
            } catch (IOException ex) {
                Logger.getLogger(AddDataMahasiswaController.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }

    }

}
