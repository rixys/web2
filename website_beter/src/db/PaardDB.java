package db;

import model.Paard;

import java.util.ArrayList;

public class PaardDB {
    ArrayList<Paard>paarden;
    Paard een;
    Paard twee;
    Paard drie;

    public PaardDB() {
        this.een = new Paard(5,"dreambreaker","robin");

        this.twee = new Paard(5,"creatina","robin");
        this.drie = new Paard(5,"chippi","robin");

        this.paarden = new ArrayList<>();
        paarden.add(een);
        paarden.add(twee);
        paarden.add(drie);
    }

    public ArrayList<Paard> getPaarden() {
        return paarden;
    }
    public int getLargestLeeftijd() {
        int oudsteLeeftijd = 0;
        String oudsteNaam = "";
        //for (Paard paarden) {
        //    if (Paard.getLeeftijd() > oudsteLeeftijd) {
        //        oudsteLeeftijd = Paard.getLeeftijd();
        //        oudsteNaam = Paard.getNaam();
        //   }
        //}
        return oudsteLeeftijd;
    }

    public void addPaard(Paard newpaard) {
        paarden.add(newpaard);
    }
}
