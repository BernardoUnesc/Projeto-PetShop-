package Janelas;

import Exceções.Letras;
import Exceções.LimitandoCamposNumericos;
import Exceções.Numeros;
import Get_Set.Animal_Get_Set;
import ActionListeners.AnimaisAction;
import Exceções.LogExceptions;
import javax.swing.ImageIcon;

public class Animal extends javax.swing.JInternalFrame {

    private final AnimaisAction animais = new AnimaisAction(this);
    private Animal_Get_Set ani;
    private LogExceptions execao = new LogExceptions();

    public Animal() {
        initComponents();

        this.setFrameIcon(new ImageIcon("src/Icones/dog.png"));

        botao_cadastrar_animais.addActionListener(animais);
        botao_limpar_animais.addActionListener(animais);

        field_altura.setDocument(new Numeros());
        field_idade_animal.setDocument(new Numeros());
        field_peso.setDocument(new Numeros());
        field_idade_animal.setDocument(new LimitandoCamposNumericos(2));

        field_cor.setDocument(new Letras());
        field_nome_animal.setDocument(new Letras());
        field_proprietario.setDocument(new Letras());
        field_raca.setDocument(new Letras());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_animal = new javax.swing.JLabel();
        label_nome_animal = new javax.swing.JLabel();
        label_proprietario = new javax.swing.JLabel();
        label_idade_animal = new javax.swing.JLabel();
        label_raca = new javax.swing.JLabel();
        label_peso = new javax.swing.JLabel();
        label_altura = new javax.swing.JLabel();
        label_cor = new javax.swing.JLabel();
        label_sexo_animal = new javax.swing.JLabel();
        comboBox_sexo_animal = new javax.swing.JComboBox<>();
        field_proprietario = new javax.swing.JTextField();
        comboBox_tipo_animal = new javax.swing.JComboBox<>();
        field_nome_animal = new javax.swing.JTextField();
        field_cor = new javax.swing.JTextField();
        field_raca = new javax.swing.JTextField();
        field_altura = new javax.swing.JTextField();
        field_peso = new javax.swing.JTextField();
        botao_cadastrar_animais = new javax.swing.JButton();
        botao_limpar_animais = new javax.swing.JButton();
        field_idade_animal = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de animal");

        label_animal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_animal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tag.png"))); // NOI18N
        label_animal.setText("Animal:");

        label_nome_animal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_nome_animal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/text.png"))); // NOI18N
        label_nome_animal.setText("Nome:");

        label_proprietario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_proprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        label_proprietario.setText("Proprietário(a):");

        label_idade_animal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_idade_animal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/calendario.png"))); // NOI18N
        label_idade_animal.setText("Idade:");

        label_raca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_raca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/raca.png"))); // NOI18N
        label_raca.setText("Raça: ");

        label_peso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_peso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/peso.png"))); // NOI18N
        label_peso.setText("Peso(gr):");

        label_altura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_altura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/altura.png"))); // NOI18N
        label_altura.setText("Altura(cm):");

        label_cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cor.png"))); // NOI18N
        label_cor.setText("Cor:");

        label_sexo_animal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_sexo_animal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sexo.PNG"))); // NOI18N
        label_sexo_animal.setText("Sexo:");

        comboBox_sexo_animal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox_sexo_animal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Fêmea" }));

        comboBox_tipo_animal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cachorro", "Gato", "Coelho" }));

        botao_cadastrar_animais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_cadastrar_animais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/add.png"))); // NOI18N
        botao_cadastrar_animais.setText("Cadastrar");
        botao_cadastrar_animais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botao_limpar_animais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_limpar_animais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/limpar.png"))); // NOI18N
        botao_limpar_animais.setText("Limpar");
        botao_limpar_animais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_proprietario)
                            .addComponent(label_animal)
                            .addComponent(label_nome_animal)
                            .addComponent(label_raca)
                            .addComponent(label_sexo_animal)))
                    .addComponent(label_peso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboBox_tipo_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field_proprietario)
                        .addComponent(field_nome_animal)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(comboBox_sexo_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_idade_animal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(field_idade_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(field_raca, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_cor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(field_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(label_altura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(field_altura)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(field_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_cadastrar_animais, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_limpar_animais, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_proprietario))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_tipo_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_animal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nome_animal)
                            .addComponent(field_nome_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_raca)
                            .addComponent(field_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label_cor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox_sexo_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_sexo_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_altura)
                        .addComponent(field_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_idade_animal)
                        .addComponent(field_idade_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_limpar_animais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_peso)
                        .addComponent(field_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botao_cadastrar_animais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar_animais;
    private javax.swing.JButton botao_limpar_animais;
    private javax.swing.JComboBox<String> comboBox_sexo_animal;
    private javax.swing.JComboBox<String> comboBox_tipo_animal;
    private javax.swing.JTextField field_altura;
    private javax.swing.JTextField field_cor;
    private javax.swing.JTextField field_idade_animal;
    private javax.swing.JTextField field_nome_animal;
    private javax.swing.JTextField field_peso;
    private javax.swing.JTextField field_proprietario;
    private javax.swing.JTextField field_raca;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_animal;
    private javax.swing.JLabel label_cor;
    private javax.swing.JLabel label_idade_animal;
    private javax.swing.JLabel label_nome_animal;
    private javax.swing.JLabel label_peso;
    private javax.swing.JLabel label_proprietario;
    private javax.swing.JLabel label_raca;
    private javax.swing.JLabel label_sexo_animal;
    // End of variables declaration//GEN-END:variables

    public Animal_Get_Set getAnimais() {

        ani = new Animal_Get_Set();
        
        try{
        ani.setIdade(Integer.parseInt(field_idade_animal.getText()));
        ani.setAltura(Integer.parseInt(field_altura.getText()));
        ani.setPeso(Integer.parseInt(field_peso.getText()));
        }
        catch(Exception ex){
         execao.exception(ex);
        }
        ani.setProprietario(field_proprietario.getText().trim());
        ani.setAnimal((String) comboBox_tipo_animal.getSelectedItem());
        ani.setNome(field_nome_animal.getText().trim());
        ani.setRaca(field_raca.getText().trim());
        ani.setCor(field_cor.getText().trim());
        ani.setSexo((String) comboBox_sexo_animal.getSelectedItem());

        limpar();

        return ani;

    }

    public void limpar() {
        field_proprietario.setText(null);
        field_nome_animal.setText(null);
        field_raca.setText(null);
        field_cor.setText(null);
        field_idade_animal.setText(null);
        field_altura.setText(null);
        field_peso.setText(null);
    }

    public boolean Verifica() {
        return !(field_proprietario.getText().trim().isEmpty()
                || field_nome_animal.getText().trim().isEmpty()
                || field_idade_animal.getText().isEmpty()
                || field_altura.getText().isEmpty()
                || field_cor.getText().trim().isEmpty()
                || field_raca.getText().trim().isEmpty()
                || field_peso.getText().isEmpty());
    }

}
