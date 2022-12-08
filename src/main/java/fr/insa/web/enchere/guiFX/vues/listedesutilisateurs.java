/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.Enchere;
import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import java.sql.SQLException;
import javafx.scene.layout.VBox;

/**
 *
 * @author badro
 */
public class listedesutilisateurs extends VBox{
    
    private VuePrincipale main;
    
    private utilisateurTable vgAllUsers;

//    public listedesutilisateurs(VuePrincipale main) {
//        this.main = main;
//        this.getChildren().add(new BigLabel("liste de tous les utilisateurs",30));
//        try {
//            this.vgAllUsers = new utilisateurTable(this.main,
//                    Enchere.tousLesUtilisateurs(this.main.getSessionInfo().getConBdD()));
//            this.getChildren().add(this.vgAllUsers);
//        } catch (SQLException ex) {
//            this.getChildren().add(new BigLabel("Problème BdD : " + ex.getLocalizedMessage(),30));
//        }
//    }
    
}
