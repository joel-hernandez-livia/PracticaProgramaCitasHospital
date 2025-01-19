
package PracticaProgramaCitasHospital;


public class SistemaGestionHospital {

 
    public static void main(String[] args) {
        System.out.println("Hola");
        
        Paciente[] pacientes = new Paciente[3];
        Doctor[] doctores = new Doctor[3];
        Cita[] citas = new Cita[3];
        
        pacientes[0] = new Paciente("pepe", 23, 1);
        pacientes[1] = new Paciente("juana", 13, 2);
        pacientes[2] = new Paciente("luis", 53, 3);
        doctores[0] = new Doctor("Chapatin", 59, "Cirujano");
        doctores[1] = new Doctor("laura", 41, "general");
        doctores[2] = new Doctor("pedro", 39, "dermatologo");
        citas[0] = new Cita(pacientes[0], doctores[1], "2025-02-01" );
        citas[1] = new Cita(pacientes[1], doctores[1], "2025-02-02" );
        citas[2] = new Cita(pacientes[2], doctores[0], "2025-02-01" );
        citas[2] = new Cita(pacientes[2], doctores[2], "2025-02-05" );
        try{
            System.out.println("\nCitas\n");
            for (int i=0; i< citas.length; i++){
                System.out.println(citas[i].getInfo());
                System.out.println("");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera sel rango den array");
        }
        
    }
    
}
