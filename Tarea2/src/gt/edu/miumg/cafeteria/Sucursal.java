package gt.edu.miumg.cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {

    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private Cafe cafe;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado empleado){
        System.out.println("Agregagando empleado");
        empleados.add(empleado);
    }

    public void agregarEquipo(Equipo equipo){
        System.out.println("Agregagando equipo");
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Cafe cafe){
        System.out.println("Agregagando cafe");
        this.cafe = cafe;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        System.out.println("Agregagando ingrediente");
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                ", equipos=" + equipos +
                ", cafe=" + cafe +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
