/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.model;

import javafx.scene.control.TextField;

/**
 *
 * @author badro
 */
public class Objet {
    
    private int id;
    private String titre;
    private String description;
    private String debut;
    private String fin;
    private int prixbase;
    private String nomU;

    public Objet(int id, String titre, String description, String debut, String fin, int prixbase, String nomU) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.debut = debut;
        this.fin = fin;
        this.prixbase = prixbase;
        this.nomU = nomU;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the debut
     */
    public String getDebut() {
        return debut;
    }

    /**
     * @param debut the debut to set
     */
    public void setDebut(String debut) {
        this.debut = debut;
    }

    /**
     * @return the fin
     */
    public String getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(String fin) {
        this.fin = fin;
    }

    /**
     * @return the prixbase
     */
    public int getPrixbase() {
        return prixbase;
    }

    /**
     * @param prixbase the prixbase to set
     */
    public void setPrixbase(int prixbase) {
        this.prixbase = prixbase;
    }

    /**
     * @return the nomU
     */
    public String getNomU() {
        return nomU;
    }

    /**
     * @param nomU the nomU to set
     */
    public void setNomU(String nomU) {
        this.nomU = nomU;
    }



}

            
    
    

