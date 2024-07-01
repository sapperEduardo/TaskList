package logica;


import java.sql.Date;
import java.time.LocalDate;


public class Tarea {
    
    private int idTarea;
    private String nombre;
    private String desc;
    private String estado;
    private Date fechaInicio;
    private Date fechaCierre;

    public Tarea() {
    }

    public Tarea(int idTarea, String nombre, String desc, String estado, Date fechaInicio, Date fechaCierre) {
        this.idTarea = idTarea;
        this.nombre = nombre;
        this.desc = desc;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
    
    

    public int getIdTarea() {
        return idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDesc() {
        return desc;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }
    
    
    
    
    
}
