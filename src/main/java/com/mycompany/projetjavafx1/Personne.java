/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetjavafx1;

import java.time.LocalDateTime;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Etu
 */
public class Personne {
    
    private final StringProperty login = new SimpleStringProperty();
    private final StringProperty password = new SimpleStringProperty();
    private final StringProperty nom = new SimpleStringProperty();
    private final StringProperty adresse1 = new SimpleStringProperty();
    private final StringProperty adresse2 = new SimpleStringProperty();
    private final StringProperty villeCP = new SimpleStringProperty();
    private final StringProperty tel1 = new SimpleStringProperty();
    private final StringProperty yeux = new SimpleStringProperty();
    private final StringProperty peau = new SimpleStringProperty();
    private final IntegerProperty longueur = new SimpleIntegerProperty();
    private final IntegerProperty largeur = new SimpleIntegerProperty();

    public String getLogin(){
        return login.get();
    }
    public String getYeux(){
        return yeux.get();
    }
    public String getNom(){
       return nom.get();
    }
    public String getAdresse(){
        return adresse1.get();
    }
    public StringProperty yeuxProperty(){
        return yeux;
    }
    public String getPeau(){
        return peau.get();
    }
    public StringProperty peauProperty(){
        return peau;
    }
    
    public Integer getLongueur(){
        return longueur.get();
    }
    public IntegerProperty longueurProperty(){
        return longueur;
    }
    
    public Integer getLargeur(){
        return largeur.get();
    }
    public IntegerProperty largeurProperty(){
        return largeur;
    }
    
    
    public void setLogin(String value){
        login.set(value);
    }
    
    public StringProperty loginProperty(){
        return login;
    }
    
    public Personne(String login, String password, String nom, String adresse1, String adresse2, String tel1){
        this.login.set(login);
        this.password.set(password);
        this.nom.set(nom);
        this.adresse1.set(adresse1);
        this.adresse2.set(adresse2);
        this.tel1.set(tel1);
    }
    
    public boolean checkPassword(String login, String password){
        return login.equals(this.login.getValue()) && password.equals(this.password.getValue());
    }
    
    private final ObjectProperty<LocalDateTime> derniereConnexion = new SimpleObjectProperty();
    
    public final LocalDateTime getDerniereConnexion(){
        return derniereConnexion.get();
    }
    
    public final void setDerniereConnexion(LocalDateTime value){
        derniereConnexion.set(value);
    }
    
    public ObjectProperty<LocalDateTime> derniereConnexionProperty(){
        return derniereConnexion;
    }

}

