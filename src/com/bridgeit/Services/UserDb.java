package com.bridgeit.Services;

import com.bridgeit.Model.User;

public interface UserDb {
	   public int insertuser(User u);
       public User getuser(String username, String password);
}
