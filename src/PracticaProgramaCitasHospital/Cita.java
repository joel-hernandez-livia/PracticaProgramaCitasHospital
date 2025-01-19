
package PracticaProgramaCitasHospital;

public class Cita {
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    
    public Cita(Paciente paciente, Doctor doctor, String fecha){
        this.doctor = doctor;
        this.paciente=paciente;
        this.fecha = fecha;
    }
    
    public String getInfo(){
        return "Doctor: "+doctor.getNombre()+"\nEspecialidad: "+doctor.getEspecialidad()+"\nPaciente: "+paciente.getNombre()
                +"\nFecha: "+fecha;
    }
}
