package br.dev.joao.Tabuada.model;

public class Tabuada {
	
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public double getMultiplicando() {
		return multiplicando;
	}
	
	public void setMinimoMultiplicador(double MinimoMultiplicando) {
		this.minimoMultiplicador = MinimoMultiplicando;
	}
	
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;	
	}
	
	public void setMaximoMultiplicador(double MaximoMultiplicador) {
		this.maximoMultiplicador = MaximoMultiplicador;
	}
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	
	public void mostrarTabuada() {
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " X " + minimoMultiplicador + " = " + produto);
			minimoMultiplicador = minimoMultiplicador + 1;
			
		}
	}
	}
