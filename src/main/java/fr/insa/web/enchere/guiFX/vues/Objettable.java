/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 *
 * @author badro
 */
public class Objettable extends TableView{
    
    
//    private VuePrincipale main;
//    
//    private ObservableList<Objet> objet;
//    
//    public UtilisateurTable(VuePrincipale main,List<Objet> Objet) {
//        this.main = main;
//        this.Objet = FXCollections.observableArrayList(Objet);
//        
//        this.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//        
//        TableColumn<Objet,String> cCategorie = 
//                new TableColumn<>("Categorie");
//        TableColumn<Objet,String> cDescription = 
//                new TableColumn<>("Description");
//        this.getColumns().addAll(cCategorie,cDescription);
//        
//        // si l'on ne veut pas d'espace supplémentaire
//        this.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
//        
//        cCategorie.setCellValueFactory(new PropertyValueFactory<>("Categorie"));
//        cDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
//        this.setItems(this.Objet);
//    }
//
//    public List<Objet> getObjet() {
//        return this.Objet;
//    }
//    
//    public List<Objet> getSelectedUsers() {
//        return this.getSelectionModel().getSelectedItems();
//    }
//    
//    public void addUsers(List<Objet> users) {
//        this.getItems().addAll(users);
//    }
//    
//    public void removeUsers(List<Objet> users) {
//        this.getItems().removeAll(users);
//    }
}
