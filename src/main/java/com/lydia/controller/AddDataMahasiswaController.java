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
public class AddDataMahasiswaController implements Initializable {

    @FXML
    private Label lblSistemAkademikSederhana;
    @FXML
    private TableView<?> tableMhs;
    @FXML
    private TableColumn<?, ?> colAcademicYearMhs;
    @FXML
    private TableColumn<?, ?> colIdMhs;
    @FXML
    private TableColumn<?, ?> colNameMhs;
    @FXML
    private TableColumn<?, ?> colPasswordMhs;
    @FXML
    private Label lblNameMhs;
    @FXML
    private TextField txtNamaMhs;
    @FXML
    private Label lblPasswordMhs;
    @FXML
    private PasswordField txtPasswordMhsAccess;
    @FXML
    private Button btnSaveMahasiswa;
    @FXML
    private Button btnUpdateMahasiswa;
    @FXML
    private Button btnDeleteMahasiswa;
    @FXML
    private Label txtVerifyPassword;
    @FXML
    private PasswordField txtVerifyPasswordMhs;
    @FXML
    private ComboBox<?> comboAcademicYearMhs;
    @FXML
    private Label lblFaculty;
    @FXML
    private Label lblAcademicYear;
    @FXML
    private ComboBox<?> comboFacultyMhs;
    @FXML
    private ComboBox<?> comboDepartmentMhs;
    @FXML
    private Label lblDepartement;
    @FXML
    private Label lblMahasiswa;
    @FXML
    private BorderPane bpMahasiswa;

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
    private void btnSaveMahasiswaAction(ActionEvent event) {
    }

    @FXML
    private void btnUpdateMahasiswaAction(ActionEvent event) {
    }

    @FXML
    private void btnDeleteMahasiswaAction(ActionEvent event) {
    }

}
