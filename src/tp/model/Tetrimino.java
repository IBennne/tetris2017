/**
 * 
 */
package tp.model;

/**
 * @author benoit
 *
 */
public class Tetrimino {
	private String id;
	private String nom;
	private String couleur;
	
	
	
	public Tetrimino(String id, String nom, String couleur) {
		
		this.id = id;
		this.nom = nom;
		this.couleur = couleur;
	}
	public Tetrimino(String nom, String couleur) {
		
		this.id = id;
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
