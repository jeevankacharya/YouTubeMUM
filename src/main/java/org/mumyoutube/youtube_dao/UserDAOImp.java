package org.mumyoutube.youtube_dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.mumyoutube.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserDAOImp implements IUserDAO {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(user);
    }

    @Override
    public List<User> getUsers() {
        Query<User> query = (Query<User>) entityManager.createNativeQuery("select * from user");

        List<User> s = query.list();
        return s;
    }
}
