/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author outah
 */
public class Professeur implements Cloneable{

    private String id;
    private double salaire;
    private String grade;
    private double aniciennete;
    private Bureau bureau;

    static int cmp = 0;

    public Professeur() {
    }

    public Professeur(double salaire, String grade, double aniciennete, Bureau bureau) {
        this.salaire = salaire;
        this.grade = grade;
        this.aniciennete = aniciennete;
        this.bureau = bureau;
        this.id = "P"+generatedId();
    }

    public int generatedId() {
        cmp++;
        return cmp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getGrade() {
        return grade;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getAniciennete() {
        return aniciennete;
    }

    public void setAniciennete(double aniciennete) {
        this.aniciennete = aniciennete;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    @Override
    public String toString() {
        return "Professeur{" + "id=" + id + ", salaire=" + salaire + ", grade=" + grade + ", aniciennete=" + aniciennete + ", bureau=" + bureau + '}';
    }

}
