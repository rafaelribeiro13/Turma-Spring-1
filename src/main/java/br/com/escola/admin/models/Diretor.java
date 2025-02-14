package br.com.escola.admin.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Table(name = "tb_diretor")
public class Diretor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_diretor")
	private Long id;

	@Column(name = "nm_diretor", nullable = false, length = 250)
	@NotBlank(message = "O nome do diretor não deve ser vazio ou nulo")
	private String nome;

	@Column(name = "cd_cpf", nullable = false, length = 11)
	@NotBlank(message = "O cpf do diretor não deve ser vazio ou nulo")
	private String cpf;
	
	public Diretor() {

	}
	
	public Diretor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Diretor{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				'}';
	}

}
