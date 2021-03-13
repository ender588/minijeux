
package Maps;
import Maps.Map;
import Maps.FenetreJeux;
public class FonctionGlobale {
	public static void main(String[] args) {
		FenetreJeux window =new FenetreJeux(1500, 1500);
		String SchemaVisuel = """
        ------------------------- 
---     -----  ------ ------- --- 
------- ------- ----------------- 
             -------        ----- 
             -------------       *
********------------------ *******
""";
		Map Plaine = new Map(SchemaVisuel);
		
	}
}
