package ahut.edu.service;

import ahut.edu.entity.User;

import java.util.List;

/**
 * Created by newman on 2016/5/24.
 */
public interface UserService {
    public User getUserById(String userId);

    public List<User> getUsers();

    public void add(User user);

    public void update(User user);

    public void deleteById(String userId);

}
