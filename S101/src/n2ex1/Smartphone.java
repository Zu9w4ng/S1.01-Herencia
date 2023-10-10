package n2ex1;

public class Smartphone extends Telefon implements Camera, Rellotge {

    public Smartphone(String marca, String model) {
        super(marca, model);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
        
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant la alarma");
    
    }

    
    
}

