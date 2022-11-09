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
//caracteristique pour pouvoir s'inscrire
    private TextField tfNom;
    private TextField tfPrenom;
    private TextField tfemail;
    private TextField tfpass;
    private TextField tfcodepostal;
//    boutton pour valider l'inscription
    private Button bOK;

    public Inscription(VuePrincipale main) {
        this.main = main;
        this.add(new Label("nom"), 0, 0);
        this.tfNom = new TextField();
        this.add(this.tfNom, 1, 0);
        this.add(new Label("prenom"), 0, 1);
        this.tfPrenom = new TextField();
        this.add(this.tfPrenom, 1, 1);
        this.add(new Label("email"), 0, 2);
        this.tfemail = new TextField();
        this.add(this.tfemail, 1, 2);
        this.add(new Label("Password"), 0, 3);
        this.tfpass = new TextField();
        this.add(this.tfpass, 1, 3);
        this.add(new Label("Code.Postale"), 0, 4);
        this.tfcodepostal = new TextField();
        this.add(this.tfcodepostal, 1, 4);
        this.bOK = new Button("OK");
        this.add(bOK, 0, 5, 2, 1);
        this.bOK.setOnAction((t) -> {
            //je prend les donnees entrees par l'utilisateur
            String nom = tfNom.getText();
            String prenom = tfPrenom.getText();
            String email = tfemail.getText();
            String password = tfpass.getText();
            String codepostal = tfcodepostal.getText();
            try {
//                je me connecte a la base de donnee pour pouvoir les souvegarder ladans tout en faisant des exceptions
                Enchere.createUtilisateur(this.main.getConnectBdD(), nom, prenom, email, password, codepostal);
            } catch (SQLException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("problem :");
                alert.setContentText(ex.getLocalizedMessage());
                alert.showAndWait();
            }
        });
    }

}
