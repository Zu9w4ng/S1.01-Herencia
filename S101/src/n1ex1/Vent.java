package n1ex1;

public class Vent extends Instrument {
    
    public Vent(String nom, double preu) {
        super(nom, preu);
    }
    
    static {
    	System.out.println("S'ha creat un instrument de vent");
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }
}