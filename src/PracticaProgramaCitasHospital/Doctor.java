
package PracticaProgramaCitasHospital;

public class Doctor extends Persona {
    private String especialidad;
    
    public Doctor(String nombre, int edad, String especialidad){
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public String getInfoDoctor(){
        return "Nombre: "+getNombre() + "/ Edad: "+ getEdad() + "/ Especialidad: "+especialidad;
    }
}
