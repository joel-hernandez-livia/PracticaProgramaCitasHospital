
package PracticaProgramaCitasHospital;

public class Paciente extends Persona{
    private int id;
    
    public Paciente (String nombre, int edad, int id){
        super(nombre, edad);
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public String getInfoPaciente(){
        return "Nombre: "+getNombre() + "/ Edad: "+ getEdad() + "/ ID: "+id;
    }
}
