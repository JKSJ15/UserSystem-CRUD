package services;

import java.util.ArrayList;

import domain.User;
import repository.UserRepository;

public class UserServices {
	public static void save(User user) {
		UserRepository.save(user);
	}
	public static void updateName(int id, String name) {
		UserRepository.updateName(id, name);
	}
	public static void updateEmail(int id, String email) {
		UserRepository.updateEmail(id, email);
	}
	public static void updateCpf(int id, String cpf) {
		UserRepository.updateCpf(id, cpf);
	}
	public static void remove(int id) {
		UserRepository.remove(id);
	}
	public static ArrayList<User> listAll(){
		return UserRepository.listAll();
	}
}
