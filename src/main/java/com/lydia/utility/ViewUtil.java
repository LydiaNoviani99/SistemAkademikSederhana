/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lydia.utility;

import javafx.scene.control.Alert;

/**
 *
 * @author USER
 */
public class ViewUtil {

    public static void showAlert(String header,
            String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setContentText(content);
        alert.setHeaderText(header);
        alert.showAndWait();
    }

}
