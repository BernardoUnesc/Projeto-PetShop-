package pet.listeners;

import pet.getset.AnimalGetSet;
import pet.janelas.Animal;
import pet.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pet.excecoes.LogExceptions;

public class AnimaisAction implements ActionListener {

    private final Animal animais;
    private AnimalGetSet ani;
    private LogExceptions execao = new LogExceptions();

    public AnimaisAction(Animal animais) {

        this.animais = animais;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {

            try {
                Log.escrever("!Clicou em 'Cadastrar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);

            }
            if (animais.Verifica()) {
                ani = animais.getAnimais();
                System.out.println(ani.toString());
                try {
                    Log.escrever("!Cadastrou um novo animal");
                } catch (IOException ex) {
                    //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);execao.exception(ex);
                    execao.exception(ex);

                }
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro concluído", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/pet/icones/aceito.png"));
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o cadastro", "Cadastro falhou", JOptionPane.ERROR_MESSAGE, new ImageIcon("src/pet/icones/erro.png"));
            }
        }
        if (e.getActionCommand().equals("Limpar")) {
            try {
                Log.escrever("!Clicou em 'Limpar'");
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                execao.exception(ex);
            }
            animais.limpar();

        }

    }
}