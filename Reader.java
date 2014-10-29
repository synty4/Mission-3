package JournalsM3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe permettant de lire le fichier d'entree
 * 
 */
public class Reader {
	
	private BufferedReader input;
	
	/**
	   * Constructeur
	   *  
	   * @pre  -
	   * @post Ouvre un fichier de sortie ou le cree s'il n'existe pas encore
	   * @exception IOException si erreur lors de l'ouverture du fichier
	   * 
	   */ 
	public Reader(String inputFile) {
		try {
			input = new BufferedReader(new FileReader(inputFile));
		} catch (IOException e) {
			System.out.print("Error related to inputfile\n");
		}
	}
	
	/**
	   * Methode permettant de lire les ligne du fichier d'entree deja ouvert
	   *  
	   * @pre  le fichier est ouvert en lecture (input n'est pas null)
	   * @post renvoie le string correspondant a la ligne suivante du fichier ouvert en lecture
	   * @exception IOException if an I/O error occurs
	   * 
	   */ 
	public String readNextLine(){
		try {
			return this.input.readLine();
		} catch (IOException e) {
			return null;
		}
	}
	
	/**
	   * Methode permettant de fermer le flux, le fichier d'entree
	   *  
	   * @pre  le fichier est ouvert en lecture (input n'est pas null)
	   * @post le fichier ouvert en lecture par input est ferme
	   * @exception IOException if an I/O error occurs
	   * 
	   */ 
	public void close() {		
		try {
			this.input.close();
		} catch (IOException e) {
			System.out.print("Error closing inputfile\n"); 
		}	
	}
}
