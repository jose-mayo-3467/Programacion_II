package alumno;

public class Alumno2 {

    public Alumno2(String alu1, String sistemas, int par, int par1, String b, Tutor tutor) {
    }

    public static void main(String[] args) {
    
        Telefono telefono = new Telefono("+52","934","9341058968");
        Tutor tutor = new Tutor("Mamá",68,Telefono);
        Alumno2 Alu1 = new Alumno2("Alu1","Sistemas", 7073,5, "B",tutor);
      
        String Telefono = Alu1.getTutor().getTelefono().toString();
        System.out.println("Telefono tutor: "+telefono);
    
    }

}