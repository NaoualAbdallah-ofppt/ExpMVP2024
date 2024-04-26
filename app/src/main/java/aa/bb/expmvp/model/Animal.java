package aa.bb.expmvp.model;

import java.util.ArrayList;

public class Animal {
    private int num;
    private String nom;
    private Double prix;
    public Animal(int num, String nom, Double prix) {
        this.num = num;
        this.nom = nom;
        this.prix = prix;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }
    public Double getPrix() {
        return prix;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public static ArrayList<Animal> getAnimals()
    {
        ArrayList<Animal> lst = new ArrayList<>();
        Animal A1= new Animal(1,"chat",300.0 );
        Animal A2= new Animal(2,"chien",500.0 );
        Animal A3= new Animal(3,"vache",5000.0 );
        lst.add(A1);
        lst.add(A2);
        lst.add(A3);
        return lst;
    }
}
