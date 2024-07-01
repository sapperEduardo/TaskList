package persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.LinkedList;
import logica.Tarea;


public class ControladorPersistencia {

    public ControladorPersistencia() {
    }


    
    
    public LinkedList<Tarea> obtenerTareas() {
        LinkedList<Tarea> lista = new LinkedList<>();
        
        if( cantidadTareas() > 0){
            try {
                ResultSet resultado = Coneccion.ejecutarConsulta("select * from Tareas order by fechaCierre");
                while (resultado.next()){
                    int id = resultado.getInt(1);
                    String nombre = resultado.getString(2);
                    String desc = resultado.getString(3);
                    String estado = (resultado.getBoolean("estado"))?"Terminada":"Pendiente";
                    Date fechaInicio = resultado.getDate(5);
                    Date fechaCierre;
                   
                    try{
                        fechaCierre = resultado.getDate(6);
                    }catch(Exception e){
                        fechaCierre = null;
                    }
                    
                    Tarea t = new Tarea(id, nombre, desc, estado, fechaInicio, fechaCierre);
                    lista.add(t);
                }
            }catch (Exception e){
                System.out.println("Error al obterner tareas: "+e.getMessage());
            }
        }
        return lista;
    }
    
    public int cantidadTareas(){
        int cantidad = 0;
        try {
            ResultSet resultado =  Coneccion.ejecutarConsulta("select count(*) from Tareas");
            if (resultado.next()){
                cantidad = resultado.getInt(1);
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return cantidad;
    }

    public void setTarea(String nombre, String descripcion, String fechaCierre) {
        String consulta = "insert into Tareas(nombre,descripcion,estado,fechaCierre)\n" +
            "values('"+nombre+"','"+descripcion+"',default,'"+fechaCierre+"')";
        try{
            int filas = Coneccion.ejecutarModificacion(consulta);
            
        }catch(Exception e){
            System.out.println("Error al setear tarea con fecha: "+e.getMessage());
        }
    
    }
    public void setTarea(String nombre, String descripcion) {
        String consulta = "insert into Tareas(nombre,descripcion,estado)\n" +
            "values('"+nombre+"','"+descripcion+"',default)";
        try{
            int filas = Coneccion.ejecutarModificacion(consulta);
            
        }catch(Exception e){
            System.out.println("Error al setear tarea sin fecha: "+e.getMessage());
        }
    
    }

    public void eliminarTarea(int id) {
        String consulta = "delete Tareas where idTarea = "+id+";";
        try{
            int filas = Coneccion.ejecutarModificacion(consulta);
            
        }catch(Exception e){
            System.out.println("Error al eliminar tarea: "+e.getMessage());
        }
    }
    
    public void actualizarTarea(int id, String nombre, String descripcion, String fecha){
        String consulta = "update Tareas set nombre = '"+nombre+"', descripcion = '"+descripcion+"', fechaCierre = '"+fecha+"'\n" +
"where idTarea = "+id+";";
        try{
            int filas = Coneccion.ejecutarModificacion(consulta);
            
        }catch(Exception e){
            System.out.println("Error al actualizar tarea con fecha: "+e.getMessage());
        }
    }
        
    public void actualizarTarea(int id, String nombre, String descripcion){
        String consulta = "update Tareas set nombre = '"+nombre+"', descripcion = '"+descripcion+"'\n" +
"where idTarea = "+id+";";
        try{
            int filas = Coneccion.ejecutarModificacion(consulta);
            
        }catch(Exception e){
            System.out.println("Error al actualizar tarea sin fecha: "+e.getMessage());
        }    
        
    }

    public void terminarTarea(int id) {
        String consulta = "update Tareas set estado = 1 where idTarea = "+id+";";
        try{
            int filas = Coneccion.ejecutarModificacion(consulta);
            
        }catch(Exception e){
            System.out.println("Error al terminar tarea: "+e.getMessage());
        } 
    
    }

    

    
}
