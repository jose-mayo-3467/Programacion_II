package pokemon;
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
    public ListaMovimientos(){
    //movimientos tipo dragon
    movimiento.add(new Movimiento()("Cola dragon", 60, Tipo.DRAGON, 16));
    movimiento.add(new Movimiento()("Gigaimpacto", 150, Tipo.DRAGON, 8));
    
    //movimientos tipo siniestro
    movimiento.add(new Movimiento()("Alarido", 55, Tipo.DRAGON, 24));
    movimiento.add(new Movimiento()("Triturar", 80, Tipo.DRAGON, 24));
    
    //movimientos tipo fuego
    movimiento.add(new Movimiento()("Garra dragon", 80, Tipo.FUEGO, 24));
    movimiento.add(new Movimiento()("Infierno", 100, Tipo.FUEGO, 8));
    
    //movimientos tipo normal
    movimiento.add(new Movimiento()("Arañaso", 40, Tipo.DRAGON, 56));
    movimiento.add(new Movimiento()("Cuchillada", 70, Tipo.DRAGON, 32));
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
