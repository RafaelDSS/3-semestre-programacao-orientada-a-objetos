/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author rafael
 */
public class Triangulo extends javax.swing.JFrame {

    /**
     * Creates new form Triangulo
     */
    public Triangulo() {
        initComponents();
        
        
        // Seta os valores iniciais dos slides nos seus respectivos labels.
        lblSliderSeguimentoA.setText(String.valueOf(sldSeguimentoA.getValue()));
        lblSliderSeguimentoB.setText(String.valueOf(sldSeguimentoB.getValue()));
        lblSliderSeguimentoC.setText(String.valueOf(sldSeguimentoC.getValue()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sldSeguimentoB = new javax.swing.JSlider();
        sldSeguimentoA = new javax.swing.JSlider();
        sldSeguimentoC = new javax.swing.JSlider();
        lblSeguimentoA = new javax.swing.JLabel();
        lblSeguimentoB = new javax.swing.JLabel();
        lblSeguimentoC = new javax.swing.JLabel();
        lblImagemTriangulo = new javax.swing.JLabel();
        btnVerificaTriangulo = new javax.swing.JButton();
        lblETrianguloResultado = new javax.swing.JLabel();
        lblTipoTrianguloResultado = new javax.swing.JLabel();
        lblSliderSeguimentoA = new javax.swing.JLabel();
        lblSliderSeguimentoB = new javax.swing.JLabel();
        lblSliderSeguimentoC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sldSeguimentoB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSeguimentoBStateChanged(evt);
            }
        });

        sldSeguimentoA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSeguimentoAStateChanged(evt);
            }
        });

        sldSeguimentoC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSeguimentoCStateChanged(evt);
            }
        });

        lblSeguimentoA.setText("Segmento A");

        lblSeguimentoB.setText("Segmento B");

        lblSeguimentoC.setText("Segmento C");

        lblImagemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangulo.png"))); // NOI18N

        btnVerificaTriangulo.setText("Verificar");
        btnVerificaTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificaTrianguloActionPerformed(evt);
            }
        });

        lblETrianguloResultado.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblETrianguloResultado.setForeground(new java.awt.Color(41, 97, 243));

        lblTipoTrianguloResultado.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblTipoTrianguloResultado.setForeground(new java.awt.Color(207, 23, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeguimentoC)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeguimentoA)
                                    .addComponent(lblSeguimentoB))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sldSeguimentoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSliderSeguimentoB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sldSeguimentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSliderSeguimentoC))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sldSeguimentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSliderSeguimentoA)))
                                .addGap(39, 39, 39)
                                .addComponent(lblImagemTriangulo)))
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblETrianguloResultado)
                            .addComponent(lblTipoTrianguloResultado))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagemTriangulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblSeguimentoA))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSliderSeguimentoA)
                                    .addComponent(sldSeguimentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSeguimentoB)
                                .addComponent(sldSeguimentoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSliderSeguimentoB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSeguimentoC)
                            .addComponent(sldSeguimentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSliderSeguimentoC, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(26, 26, 26)
                .addComponent(btnVerificaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblETrianguloResultado)
                .addGap(29, 29, 29)
                .addComponent(lblTipoTrianguloResultado)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificaTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificaTrianguloActionPerformed
        
        int seguimentoA = sldSeguimentoA.getValue();
        int seguimentoB = sldSeguimentoB.getValue();
        int seguimentoC = sldSeguimentoC.getValue();
        int temp;
        boolean formaTriangulo = false;
        String nomeTriangulo = "";
        
        
        // Ordena as váriaveis, de modo que, seguimentoA > seguimentoB > seguimentoC;
        if (seguimentoA < seguimentoB) {
            temp = seguimentoA;
            seguimentoA = seguimentoB;
            seguimentoB = temp;
        }
        if (seguimentoB < seguimentoC) {
            temp = seguimentoB;
            seguimentoB = seguimentoC;
            seguimentoC = temp;
        }
        if (seguimentoA < seguimentoB) {
            temp = seguimentoA;
            seguimentoA = seguimentoB;
            seguimentoB = temp;
        }
        
        
        // Verifica os tipos de triângulos
        if (seguimentoA >= (seguimentoB + seguimentoC)){
                formaTriangulo = false;
        }
        else if ((seguimentoA * seguimentoA) == (seguimentoB * seguimentoB + seguimentoC * seguimentoC)){
                nomeTriangulo = "Triângulo Retângulo";
                formaTriangulo = true;
        }
        else if ((seguimentoA * seguimentoA) > (seguimentoB * seguimentoB + seguimentoC * seguimentoC)){
                nomeTriangulo = "Triângulo Obtusângulo";
                formaTriangulo = true;
        }
        else if ((seguimentoA * seguimentoA) < (seguimentoB * seguimentoB + seguimentoC * seguimentoC)){
                nomeTriangulo = "Triângulo Acutângulo";
                formaTriangulo = true;
        }
        if (seguimentoA == seguimentoB && seguimentoB == seguimentoC){
                nomeTriangulo = "Triângulo Equilátero";
                formaTriangulo = true;
        }
        else if (seguimentoA == seguimentoB || seguimentoB == seguimentoC){
                nomeTriangulo = "Triângulo Isósceles";
                formaTriangulo = true;
        }
        
        if (formaTriangulo) {
            lblETrianguloResultado.setText("Formam um Triângulo");
            lblTipoTrianguloResultado.setText(nomeTriangulo);
        }
        else {
            lblETrianguloResultado.setText("Não formam um Triângulo");
            lblTipoTrianguloResultado.setText("");
        }
    }//GEN-LAST:event_btnVerificaTrianguloActionPerformed

    private void sldSeguimentoAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSeguimentoAStateChanged
        lblSliderSeguimentoA.setText(String.valueOf(sldSeguimentoA.getValue()));
    }//GEN-LAST:event_sldSeguimentoAStateChanged

    private void sldSeguimentoBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSeguimentoBStateChanged
        lblSliderSeguimentoB.setText(String.valueOf(sldSeguimentoB.getValue()));
    }//GEN-LAST:event_sldSeguimentoBStateChanged

    private void sldSeguimentoCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSeguimentoCStateChanged
        lblSliderSeguimentoC.setText(String.valueOf(sldSeguimentoC.getValue()));
    }//GEN-LAST:event_sldSeguimentoCStateChanged

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
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificaTriangulo;
    private javax.swing.JLabel lblETrianguloResultado;
    private javax.swing.JLabel lblImagemTriangulo;
    private javax.swing.JLabel lblSeguimentoA;
    private javax.swing.JLabel lblSeguimentoB;
    private javax.swing.JLabel lblSeguimentoC;
    private javax.swing.JLabel lblSliderSeguimentoA;
    private javax.swing.JLabel lblSliderSeguimentoB;
    private javax.swing.JLabel lblSliderSeguimentoC;
    private javax.swing.JLabel lblTipoTrianguloResultado;
    private javax.swing.JSlider sldSeguimentoA;
    private javax.swing.JSlider sldSeguimentoB;
    private javax.swing.JSlider sldSeguimentoC;
    // End of variables declaration//GEN-END:variables
}
