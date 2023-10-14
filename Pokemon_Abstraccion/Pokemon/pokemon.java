package pokemon;

import pokemon_herencia.Tipo;

public abstract class Pokemon {
    
    private String nombre;
    private Tipo tipo;
    private int hp = 250;
    private int nivel;
    private Movimiento movimiento[];


    public Pokemon(String nombre, Tipo tipo,int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;    
        this.movimiento = new Movimiento[4];
    }

    public Movimiento[] getMovimiento() {
        return movimiento;
    }


    public int getHp() {
        return hp;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }
    private void calculaDanio(int danio, double efectividad) {
        double puntosRestados=danio*efectividad;
        this.hp -= danio;
            System.out.printf("%s recibe %d puntos de danio\n",this.getNombre(), danio);
    }
    public void recibirAtaque(String movimiento, double efectividad) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(),movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);
        System.out.printf("%s tiene ahora %s puntos de vida \n",this.getNombre(), this.hp);
    }
     protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon){
        System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad= obtenerEfectividad(pokemon);
        
        if (movimiento.getpp()>0){
            pokemon.recibirAtaque(movimiento,efectividad);
            return true;
        }else{
            System.out.println("El movimiento no tiene puntos de pp");
            return false;
        }
    }
    
    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento= getMovimientos(m);
        boolean seHaConcretadoAtaque= seHaConcretadoAtaque(movimiento, pokemon);
        if (seHaConcretadoAtaque){
            pokemon.getMovimientos(m).setPp(movimiento.getPp()-1);
        }
    }
    
    public abstract double obtenerEfectividad(Pokemon pokemon);
}
