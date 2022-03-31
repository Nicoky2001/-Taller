

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 888
 */
public abstract class Vehiculo {
    
    
    protected String matricula;
    protected String fecha_matriculacion;
    protected String marca;
    protected String modelo;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFecha_matriculacion() {
        return fecha_matriculacion;
    }

    public void setFecha_matriculacion(String fecha_matriculacion) {
        this.fecha_matriculacion = fecha_matriculacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" + "matricula=" + matricula + ", fecha_matriculacion=" + fecha_matriculacion + ", marca=" + marca + ", modelo=" + modelo ;
    }
    
   public void altaVehiculo(){
       
        Scanner sc = new Scanner (System.in);
       
        
        System.out.println("Dime Matricula :  ");
        matricula = sc.nextLine().toUpperCase();
        System.out.println("Dime Fecha de Matriculacion dd/mm/aaaa");
        fecha_matriculacion = sc.nextLine();
        System.out.println("Dime la Marca : ");
        marca=sc.nextLine().toUpperCase();
        System.out.println("Dime Modelo : ");
        modelo= sc.nextLine().toUpperCase();
        
   }
public abstract double autonomia();
public abstract double calculargasto();
   

    
}
