import gt.edu.miumg.cafeteria.*;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Mario Garza", "Gerente", 2500);
        System.out.println("empleado = " + empleado);
        Empleado empleado2 = new Empleado("Juan Perez", "Cajero", 1500);
        System.out.println("empleado2 = " + empleado2);

        Equipo equipo = new Equipo("Cocina","Apagado");
        System.out.println("equipo = " + equipo);

        Ingrediente grano = new Grano("Cafe");
        System.out.println("ingrediente1 = " + grano);
        Ingrediente leche = new Leche("Entera",10);
        System.out.println("ingrediente2 = " + leche);
        Ingrediente agua = new Agua(10);
        System.out.println("ingrediente3 = " + agua);

        Cafe colombiano = new CafeColombiano("Cafe Colombiano", 10,5.00);
        System.out.println("colombiano = " + colombiano);
        Cafe espresso = new EspressoItaliano(5,10, 5.00 );
        System.out.println("espresso = " + espresso);

        Sucursal sucursalColombia = new Sucursal("Sucursal Bogota","Zona 10");
        System.out.println("sucursalColombia = " + sucursalColombia);
        sucursalColombia.agregarEmpleado(empleado);
        sucursalColombia.agregarEquipo(equipo);
        sucursalColombia.agregarEspecialidad(colombiano);
        System.out.println("sucursalColombia = " + sucursalColombia);

        Sucursal sucursalItalia = new Sucursal("Sucursal Italia","Zona 15");
        System.out.println("sucursalItalia = " + sucursalItalia);
        sucursalItalia.agregarEmpleado(empleado);
        sucursalItalia.agregarEmpleado(empleado2);
        sucursalItalia.agregarEquipo(equipo);
        sucursalItalia.agregarEspecialidad(espresso);
        System.out.println("sucursalItalia = " + sucursalItalia);


    }
}