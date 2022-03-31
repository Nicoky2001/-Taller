
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class PrincipalVehiculos {

    public static void main(String[] args) {

        Vehiculo v = new Electrico();
        

        Concesionario nuevo = new Concesionario();

        Scanner sc = new Scanner(System.in);
        String opc2, opc = "n";

        System.out.println("****************************Crear coche************************************");

        do {

            System.out.println("El nuevo coche es eletrico s/n :");
            opc2 = sc.nextLine().toLowerCase();

            if (opc2.equalsIgnoreCase("s")) {

                v = new Electrico();                

            } else if (opc2.equalsIgnoreCase("n")) {

                v = new Gasolina();                

            }
            v.altaVehiculo();
            nuevo.altaCoche(v);
            System.out.println("Desea agrergar un coche s/n : ");
            opc = sc.nextLine().toLowerCase();

        } while (opc.equalsIgnoreCase("s"));

        nuevo.mostrarCoches();
        v.autonomia();
        v.calculargasto();
        

    }

}
