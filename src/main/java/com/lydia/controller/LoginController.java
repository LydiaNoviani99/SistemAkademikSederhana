/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.controller;

import com.lydia.MainApp;
import com.lydia.utility.TextUtil;
import static com.lydia.utility.ViewUtil.showAlert;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LoginController implements Initializable {

    private ResourceBundle rb;
    @FXML
    private BorderPane bpLogin;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private ImageView imgLogo;
    @FXML
    private Label lblUsername;
    @FXML
    private Label lblPassword;
    @FXML
    private Label lblJudulLogin;
    @FXML
    private Label lblKeterangan;
    @FXML
    private Label lblCopyright;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.setComponentOutputText(rb);
    }

    @FXML
    private void btnLoginAction(ActionEvent event) {
        if (!TextUtil.isEmptyField(txtUsername, txtPassword)) {
            if (TextUtil.isNumber(txtUsername.getText().trim())) {
                if (txtUsername.getText().equalsIgnoreCase("1")) {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(MainApp.class.getResource(
                                "/layout/HomeAdmin.fxml"));
                        loader.
                                setResources(rb);
                        BorderPane pane = loader.load();
                        HomeAdminController homeAdminController = loader.
                                getController();
                        Scene scene = new Scene(pane);
                        Stage secondStage = new Stage();
                        secondStage.setScene(scene);
                        secondStage.setTitle(rb.getString("titleHomeAdmin"));
                        secondStage.initOwner(bpLogin.getScene().getWindow());
                        secondStage.initModality(Modality.WINDOW_MODAL);

                        secondStage.show();
                    } catch (IOException ex) {
                        Logger.getLogger(AddDataMahasiswaController.class.
                                getName()).
                                log(Level.SEVERE, null, ex);
                    }
                } else if (txtUsername.getText().equalsIgnoreCase("2")) {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(MainApp.class.getResource(
                                "/layout/HomeKaprodi.fxml"));
                        loader.
                                setResources(rb);
                        BorderPane pane = loader.load();
                        HomeKaprodiController homeKaprodiController = loader.
                                getController();
                        Scene scene = new Scene(pane);
                        Stage secondStage = new Stage();
                        secondStage.setScene(scene);
                        secondStage.setTitle(rb.getString("titleHomeKaprodi"));
                        secondStage.initOwner(bpLogin.getScene().getWindow());
                        secondStage.initModality(Modality.WINDOW_MODAL);

                        secondStage.show();
                    } catch (IOException ex) {
                        Logger.getLogger(AddDataMahasiswaController.class.
                                getName()).
                                log(Level.SEVERE, null, ex);
                    }
                } else if (txtUsername.getText().equalsIgnoreCase("3")) {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(MainApp.class.getResource(
                                "/layout/HomeDosen.fxml"));
                        loader.
                                setResources(rb);
                        BorderPane pane = loader.load();
                        HomeDosenController homeDosenController = loader.
                                getController();
                        Scene scene = new Scene(pane);
                        Stage secondStage = new Stage();
                        secondStage.setScene(scene);
                        secondStage.setTitle(rb.getString("titleHomeDosen"));
                        secondStage.initOwner(bpLogin.getScene().getWindow());
                        secondStage.initModality(Modality.WINDOW_MODAL);

                        secondStage.show();
                    } catch (IOException ex) {
                        Logger.getLogger(AddDataMahasiswaController.class.
                                getName()).
                                log(Level.SEVERE, null, ex);
                    }
                } else if (txtUsername.getText().equalsIgnoreCase("4")) {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(MainApp.class.getResource(
                                "/layout/HomeMahasiswa.fxml"));
                        loader.
                                setResources(rb);
                        BorderPane pane = loader.load();
                        HomeMahasiswaController homeMahasiswaController
                                = loader.
                                        getController();
                        Scene scene = new Scene(pane);
                        Stage secondStage = new Stage();
                        secondStage.setScene(scene);
                        secondStage.setTitle(rb.getString("titleHomeMhs"));
                        secondStage.initOwner(bpLogin.getScene().getWindow());
                        secondStage.initModality(Modality.WINDOW_MODAL);

                        secondStage.show();
                    } catch (IOException ex) {
                        Logger.getLogger(AddDataMahasiswaController.class.
                                getName()).
                                log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            showAlert(rb.getString("alertLogin.head"), "alertLogin.content",
                    Alert.AlertType.ERROR
            );

        }
    }

    private void setComponentOutputText(ResourceBundle rb) {

        this.rb = rb;

        lblJudulLogin.setText(rb.getString("lblJudulLogin.text"));
        lblKeterangan.setText(rb.getString("lblKeterangan.text"));
        lblUsername.setText(rb.getString("lblUsername.text"));
        lblPassword.setText(rb.getString("lblPassword.text"));
        btnLogin.setText(rb.getString("btnLogin.text"));
        lblCopyright.setText(rb.getString("lblCopyright.text"));

    }
}
