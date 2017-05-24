/**
 * 
 */
package tp.model;

import java.util.UUID;

/**
 * @author benoit
 *
 */
public class Tetrimino {
	private UUID id;
	private String nom;
	private String couleur;
	
	
	
	public Tetrimino(UUID id, String nom, String couleur) {
		
		this.id = id;
		this.nom = nom;
		this.couleur = couleur;
	}
	public Tetrimino(String nom, String couleur) {
		
		
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
