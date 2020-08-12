package dev.snapgram.services;

import dev.snapgram.beans.User;
import dev.snapgram.exceptions.InvalidLoginException;

public interface UserService {

	User createUser(User user);
	
	User getUserById(int id);
	
	User getUserByUsername(String username);
	
	User getUserByLogin(String username, String password) throws InvalidLoginException;
}
