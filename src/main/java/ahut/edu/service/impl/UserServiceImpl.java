package ahut.edu.service.impl;

import ahut.edu.mapper.UserMapper;
import ahut.edu.entity.User;
import ahut.edu.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by newman on 2016/5/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(String userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> getUsers(){
        return  userMapper.getAllUser();
    }

    @Override
    public void add(User user){
        userMapper.insertSelective(user);
    }

    @Override
    public void update(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteById(String userId){
        userMapper.deleteByPrimaryKey(userId);
    }
}
