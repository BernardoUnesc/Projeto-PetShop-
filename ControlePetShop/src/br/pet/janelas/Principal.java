package br.pet.janelas;

import br.pet.log.Log;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import br.pet.excecoes.LogExceptions;
import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    private final LogExceptions execao = new LogExceptions();
    private final Clientes c_cliente = new Clientes();
    private final Funcionarios funcionario = new Funcionarios();
    private final Animal animal = new Animal();
    private final ControleEstoque controle = new ControleEstoque();
    private final Ajuda ajuda = new Ajuda();
    private final ImageIcon icone;
    private Dimension d;
    private final Color classic = new Color(204, 204, 204);
    private final Color escuro = new Color(82, 63, 33);

    public Principal() {
        initComponents();

        // Configuração da Janela
        this.setLocationRelativeTo(null);
        icone = new ImageIcon("src/br/pet/icones/bigdog.png");
        this.setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")

    public void Janela(JInternalFrame frame) {
        desktopPane_principal.remove(frame);
        desktopPane_principal.add(frame);
        frame.moveToFront();
        frame.setVisible(true);
        Centralizar(frame);
    }

    public void Centralizar(JInternalFrame frame) {
        d = frame.getDesktopPane().getSize();
        frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    }

    public void Log(String msg) {
        try {
            Log.escrever(msg);
        } catch (IOException ex) {
            execao.exception(ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane_principal = new javax.swing.JDesktopPane();
        label_patinhas = new javax.swing.JLabel();
        menu_bar = new javax.swing.JMenuBar();
        menu_cadastros = new javax.swing.JMenu();
        menu_cliente = new javax.swing.JMenuItem();
        menu_funcionario = new javax.swing.JMenuItem();
        menu_animal = new javax.swing.JMenuItem();
        menu_estoque = new javax.swing.JMenuItem();
        menu_ajuda = new javax.swing.JMenu();
        menu_sobre = new javax.swing.JMenuItem();
        menu_tema = new javax.swing.JMenu();
        menu_escuro = new javax.swing.JMenuItem();
        menu_classico = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetControl");

        desktopPane_principal.setBackground(new java.awt.Color(204, 204, 204));

        label_patinhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/pegadas.png"))); // NOI18N

        desktopPane_principal.setLayer(label_patinhas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPane_principalLayout = new javax.swing.GroupLayout(desktopPane_principal);
        desktopPane_principal.setLayout(desktopPane_principalLayout);
        desktopPane_principalLayout.setHorizontalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_patinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 963, Short.MAX_VALUE)
        );
        desktopPane_principalLayout.setVerticalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_patinhas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE)
        );

        menu_bar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_bar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menu_bar.setOpaque(false);

        menu_cadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cadastro.png"))); // NOI18N
        menu_cadastros.setText("Cadastro");
        menu_cadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_cadastros.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        menu_cliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/cliente.png"))); // NOI18N
        menu_cliente.setText("Cadastro de cliente");
        menu_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clienteActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_cliente);

        menu_funcionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/funcionario.png"))); // NOI18N
        menu_funcionario.setText("Cadastro de funcionário");
        menu_funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_funcionarioActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_funcionario);

        menu_animal.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_animal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/dog.png"))); // NOI18N
        menu_animal.setText("Cadastro de animal");
        menu_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_animalActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_animal);

        menu_estoque.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/estoque.png"))); // NOI18N
        menu_estoque.setText("Controle de estoque");
        menu_estoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_estoqueActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_estoque);

        menu_bar.add(menu_cadastros);

        menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/help.png"))); // NOI18N
        menu_ajuda.setText("Ajuda");
        menu_ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_ajuda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        menu_sobre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/ajuda.png"))); // NOI18N
        menu_sobre.setText("Sobre");
        menu_sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_sobreMousePressed(evt);
            }
        });
        menu_ajuda.add(menu_sobre);

        menu_bar.add(menu_ajuda);

        menu_tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/tema.png"))); // NOI18N
        menu_tema.setText("Tema");
        menu_tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_tema.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        menu_escuro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_escuro.setText("Tema Escuro");
        menu_escuro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_escuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_escuroActionPerformed(evt);
            }
        });
        menu_tema.add(menu_escuro);

        menu_classico.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_classico.setText("Tema Clássico");
        menu_classico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_classico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_classicoActionPerformed(evt);
            }
        });
        menu_tema.add(menu_classico);

        menu_bar.add(menu_tema);

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pet/icones/sair.png"))); // NOI18N
        menu_sair.setText("Sair");
        menu_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_sair.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sairMouseClicked(evt);
            }
        });
        menu_bar.add(menu_sair);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Chamacliente(){
        Janela(c_cliente);
    }

    
    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
        Log("!Abriu a janela Cliente");
        Janela(c_cliente);
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void menu_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_funcionarioActionPerformed
        Log("!Abriu a janela Funcionário");
        Janela(funcionario);
    }//GEN-LAST:event_menu_funcionarioActionPerformed

    private void menu_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_animalActionPerformed
        Log("!Abriu a janela Animal");

        Janela(animal);
        animal.PegaPrincipal(this);
    }//GEN-LAST:event_menu_animalActionPerformed

    private void menu_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_estoqueActionPerformed
        Log("!Abriu a janela Controle de Estoque");
        Janela(controle);
    }//GEN-LAST:event_menu_estoqueActionPerformed

    private void menu_sobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobreMousePressed
        Log("!Abriu a janela Ajuda");
        Janela(ajuda);

    }//GEN-LAST:event_menu_sobreMousePressed

    private void menu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sairMouseClicked
        Log("!Clicou em sair");
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Sair", 2);
        if (opcao == 0) {
            Log("!Saiu");
            System.exit(0);
        } else {
            Log("!Cancelou sair");
        }
    }//GEN-LAST:event_menu_sairMouseClicked

    private void menu_escuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_escuroActionPerformed
        desktopPane_principal.setBackground(escuro);
        Log("!Alterou tema para escuro");
    }//GEN-LAST:event_menu_escuroActionPerformed

    private void menu_classicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_classicoActionPerformed
        desktopPane_principal.setBackground(classic);
        Log("!Alterou tema para clássico");
    }//GEN-LAST:event_menu_classicoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane_principal;
    private javax.swing.JLabel label_patinhas;
    private javax.swing.JMenu menu_ajuda;
    private javax.swing.JMenuItem menu_animal;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenuItem menu_classico;
    private javax.swing.JMenuItem menu_cliente;
    private javax.swing.JMenuItem menu_escuro;
    private javax.swing.JMenuItem menu_estoque;
    private javax.swing.JMenuItem menu_funcionario;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenuItem menu_sobre;
    private javax.swing.JMenu menu_tema;
    // End of variables declaration//GEN-END:variables
}
