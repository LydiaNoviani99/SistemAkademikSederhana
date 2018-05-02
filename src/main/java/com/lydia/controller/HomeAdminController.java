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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class HomeAdminController implements Initializable {

    private ResourceBundle rb;
    @FXML
    private Button btnDataMataKuliah;
    @FXML
    private Button btnDataDosen;
    @FXML
    private BorderPane bpHomeAdmin;
    @FXML
    private Button btnDataMhs;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.setComponentOutputText(rb);
    }

    private void setComponentOutputText(ResourceBundle rb) {

        this.rb = rb;

        btnDataDosen.setText(rb.getString("btnDosen"));
        btnDataMhs.setText(rb.getString("btnMahasiswa"));
        btnDataMataKuliah.setText(rb.getString("btnMataKuliah"));

    }

    @FXML
    private void btnDataDosenOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(
                    "/layout/AddDataDosen.fxml"));
            loader.setResources(rb);
            BorderPane pane = loader.load();

            AddDataDosenController addDataDosenController = loader.
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
            Logger.getLogger(AddDataDosenController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void btnDataMhsOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(
                    "/layout/AddDataMahasiswa.fxml"));
            loader.setResources(rb);
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

    @FXML
    private void btnDataMataKuliahOnAction(ActionEvent event) {
    }

}
