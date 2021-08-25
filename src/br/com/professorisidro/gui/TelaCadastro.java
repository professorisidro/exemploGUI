package br.com.professorisidro.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.professorisidro.model.Produto;

public class TelaCadastro extends JFrame {
	
	// atributos para a parte visual
	private JLabel lblCodigo;
	private JLabel lblDescricao;
	private JLabel lblPreco;
	private JLabel lblQtde;
	
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JTextField txtPreco;
	private JTextField txtQtde;
	
	private JButton btnCadastrar;
	
	
	
	public TelaCadastro() {
		setLayout(null);   					// desenho à mão livre
		setSize(640, 480);  				// tamanho do Frame
		setTitle("Cadastro de Produtos");   // título
		setVisible(true);					// visível
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		// criando cada um dos componentes Gráficos
		lblCodigo = new JLabel("Codigo do Produto");
		lblCodigo.setBounds(20, 20, 150, 50);
		getContentPane().add(lblCodigo);
		
		lblDescricao = new JLabel("Descricao do Produto");
		lblDescricao.setBounds(20, 100, 200, 50);
		getContentPane().add(lblDescricao);
		
		lblPreco = new JLabel("Preço do Produto");
		lblPreco.setBounds(20, 180, 200, 50);
		getContentPane().add(lblPreco);
		
		lblQtde = new JLabel("Quantidade");
		lblQtde.setBounds(20, 260, 200, 50);
		getContentPane().add(lblQtde);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(20, 70, 60, 20);
		getContentPane().add(txtCodigo);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(20,150,300, 20);
		getContentPane().add(txtDescricao);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(20,230,80,20);
		getContentPane().add(txtPreco);
		
		txtQtde = new JTextField();
		txtQtde.setBounds(20,310,80,20);
		getContentPane().add(txtQtde);
		
		
		btnCadastrar = new JButton("Cadastrar Produto");
		btnCadastrar.setBounds(250, 310, 200, 50);
		getContentPane().add(btnCadastrar);
				
		btnCadastrar.addActionListener( (e) -> criarProduto() );	
		
	}
	 
	
	
	
	public void criarProduto() {
		Produto p = new Produto();
		p.setId(Integer.parseInt(txtCodigo.getText()));
		p.setDescricao(txtDescricao.getText());
		p.setPreco(Double.parseDouble(txtPreco.getText()));
		p.setQtdEstoque(Integer.parseInt(txtQtde.getText()));
		
		//JOptionPane.showMessageDialog(this, p);
		TelaExibicao exibe = new TelaExibicao(p);
	}
	
	
}
