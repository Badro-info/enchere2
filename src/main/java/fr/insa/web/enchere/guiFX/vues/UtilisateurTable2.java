/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import fr.insa.web.enchere.model.utilisateur;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author badro
 */
public class UtilisateurTable2 extends TableView {
    
    private VuePrincipale main;
    
    private ObservableList<utilisateur> utilisateurs;
    
    public UtilisateurTable2(VuePrincipale main,List<utilisateur> utilisateurs) {
        this.main = main;
        this.utilisateurs = FXCollections.observableArrayList(utilisateurs);
        
        this.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        TableColumn<utilisateur,String> cNom = 
                new TableColumn<>("nom");
        TableColumn<utilisateur,String> cEmail = 
                new TableColumn<>("email");
        this.getColumns().addAll(cNom,cEmail);
        
        // si l'on ne veut pas d'espace supplémentaire
        this.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        
        cNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        cEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.setItems(this.utilisateurs);
    }

    public List<utilisateur> getUtilisateurs() {
        return this.utilisateurs;
    }
    
    public List<utilisateur> getSelectedUsers() {
        return this.getSelectionModel().getSelectedItems();
    }
    
    public void addUsers(List<utilisateur> users) {
        this.getItems().addAll(users);
    }
    
    public void removeUsers(List<utilisateur> users) {
        this.getItems().removeAll(users);
    }
    
}

