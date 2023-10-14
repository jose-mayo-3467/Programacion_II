package pokemon_herencia;

public class PokemonDragon extends Pokemon {
    public PokemonDragon (int nivel, String nombre, Tipo tipo ) {
    super(nivel, nombre, Tipo.DRAGON);
    }
    ListaMovimientos listaMovimientos = new ListaMovimientos();
     
    setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Cola dragon"));
    setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Gigaimpacto"));
    setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Garra dragon"));
    setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Basto impacto"));   
     
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad= 1.0;
        
        if(pokemon.getTipo()== Tipo.HADA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.HIELO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.AGUA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.ELECTRICO) efectividad = 0.5;

        return efectividad;
        
        
    }

}
