/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filasparque;

/**
 *
 * @author Usuario
 */
public class FilasParque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parque parque = new Parque(100);
        Juego casaEmbrujada = new Juego(1, 20, "Casa Embrujada");
        Juego montañaRusa = new Juego(2, 10, "Montaña Rusa");
        Juego espejos = new Juego(3, 2, "Espejitos Magicos");

        Visitante a = new Visitante("Carla", "perez", 1234, 0);
        Visitante b = new Visitante("Pedro", "Rodriguez", 2345, 0);
        Visitante c = new Visitante("Luisa", "Carrera", 3456, 0);

        parque.ingreso(a);
        parque.ingreso(b);
        parque.ingreso(c);

        parque.buscarVisitante(2345);

        parque.ingresoJuego(espejos, 1234);
        parque.ingresoJuego(espejos, 3456);
        parque.ingresoJuego(espejos, 2345);
        parque.ingresoJuego(montañaRusa, 1234);

        parque.buscarVisitante(1234);
        parque.buscarEnJuego(espejos, 1234);

        parque.salidaJuego(espejos);
        parque.salidaJuego(espejos);
        parque.salidaJuego(espejos);

        parque.ingresoJuego(espejos, 1234);
        parque.salida(1234);

        parque.buscarVisitante(1234);

        parque.salida(1234);
    }

}
