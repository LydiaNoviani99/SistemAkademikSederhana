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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AddDataDosenController implements Initializable {

    @FXML
    private BorderPane bpUser;
    @FXML
    private Label lblSistemAkademikSederhana;
    @FXML
    private TableView<?> tableUser;
    @FXML
    private TableColumn<?, ?> colId;
    @FXML
    private TableColumn<?, ?> colName;
    @FXML
    private TableColumn<?, ?> colPassword;
    @FXML
    private Label lblNameDosen;
    @FXML
    private TextField txtNamaDosen;
    @FXML
    private Label lblPasswordDosen;
    @FXML
    private PasswordField txtPasswordAccessDosen;
    @FXML
    private Button btnSaveDosen;
    @FXML
    private Button btnUpdateDosen;
    @FXML
    private Button btnDeleteDosen;
    @FXML
    private Label lblVerPasswordDosen;
    @FXML
    private PasswordField txtVerifyPasswordDosen;
    @FXML
    private Label lblFacultyDosen;
    @FXML
    private ComboBox<?> comboFacultyDosen;
    @FXML
    private ComboBox<?> comboDepartmenDosen;
    @FXML
    private Label lblDepartementDosen;
    @FXML
    private Label lblDosen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void tableMahasiswaOnClicked(MouseEvent event) {
    }

    @FXML
    private void btnSaveDosenAction(ActionEvent event) {
    }

    @FXML
    private void btnUpdateDosenAction(ActionEvent event) {
    }

    @FXML
    private void btnDeleteDosenAction(ActionEvent event) {
    }

}
