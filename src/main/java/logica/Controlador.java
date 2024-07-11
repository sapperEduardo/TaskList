package logica;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import logica.Tarea;
import persistencia.ControladorPersistencia;
import vista.Mensajero;
import vista.Principal;

public class Controlador {
    
    
    private ControladorPersistencia control = null; 
    
    public Controlador() {
        control = new ControladorPersistencia();
    }
   
    public void abrirPrincipal(){
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    
    
    public LinkedList<Tarea> traerTareas(){
        return control.obtenerTareas();
    }

    public void guardarTarea(String nombre, String descripcion, String fechaCierre) {
        control.setTarea(nombre, descripcion, fechaCierre);
    }
    public void guardarTarea(String nombre, String descripcion) {
        control.setTarea(nombre, descripcion);
    }

    public void eliminarTarea(int id) {
        control.eliminarTarea(id);
    }

    public void actualizarTarea(int id, String nombre, String descripcion, String fecha){
        control.actualizarTarea(id, nombre, descripcion, fecha);
    }
    public void actualizarTarea(int id, String nombre, String descripcion){
        control.actualizarTarea(id, nombre, descripcion);
    }

    public boolean terminarTarea(int id) {
        
        boolean estado = control.tareaTerminada(id);
        
        if(!estado){
            control.terminarTarea(id);
            return true;
        }else{
            return false;
        }
        
    }

    
    public LinkedList<Tarea> traerTareasTXT() {
    LinkedList<Tarea> listaOriginal = control.obtenerTareas();
    LinkedList<Tarea> listaFiltrada = new LinkedList<>();
    
    LocalDate fechaActual = LocalDate.now();

    for (Tarea t : listaOriginal) {
        String estado = t.getEstado();

        if (estado.equalsIgnoreCase("Pendiente")) {
            Date fechaCierre = t.getFechaCierre();

            if (fechaCierre != null) {
                LocalDate fechaTarea = fechaCierre.toLocalDate();
                long diasDeDiferencia = ChronoUnit.DAYS.between(fechaActual, fechaTarea);

                if (diasDeDiferencia <= 5 && 0 <= diasDeDiferencia) { // Asegúrate de que la fecha no haya pasado
                    listaFiltrada.add(t);
                }else if(diasDeDiferencia < 0){  /// si ya paso la fecha le cambiamos el estado a "ATRASADA"
                    t.setEstado("Atrasada!");
                    listaFiltrada.add(t);
                }
                
            }
        }
    }

    return listaFiltrada;
    
    }

    
    public void crearTXT(File fileToSave, LinkedList<Tarea> lista) {
        
        try (FileWriter writer = new FileWriter(fileToSave)) {
            Iterable<Tarea> tareas;
                    writer.write("----LISTA DE TAREAS PENDIENTES EN 5 DIAS----\n\n");
                for (Tarea tarea : lista) {
                    writer.write("Nombre: '" + tarea.getNombre() +"',  Descripcion: '"+tarea.getDesc()+"',  Fecha de cierre: '"+tarea.getFechaCierre()+ "'\nEstado: ("+tarea.getEstado()+")\n\n");
                }
                
                writer.flush();
                
                Mensajero.Mensaje("ARCHIVO GUARDADO", "info", "Generar TXT");
            
            } catch (IOException e) {
                Mensajero.Mensaje("ERROR AL GUARDAR EL ARCHIVO", "ERROR", "Generar TXT");
            }
    
    }

    
    
    
    
}
