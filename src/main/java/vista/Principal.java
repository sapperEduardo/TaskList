
package vista;

import java.io.File;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import logica.Controlador;
import logica.Tarea;



public class Principal extends javax.swing.JFrame {

    private Controlador control = null;
    
    
    public Principal() {
        setTitle("Lista de tareas");
        control = new Controlador();
        initComponents();
        cargarTabla();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNueva = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTXT = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lista de tareas");

        btnNueva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNueva.setText("Nueva");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Terminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTXT.setText("TXT (5D)");
        btnTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTXTActionPerformed(evt);
            }
        });

        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        tablaTareas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTareas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTXTActionPerformed
        /// ACA VA LA FUNCION PARA GENERAR LA LISTA CON EL TXT.
        //// 1 VERIFICAR SI HAY TAREAS, 2 VERIFICAR SI SU FECHA DE CIERRE ESTÁ A 5 O MEOS DIAS Y SI NO ESTÁ TERMINADA.
        //// 3 PREGUNTAR O PEDIR UBICACION Y 4 GENERAR EL TXT.
        if(tablaTareas.getRowCount() > 0){
            LinkedList<Tarea> lista = control.traerTareasTXT();
            
            if(lista.size() > 0){
            
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Guardar lista de tareas");
                
                int userSelection = fileChooser.showSaveDialog(null);
        
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                if (!fileToSave.getAbsolutePath().endsWith(".txt")) {
                    fileToSave = new File(fileToSave + ".txt");
                }
                
                control.crearTXT(fileToSave, lista);
                
                
            }else{
                Mensajero.Mensaje("NO HAY TAREAS PARA REALIZAR \nA MENOS DE 5 DIAS", "info", "Generar TXT");
            }
        }else{
            Mensajero.Mensaje("NO EXISTE NINGUNA TAREA!", "error", "Generar TXT");
        }
        
        
        
        
        }   
    }//GEN-LAST:event_btnTXTActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tablaTareas.getRowCount() > 0){
            int filaSelec = tablaTareas.getSelectedRow();
            if(filaSelec != -1){
                int id = (int) tablaTareas.getValueAt(tablaTareas.getSelectedRow(), 0);
                
                control.terminarTarea(id);
                Mensajero.Mensaje("LA TAREA HA SIDO TERMINADA!", "info", "Terminar tarea");            
                this.cargarTabla();
                
            }else{
                Mensajero.Mensaje("DEBE SELECCIONAR UNA TAREA!", "error", "Seleccion de tarea");
            }
        }else{
            Mensajero.Mensaje("NO EXISTE NINGUNA TAREA!", "error", "Editar tarea");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tablaTareas.getRowCount() > 0){
            int filaSelec = tablaTareas.getSelectedRow();
            if(filaSelec != -1){
                TableModel modelo = tablaTareas.getModel();
                
                int id = (int) modelo.getValueAt(filaSelec, 0); 
                String nombre = modelo.getValueAt(filaSelec, 1).toString(); 
                String descripcion = modelo.getValueAt(filaSelec, 2).toString();
                String fechaCierre = "";
                
                Object valorFecha = modelo.getValueAt(filaSelec, 5);
                if (valorFecha != null) {
                    fechaCierre = valorFecha.toString();
                }
                
                EditarTarea editar = new EditarTarea();
                editar.setNombre(nombre);
                editar.setDescripcion(descripcion);
                editar.setFecha(fechaCierre);
                editar.setIdTarea(id);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                this.dispose();
                
            }else{
                Mensajero.Mensaje("DEBE SELECCIONAR UNA TAREA!", "error", "Seleccion de tarea");
            }
        }else{
            Mensajero.Mensaje("NO EXISTE NINGUNA TAREA!", "error", "Editar tarea");
            
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        CrearTarea crear = new CrearTarea();
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        if(tablaTareas.getRowCount() > 0){
            if(tablaTareas.getSelectedRow() != -1){
                int id = (int) tablaTareas.getValueAt(tablaTareas.getSelectedRow(), 0);   
                control.eliminarTarea(id);   
                Mensajero.Mensaje("TAREA ELIMINADA EXITOSAMENTE!", "info", "Eliminacion de tarea");            
                this.cargarTabla();   
            }else{
                Mensajero.Mensaje("DEBE SELECCIONAR UNA TAREA!", "error", "Seleccion de tarea");            
            }
        }else{
            Mensajero.Mensaje("NO EXISTE NINGUNA TAREA!", "error", "Eliminar tarea");
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTareas;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    public void cargarTabla() {
        DefaultTableModel modelo = new DefaultTableModel () {
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        String[] titulos = {"ID","Nombre","Descripcion","Estado","Fecha de inicio", "Fecha de cierre"};
       
        modelo.setColumnIdentifiers(titulos);
        
        
        LinkedList<Tarea> tareas = control.traerTareas();
        
        if(tareas != null){
            for(Tarea t: tareas){
                Object[] objeto = {t.getIdTarea(), t.getNombre(), t.getDesc(), t.getEstado(), 
                    t.getFechaInicio(), t.getFechaCierre()};
                modelo.addRow(objeto);
            }
        }
        
        tablaTareas.setModel(modelo);
    }
    
    
}
