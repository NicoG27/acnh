package com.animalCrossing.animalCrossingWeb.Entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name="tiere")
public class TiereEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String art;
    private String name;
    private int monatvon;
    private int monatbis;
    private Time uhrzeitvon;
    private Time uhrzeitbis;
    private String ort;
    private int preis;
    private String hinweis;

    public TiereEntity(int id, String art, String name, int monatvon, int monatbis, Time uhrzeitvon, Time uhrzeitbis, String ort, int preis, String hinweis) {
        this.id = id;
        this.art = art;
        this.name = name;
        this.monatvon = monatvon;
        this.monatbis = monatbis;
        this.uhrzeitvon = uhrzeitvon;
        this.uhrzeitbis = uhrzeitbis;
        this.ort = ort;
        this.preis = preis;
        this.hinweis = hinweis;
    }

    public TiereEntity() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonatvon() {
        return monatvon;
    }

    public void setMonatvon(int monatVon) {
        this.monatvon = monatVon;
    }

    public int getMonatbis() {
        return monatbis;
    }

    public void setMonatbis(int monatBis) {
        this.monatbis = monatBis;
    }

    public Time getUhrzeitvon() {
        return uhrzeitvon;
    }

    public void setUhrzeitvon(Time uhrzeitVon) {
        this.uhrzeitvon = uhrzeitVon;
    }

    public Time getUhrzeitbis() {
        return uhrzeitbis;
    }

    public void setUhrzeitbis(Time uhrzeitBis) {
        this.uhrzeitbis = uhrzeitBis;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getHinweis() {
        return hinweis;
    }

    public void setHinweis(String hinweis) {
        this.hinweis = hinweis;
    }
}
