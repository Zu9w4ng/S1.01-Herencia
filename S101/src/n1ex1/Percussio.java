package n1ex1;

public class Percussio extends Instrument{
    
    public Percussio(String nom, double preu) {
        super(nom, preu);
    }
    
    static {
    	System.out.println("S'ha creat un instrument de percussió");
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }
}