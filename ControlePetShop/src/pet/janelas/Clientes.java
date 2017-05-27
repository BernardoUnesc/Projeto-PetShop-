package pet.janelas;

import pet.excecoes.Letras;
import pet.excecoes.LimitandoCamposNumericos;
import pet.getset.ClienteGetSet;
import pet.log.Log;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import pet.listeners.CadastroClienteAction;
import pet.excecoes.LogExceptions;

public class Clientes extends javax.swing.JInternalFrame {

    private final CadastroClienteAction cliente = new CadastroClienteAction(this);
    private String cpf;
    private String tel;
    private ClienteGetSet client;
    private final Log log = new Log();
    private final LogExceptions execao = new LogExceptions();

    public Clientes() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/pet/icones/cliente.png"));
        botao_cadastrar_cliente.addActionListener(cliente);
        botao_limpar_cliente.addActionListener(cliente);
        field_idade_cliente.setDocument(new LimitandoCamposNumericos(3));

        field_nome_cliente.setDocument(new Letras());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nome_cliente = new javax.swing.JLabel();
        label_idade_cliente = new javax.swing.JLabel();
        label_cpf_cliente = new javax.swing.JLabel();
        label_telefone_cliente = new javax.swing.JLabel();
        field_nome_cliente = new javax.swing.JTextField();
        label_sexo_cliente = new javax.swing.JLabel();
        comboBox_sexo_cliente = new javax.swing.JComboBox<>();
        field_CPF_cliente = new javax.swing.JFormattedTextField();
        label_endereco_cliente = new javax.swing.JLabel();
        field_endereco_cliente = new javax.swing.JTextField();
        botao_cadastrar_cliente = new javax.swing.JButton();
        field_telefone_cliente = new javax.swing.JFormattedTextField();
        label_email_cliente = new javax.swing.JLabel();
        field_email_cliente = new javax.swing.JTextField();
        field_idade_cliente = new javax.swing.JTextField();
        botao_limpar_cliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setNormalBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setVisible(false);

        label_nome_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_nome_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/cliente.png"))); // NOI18N
        label_nome_cliente.setText(" Nome:");

        label_idade_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_idade_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/calendario.png"))); // NOI18N
        label_idade_cliente.setText("Idade:");
        label_idade_cliente.setDoubleBuffered(true);

        label_cpf_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cpf_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/cpf.png"))); // NOI18N
        label_cpf_cliente.setText("CPF:");

        label_telefone_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_telefone_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/telefone.png"))); // NOI18N
        label_telefone_cliente.setText("Telefone:");

        label_sexo_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_sexo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/sexo.PNG"))); // NOI18N
        label_sexo_cliente.setText("Sexo:");

        comboBox_sexo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        try {
            field_CPF_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        label_endereco_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_endereco_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/mapa.png"))); // NOI18N
        label_endereco_cliente.setText("Endereço:");

        botao_cadastrar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_cadastrar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/add.png"))); // NOI18N
        botao_cadastrar_cliente.setText("Cadastrar");
        botao_cadastrar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_cadastrar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        try {
            field_telefone_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)######### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        label_email_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_email_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/email.png"))); // NOI18N
        label_email_cliente.setText("E-mail:");

        botao_limpar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_limpar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pet/icones/limpar.png"))); // NOI18N
        botao_limpar_cliente.setText("Limpar");
        botao_limpar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao_limpar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_nome_cliente)
                        .addGap(26, 26, 26)
                        .addComponent(field_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_idade_cliente)
                        .addGap(32, 32, 32)
                        .addComponent(field_idade_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_cpf_cliente)
                        .addGap(44, 44, 44)
                        .addComponent(field_CPF_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(comboBox_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(label_telefone_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(field_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_email_cliente)
                        .addGap(32, 32, 32)
                        .addComponent(field_email_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_endereco_cliente)
                        .addGap(10, 10, 10)
                        .addComponent(field_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(botao_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_limpar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nome_cliente)
                    .addComponent(field_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_idade_cliente)
                    .addComponent(field_idade_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_cpf_cliente)
                    .addComponent(field_CPF_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_telefone_cliente)
                    .addComponent(field_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_email_cliente)
                    .addComponent(field_email_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_endereco_cliente)
                    .addComponent(field_endereco_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botao_cadastrar_cliente))
                    .addComponent(botao_limpar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar_cliente;
    private javax.swing.JButton botao_limpar_cliente;
    private javax.swing.JComboBox<String> comboBox_sexo_cliente;
    private javax.swing.JFormattedTextField field_CPF_cliente;
    private javax.swing.JTextField field_email_cliente;
    private javax.swing.JTextField field_endereco_cliente;
    private javax.swing.JTextField field_idade_cliente;
    private javax.swing.JTextField field_nome_cliente;
    private javax.swing.JFormattedTextField field_telefone_cliente;
    private javax.swing.JLabel label_cpf_cliente;
    private javax.swing.JLabel label_email_cliente;
    private javax.swing.JLabel label_endereco_cliente;
    private javax.swing.JLabel label_idade_cliente;
    private javax.swing.JLabel label_nome_cliente;
    private javax.swing.JLabel label_sexo_cliente;
    private javax.swing.JLabel label_telefone_cliente;
    // End of variables declaration//GEN-END:variables

    public ClienteGetSet getcliente() {

        client = new ClienteGetSet();

        cpf = field_CPF_cliente.getText().replaceAll("[-.]", "").trim();
        tel = field_telefone_cliente.getText().replaceAll("[()]", "").trim();

        try {
            client.setCPF(Long.parseLong(cpf));
            client.setTelefone(Long.parseLong(tel));
            client.setIdade(Integer.parseInt(field_idade_cliente.getText()));
        } catch (Exception ex) {
            execao.exception(ex);
        }

        client.setEndereco(field_endereco_cliente.getText().trim());
        client.setNome(field_nome_cliente.getText().trim());
        client.setSexo((String) comboBox_sexo_cliente.getSelectedItem());
        client.setEmail(field_email_cliente.getText().trim());
        limpar();

        return client;

    }

    public void limpar() {
        field_nome_cliente.setText(null);
        field_email_cliente.setText(null);
        field_CPF_cliente.setText(null);
        field_CPF_cliente.setFocusLostBehavior(JFormattedTextField.PERSIST);
        field_endereco_cliente.setText(null);
        field_idade_cliente.setText(null);
        field_telefone_cliente.setText(null);
        field_telefone_cliente.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }

    public boolean Verifica() {
        return !(field_nome_cliente.getText().trim().isEmpty()
                || field_idade_cliente.getText().isEmpty()
                || field_CPF_cliente.getText().replaceAll("[-.]", "").trim().isEmpty()
                || field_email_cliente.getText().trim().isEmpty()
                || field_telefone_cliente.getText().replaceAll("[()]", "").trim().isEmpty()
                || field_endereco_cliente.getText().trim().isEmpty());
    }

}