package com.carlosamaral.animals.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "animal")
public class AnimalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    public String name;

    @NotNull
    public String about;

    @NotNull
    public String location;

    @NotNull
    public String urlImage;

    @NotNull
    public String urlAbout;

    @NotNull
    public Double height;

    @NotNull
    public Double weight;

    @NotNull
    public Double width;

    @NotNull
    public Double vel;

    @NotNull
    public Integer maxage;

    @NotNull
    public String scientificname;

    @NotNull
    public String reino;

    @NotNull
    public String filo;

    @NotNull
    public String classe;

    @NotNull
    public String ordem;

    @NotNull
    public String family;

    @NotNull
    public String gender;

    public String similars;


    // GETTER AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlAbout() {
        return urlAbout;
    }

    public void setUrlAbout(String urlAbout) {
        this.urlAbout = urlAbout;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getVel() {
        return vel;
    }

    public void setVel(Double vel) {
        this.vel = vel;
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }

    public String getScientificname() {
        return scientificname;
    }

    public void setScientificname(String scientificname) {
        this.scientificname = scientificname;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSimilars() {
        return similars;
    }

    public void setSimilars(String similars) {
        this.similars = similars;
    }

    // TO STRING

    @Override
    public String toString() {
        return "AnimalModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", location='" + location + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", urlAbout='" + urlAbout + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", width=" + width +
                ", vel=" + vel +
                ", maxage=" + maxage +
                ", scientificname='" + scientificname + '\'' +
                ", reino='" + reino + '\'' +
                ", filo='" + filo + '\'' +
                ", classe='" + classe + '\'' +
                ", order='" + ordem + '\'' +
                ", family='" + family + '\'' +
                ", gender='" + gender + '\'' +
                ", similars='" + similars + '\'' +
                '}';
    }
}
