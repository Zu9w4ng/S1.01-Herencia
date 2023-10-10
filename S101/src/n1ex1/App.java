package n1ex1;

public class App {
    public static void main(String[] args) {
        
        Vent flauta = new Vent("flauta", 50);
        descriuInstrument(flauta);
        flauta.tocar();

        Corda guitarra = new Corda("guitarra", 300);
        descriuInstrument(guitarra);
        guitarra.tocar();

        Percussio bateria = new Percussio("bateria", 1200);
        descriuInstrument(bateria);
        bateria.tocar();
    }
    
    static void descriuInstrument(Instrument instrument) {
    	System.out.println("Característiques: " + instrument.getNom() + " amb un preu de " + instrument.getPreu());
    }
}
