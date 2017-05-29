/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Empleado {
    private String dni;
    private String nombre;
    String direccion;
    private String cargo;
    private int numHijos;
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    public double calcula_sueldo(double base){
        double total=base;
        
        /*
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        */      
        switch (getCargo()){
            case "ENCARGADO":
               total+=300;
               break;
            case "DIRECTOR":
               total+=1000;  
               break;
        }
        
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
}
