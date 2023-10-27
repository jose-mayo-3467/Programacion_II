package pokemon_herencia;
import pokemon.pokemonDragon;
import pokemon.pokemonFuego;

public class BatallaPokemon{
    
     public static void main(String[] args) {
         Pokemon Haxorus = new Pokemon(10 ,"Haxorus", "Dragon");
         Pokemon Charizard = new Pokemon(10 ,"Charizard", "Fuego");
         Haxorus.atacar("gillotina", Charizard);
         Charizard.atacar("lanzallamas" ,Haxorus);   
         
         
    }   
}
