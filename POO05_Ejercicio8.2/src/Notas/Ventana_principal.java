/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

/**
 *
 * @author juanc
 */
public class Ventana_principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_principal
     */
    public Ventana_principal() {
        initComponents();
        Nota1.setText("Nota 1: ");
        Nota2.setText("Nota 2: ");  
        Nota3.setText("Nota 3: ");
        Nota4.setText("Nota 4: "); 
        Nota5.setText("Nota 5: "); 
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText("");
        Promedio.setText("");
        Desviacion.setText("");
        Mayor.setText("");
        Menor.setText("");
        setTitle("Notas");
        setSize(380,580);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcular = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        campoNota1 = new javax.swing.JTextField();
        campoNota2 = new javax.swing.JTextField();
        campoNota3 = new javax.swing.JTextField();
        campoNota4 = new javax.swing.JTextField();
        Nota1 = new javax.swing.JLabel();
        Nota2 = new javax.swing.JLabel();
        Nota3 = new javax.swing.JLabel();
        Nota4 = new javax.swing.JLabel();
        Promedio = new javax.swing.JLabel();
        Desviacion = new javax.swing.JLabel();
        Menor = new javax.swing.JLabel();
        Mayor = new javax.swing.JLabel();
        Nota5 = new javax.swing.JLabel();
        campoNota5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        campoNota1.setText("jTextField1");
        campoNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNota1ActionPerformed(evt);
            }
        });

        campoNota2.setText("jTextField2");
        campoNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNota2ActionPerformed(evt);
            }
        });

        campoNota3.setText("jTextField3");

        campoNota4.setText("jTextField4");

        Nota1.setText("Nota1:");

        Nota2.setText("Nota2:");

        Nota3.setText("Nota3:");

        Nota4.setText("Nota4:");

        Promedio.setText("Promedio=");

        Desviacion.setText("Desviacion=");

        Menor.setText("Menor=");

        Mayor.setText("Mayor=");

        Nota5.setText("Nota5:");

        campoNota5.setText("jTextField5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nota5)
                    .addComponent(Nota1)
                    .addComponent(Nota2)
                    .addComponent(Nota3)
                    .addComponent(Nota4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mayor)
                    .addComponent(Menor)
                    .addComponent(Desviacion)
                    .addComponent(Promedio)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcular)
                        .addGap(35, 35, 35)
                        .addComponent(limpiar))
                    .addComponent(campoNota4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(campoNota3)
                    .addComponent(campoNota2)
                    .addComponent(campoNota1)
                    .addComponent(campoNota5))
                .addGap(0, 71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota1)
                    .addComponent(campoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota2)
                    .addComponent(campoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota3)
                    .addComponent(campoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota4)
                    .addComponent(campoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nota5)
                    .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addComponent(Promedio)
                .addGap(18, 18, 18)
                .addComponent(Desviacion)
                .addGap(18, 18, 18)
                .addComponent(Menor)
                .addGap(18, 18, 18)
                .addComponent(Mayor)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNota1ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        if (evt.getSource() == calcular) { /* Si se pulsa el botón
            Calcular */
            Notas notas = new Notas(); // Se crea un objeto Notas
            // Se obtiene y convierte el valor numérico de la nota 1
            notas.lista_notas[0] = Double.parseDouble(campoNota1.getText());
            // Se obtiene y convierte el valor numérico de la nota 2
            notas.lista_notas[1] = Double.parseDouble(campoNota2.getText());
            // Se obtiene y convierte el valor numérico de la nota 3
            notas.lista_notas[2] = Double.parseDouble(campoNota3.getText());
            // Se obtiene y convierte el valor numérico de la nota 4
            notas.lista_notas[3] = Double.parseDouble(campoNota4.getText());
            // Se obtiene y convierte el valor numérico de la nota 5
            notas.lista_notas[4] = Double.parseDouble(campoNota5.getText());
            notas.calcular_promedio(); // Se calcula el promedio
            notas.calcular_desviacion(); // Se calcula la desviación
            // Se muestra el promedio formateado
            Promedio.setText("Promedio = " + String.valueOf(String.format("%.2f",notas.calcular_promedio())));
            double desv = notas.calcular_desviacion();
            // Se muestra la desviación formateada
            Desviacion.setText("Desviación estándar = " + String.format("%.2f", desv));
            // Se muestra el valor mayor formateado
            Mayor.setText("Valor mayor = " + String.valueOf(notas.calcular_mayor()));
            // Se muestra el valor menor formateado
            Menor.setText("Valor menor = " + String.valueOf(notas.calcular_menor()));
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void campoNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNota2ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText(""); 
        Promedio.setText("");
        Desviacion.setText("");
        Mayor.setText("");
        Menor.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Desviacion;
    private javax.swing.JLabel Mayor;
    private javax.swing.JLabel Menor;
    private javax.swing.JLabel Nota1;
    private javax.swing.JLabel Nota2;
    private javax.swing.JLabel Nota3;
    private javax.swing.JLabel Nota4;
    private javax.swing.JLabel Nota5;
    private javax.swing.JLabel Promedio;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoNota1;
    private javax.swing.JTextField campoNota2;
    private javax.swing.JTextField campoNota3;
    private javax.swing.JTextField campoNota4;
    private javax.swing.JTextField campoNota5;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables
}
