/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termometro;
/**
 *
 * @author AlumnoT
 */

public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextFieldNumeros = new javax.swing.JTextField();
        jRadioButtonC = new javax.swing.JRadioButton();
        jRadioButtonK = new javax.swing.JRadioButton();
        jRadioButtonF = new javax.swing.JRadioButton();
        checkboxC = new java.awt.Checkbox();
        checkboxK = new java.awt.Checkbox();
        checkboxF = new java.awt.Checkbox();
        jLabelC = new javax.swing.JLabel();
        jLabelK = new javax.swing.JLabel();
        jLabelF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelSiglaText = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        buttonGroup1.add(jRadioButtonC);
        jRadioButtonC.setText("Cº");
        jRadioButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonK);
        jRadioButtonK.setText("K");
        jRadioButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonF);
        jRadioButtonF.setText("F");
        jRadioButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFActionPerformed(evt);
            }
        });

        checkboxC.setLabel("Cº");

        checkboxK.setLabel("K");

        checkboxF.setLabel("F");

        jLabelC.setText("Cº");

        jLabelK.setText("K");

        jLabelF.setText("F");

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonC)
                            .addComponent(checkboxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jTextFieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSiglaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonK)
                            .addComponent(checkboxK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelK))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelF)
                            .addComponent(checkboxF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSiglaText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonC)
                            .addComponent(jRadioButtonK)
                            .addComponent(jRadioButtonF))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkboxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(checkboxF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelC)
                    .addComponent(jLabelK)
                    .addComponent(jLabelF))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKActionPerformed
        // TODO add your handling code here:
        labelSiglaText.setText("K");
    }//GEN-LAST:event_jRadioButtonKActionPerformed

    private void jRadioButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCActionPerformed
        // TODO add your handling code here:
        labelSiglaText.setText("Cº");
    }//GEN-LAST:event_jRadioButtonCActionPerformed

    private void jRadioButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFActionPerformed
        // TODO add your handling code here:
        labelSiglaText.setText("F");
    }//GEN-LAST:event_jRadioButtonFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jLabelC.setText("Cº");
        jLabelF.setText("F");
        jLabelK.setText("K");

        if (jRadioButtonC.isSelected()) { // RadioButton Celsius
            if (checkboxC.getState() == true) { // Celsius
                jLabelC.setText(jTextFieldNumeros.getText());
            }
            if (checkboxF.getState() == true) { // Fahrenheit
                float f = Float.parseFloat(jTextFieldNumeros.getText());
                jLabelF.setText(Metodos.celsiusToFahrenheit(f));
            }
            if (checkboxK.getState() == true) { // Kelvin
                float f = Float.parseFloat(jTextFieldNumeros.getText());
                jLabelK.setText(Metodos.celsiusToKelvin(f));
            }
        } else if (jRadioButtonF.isSelected()) { // RadioButton Fahrenheit
            if (checkboxC.getState() == true) { // Celsius
                float f = Float.parseFloat(jTextFieldNumeros.getText());
                jLabelC.setText(Metodos.fahrenheitToCelsius(f));
            }
            if (checkboxF.getState() == true) { // Fahrenheit
                jLabelF.setText(jTextFieldNumeros.getText());
            }
            if (checkboxK.getState() == true) { // Kelvin
                float f = Float.parseFloat(jTextFieldNumeros.getText());
                jLabelK.setText(Metodos.fahrenheitToKelvin(f));
            }
        } else if (jRadioButtonK.isSelected()) { // RadioButton Kelvin
            if (checkboxC.getState() == true) { // Celsius
                float f = Float.parseFloat(jTextFieldNumeros.getText());
                jLabelC.setText(Metodos.kelvinToCelsius(f));
            }
            if (checkboxF.getState() == true) { // Fahrenheit
                float f = Float.parseFloat(jTextFieldNumeros.getText());
                jLabelF.setText(Metodos.kelvinToFahrenheit(f));
            }
            if (checkboxK.getState() == true) { // Kelvin
                jLabelK.setText(jTextFieldNumeros.getText());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Checkbox checkboxC;
    private java.awt.Checkbox checkboxF;
    private java.awt.Checkbox checkboxK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelF;
    private javax.swing.JLabel jLabelK;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonF;
    private javax.swing.JRadioButton jRadioButtonK;
    private javax.swing.JTextField jTextFieldNumeros;
    private java.awt.Label labelSiglaText;
    // End of variables declaration//GEN-END:variables
}