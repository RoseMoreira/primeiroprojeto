package model;

public class Permissoes {
    
	
	public Permissoes () {
		
	}

    public Permissoes(int id_permissao, String tipo_permissao, Cliente cliente) {
		super();
		this.id_permissao = id_permissao;
		this.tipo_permissao = tipo_permissao;
		this.cliente = cliente;
	}

	private int id_permissao;
    
    private String tipo_permissao;
     
    private Cliente cliente;

	public int getId_permissao() {
		return id_permissao;
	}

	public void setId_permissao(int id_permissao) {
		this.id_permissao = id_permissao;
	}

	public String getTipo_permissao() {
		return tipo_permissao;
	}

	public void setTipo_permissao(String tipo_permissao) {
		this.tipo_permissao = tipo_permissao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
    
}