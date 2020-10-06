package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.User;

public class UserDAO {

	private static final Map<Integer, User> userMap = new HashMap<Integer, User>();
	private static int i = 4;

	static {
		initUsers();
	}

	private static void initUsers() {
		User user1 = new User(1, "gabi@gmail.com", "12345678", "12345678", "Gabi", "Alves", "11/04/1999", "Feminino",
				"888888", "8888888", "88888888888", "Rua", "888888", "88", "complemento", "referencia", "bairro",
				"cidade", "estado");
		User user2 = new User(2, "gabi@gmail.com", "12345678", "12345678", "Gabi", "Alves", "11/04/1999", "Feminino",
				"888888", "8888888", "88888888888", "Rua", "888888", "88", "complemento", "referencia", "bairro",
				"cidade", "estado");
		User user3 = new User(3, "gabi@gmail.com", "12345678", "12345678", "Gabi", "Alves", "11/04/1999", "Feminino",
				"888888", "8888888", "88888888888", "Rua", "888888", "88", "complemento", "referencia", "bairro",
				"cidade", "estado");

		userMap.put(user1.getId(), user1);
		userMap.put(user2.getId(), user2);
		userMap.put(user3.getId(), user3);
	}

	public static User getUser(int id) {
		return userMap.get(id);
	}

	public static User getUserByEmail(String email) {
		List<User> list = getAllUsers();

		for (User user : list) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}

		return null;
	}

	public static User addUser(String email, String senha, String confirSenha, String nome, String sobrenome,
			String data, String sexo, String celular, String telefone, String cnpj, String rua, String cep,
			String numero, String complemento, String referencia, String bairro, String cidade, String estado) {

		User user = new User(i, email, senha, confirSenha, nome, sobrenome, data, sexo, celular, telefone, cnpj, rua,
				cep, numero, complemento, referencia, bairro, cidade, estado);
		userMap.put(user.getId(), user);
		i++;
		return user;
	}

	public static User updateUser(int id, String email, String senha, String confirSenha, String nome, String sobrenome,
			String data, String sexo, String celular, String telefone, String cnpj, String rua, String cep,
			String numero, String complemento, String referencia, String bairro, String cidade, String estado) {

		User user = new User(id, email, senha, confirSenha, nome, sobrenome, data, sexo, celular, telefone, cnpj, rua,
				cep, numero, complemento, referencia, bairro, cidade, estado);
		userMap.put(user.getId(), user);
		return user;
	}

	public static void deleteUser(int id) {
		if (userMap.containsKey(id)) {
			userMap.remove(id);
		}
	}

	public static List<User> getAllUsers() {
		return new ArrayList<User>(userMap.values());
	}
}