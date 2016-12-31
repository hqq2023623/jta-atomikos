package zj.dao;

import zj.model.User;

import java.util.Map;

/**
 * Created by lzj on 2016/12/31.
 */
public interface IUserDao {

    int saveUser1(User user) throws Exception;

    int saveUser2(User user) throws Exception;


}
