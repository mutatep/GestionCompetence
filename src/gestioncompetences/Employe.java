/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mutatep
 */
public class Employe {
    
    private String identifiant;
    private String prenom;
    private String nom;
    private Date dateEntree;
    protected static Map<String, Employe> mapEmployes = new HashMap<String, Employe>();
    
    /**
     *
     * @param id : Identifiant de l'employé
     * @param prenom : Prénom de l'employé
     * @param nom : Nom d'un employé
     * @param dateE : Date d'entrée d'un employé
     */
    public Employe(String id, String prenom, String nom, Date dateE){
        this.identifiant = id;
        this.prenom = prenom;
        this.nom = nom;
        this.dateEntree = dateE;
        
        this.mapEmployes.put(this.identifiant, this);
    }
    
    public Employe(){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date d = null;
            
            String csvFile = "fichiers/liste_personnel.csv";
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] description = line.split(";");
                Employe employe = new Employe(description[3], description[0], description[1], simpleDateFormat.parse(description[2]));
            }
            br.close();
        }
        catch (IOException | ParseException ex) {
            Logger.getLogger(Employe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(this.mapEmployes.keySet());
    }
    
    /**
     *
     * @param e : Un employé à ajouter
     * @throws IllegalArgumentException
     */
    public void ajouterEmploye(Employe e) throws IllegalArgumentException{
        if (e != null)
            throw new IllegalArgumentException("La valeur de l'employé à ajouter est null");
        this.mapEmployes.put(e.getIdentifiant(), e);
    }
    
    public void supprimerEmployer(Employe e)throws IllegalArgumentException{
        if (e != null)
            throw new IllegalArgumentException("La valeur de l'employé à supprimer est null");
        this.mapEmployes.remove(e.getIdentifiant());
    }

    /**
     *
     * @return l'indentifiant d'un employé
     */
    public String getIdentifiant(){
        return this.identifiant;
    }
    
    public static void afficherMapemployes(){
        for(String s : Employe.mapEmployes.keySet()){
            System.out.print (s +  " : ");
            System.out.println(Employe.mapEmployes.get(s).identifiant + " -- " 
                    + Employe.mapEmployes.get(s).nom + " -- " 
                    +Employe.mapEmployes.get(s).prenom + " -- "
                    +Employe.mapEmployes.get(s).dateEntree);
             
        }
    }
    
}
