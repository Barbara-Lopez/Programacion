/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ejercicio1.pkg3.Ejercicio13;

/**
 *
 * @author LENOVO
 */
public class VPrincipal extends javax.swing.JFrame {
    private char cliente;
    private char caso;
    private char abogado;
    /**
     * Creates new form VPrincipal
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPersonas = new javax.swing.JMenu();
        mAltaP = new javax.swing.JMenuItem();
        mBajaP = new javax.swing.JMenuItem();
        mModificarP = new javax.swing.JMenuItem();
        mConsultarP = new javax.swing.JMenuItem();
        mAbogados = new javax.swing.JMenu();
        mAltaA = new javax.swing.JMenuItem();
        mBajaA = new javax.swing.JMenuItem();
        mModificarA = new javax.swing.JMenuItem();
        mConsultarA = new javax.swing.JMenuItem();
        mCasos = new javax.swing.JMenu();
        mAltaC = new javax.swing.JMenuItem();
        mBajaC = new javax.swing.JMenuItem();
        mModificarC = new javax.swing.JMenuItem();
        mConsultarC = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenidos a la empresa");

        mPersonas.setText("Cliente");

        mAltaP.setText("Alta");
        mAltaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaPActionPerformed(evt);
            }
        });
        mPersonas.add(mAltaP);

        mBajaP.setText("Baja");
        mBajaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaPActionPerformed(evt);
            }
        });
        mPersonas.add(mBajaP);

        mModificarP.setText("Modificar");
        mModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificarPActionPerformed(evt);
            }
        });
        mPersonas.add(mModificarP);

        mConsultarP.setText("Consultar");
        mConsultarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultarPActionPerformed(evt);
            }
        });
        mPersonas.add(mConsultarP);

        jMenuBar1.add(mPersonas);

        mAbogados.setText("Abogados");

        mAltaA.setText("Alta");
        mAltaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaAActionPerformed(evt);
            }
        });
        mAbogados.add(mAltaA);

        mBajaA.setText("Baja");
        mBajaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaAActionPerformed(evt);
            }
        });
        mAbogados.add(mBajaA);

        mModificarA.setText("Modificar");
        mModificarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificarAActionPerformed(evt);
            }
        });
        mAbogados.add(mModificarA);

        mConsultarA.setText("Consultar");
        mConsultarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultarAActionPerformed(evt);
            }
        });
        mAbogados.add(mConsultarA);

        jMenuBar1.add(mAbogados);

        mCasos.setText("Casos");

        mAltaC.setText("Alta");
        mAltaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaCActionPerformed(evt);
            }
        });
        mCasos.add(mAltaC);

        mBajaC.setText("Baja");
        mBajaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaCActionPerformed(evt);
            }
        });
        mCasos.add(mBajaC);

        mModificarC.setText("Modificar");
        mModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificarCActionPerformed(evt);
            }
        });
        mCasos.add(mModificarC);

        mConsultarC.setText("Consultar");
        mConsultarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultarCActionPerformed(evt);
            }
        });
        mCasos.add(mConsultarC);

        jMenuBar1.add(mCasos);

        Salir.setText("Salir");
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mConsultarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultarPActionPerformed
        
    }//GEN-LAST:event_mConsultarPActionPerformed

    private void mConsultarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultarAActionPerformed

    }//GEN-LAST:event_mConsultarAActionPerformed

    private void mConsultarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultarCActionPerformed

    }//GEN-LAST:event_mConsultarCActionPerformed

    private void mAltaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaPActionPerformed
        cliente='a';
        Ejercicio13.opcionCliente(cliente);
        Ejercicio13.vCliente();
    }//GEN-LAST:event_mAltaPActionPerformed

    private void mBajaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaPActionPerformed
        cliente='b';
        Ejercicio13.opcionCliente(cliente);
        Ejercicio13.vCliente();
    }//GEN-LAST:event_mBajaPActionPerformed

    private void mModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificarPActionPerformed
        cliente='m';
        Ejercicio13.opcionCliente(cliente);
        Ejercicio13.vCliente();
    }//GEN-LAST:event_mModificarPActionPerformed

    private void mAltaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaAActionPerformed
        abogado='a';
        Ejercicio13.opcionAbogado(abogado);
    }//GEN-LAST:event_mAltaAActionPerformed

    private void mBajaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaAActionPerformed
        abogado='b';
        Ejercicio13.opcionAbogado(abogado);
    }//GEN-LAST:event_mBajaAActionPerformed

    private void mModificarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificarAActionPerformed
        abogado='m';
        Ejercicio13.opcionAbogado(abogado); 
    }//GEN-LAST:event_mModificarAActionPerformed

    private void mAltaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaCActionPerformed
        caso='a';
        Ejercicio13.opcionCaso(caso);
    }//GEN-LAST:event_mAltaCActionPerformed

    private void mBajaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaCActionPerformed
        caso='b';
        Ejercicio13.opcionCaso(caso);
    }//GEN-LAST:event_mBajaCActionPerformed

    private void mModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificarCActionPerformed
        caso='m';
        Ejercicio13.opcionCaso(caso);
    }//GEN-LAST:event_mModificarCActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mAbogados;
    private javax.swing.JMenuItem mAltaA;
    private javax.swing.JMenuItem mAltaC;
    private javax.swing.JMenuItem mAltaP;
    private javax.swing.JMenuItem mBajaA;
    private javax.swing.JMenuItem mBajaC;
    private javax.swing.JMenuItem mBajaP;
    private javax.swing.JMenu mCasos;
    private javax.swing.JMenuItem mConsultarA;
    private javax.swing.JMenuItem mConsultarC;
    private javax.swing.JMenuItem mConsultarP;
    private javax.swing.JMenuItem mModificarA;
    private javax.swing.JMenuItem mModificarC;
    private javax.swing.JMenuItem mModificarP;
    private javax.swing.JMenu mPersonas;
    // End of variables declaration//GEN-END:variables
}