/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.model;

/**
 *
 * id integer not null primary key
                          generated always as identity,
                        nom varchar(100) not null unique,
                        prenom varchar(50) not null,
                        email varchar(100) not null unique,
                        pass varchar(50) not null,
                        codepostal varchar(30) not null
 * @author badro
 */
public class utilisateur {

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the codepostal
     */
    public String getCodepostal() {
        return codepostal;
    }
     private final int id;
    private String nom;
    private String email;
    private String pass;
    private String codepostal;
//    private String nomRole;

    public utilisateur(int id, String nom, String email, String pass, String codepostal) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.pass = pass;
        this.codepostal = codepostal;
//        this.nomRole = nomRole;
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

//    public String getNomRole() {
//        return nomRole;
//    }
}
