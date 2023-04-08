package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    //Definir une methode qui permet de chercher les produits par mot cle
	/*@Query("select p from Produit p where p.designation like %:x%");
	List<Produit> ChercherParMc(@Param("x")String Mc); */
	
	//Equivalente de chercherParMc juste que hadi mn smiya kay3rf chno ydir
	List<Produit> findByDesignationContains(String Mc);
}
