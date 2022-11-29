/*
    Copyright 2000- Francois de Bertrand de Beuvron

    This file is part of CoursBeuvron.

    CoursBeuvron is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    CoursBeuvron is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CoursBeuvron.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insa.badreddine.enchere.guifx;

import fr.insa.badreddine.enchere.Enchere;
import fr.insa.web.enchere.guiFX.vues.entetelogin;
import fr.insa.web.enchere.sessioninfo.SessionInfo;
import java.sql.Connection;
import java.sql.SQLException;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

/**
 * vue principale.
 *
 * @author francois
 */
public class VuePrincipale extends BorderPane {
    
    private Connection connectBdD;
    private int utilisateurCourant;
    private ScrollPane mainContent;
    
    public void setEntete(Node c) {
        this.setTop(c);
    }
    
    public void setMainContent(Node c) {
        this.mainContent.setContent(c);
    }
    
    public VuePrincipale() {
        try {
            this.utilisateurCourant = -1;
            this.connectBdD = Enchere.defautConnect(); //e me connecte d'abord a la base de donnee
            this.mainContent = new ScrollPane();
            this.setCenter(this.mainContent);
            this.setTop(new entetelogin(this)); // j'integre entetelogin dans ma vue principale
//            this.setTop(new enteteboutons(this));
        } catch (ClassNotFoundException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("pas de driver");
            alert.showAndWait();
        } catch (SQLException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("problem :");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
//         this.setMainContent(new Inscription(this));

// this.sessioninfo = new Sessioninfo();
//        this.mainContent = new ScrollPane();
//        this.setCenter(this.mainContent);
//        JavaFXUtils.addSimpleBorder(this.mainContent);
//         try {
//            this.sessionInfo.setConBdD(GestionBdD.defautConnect());
//            this.setEntete(new EnteteInitialLogin(this));
//            this.setMainContent(new BienvenueMainVue(this));
//        } catch (ClassNotFoundException | SQLException ex) {
//            this.setMainContent(new BdDNonAccessible(this));
//        }
//        
//    }
//
//    /**
//     * @return the sessionInfo
//     */
//    public SessionInfo getSessionInfo() {
//        return sessionInfo;
//    }
    }

    /**
     * @return the connectBdD
     */
    public Connection getConnectBdD() {
        return connectBdD;
    }

    /**
     * @return the utilisateurCourant
     */
    public int getUtilisateurCourant() {
        return utilisateurCourant;
    }

    /**
     * @param utilisateurCourant the utilisateurCourant to set
     */
    public void setUtilisateurCourant(int utilisateurCourant) {
        this.utilisateurCourant = utilisateurCourant;
    }
    
}
