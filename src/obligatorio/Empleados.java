package obligatorio;
import java.util.Date;

public class Empleados {
    
    private String nombre;
    private int cedula;
    private int numeroEmpleado;
    private Date fechaContrato;
    
    public Empleados(String nombre, int cedula, int numeroEmpleado, Date fechaContrato){
        this.nombre=nombre;
        this.cedula=cedula;
        this.numeroEmpleado=numeroEmpleado;
        this.fechaContrato=fechaContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    
    
}
