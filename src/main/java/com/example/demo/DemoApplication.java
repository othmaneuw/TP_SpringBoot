package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.DAO.ProduitRepository;
import com.example.demo.Entities.Produit;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		 ProduitRepository pr = ctx.getBean(ProduitRepository.class);
		 pr.save(new Produit(null,"USB Kingstone",150,12));
		 pr.save(new Produit(null,"Clavier",150,12));
		 pr.save(new Produit(null,"Ecran",150,12));
		 
		 //Modification de l'Ecran en disque dur ssd
		 pr.save(new Produit(3,"Disque dur ssd",150,12));
		 
		 //pr.ChercherParMc("USB").forEach(p->System.out.println(p));
		 
		 pr.findByDesignationContains("USB").forEach(p->System.out.println(p));


	}

}
