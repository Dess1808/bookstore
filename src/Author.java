public class Author {
	private String name;
	private String email;
	private String cpf;
	
	//methods sets
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//methods gets
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	
	//show Details
	void showDetailsAuthor() {
		System.out.println("Mostrando detalhes do autor");
		System.out.println("nome: " + this.name);
		System.out.println("email: " + this.email);
		System.out.println("cpf: " + this.cpf);
	}	
}
