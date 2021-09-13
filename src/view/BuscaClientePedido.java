/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BuscaClientePedido extends javax.swing.JFrame {

    /**
     * Creates new form BuscaClientePedido
     */
    
    String nomeCliente;
    
    private static Scanner input;
    public BuscaClientePedido() {
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
        nomeClienteBuscaPedido = new javax.swing.JTextField();
        buscarClientePedidopq = new javax.swing.JButton();
        adicionarNomeClientePedido = new javax.swing.JButton();

        jLabel1.setText("Cliente :");

        buscarClientePedidopq.setText("Buscar");
        buscarClientePedidopq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientePedidopqActionPerformed(evt);
            }
        });

        adicionarNomeClientePedido.setText("Adicionar");
        adicionarNomeClientePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarNomeClientePedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarClientePedidopq, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarNomeClientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeClienteBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarClientePedidopq)
                    .addComponent(adicionarNomeClientePedido))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public  String retornaNome(){
        return nomeCliente;
        
    }
    private void adicionarNomeClientePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarNomeClientePedidoActionPerformed
        // TODO add your handling code here:
        // Adiciona o nome do cliente na tela de busca do pedido
        BuscaClientePedido busca= new BuscaClientePedido();
        busca.retornaNome();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_adicionarNomeClientePedidoActionPerformed

    private void buscarClientePedidopqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientePedidopqActionPerformed
        // TODO add your handling code here:
        String nome= nomeClienteBuscaPedido.getText();
        
  try{
        input = new Scanner(Paths.get("C:/sabineM/arq_01.txt"));
    }catch (IOException ioException){
        System.err.println("Error opening file. Terminating.");
        System.exit(1);
    }
  
    Pattern termo= compile(nome) ;
   
try{
    
    while (input.hasNext()) // enquanto houver mais para ler
    {
        String l= input.next();
        
        if(l.equals(nome)){   
        
        //TODO 
        nomeCliente= l;
        break;
        }else{
            
            
        }
        
        
    }// fecha while
    
    
}catch (NoSuchElementException elementException){
    System.err.println("File improperly formed. Terminating.");
}
   if (input != null){
        input.close();
    }
   
   
    }//GEN-LAST:event_buscarClientePedidopqActionPerformed

    
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
            java.util.logging.Logger.getLogger(BuscaClientePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaClientePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaClientePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaClientePedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaClientePedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarNomeClientePedido;
    private javax.swing.JButton buscarClientePedidopq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomeClienteBuscaPedido;
    // End of variables declaration//GEN-END:variables

   
}
