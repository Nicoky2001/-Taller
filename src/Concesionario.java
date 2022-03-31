
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 888
 */
public class Concesionario {
    
    
    ArrayList <Vehiculo> coche;
       
    
    public Concesionario(){
        
        this.coche = new ArrayList<>();
        
    }
       
    
    public void altaCoche(Vehiculo nuevo){
        
        coche.add(nuevo);   
        
        
    }
    
    public void mostrarCoches(){
        
        for (Vehiculo carro : coche) {
            
            System.out.println(carro);
        }
    }
    

    
   
    
}
