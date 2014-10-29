package JournalsM3;
/**
 * La classe magazine permet de representer une revue sous la forme d'un objet
 * Les variables d'instance de la classe donnent les differentes informations 
 * disponibles sur la revue sous forme de String.
 * 
 */
public class Magazine {
	
	private String Rank;
	private String FoR1;
	private String FoR1Name;
	private String FoR2;
	private String FoR2Name;
	private String FoR3;
	private String FoR3Name;
	
	
	/**
	 * Constructeur
	 * @pre none
	 * @post cree un Magazine dont les 7 attributs sont passes en arguments
	 */
	public Magazine(String rank, String foR1, String foR1Name, String foR2, String foR2Name, String foR3, String foR3Name) {
		Rank = rank;
		FoR1 = foR1;
		FoR1Name = foR1Name;
		FoR2 = foR2;
		FoR2Name = foR2Name;
		FoR3 = foR3;
		FoR3Name = foR3Name;
	}
	
	/**
	 * Constructeur
	 * @pre entries est un tableau de String a exactement 8 entrees
	 * @post cree un Magazine dont les 7 attributs sont les 7 entrees du tableau 0,2-7
	 */
	public Magazine(String[] entries) {
		if (entries.length != 8)
			return;
		
		Rank = entries[0];
		FoR1 = entries[2];
		FoR1Name = entries[3];
		FoR2 = entries[4];
		FoR2Name = entries[5];
		FoR3 = entries[6];
		FoR3Name = entries[7];
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getFoR1() {
		return FoR1;
	}

	public void setFoR1(String foR1) {
		FoR1 = foR1;
	}

	public String getFoR1Name() {
		return FoR1Name;
	}

	public void setFoR1Name(String foR1Name) {
		FoR1Name = foR1Name;
	}

	public String getFoR2() {
		return FoR2;
	}

	public void setFoR2(String foR2) {
		FoR2 = foR2;
	}

	public String getFoR2Name() {
		return FoR2Name;
	}

	public void setFoR2Name(String foR2Name) {
		FoR2Name = foR2Name;
	}

	public String getFoR3() {
		return FoR3;
	}

	public void setFoR3(String foR3) {
		FoR3 = foR3;
	}

	public String getFoR3Name() {
		return FoR3Name;
	}

	public void setFoR3Name(String foR3Name) {
		FoR3Name = foR3Name;
	}
	
	/**
	 * Methode toString
	 * @pre none
	 * @return Retourne une chaine de caracteres representant l'objet Magazine sous forme strucutree.
	 * 		   Si un attribut est a null, alors aucune information n'est affichee a son propos.
	 */
	public String toString() {
		if (Rank == null && FoR1 == null && FoR1Name == null && FoR2 == null && FoR2Name == null && FoR3 == null && FoR3Name == null)
			return "No additional data available for this entry";
		
		String retour = "";
		if (Rank != null)
			retour = retour.concat("Rank: ").concat(getRank()).concat("\n");
		if (FoR1 != null)
			retour = retour.concat("FoR1: ").concat(getFoR1()).concat("\n");
		if (FoR1Name != null)
			retour = retour.concat("FoR1Name: ").concat(getFoR1Name()).concat("\n");
		if (FoR2 != null)
			retour = retour.concat("FoR2: ").concat(getFoR2()).concat("\n");
		if (FoR2Name != null)
			retour = retour.concat("FoR2Name: ").concat(getFoR2Name()).concat("\n");
		if (FoR3 != null)
			retour = retour.concat("FoR3: ").concat(getFoR3()).concat("\n");
		if (FoR3Name != null)
			retour = retour.concat("FoR3Name: ").concat(getFoR3Name()).concat("\n");
		
		return retour;
	}
}
