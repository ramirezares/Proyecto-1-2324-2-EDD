/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package _06_Interfaces;

/**
 *
 * @author AresR
 */
public class Welcome extends javax.swing.JFrame {
    
    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();                       
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        BContinue = new javax.swing.JButton();
        titleInstruction = new javax.swing.JLabel();
        InstructionsComplete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Welcome.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("Bienvenido");

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_07_Images/HormigaVistaAerea.png"))); // NOI18N

        BContinue.setText("Continuar");
        BContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContinueActionPerformed(evt);
            }
        });

        titleInstruction.setText("Instrucciones:");

        InstructionsComplete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InstructionsComplete.setText("<html>  El programa a ejecutar implementa un algoritmo de optimización basado en el comportamiento de colonias de hormigas.  En las distintas ventanas se encuentra un botón \"Actualizar\" que permite realizar  los cambios deseados a la hora de buscar, selecionar y modificar campos  antes de iniciar la simulacion. Use este boton cada vez que realice algun cambio.  <br> <br> Debe cargar un grafo para usar el resto de las funcionalizades del programa, para ello dispondra del boton cargar y un archivo de texto con la estructura correcta para crear un grafo.  <br> <br> Al finalizar el programa, en caso de haber modificado el grafo el boton guardar le permite seleccionar un archivo de texto donde guardar el grafo.  <br> <br> En la carpeta test se encuentran dos archivos de texto para tales fines. <br>  <br> La funcion de mostrar grafo presenta graficamente el grafo que contiene el programa. De ser necesario puede pulsar varias veces en el botón para obtener la vista aerea y no tridimensional del grafo. <br> ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(InstructionsComplete, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(BContinue))
                            .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Welcome)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleInstruction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InstructionsComplete, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BContinue)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContinueActionPerformed
        this.setVisible(false);
        Menu menuWindouw = new Menu();
        menuWindouw.setVisible(true);
    }//GEN-LAST:event_BContinueActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BContinue;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel InstructionsComplete;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel titleInstruction;
    // End of variables declaration//GEN-END:variables
}
