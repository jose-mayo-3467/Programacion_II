package pokemon;
import java.util.ArrayList;
import pokemon_herencia.Tipo;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
    public ListaMovimientos(){
        
    //movimientos tipo dragon
    movimiento.add(new Movimiento()("Cola dragon", 60,16, Tipo.DRAGON));
    movimiento.add(new Movimiento()("Gigaimpacto", 150,8, Tipo.DRAGON ));
    movimiento.add(new Movimiento()("Garra dragon", 80,24, Tipo.DRAGON));
    movimiento.add(new Movimiento()("Basto impacto", 60,24,Tipo.DRAGON));
    
    //movimientos tipo fuego
    movimiento.add(new Movimiento()("Colmillo ígneo",65,24, Tipo.FUEGO));
    movimiento.add(new Movimiento()("Infierno", 100,8,Tipo.FUEGO));
    movimiento.add(new Movimiento()("Fuego sagrado", 100,8, Tipo.FUEGO));
    movimiento.add(new Movimiento()("Látigo ígneo", 80,24,Tipo.FUEGO));
    
    //movimiento tipo siniestro
    movimiento.add(new Movimiento()("Alarido", 55,24, Tipo.SINIESTRO));
    
    //movimiento tipo hada
    movimiento.add(new Movimiento()("Choque anímico", 75,24, Tipo.HADA));
    
    //movimiento tipo normal
    movimiento.add(new Movimiento()("Arañaso", 40,56, Tipo.NORMAL));
    
    //movimiento tipo agua
    movimiento.add(new Movimiento()("Azote torrencial", 25, 8, Tipo.AGUA);
    
    //movimiento tipo fantasma
    movimiento.add(new Movimiento()("Robasombra", 90, 16.Tipo.FANTASMA); 
    
     //movimiento tipo electrico
    movimiento.add(new Movimiento()("Colmillo rayo",65,24, Tipo.ELECTRICO);   
    
    //movimiento tipo psiquico
    movimiento.add(new Movimiento()("Psicocolmillo", 85, 16, Tipo.PSIQUICO);
    
    //movimiento tipo hielo
    movimiento.add(new Movimiento()("Colmillo hielo", 65, 24, Tipo.HIELO);
    
    }
     public Movimiento buscarMovimientoPorNombre(String nombre){   
            for(Movimiento movimiento: movimientos){
                if (movimiento.getNombre().equals(nombre)){
                    return movimiento;
                }
            }
            return null;
        }
    
}
