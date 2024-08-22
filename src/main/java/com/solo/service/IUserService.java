package com.solo.service;

import com.solo.entity.User;

public interface IUserService {

	public void removeSessionMessage();

	public User registerUser(User user, String url);
	
	public User verify(User user);

}
