package web.service;

import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    @Transactional
    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public void removeUser(long id) {
        userDao.removeUser(id);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
