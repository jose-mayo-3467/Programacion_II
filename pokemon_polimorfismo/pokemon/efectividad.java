/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon_polimorfismo;

/**
 *
 * @author josem
 */
public class efectividad extends charizard {
    
    
    public efectividad(String nombre, int lvl) {
        super(nombre, lvl);
    }
        public double obtenerEfectividad(pokemon charizard){
        double efectividad= 1.0;
        
        if(charizard.gettipo()== tipo.HADA) efectividad = 1.0;
        if(charizard.gettipo()== tipo.FUEGO) efectividad = 0.5;
        if(charizard.gettipo()== tipo.HIELO) efectividad = 2.0;
        if(charizard.gettipo()== tipo.PLANTA) efectividad = 2.0;
        if(charizard.gettipo()== tipo.DRAGON) efectividad = 0.5;
        if(charizard.gettipo()== tipo.ROCA) efectividad = 0.5;
        if(charizard.gettipo()== tipo.AGUA) efectividad = 0.5;
        if(charizard.gettipo()== tipo.ELECTRICO) efectividad = 1.0;
        if(charizard.gettipo()== tipo.ACERO) efectividad = 2.0;
        if(charizard.gettipo()== tipo. BICHO) efectividad = 2.0;      
        return efectividad;   
    }  
}
