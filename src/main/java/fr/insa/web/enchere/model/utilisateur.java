/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.model;

/**
 *
 * @author badro
 */
public class utilisateur {
     private final int id;
    private String nom;
    private String pass;
    private String nomRole;

    public utilisateur(int id, String nom, String pass, String nomRole) {
        this.id = id;
        this.nom = nom;
        this.pass = pass;
        this.nomRole = nomRole;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNomRole() {
        return nomRole;
    }
}
