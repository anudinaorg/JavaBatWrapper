/**
 * 
 */
package com.arccorp.sbuspvc.service;

import java.util.List;

import com.arccorp.sbuspvc.model.User;

/**
 * @author Anand
 *
 */
public interface UserService {
	/**
	 * @param id
	 * @return
	 */
	User findById(long id);

	/**
	 * @param name
	 * @return
	 */
	User findByName(String name);

	/**
	 * @param user
	 */
	void saveUser(User user);

	/**
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * @param id
	 */
	void deleteUserById(long id);

	/**
	 * @return
	 */
	List<User> findAllUsers();

	/**
	 * 
	 */
	void deleteAllUsers();

	/**
	 * @param user
	 * @return
	 */
	public boolean isUserExist(User user);
}
