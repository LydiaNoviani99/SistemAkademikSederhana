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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class HomeAdminController implements Initializable {

    @FXML
    private ImageView btnDataMataKuliah;
    @FXML
    private ImageView btnDataDosen;
    @FXML
    private ImageView btnDataMhs;
    @FXML
    private BorderPane bpHomeAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnDataMataKuliahOnClick(MouseEvent event) {
    }

    @FXML
    private void btnDataDosenOnClick(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(
                    "/layout/AddDataDosen.fxml"));
            BorderPane pane = loader.load();
            AddDataDosenController addDataDosenController = loader.
                    getController();
            Scene scene = new Scene(pane);
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.setTitle("Add Data Dosen");
            secondStage.initOwner(bpHomeAdmin.getScene().getWindow());
            secondStage.initModality(Modality.WINDOW_MODAL);

//        anchorPane.getScene().getWindow().hide();
            secondStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AddDataMahasiswaController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnDataMhsOnClick(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(
                    "/layout/AddDataMahasiswa.fxml"));
            BorderPane pane = loader.load();
            AddDataMahasiswaController addDataMahasiswaController = loader.
                    getController();
            Scene scene = new Scene(pane);
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.setTitle("Add Data Mahasiswa");
            secondStage.initOwner(bpHomeAdmin.getScene().getWindow());
            secondStage.initModality(Modality.WINDOW_MODAL);

//        anchorPane.getScene().getWindow().hide();
            secondStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AddDataMahasiswaController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

}
