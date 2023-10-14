package pokemon_herencia;

public class PokemonFuego extends Pokemon {
    public PokemonFuego (int nivel, String nombre, Tipo tipo ) {
    super(nivel ,nombre, Tipo.DRAGON);
   
    ListaMovimientos listaMovimientos = new ListaMovimientos();
     
    setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Colmillo ígneo"));
    setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Infierno"));
    setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Fuego sagrado"));
    setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Látigo ígneo"));   
     
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad= 1.0;
        
        if(pokemon.getTipo()== Tipo.HADA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.HIELO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.TIERRA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.AGUA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ACERO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.BICHO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 2.0;

        return efectividad;
    }

}
