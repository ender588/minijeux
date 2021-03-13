package Maps;
import Maps.FenetreJeux;
import Maps.Tile;
import Maps.TileWall;
import Maps.TileCover;
import Maps.TileFree;

public class Map {
	// attribut , variable d'intance 
	private int Verticale;
	private int Horizontale;
	private Tile[][] Tableau;
	private int  totale;
	
	public Map(String SchemaVisuel) {
		// constructeur
		
		Verticale = (int) SchemaVisuel.chars().filter(ch -> ch == '\n').count();
		totale = SchemaVisuel.length() - Verticale;
		Horizontale= (totale / Verticale);
		
	    Tableau = new Tile[Verticale][Horizontale];
	    
		for (int V=0; V < Verticale; V++) {
			for (int H=0; H < Horizontale; H++) {
				char CaseEnCours = SchemaVisuel.charAt((Horizontale+1) * V + H);
				switch(CaseEnCours) {
				case '*':
					Tableau[V][H]= new TileWall();
					break;
				case'-':
					Tableau[V][H]= new TileCover();
					break;
				case' ':
					Tableau[V][H]= new TileFree();
					break;
				}
			}
		}
		// fin du constructor
	}

	public void AfficherTableau() {
		for (int V=0; V < Verticale; V++) {
			for (int H=0; H < Horizontale; H++) {
			}
		}
	}
}
			
		
		/*Tableau = new Tile [Largeur][Longeur];
		Tableau[0][0]= new TileFree();
		Tableau[0][1]= new TileCover();
		Tableau[1][1]= new TileWall();
		Tableau[2][0]= new TileCover();
		Tableau[2][1]= new TileWall();
	
		 //création d'un tableau
		for(int i =0;i<Largeur;i++) {
			for(int j =0;j<Longeur;j++) {
				System.out.print(Tableau[i][j]);
				*/
				
			
	

