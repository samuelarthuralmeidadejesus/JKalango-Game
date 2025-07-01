package br.com.jkalango.view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//extends é herança
public class JCadastroJogador extends JFrame{
    //Construtor inicializa os componentes do formulario
    public JCadastroJogador(){
        //Titulo Da Janela
        setTitle("Faça parte do JKalango!");
        //Garante que a aplicação não seja finalizada
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //tamanho
        setSize(400,450);
        //posição ao centro
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel lblNome = new JLabel("Nome");
        JTextField txtNome = new JTextField(40);
        add(lblNome);
        add(txtNome);

        JLabel lblNick = new JLabel("Nickname");
        JTextField txtNick = new JTextField(40);
        add(lblNick);
        add(txtNick);
        
        JLabel lblSenha = new JLabel("Senha");
        add(lblSenha);
        JPasswordField pswSenha = new JPasswordField("Senha");
        add(pswSenha);
        

        JLabel lblCelular = new JLabel("Celular");
        JTextField txtCelular = new JTextField(40);
        add(lblCelular);
        add(txtCelular);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, "Jogador Cadastrado Com Sucesso!");

            }
            
        });
        setVisible(true);
    }

}
