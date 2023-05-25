package tarea6;

public class Tarea6_JFrame extends javax.swing.JFrame {

    Fichero objetofichero;
    
    public Tarea6_JFrame() {
        initComponents();
        objetofichero=new Fichero();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CodigoTxt = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JTextField();
        CantidadTxt = new javax.swing.JTextField();
        DescripcionTxt = new javax.swing.JTextField();
        InsertarBtn = new javax.swing.JButton();
        BuscarBtn = new javax.swing.JButton();
        ModificarBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        MostrarBtn = new javax.swing.JButton();
        SalirBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BuscarCodigoIntroducido = new javax.swing.JTextField();
        BorrarCodigoIntroducido = new javax.swing.JTextField();
        ModificarCodigoIntroducido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        javax.swing.JButton BuscarII = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BuscarEspecialTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 222, 222));
        setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(300, 300));

        lista.setColumns(20);
        lista.setRows(5);
        jScrollPane1.setViewportView(lista);

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Descripción");

        CodigoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTxtActionPerformed(evt);
            }
        });

        NombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTxtActionPerformed(evt);
            }
        });

        CantidadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadTxtActionPerformed(evt);
            }
        });

        DescripcionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionTxtActionPerformed(evt);
            }
        });

        InsertarBtn.setText("Insertar");
        InsertarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarBtnActionPerformed(evt);
            }
        });

        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        ModificarBtn.setText("Modificar");
        ModificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        MostrarBtn.setText("Mostrar Todo");
        MostrarBtn.setToolTipText("");
        MostrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBtnActionPerformed(evt);
            }
        });

        SalirBtn.setText("Salir");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("     Listado de productos");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BuscarCodigoIntroducido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCodigoIntroducidoActionPerformed(evt);
            }
        });

        BorrarCodigoIntroducido.setToolTipText("");

        ModificarCodigoIntroducido.setToolTipText("");
        ModificarCodigoIntroducido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCodigoIntroducidoActionPerformed(evt);
            }
        });

        jLabel6.setText("Introduzca aquí el código exacto y pulse Buscar");

        jLabel7.setText("Introduzca aquí el código, rellene los campos");

        jLabel8.setText("Introduzca aquí el código y pulse Borrar");

        jLabel9.setText("\"Nombre\", \"Cantidad\" y \"Descripción\" y pulse Modificar ");

        BuscarII.setText("Buscar II");
        BuscarII.setToolTipText("");
        BuscarII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarIIActionPerformed(evt);
            }
        });

        jLabel10.setText("Introduzca aquí una parte del código y pulse Buscar II");

        BuscarEspecialTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEspecialTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModificarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(BuscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BuscarII, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel10)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel6)
                                        .addGap(44, 44, 44)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ModificarCodigoIntroducido, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(BuscarEspecialTxt)
                                    .addComponent(BuscarCodigoIntroducido)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BorrarCodigoIntroducido))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(InsertarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CodigoTxt)
                            .addComponent(NombreTxt)
                            .addComponent(CantidadTxt)
                            .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(MostrarBtn)
                        .addGap(42, 42, 42)
                        .addComponent(SalirBtn)
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CodigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(InsertarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarBtn)
                            .addComponent(BuscarCodigoIntroducido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarEspecialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarII))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModificarCodigoIntroducido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificarBtn))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(BorrarCodigoIntroducido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarBtn)
                    .addComponent(SalirBtn))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBtnActionPerformed
        lista.setText(objetofichero.Mostrar());
        
    }//GEN-LAST:event_MostrarBtnActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        lista.setText(null);
        lista.setText(objetofichero.Buscar(BuscarCodigoIntroducido.getText()));
        BuscarCodigoIntroducido.setText(null);
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void ModificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBtnActionPerformed
        lista.setText(null);
        lista.setText(objetofichero.modificar(ModificarCodigoIntroducido.getText(), NombreTxt.getText(), CantidadTxt.getText(), DescripcionTxt.getText()));
        CodigoTxt.setText(null);
        NombreTxt.setText(null);
        CantidadTxt.setText(null);
        DescripcionTxt.setText(null);
        ModificarCodigoIntroducido.setText(null);
    }//GEN-LAST:event_ModificarBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        lista.setText(null);
        lista.setText(objetofichero.Borrar(BorrarCodigoIntroducido.getText()));  
        BorrarCodigoIntroducido.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        objetofichero.salvar();
        System.exit(0);
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void CodigoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTxtActionPerformed
        
    }//GEN-LAST:event_CodigoTxtActionPerformed

    private void NombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTxtActionPerformed
        
    }//GEN-LAST:event_NombreTxtActionPerformed

    private void CantidadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadTxtActionPerformed
        
    }//GEN-LAST:event_CantidadTxtActionPerformed

    private void DescripcionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionTxtActionPerformed
        
    }//GEN-LAST:event_DescripcionTxtActionPerformed

    private void InsertarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarBtnActionPerformed
        lista.setText(objetofichero.insertar(CodigoTxt.getText(), NombreTxt.getText(), CantidadTxt.getText(), DescripcionTxt.getText()));
        
        CodigoTxt.setText(null);
        NombreTxt.setText(null);
        CantidadTxt.setText(null);
        DescripcionTxt.setText(null);
    }//GEN-LAST:event_InsertarBtnActionPerformed

    private void ModificarCodigoIntroducidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCodigoIntroducidoActionPerformed
        
    }//GEN-LAST:event_ModificarCodigoIntroducidoActionPerformed

    private void BuscarCodigoIntroducidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCodigoIntroducidoActionPerformed
        BuscarCodigoIntroducido.setText(null);
        BuscarCodigoIntroducido.requestFocus();
    }//GEN-LAST:event_BuscarCodigoIntroducidoActionPerformed

    private void BuscarIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarIIActionPerformed
        lista.setText(null);
        lista.setText(objetofichero.Buscar2(BuscarEspecialTxt.getText()));
        BuscarEspecialTxt.setText(null);
    }//GEN-LAST:event_BuscarIIActionPerformed

    private void BuscarEspecialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEspecialTxtActionPerformed
        
    }//GEN-LAST:event_BuscarEspecialTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Tarea6_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea6_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea6_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea6_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
         
            public void run() {
                new Tarea6_JFrame().setVisible(true);
            }
        }
      );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BorrarCodigoIntroducido;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTextField BuscarCodigoIntroducido;
    private javax.swing.JTextField BuscarEspecialTxt;
    private javax.swing.JTextField CantidadTxt;
    private javax.swing.JTextField CodigoTxt;
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JButton InsertarBtn;
    private javax.swing.JButton ModificarBtn;
    private javax.swing.JTextField ModificarCodigoIntroducido;
    private javax.swing.JButton MostrarBtn;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lista;
    // End of variables declaration//GEN-END:variables
}
