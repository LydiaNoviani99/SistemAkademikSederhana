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

/**
 * FXML Controller class
 *
 * @author USER
 */
public class HomeKaprodiController implements Initializable {

    private ResourceBundle rb;
    @FXML
    private Button btnMataKuliah;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.setComponentOutputText(rb);
    }

    @FXML
    private void btnDataMataKuliahOnAction(ActionEvent event) {
    }

    private void setComponentOutputText(ResourceBundle rb) {
        this.rb = rb;

        btnMataKuliah.setText(rb.getString("btnMataKuliah"));
    }

}
