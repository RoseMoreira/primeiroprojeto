package model;

public class Cliente {
    
	public Cliente() {
		
	}
 
    public Cliente(String nome_cliente, int id_cliente, String email_cliente, int senha_cliente, Permissoes permissoes,
			Passagem passagem) {
		super();
		this.nome_cliente = nome_cliente;
		this.id_cliente = id_cliente;
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
		this.permissoes = permissoes;
		this.passagem = passagem;
	}

	private String nome_cliente;
    
   
    private int id_cliente;

    private String email_cliente;
    
  
    private int senha_cliente;

    private Permissoes permissoes;
 
    private Passagem passagem;

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public int getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(int senha_cliente) {
		this.senha_cliente = senha_cliente;
	}

	public Permissoes getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Permissoes permissoes) {
		this.permissoes = permissoes;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
    
}