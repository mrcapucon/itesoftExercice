/*
 * Copyright (c) 2016 Bull/Atos.
 * All rights reserved.
 */
package com.interview.demo.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.interview.demo.common.EntityColumnConstants;

/**
 * [Enter type description here].
 *
 * @author Bull/Atos
 */
@Entity
public class Frescoes {
    @Id
    @Column(name = EntityColumnConstants.ID_COLUMN_NAME)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private int codeInsee;

    private String categorie;

    private String etatOeuvre;

    private String photo;

    private String etatSupport;

    private String commentaire;

    private String support;

    private String anneeCreation;

    private String artiste;

    private String maitreOeuvre;

    private String proprietaire;

    private String mnemo;

    private String numPostale;

    private String section;

    private String parcelle;

    private String geoPoint;

    private String geoShape;

    private String nomRue;

    public Long getId() {
        return id;
    }

    public Frescoes setId(final Long id) {
        this.id = id;
        return this;
   }

    public int getCodeInsee() {
        return codeInsee;
    }

    public Frescoes setCodeInsee(final int codeInsee) {
        this.codeInsee = codeInsee;
        return this;
    }

    public String getCategorie() {
        return categorie;
    }

    public Frescoes setCategorie(final String categorie) {
        this.categorie = categorie;
        return this;
    }

    public String getEtatOeuvre() {
        return etatOeuvre;
    }

    public Frescoes setEtatOeuvre(final String etatOeuvre) {
        this.etatOeuvre = etatOeuvre;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Frescoes setPhoto(final String photo) {
        this.photo = photo;
        return this;
    }

    public String getEtatSupport() {
        return etatSupport;
    }

    public Frescoes setEtatSupport(final String etatSupport) {
        this.etatSupport = etatSupport;
        return this;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Frescoes setCommentaire(final String commentaire) {
        this.commentaire = commentaire;
        return this;
    }

    public String getSupport() {
        return support;
    }

    public Frescoes setSupport(final String support) {
        this.support = support;
        return this;
    }

    public String getAnneeCreation() {
        return anneeCreation;
    }

    public Frescoes setAnneeCreation(final String anneeCreation) {
        this.anneeCreation = anneeCreation;
        return this;
    }

    public String getArtiste() {
        return artiste;
    }

    public Frescoes setArtiste(final String artiste) {
        this.artiste = artiste;
        return this;
    }

    public String getMaitreOeuvre() {
        return maitreOeuvre;
    }

    public Frescoes setMaitreOeuvre(final String maitreOeuvre) {
        this.maitreOeuvre = maitreOeuvre;
        return this;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public Frescoes setProprietaire(final String proprietaire) {
        this.proprietaire = proprietaire;
        return this;
    }

    public String getMnemo() {
        return mnemo;
    }

    public Frescoes setMnemo(final String mnemo) {
        this.mnemo = mnemo;
        return this;
    }

    public String getNumPostale() {
        return numPostale;
    }

    public Frescoes setNumPostale(final String numPostale) {
        this.numPostale = numPostale;
        return this;
    }

    public String getSection() {
        return section;
    }

    public Frescoes setSection(final String section) {
        this.section = section;
        return this;
    }

    public String getParcelle() {
        return parcelle;
    }

    public Frescoes setParcelle(final String parcelle) {
        this.parcelle = parcelle;
        return this;
    }

    public String getGeoPoint() {
        return geoPoint;
    }

    public Frescoes setGeoPoint(final String geoPoint) {
        this.geoPoint = geoPoint;
        return this;
    }

    public String getGeoShape() {
        return geoShape;
    }

    public Frescoes setGeoShape(final String geoShape) {
        this.geoShape = geoShape;
        return this;
    }

    public String getNomRue() {
        return nomRue;
    }

    public Frescoes setNomRue(final String nomRue) {
        this.nomRue = nomRue;
        return this;
    }
}
