package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {
	/**
	 * Guarda un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Retorna un listado de usuarios
	 * @return listado de usuarios
	 */
	List<User> findAll();


}
