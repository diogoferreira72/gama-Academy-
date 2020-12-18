package br.myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "mtb310_usuario") // ligar com tabela
public class Usuario {

    // Atributos

    @Id // ligar com coluna e chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
    @Column(name = "id") // nome da coluna
    private int id;

    // correspondencia tipo JAVA com tipo Banco Dados
    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "cpf", length = 11, nullable = false, unique =  true)
    private String cpf;

    @Column(name = "password", length = 30, nullable = false)
    private String password;

    @Column(name = "racf", length = 8, nullable = false)
    private char racf;

    // Métodos
    public Usuario(String name, String email, char racf){
        this.name = name;
        this.email = email;
        this.racf = racf;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getRacf() {
		return racf;
	}

	public void setRacf(char racf) {
		this.racf = racf;
	}
    

}