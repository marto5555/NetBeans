package obligatorio;

import java.util.Date;

public class EmpleadoFT extends Empleados implements ICantante{
    
    private int telefono;
    private String direccionParticular;
    private String tipoEmpleado;
   
   public EmpleadoFT(String nombre, int cedula, int numeroEmpleado, Date fechaContrato, int telefono, String direccionParticular, String tipoEmpleado){
       super(nombre, cedula, numeroEmpleado, fechaContrato);
       this.telefono=telefono;
       this.direccionParticular=direccionParticular;
       this.tipoEmpleado=tipoEmpleado;
   } 

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccionParticular() {
        return direccionParticular;
    }

    public void setDireccionParticular(String direccionParticular) {
        this.direccionParticular = direccionParticular;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
   
    public float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtras){
        float salario=0;
        
        if(getTipoEmpleado().equals("Vendedor")){
            salario=18000;
        }else if(getTipoEmpleado().equals("Encargado")){
            salario=23000;
        }
        if(ventasMes>=10000 && ventasMes < 15000){
            salario+=1000;
        }
        else if(ventasMes>=15000){
            salario+=2000;
        }
        salario+=horasExtras*300;
        
        return salario;
    }
    
    public float calcularSalarioNeto(float salarioBruto){
        if(salarioBruto>=18000 && salarioBruto<23000){
        salarioBruto+=salarioBruto*0.16;
        }else if(salarioBruto>23000){
            salarioBruto+=salarioBruto*0.18;

        }
        return salarioBruto;
    }
   
    public String cantar(){
        
        return "Letra cancion";
    }
    
}
