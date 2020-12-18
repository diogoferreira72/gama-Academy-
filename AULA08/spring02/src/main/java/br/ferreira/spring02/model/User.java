package br.ferreira.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "user")
@Getter @Setter @NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name", length = 150, nullable = false)
	private String name;

	@Column(name = "email", length = 100, nullable = false, unique = false)
	private String email;
	
	@Column(name="cpf", length = 11, nullable = false, unique = false)
	private String cpf;
	
	@Column(name="password", length = 30, nullable = false)
    private String password;
	
	@OneToMany(mappedBy = "user")
	@JsonIgnoreProperties("user")
	private List<Anuncio> anuncios;

  	//Construtor vazio usado pelo JPA para construir os objetos
	//
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

    

    
}
