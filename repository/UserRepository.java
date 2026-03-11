package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionDb;
import domain.User;

public class UserRepository {
	public static void save(User user) {
		String sql = "INSERT INTO `usersystem`.`user` (`na_user`, `email_user`, `cpf_user`) VALUES ('"+user.getName().toUpperCase()+"', '"+user.getEmail().toUpperCase()+"', '"+user.getCpf()+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)){
			if(user.getCpf() == null || user.getName() == null || user.getEmail() == null) {
				throw new IllegalArgumentException("Fields cannot be null");
			}else if(user.getCpf().equals(rs.getString("cpf_user"))) {
				throw new IllegalArgumentException("CPF already registered");}
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Saved successfully!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void updateName(int id, String name) {
		String sql = "UPDATE `usersystem`.`user` SET `na_user` = '"+name.toUpperCase()+"' WHERE (`id_user` = '"+id+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
			if (name == null) {
				throw new IllegalArgumentException("Name cannot be null");
			}
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Update succefull!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void updateEmail(int id, String email) {
		String sql = "UPDATE `usersystem`.`user` SET `email_user` = '"+email.toUpperCase()+"' WHERE (`id_user` = '"+id+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
			if (email == null) {
				throw new IllegalArgumentException("Email cannot be null");
			}
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Update succefull!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void updateCpf(int id, String cpf) {
		String sql = "UPDATE `usersystem`.`user` SET `cpf_user` = '"+cpf+"' WHERE (`id_user` = '"+id+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)){
			if (cpf == null) {
				throw new IllegalArgumentException("Cpf cannot be null");
			}if(cpf.equals(rs.getString("cpf_user"))) {
				throw new IllegalArgumentException("CPF already registered");}
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Update succefull!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void remove(int id) {
		String sql = "DELETE FROM `usersystem`.`user` WHERE (`id_user` = '"+id+"');";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("removed successfully!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static ArrayList<User> listAll() {
		String sql = "SELECT * FROM usersystem.user;";
		ArrayList<User> users = new ArrayList();
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);){
			while (rs.next()) {
				User u = new User(rs.getInt("id_user"), rs.getString("na_user"), rs.getString("email_user"), rs.getString("cpf_user"));
				users.add(u);
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return users;
	}
	public static ArrayList<User> findByName(String name) {
		String sql = "SELECT * FROM usersystem.user where na_user like '"+name.toUpperCase()+"'; ";
		ArrayList<User> users = new ArrayList();
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);){
			if (name==null) {
				throw new IllegalArgumentException("Name cannot be null");
			}
			while (rs.next()) {
				User user = new User(rs.getInt("id_user"), rs.getString("na_user"), rs.getString("email_user"), rs.getString("cpf_user"));
				users.add(user);
		}
		}catch (Exception e) {
		e.printStackTrace();
		}
		return users;
	}
	public static ArrayList<User> findById(int id) {
		String sql = "SELECT * FROM usersystem.user where id_user like '"+id+"'; ";
		ArrayList<User> users = new ArrayList();
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);){
			while (rs.next()) {
				User user = new User(rs.getInt("id_user"), rs.getString("na_user"), rs.getString("email_user"), rs.getString("cpf_user"));
				users.add(user);
		}
		}catch (Exception e) {
		e.printStackTrace();
		}
		return users;
	}
	
}
