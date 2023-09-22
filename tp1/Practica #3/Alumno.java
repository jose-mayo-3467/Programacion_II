
package alumnos;

public class Alumno {
 String nombre, carrera;
    int matricula, grado;
    String grupo;
    Tutor tutor;

    
    public Alumno(String nombre, String carrera, int matricula, int grado, String grupo, Tutor tutor ){
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
        this.grado = grado;
        this.grupo = grupo;
        this.tutor = tutor;
    }

    public Tutor getTutor(){
        return tutor;
    }
    
    public void setTutor(Tutor tutor){
        this.tutor = tutor;
        }
    }

 class Tutor{
     
     String nombre;
     int edad;
     Telefono telefono;
     
     public Tutor(String nombre, int edad, Telefono telefono){
         this.nombre = nombre;
         this.edad = edad;
         this.telefono = telefono;
     }
    
     public Telefono getTelefono(){
         return telefono;
     }
     
     public void setTelefono(Telefono telefono){
         this.telefono = telefono;
     }
       
}

class Telefono{
    
    String codigo,lada,numero;
  
    public Telefono(String codigo, String lada, String numero){
        this.codigo = codigo;
        this.lada = lada;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" + "codigo=" + codigo + ", lada=" + lada + ", numero=" + numero + '}';
    }
    
 }