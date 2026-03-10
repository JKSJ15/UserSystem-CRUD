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
		String sql = "INSERT INTO `usersystem`.`user` (`na_user`, `email_user`, `cpf_user`) VALUES ('"+user.getName()+"', '"+user.getEmail()+"', '"+user.getCpf()+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Saved successfully!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void updateName(int id, String name) {
		String sql = "UPDATE `usersystem`.`user` SET `na_user` = '"+name+"' WHERE (`id_user` = '"+id+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Update succefull!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void updateEmail(int id, String email) {
		String sql = "UPDATE `usersystem`.`user` SET `email_user` = '"+email+"' WHERE (`id_user` = '"+id+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
			int i = st.executeUpdate(sql);
			if (i==1) {
				System.out.println("Update succefull!");
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void updateCpf(int id, String name) {
		String sql = "UPDATE `usersystem`.`user` SET `cpf_user` = '"+name+"' WHERE (`id_user` = '"+id+"');\n";
		try (Connection conn = ConnectionDb.getConnection();
			Statement st = conn.createStatement();){
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
	
}
