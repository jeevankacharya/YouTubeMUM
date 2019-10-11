package org.mumyoutube.youtube_dao;

import org.mumyoutube.model.User;

import java.util.List;

public interface IUserDAO {
     void addUser(User user);
     List<User> getUsers();
}