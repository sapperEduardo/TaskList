
package vista;

import java.awt.Image;
import java.io.File;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import logica.Controlador;
import logica.Tarea;




public class Principal extends javax.swing.JFrame {

    private Controlador control = null;
    
    
    public Principal() {
        
        Image icono = new ImageIcon(getClass().getResource("/icono2.png")).getImage();
        setIconImage(icono);
        
        this.setResizable(false);
        setTitle("Lista de tareas");
        control = new Controlador();
        initComponents();
        cargarTabla();
        this.setTitle("Lista de tareas");
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        btnTXT = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lista de tareas");

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnTerminar.setBackground(new java.awt.Color(255, 255, 255));
        btnTerminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        btnTerminar.setText("Terminar");
        btnTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnTXT.setBackground(new java.awt.Color(255, 255, 255));
        btnTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/txt.png"))); // NOI18N
        btnTXT.setText("TXT (5D)");
        btnTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTXTActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNueva.setBackground(new java.awt.Color(255, 255, 255));
        btnNueva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnNueva.setText("Nueva");
        btnNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTXTActionPerformed
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
                    Mensajero.Mensaje("NO SE ELIGIO NINGUNA RUTA", "info", "Generar TXT");
                }
            }else{
                Mensajero.Mensaje("NO HAY TAREAS PARA REALIZAR \nA MENOS DE 5 DIAS", "info", "Generar TXT");
            }
        }else{
            Mensajero.Mensaje("NO EXISTE NINGUNA TAREA!", "error", "Generar TXT");
        }

    }//GEN-LAST:event_btnTXTActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        if(tablaTareas.getRowCount() > 0){
            int filaSelec = tablaTareas.getSelectedRow();
            if(filaSelec != -1){
                int id = (int) tablaTareas.getValueAt(tablaTareas.getSelectedRow(), 0);

                boolean seTermino = control.terminarTarea(id);

                if(seTermino){
                    Mensajero.Mensaje("LA TAREA HA SIDO TERMINADA!", "info", "Terminar tarea");
                    this.cargarTabla();
                }else{
                    boolean eliminar = Mensajero.eliminar();

                    if (eliminar){
                        control.eliminarTarea(id);
                        Mensajero.Mensaje("TAREA ELIMINADA EXITOSAMENTE!", "info", "Eliminacion de tarea");
                        this.cargarTabla();
                    }

                }

            }else{
                Mensajero.Mensaje("DEBE SELECCIONAR UNA TAREA!", "error", "Seleccion de tarea");
            }
        }else{
            Mensajero.Mensaje("NO EXISTE NINGUNA TAREA!", "error", "Editar tarea");
        }
    }//GEN-LAST:event_btnTerminarActionPerformed

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

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnTXT;
    private javax.swing.JButton btnTerminar;
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
