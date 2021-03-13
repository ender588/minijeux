package Maps;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame; // bibliotheque fenetre
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FenetreJeux extends JFrame{
	private int largeurFenetre;
	private int longeurFenetre;
	public FenetreJeux(int largeurFenetre, int longeurFenetre){
		// définit le nom de la fenetre
		this.setTitle("Map");
		//définit sa taille:400 pixel de large et 100 pixel de haut 
		this.setSize(largeurFenetre, longeurFenetre);
		// Place un objet au centre
		this.setLocationRelativeTo(null);
		//termine le processus lorsque on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ET enfin rendre visible
		this.setVisible(true);	
		

		
	}

	
}
