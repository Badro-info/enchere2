/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.Enchere;
import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author badro
 */
public class Inscription extends GridPane {

    private VuePrincipale main;

    private TextField tfNom;
    private TextField tfPrenom;
    private Button bOK;

    public Inscription(VuePrincipale main) {
        this.main = main;
        this.add(new Label("nom"), 0, 0);
        this.tfNom = new TextField();
        this.add(this.tfNom, 1, 0);
        this.add(new Label("prenom"), 0, 1);
        this.tfPrenom = new TextField();
        this.add(this.tfPrenom, 1, 1);
        this.bOK = new Button("OK");
        this.add(bOK, 0, 2, 2, 1);
        this.bOK.setOnAction((t) -> {
            String nom = tfNom.getText();
            String prenom = tfPrenom.getText();
            try {
                Enchere.createUtilisateur(this.main.getConnectBdD(), nom, prenom, nom+"@monmail", "passs", "67000");
            } catch (SQLException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("problem :");
                alert.setContentText(ex.getLocalizedMessage());
                alert.showAndWait();
            }
        });
    }

}
