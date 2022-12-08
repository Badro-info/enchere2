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
public class utilisateurTable {
    public class UtilisateurTable extends TableView {
    
    private VuePrincipale main;
    
    private ObservableList<utilisateur> utilisateurs;
    
    public UtilisateurTable(VuePrincipale main,List<utilisateur> utilisateurs) {
        this.main = main;
        this.utilisateurs = FXCollections.observableArrayList(utilisateurs);
        
        this.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        TableColumn<utilisateur,String> cNom = 
                new TableColumn<>("nom");
        TableColumn<utilisateur,String> cRole = 
                new TableColumn<>("role");
        this.getColumns().addAll(cNom,cRole);
        
        // si l'on ne veut pas d'espace supplémentaire
        this.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        
        cNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        cRole.setCellValueFactory(new PropertyValueFactory<>("nomRole"));
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
}
