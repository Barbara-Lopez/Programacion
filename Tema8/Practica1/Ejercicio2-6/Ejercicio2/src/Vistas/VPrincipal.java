/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ejercicio2.Ejercicio2;

/**
 *
 * @author LENOVO
 */
public class VPrincipal extends javax.swing.JFrame {
    private char opcion;
    /**
     * Creates new form NewJFrame
     */
    public VPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bAsistencia = new javax.swing.JButton();
        bListado = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mGuardar = new javax.swing.JMenu();
        mEliminar = new javax.swing.JMenu();
        mActualizar = new javax.swing.JMenu();
        mAsistencia = new javax.swing.JMenu();
        mListado = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        bGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        bGuardar.setToolTipText("Guardar eventos");
        bGuardar.setFocusable(false);
        bGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(bGuardar);

        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        bEliminar.setToolTipText("Eliminar evento");
        bEliminar.setFocusable(false);
        bEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEliminar);

        bActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        bActualizar.setToolTipText("Actualizar evento");
        bActualizar.setFocusable(false);
        bActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(bActualizar);

        bAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/confirmar.png"))); // NOI18N
        bAsistencia.setToolTipText("Asistencia a eventos");
        bAsistencia.setFocusable(false);
        bAsistencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAsistencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAsistenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(bAsistencia);

        bListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/listado.png"))); // NOI18N
        bListado.setToolTipText("Listado del aforo");
        bListado.setFocusable(false);
        bListado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bListado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadoActionPerformed(evt);
            }
        });
        jToolBar1.add(bListado);

        mGuardar.setText("Guardar ");
        mGuardar.setToolTipText("Guardar evento");
        mGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGuardarActionPerformed(evt);
            }
        });
        jMenuBar1.add(mGuardar);

        mEliminar.setText("ELiminar");
        mEliminar.setToolTipText("Eliminar evento");
        mEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarActionPerformed(evt);
            }
        });
        jMenuBar1.add(mEliminar);

        mActualizar.setText("Actualizar");
        mActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarActionPerformed(evt);
            }
        });
        jMenuBar1.add(mActualizar);

        mAsistencia.setText("Asistencia");
        mAsistencia.setToolTipText("Asistencia a eventos");
        mAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAsistenciaActionPerformed(evt);
            }
        });
        jMenuBar1.add(mAsistencia);

        mListado.setText("Listado");
        mListado.setToolTipText("Listado del aforo");
        mListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoActionPerformed(evt);
            }
        });
        jMenuBar1.add(mListado);

        Salir.setText("Salir");
        Salir.setToolTipText("Salir de la aplicación");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 267, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        opcion='g';
        Ejercicio2.opcionElegida(opcion); 
        Ejercicio2.evento();  
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        opcion='e';
        Ejercicio2.opcionElegida(opcion);
        Ejercicio2.evento();
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        opcion='a';
        Ejercicio2.opcionElegida(opcion);
        Ejercicio2.evento();
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoActionPerformed
        
    }//GEN-LAST:event_bListadoActionPerformed

    private void mGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGuardarActionPerformed
        opcion='g';
        Ejercicio2.opcionElegida(opcion);
        Ejercicio2.evento();
    }//GEN-LAST:event_mGuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Ejercicio2.salir();
                
    }//GEN-LAST:event_SalirActionPerformed

    private void mEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarActionPerformed
        opcion='e';
        Ejercicio2.opcionElegida(opcion);
        Ejercicio2.evento();
    }//GEN-LAST:event_mEliminarActionPerformed

    private void mAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAsistenciaActionPerformed
        Ejercicio2.asistencia();
    }//GEN-LAST:event_mAsistenciaActionPerformed

    private void mListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoActionPerformed
        
    }//GEN-LAST:event_mListadoActionPerformed

    private void bAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAsistenciaActionPerformed
        Ejercicio2.asistencia();
    }//GEN-LAST:event_bAsistenciaActionPerformed

    private void mActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarActionPerformed
        opcion='a';
        Ejercicio2.opcionElegida(opcion);
        Ejercicio2.evento();
    }//GEN-LAST:event_mActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bAsistencia;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bListado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mActualizar;
    private javax.swing.JMenu mAsistencia;
    private javax.swing.JMenu mEliminar;
    private javax.swing.JMenu mGuardar;
    private javax.swing.JMenu mListado;
    // End of variables declaration//GEN-END:variables
}
