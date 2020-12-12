package obligatorio;

import java.util.Date;

public class EmpleadoPT extends Empleados{
    
    private float cantHoras;
    private String nombreInstitucion;
    
    public EmpleadoPT(String nombre, int cedula, int numeroEmpleado, Date fechaContrato, float cantHoras, String nombreInstitucion){
        super(nombre, cedula, numeroEmpleado, fechaContrato );
        this.cantHoras=cantHoras;
        this.nombreInstitucion=nombreInstitucion;
    }

    public float getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }
    
    
    
}
