package domain;

import java.util.Objects;

public class User {
    private Integer id;
    private String name;
    private String email;
    private int cpf;
    

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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
