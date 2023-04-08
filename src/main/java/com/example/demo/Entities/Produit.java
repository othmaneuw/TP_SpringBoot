package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
	private Integer reference;
	
	@Column(length=20)
	private String designation;
	
	private double prix;
	private int qte;
	public Produit(Integer reference, String designation, double prix, int qte) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.qte = qte;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getReference() {
		return reference;
	}
	public void setReference(Integer reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", designation=" + designation + ", prix=" + prix + ", qte=" + qte
				+ "]";
	}
	
	

}
