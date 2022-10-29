package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Passagem {
    
	
	private int id_passagem; 

    private LocalDate data_passagem;
    
    private int duracao_passagem;

    private double valor_passagem;

    private String cidade_passagem;

    private String pais_passagem;
    
    private Cliente cliente;
    
    DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Passagem() {
    	
    }

    public Passagem(int id_passagem, LocalDate data_passagem, int duracao_passagem, double valor_passagem,
			String cidade_passagem, String pais_passagem, Cliente cliente) {
		super();
		this.id_passagem = id_passagem;
		this.data_passagem = data_passagem;
		this.duracao_passagem = duracao_passagem;
		this.valor_passagem = valor_passagem;
		this.cidade_passagem = cidade_passagem;
		this.pais_passagem = pais_passagem;
		this.cliente = cliente;
	}

	public int getId_passagem() {
		return id_passagem;
	}

	public void setId_passagem(int id_passagem) {
		this.id_passagem = id_passagem;
	}

	public LocalDate getData_passagem() {
		return data_passagem;
	}

	public void setData_passagem(LocalDate data_passagem) {
		this.data_passagem = data_passagem;
	}

	public int getDuracao_passagem() {
		return duracao_passagem;
	}

	public void setDuracao_passagem(int duracao_passagem) {
		this.duracao_passagem = duracao_passagem;
	}

	public double getValor_passagem() {
		return valor_passagem;
	}

	public void setValor_passagem(double valor_passagem) {
		this.valor_passagem = valor_passagem;
	}

	public String getCidade_passagem() {
		return cidade_passagem;
	}

	public void setCidade_passagem(String cidade_passagem) {
		this.cidade_passagem = cidade_passagem;
	}

	public String getPais_passagem() {
		return pais_passagem;
	}

	public void setPais_passagem(String pais_passagem) {
		this.pais_passagem = pais_passagem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public DateTimeFormatter getFormater() {
		return formater;
	}

	public void setFormater(DateTimeFormatter formater) {
		this.formater = formater;
	}
    
}

