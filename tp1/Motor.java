/**
* Automovil.java
*
* @author H�ctor Quej Cosgaya
* @author Jos� Aguilar Canepa
*
* @created 05/11/12 10:50 PM
*
* Esta clase modela el motor de un automovil.
*/
import java.util.Random;


public class Motor {
	
	public int revoluciones;		// La cantidad de ciclos por segundo que el motor est� realizando.
	public int aire;				// Volumen en mm3 del aire que entra a un cilindro del motor.
	public int combustible;		// Volumen en mm3 de gasolina que entra a un cilindro del motor
	public boolean piston;		// Indica si el pist�n del cilindro est� arriba (on) o abajo (on)
	public boolean bujia;			// Indica si la buj�a del cilindro est� encendida o apagada
	public boolean encendido;		// Indica si el motor se encuentra funcionando
	public Random r;			// Utilizado para motivos de simulaci�n del entorno del motor.
	
	/**
	* Inicializa un nuevo objeto Motor.
	*/
	public Motor() {
		aire = 0;
		combustible = 0;
		revoluciones = 0;
		encendido = false;
		r = new Random();
	}
	
	/**
	* Llena el cilindro con la cantidad y proporci�n necesarias de aire y combustible para que se realize la combusti�n.
	*/
	public void prepararMezcla() {
		while(!(Math.abs(aire - combustible) < 5 && (aire > 50 && combustible > 50))){
			aire += r.nextInt(10);
			combustible += r.nextInt(10);
		}
		piston = false;
	}
	
	/**
	* Sube el cilindro para comprimir la mezcla de aire y combustible. Adem�s se asegura que la buj�a est� apagada.
	*/
	public void comprimirMezcla(){
		piston = true;
		bujia = false;
	}
	
	/**
	* Enciende la buj�a el tiempo necesario para que la combusti�n se realice y la apaga despu�s. 
	* Posteriormente, convierte la energ�a qu�mica de la combusti�n en energ�a mec�nica, que se
	* transifere al cig�e�al para aumentar las revoluciones del motor. El resto de la energ�a qu�mica
	* se elimina a trav�s del escape.
	*/
	public void encenderMezcla(){
		bujia = true;
		bujia = false;
		double energia = (aire + combustible) * 34.78 / 2;
		revoluciones += (int)(energia / 100);
		piston = false;
		eliminarDesechos(energia);
	}
	
	/**
	* Elimina los desechos producidos tras realizar la combusti�n en el cilindro.
     * @param residuos
	*/
	public void eliminarDesechos(double residuos){
		while(residuos > 0){
			residuos -= r.nextDouble();
		}
	}

    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
        
       public void revolucionar() {
       if(encendido) {
            prepararMezcla();
            comprimirMezcla();
            encenderMezcla();
        }
    } 
}
