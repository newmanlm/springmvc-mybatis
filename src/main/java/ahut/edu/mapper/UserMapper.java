package ahut.edu.mapper;

import ahut.edu.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {
    User selectByPrimaryKey(String userId);

    /**
     * 获取所有用户信息
     *
     * @return List<User>
     */
    List<User> getAllUser();

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByPrimaryKey(String userId);
}