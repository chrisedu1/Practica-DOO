package gt.edu.miumg.cafeteria;

public class EspressoItaliano extends Cafe{

    private int intensidad;

    public EspressoItaliano(int intensidad, int tamano, double precio){
        super("Espresso Italiano", tamano, precio);
        this.intensidad = intensidad;
        ingredientes.add(new Grano("Italiano"));
        ingredientes.add(new Agua(50));
        ingredientes.add(new Leche("Entera",10));
    }

    @Override
    public String toString() {
        return "EspressoItaliano{" +
                "intensidad=" + intensidad +
                '}';
    }
}
