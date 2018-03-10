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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Récupération des données dans un fichier csv
 * @author mutatep
 */
public class FichierCsv implements Fichier{
    
    private String[] mots;
    
    public void chargerDonnees(String csvFile){
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = br.readLine();
            
            while ((line = br.readLine()) != null) {
                mots = line.split(";");
                if(csvFile.contains("liste_personnel"))
                    this.chargerDonneesEmployes();
                
                if(csvFile.contains("liste_competences"))
                    this.chargerDonneesCompetences();
                
                if(csvFile.contains("competences_personnel"))
                    this.chargerDonneesCompetencesPersonnel();
            }
            br.close();
        }
        catch (IOException | ParseException  ex) {
            Logger.getLogger(Employe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void chargerDonneesEmployes() throws ParseException{
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Employe employe = new Employe(Integer.parseInt(this.mots[3]), this.mots[0], this.mots[1], date.parse(this.mots[2]));
    }
    
    private void chargerDonneesCompetences() throws ParseException{
        Competence comptetence = new Competence(this.mots[0],this.mots[2],this.mots[1]);
    }
    
    private void chargerDonneesCompetencesPersonnel() throws ParseException{
        for(Integer s : Entreprise.getMapEmployes().keySet())
            if(Integer.parseInt(this.mots[0]) == s)
                for(int i = 1; i<this.mots.length; i++)
                    Entreprise.getMapEmployes().get(s).ajouterCompetence(Competence.getMapCompetences().get(this.mots[i]));
    }
    
}
