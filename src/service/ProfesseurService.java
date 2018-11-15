/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Professeur;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author outah
 */
public class ProfesseurService {

    public Professeur findById(String idProf, List<Professeur> profs){
        for (int i = 0; i < profs.size(); i++) {
            if(profs.get(i).getId().equals(idProf)){
                return profs.get(i);
            }
        }
        return null;
    }
    
    public Professeur findByAnciennete(List<Professeur> profs){
        double maxAnciennete = profs.get(0).getAniciennete();
        int tab[] = {1,33,223,455};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        
        Professeur plusAncien = profs.get(0);
        for (int i = 1; i < profs.size(); i++) {
            if(profs.get(i).getAniciennete()>maxAnciennete){
                maxAnciennete = profs.get(i).getAniciennete();
                plusAncien = profs.get(i);
            }
        }
        return plusAncien;
    }
    
    public List<Professeur> findByGrade(String grade, List<Professeur> profs){
        List<Professeur> gradeListes = new ArrayList<>();
        for (int i = 0; i < profs.size(); i++) {
            if(grade.equals(profs.get(i).getGrade())){
                gradeListes.add(profs.get(i));
            }
        }
        return gradeListes;
    }
    public List<Professeur> findByDepartement(String departement, List<Professeur> profs){
        List<Professeur> departementListes = new ArrayList<>();
        for (int i = 0; i < profs.size(); i++) {
            if(departement.equals(profs.get(i).getBureau().getDepartement())){
                departementListes.add(profs.get(i));
            }
        }
        return departementListes;
    }
    public boolean isCollocataire(String idProf1, String idProf2, List<Professeur> profs){
        Professeur p1 = findById(idProf1, profs);
        Professeur p2 = findById(idProf2, profs);
        if(p1.getBureau().getId() == p2.getBureau().getId()){
            return true;
        }else{
            return false;
        }
    }
    public int countDesk(int etage, List<Professeur> profs){
        int cmp =0;
        for (int i = 0; i < profs.size(); i++) {
            if(profs.get(i).getBureau().getEtage() == etage){
                cmp++;
            }
        }
        return cmp;
    }
    
    public boolean swich(String idprof1, String idProf2, List<Professeur> profs){
        
    }
   
}
