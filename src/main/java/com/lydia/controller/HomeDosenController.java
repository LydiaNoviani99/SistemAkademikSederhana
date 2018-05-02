/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class HomeDosenController implements Initializable {

    private ResourceBundle rb;

    @FXML
    private Button btnJadwal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.setComponentOutputText(rb);
    }

    @FXML
    private void btnJadwalDosenOnClick(MouseEvent event) {
    }

    @FXML
    private void btnJadwalDosenOnAction(ActionEvent event) {
    }

    private void setComponentOutputText(ResourceBundle rb) {

        this.rb = rb;
        btnJadwal.setText(rb.getString("btnJadwal"));
    }

}
