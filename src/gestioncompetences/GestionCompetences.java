/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompetences;

/**
 *
 * @author mutatep
 */
public class GestionCompetences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //"fichiers/liste_personnel.csv";
        
        FichierCsv fichier = new FichierCsv();
        System.out.println("Les Employés : ");
        Employe.afficherMapemployes();
        System.out.println("Les Compétences : ");
        Competence.afficherMapCompetences();
    }
    
}
