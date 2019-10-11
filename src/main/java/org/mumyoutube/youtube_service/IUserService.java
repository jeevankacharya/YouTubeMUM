package org.mumyoutube.youtube_service;

import org.mumyoutube.model.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);

    List<User> getUsers();
}
