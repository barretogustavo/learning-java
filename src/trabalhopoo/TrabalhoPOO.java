package trabalhopoo;
/**
 *
 * @author gusta
 */
public class TrabalhoPOO {

    public static void main(String[] args) {
      
        
        Lancha l1 = new Lancha("Sedna", true, "Focker", "F215", "Branca", "2021F215", 10, 120, 650000.54f, 2.5f);
        Lancha l2 = new Lancha("Casco Forte", true, "Cimitarra", "C5000", "Azul", "2021C5000", 15, 130, 860000.50f, 2.0f);
        Lancha l3 = new Lancha("Cascudo", false, "Phantom", "PHAN660", "Marfin", "2021phan660", 8, 110, 505000.10f, 1.9f);
        Lancha l4 = new Lancha("FerretiMax", true, "Ferreti", "FER14", "Branca", "2021FER14", 20, 180, 950600.00f, 2.5f);
        Lancha l5 = new Lancha("Casco Top", false, "Intermarine", "INTER50", "Preta", "2021INTER50", 30, 100, 1500000.00f, 2.5f);
        
        l1.imprimir();
        l2.imprimir();
        l3.imprimir();
        l4.imprimir();
        l5.imprimir();
        
    }
    
}
