package zj.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import zj.dao.BaseDaoIMpl;
import zj.dao.IUserDao;
import zj.model.User;

/**
 * Created by lzj on 2016/12/31.
 */
@Repository
public class UserDaoImpl extends BaseDaoIMpl implements IUserDao {

    @Override
    public int saveUser1(User user) throws Exception {
        return getJdbcTemplate1().update("INSERT INTO `user` (username) VALUES (1)");
    }

    //抛出异常,让事务回滚
    @Override
    public int saveUser2(User user) throws Exception {
        throw new RuntimeException("a");
//        return getJdbcTemplate1().update("INSERT INTO `user` (username) VALUES (2) asldhsadlk");
    }
}
