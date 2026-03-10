package services;

import domain.User;

public class MainCl {
    public static void main(String[] args) {
        //User u1 = new User(2, "João", "joao@gmail", "22222222222");
    	//UserServices.save(u1);
    	//UserServices.updateEmail(2,"cabral@gmail");
    	//UserServices.updateCpf(2,"21221221221");
    	//UserServices.updateName(2,"Cabral");
    	//UserServices.remove(2);
    	System.out.println(UserServices.listAll());;
    }
}