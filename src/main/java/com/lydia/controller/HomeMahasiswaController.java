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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class HomeMahasiswaController implements Initializable {

    private ResourceBundle rb;
    @FXML
    private ImageView btnProfilMhs;
    @FXML
    private ImageView btnJadwalMhs;
    @FXML
    private ImageView btnDkbsMhs;
    @FXML
    private ImageView btnPerwalianMhs;
    @FXML
    private Button btnProfil;
    @FXML
    private Button btnJadwal;
    @FXML
    private Button btnDKBS;
    @FXML
    private Button btnPerwalian;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.setComponentOutputText(rb);
    }

    @FXML
    private void btnProfilMhsOnClick(MouseEvent event) {
    }

    @FXML
    private void btnJadwalMhsOnClick(MouseEvent event) {
    }

    @FXML
    private void btnDkbsMhsOnClick(MouseEvent event) {
    }

    @FXML
    private void btnPerwalianMhsOnClick(MouseEvent event) {
    }

    @FXML
    private void btnProfilMhsOnAction(ActionEvent event) {
    }

    @FXML
    private void btnJadwalOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDKBSOnAction(ActionEvent event) {
    }

    @FXML
    private void btnPerwalianOnAction(ActionEvent event) {
    }

    private void setComponentOutputText(ResourceBundle rb) {

        this.rb = rb;

        btnProfil.setText(rb.getString("btnProfil"));
        btnJadwal.setText(rb.getString("btnJadwal"));
        btnDKBS.setText(rb.getString("btnDKBS"));
        btnPerwalian.setText(rb.getString("btnPerwalian"));
    }

}
