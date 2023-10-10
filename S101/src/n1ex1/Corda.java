package n1ex1;

public class Corda extends Instrument {
    
    public Corda(String nom, double preu) {
        super(nom, preu);
    }

    static {
    	System.out.println("S'ha creat un instrument de corda");
    }
    
    public void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }
    
}
