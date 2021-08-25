package br.com.professorisidro.gui;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.professorisidro.model.Produto;

public class TelaExibicao extends JFrame implements MouseListener {
	private Produto produto;
	
	private JLabel lblInfo;

	public TelaExibicao(Produto produto) throws HeadlessException  {
		super();
		this.produto = produto;
		setTitle("Produto Cadastrado");
		setVisible(true);
		setSize(600, 200);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addMouseListener(this);
		
		lblInfo = new JLabel(produto.getId()+" / "+ produto.getDescricao() + 
				             " MTN $" + String.format("%.2f", produto.getPreco()) + " ");
		lblInfo.setBounds(20,20,250,30);
		getContentPane().add(lblInfo);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cliquei com o mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Apertei algum botao do mouse");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Soltei algum botao do mouse");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Entrei com o ponteiro do mouse na tela");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Saí com o ponteiro do mouse na tela");
	}
	
	

}
