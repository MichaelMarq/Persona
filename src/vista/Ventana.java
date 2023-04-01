
package vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;


public class Ventana extends javax.swing.JFrame {
    
    //Objetos
    
    private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
    private DefaultTableModel modeloTable = new DefaultTableModel();

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        llenarModeloComboBox();
        agregarModeloTabla();
        this.setTitle("Insertar persona");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //Llenar el modelo de datos para la tabla
    private void llenarModeloComboBox(){
        modelo.addElement(new Persona("Jose", "Zambrano", "jose@hotmail.com", "0888888", "calle anonima"));
        modelo.addElement(new Persona("Juan", "Pérez", "juan.perez@example.com", "555-1234", "Calle 123, Ciudad"));
        modelo.addElement(new Persona("María", "González", "maria.gonzalez@example.com", "555-5678", "Avenida 456, Pueblo"));
        modelo.addElement(new Persona("Pedro", "Sánchez", "pedro.sanchez@example.com", "555-9012", "Calle 789, Villa"));
        modelo.addElement(new Persona("Ana", "Martínez", "ana.martinez@example.com", "555-3456", "Calle 234, Ciudad"));
        modelo.addElement(new Persona("Miguel", "López", "miguel.lopez@example.com", "555-7890", "Avenida 901, Pueblo"));
        modelo.addElement(new Persona("Luisa", "Hernández", "luisa.hernandez@example.com", "555-2345", "Calle 567, Villa"));
        modelo.addElement(new Persona("Pablo", "García", "pablo.garcia@example.com", "555-6789", "Calle 123, Ciudad"));
        modelo.addElement(new Persona("Laura", "Díaz", "laura.diaz@example.com", "555-0123", "Avenida 456, Pueblo"));
        modelo.addElement(new Persona("Diego", "Rojas", "diego.rojas@example.com", "555-4567", "Calle 789, Villa"));
        modelo.addElement(new Persona("Carla", "Fernández", "carla.fernandez@example.com", "555-8901", "Calle 234, Ciudad"));
        
    }
    
    //Agregar columnas a la tabla
    private void agregarModeloTabla(){
        modeloTable.addColumn("Nombre");
        modeloTable.addColumn("Apellido");
        modeloTable.addColumn("Email");
        modeloTable.addColumn("Celular");
        modeloTable.addColumn("Direccion");
        
    }

    //initComponents
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaPersona = new javax.swing.JLabel();
        cbxPersona = new javax.swing.JComboBox<>();
        btnInsertar = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        separator = new javax.swing.JSeparator();
        lbDatos = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPersona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPersona.setText("Persona");

        cbxPersona.setModel(modelo);

        btnInsertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnInsertar.setText("Insertar Persona");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        table.setModel(modeloTable);

        ListSelectionListener oyenteDeSeleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    int filaSeleccionada = table.getSelectedRow();

                    txtNombre.setText((String) modeloTable.getValueAt(filaSeleccionada, 0));
                    txtApellido.setText((String) modeloTable.getValueAt(filaSeleccionada, 1));
                    txtEmail.setText((String) modeloTable.getValueAt(filaSeleccionada, 2));
                    txtCelular.setText((String) modeloTable.getValueAt(filaSeleccionada, 3));
                    txtDireccion.setText((String) modeloTable.getValueAt(filaSeleccionada, 4));

                }

            }
        };

        table.getSelectionModel().addListSelectionListener(oyenteDeSeleccion);
        scrollTable.setViewportView(table);

        lbDatos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lbDatos.setText("Datos de la persona");

        lbNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNombre.setText("Nombres");

        lbApellido.setText("Apellidos");

        lbEmail.setText("Email");

        lbCelular.setText("Celular");

        lbDireccion.setText("Direccion");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDatos)
                            .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(cbxPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etiquetaPersona)
                            .addComponent(separator)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCelular)
                                    .addComponent(txtApellido)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbApellido)
                        .addGap(174, 174, 174))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etiquetaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar))
                .addGap(35, 35, 35)
                .addComponent(scrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDatos)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento del boton insertar
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        Persona p = (Persona)cbxPersona.getSelectedItem();
        String nombre = p.getNombre();
        String apellido = p.getApellido();
        String email = p.getEmail();
        String celular = p.getCelular();
        String direccion = p.getDireccion();
        
        String personas [] = {nombre,apellido,email,celular,direccion};
        
        modeloTable.addRow(personas);
    }//GEN-LAST:event_btnInsertarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<Persona> cbxPersona;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbDatos;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
