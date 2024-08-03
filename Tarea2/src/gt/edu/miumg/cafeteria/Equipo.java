package gt.edu.miumg.cafeteria;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender(){
        System.out.println("Encendiendo");
        estado = "Encendido";
    }

    public void apagar(){
        System.out.println("Apagado");
        estado = "Apagado";
    }

    public void repara(){
        System.out.println("Reparado");
        estado = "Reparado";
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
