/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.Enchere;
import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import java.sql.SQLException;
import java.sql.Timestamp;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author badro
 */
public class proposer extends GridPane{
    private VuePrincipale main;
//caracteristique pour pouvoir s'inscrire
    private TextField tfdescription;
    private TextField tftitre;
    private TextField tfcategorie;
    private TextField tfproposerpar;
    private TextField tfdatefin;
    private TextField tfdebut;
    private TextField tfprixbase;
//    boutton pour valider l'inscription
    private Button bOK;
//    private Button bcategorie;
    
    public proposer(VuePrincipale main) {
        this.main = main;
        this.add(new Label("Categorie"), 0, 0);
        this.tfcategorie = new TextField();
        this.add(this.tfcategorie, 1, 0);
        this.add(new Label("proposer Par"), 0, 1);
        this.tfproposerpar = new TextField();
        this.add(this.tfproposerpar, 1, 1);
        this.add(new Label("Description"), 0, 2);
        this.tfdescription = new TextField();
        this.add(this.tfdescription, 1, 2);
        this.add(new Label("Titre"), 0, 3);
        this.tftitre = new TextField();
        this.add(this.tftitre, 1, 3);
        this.add(new Label("date de fin (jj/mm/aaaa)"), 0, 4);
        this.tfdatefin = new TextField();
        this.add(this.tfdatefin, 1, 4);
        this.add(new Label("datedebut"), 0, 5);
        this.add(new Label("Prix Base"), 0, 6);
        this.tfprixbase = new TextField();
        this.add(this.tfprixbase, 1, 6);
        this.bOK = new Button("OK");
        this.add(bOK, 0, 7, 2, 1);
        this.bOK.setOnAction((t) -> {
            //je prend les donnees entrees par l'utilisateur
//            String descriptionCourte = tfdescriptioncourte.getText();
//            String descriptiondetaille = tfdescriptiondetaille.getText();
            String sdate = tfdatefin.getText();
            String[] jma = sdate.split("/");
            int jour = Integer.parseInt(jma[0]);
            int mois = Integer.parseInt(jma[1]);
            int annee = Integer.parseInt(jma[2]);
            Timestamp dateFin = new Timestamp(annee, mois,jour, 0, 0, 0, 0);
            int prixbase = Integer.parseInt(tfprixbase.getText());  // String -- int
            Timestamp datedebut = new Timestamp(System.currentTimeMillis());  // timestamp actuel
            String Titre = tftitre.getText();
            String Description = tfdescription.getText();
            int Categorie = Integer.parseInt(tfcategorie.getText());
            int ProposerPar = this.main.getUtilisateurCourant();
            try {
//                je me connecte a la base de donnee pour pouvoir les souvegarder ladans tout en faisant des exceptions
                Enchere.createObjet(this.main.getConnectBdD(), Titre, Description, datedebut, dateFin, prixbase, Categorie, ProposerPar);
            } catch (SQLException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("problem :");
                alert.setContentText(ex.getLocalizedMessage());
                alert.showAndWait();
            }
        });
    }
    
}
