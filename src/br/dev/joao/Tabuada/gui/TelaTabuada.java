package br.dev.joao.Tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.w3c.dom.Text;

import br.dev.joao.Tabuada.model.Tabuada;

public class TelaTabuada {
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;
	
	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
	public void criarTelaTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(270, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		
		// Vamos criar os componentes da tela
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("min. Multiplicador: ");
		labelMinMultiplicador.setBounds(20, 55, 150, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 55, 50, 30);
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("max. multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 90, 150, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 90, 50, 30);
		
		//botões da tela
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 155, 95, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(135, 155, 95, 30);
		
		// Criar um objeto scroll
		
		listTabuada = new JList();
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 205, 210, 435);		
		
		// obtemos o painel de conteudo e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane() .add(labelMultiplicando);
		tela.getContentPane() .add(labelMinMultiplicador);
		tela.getContentPane() .add(labelMaxMultiplicador);
		tela.getContentPane() .add(textMultiplicando);
		tela.getContentPane() .add(textMinMultiplicador);
		tela.getContentPane() .add(textMaxMultiplicador);
		tela.getContentPane() .add(buttonCalcular);
		tela.getContentPane() .add(buttonLimpar);
		tela.getContentPane() .add(scrollTabuada);
		
		
		//adicionara ouvintes de eventos aos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);
				
				String minMultiplicador = textMinMultiplicador.getText();
				double minMultiplicadorDouble = Double.valueOf(minMultiplicador);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				
				String maxMultiplicador = textMaxMultiplicador.getText();
				double maxMultiplicadorDouble = Double.valueOf(maxMultiplicador);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				
				System.out.println("Multiplicando " + textMultiplicando.getText());
				System.out.println("Min.multiplicador " + textMinMultiplicador.getText());
				System.out.println("Max.Multiplicador " + textMaxMultiplicador.getText());
				System.out.println("---------------");
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMaxMultiplicador.setText("");
				textMinMultiplicador.setText("");
				textMultiplicando.setText("");
				
				textMultiplicando.requestFocus();
			}
		});
		
		
		// Essa linha deve ser a ultima linha desse metodo
		tela.setVisible(true);
		
		
		
	}
	
	
}
