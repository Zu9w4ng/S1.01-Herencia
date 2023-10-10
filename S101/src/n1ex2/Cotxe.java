package n1ex2;

public class Cotxe {
	   
    private static final String MARCA = "Opel";
    private static String model = "Corsa";
    private final int potencia = 100;
    
    public static String getMarca() {
        return MARCA;
    }
    public static String getModel() {
        return model;
    }
    public static void setModel(String model) {
        Cotxe.model = model;
    }
    public int getPotencia() {
        return potencia;
    }

    //frenar estàtic
    public static void frenar(Cotxe cotxe) {
        System.out.println("El vehicle està frenant");
    }

    //accelerar no estàtic
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}

