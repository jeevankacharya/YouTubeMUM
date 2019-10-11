package org.mumyoutube.youtube_service;

import org.mumyoutube.model.User;
import org.mumyoutube.youtube_dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }
}
