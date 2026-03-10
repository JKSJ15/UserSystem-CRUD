package domain;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String email;
    private String cpf;
    
//constructor
 public User(int id, String name, String email, String cpf) {
	 	this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
	}
 
  //equals and hashcode 
  @Override
public int hashCode() {
	return Objects.hash(cpf, email, id, name);
}
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return cpf == other.cpf && Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
  }

  //toString
  @Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", email=" + email + ", cpf=" + cpf + "]";
	}
	
  //getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
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
}
