package zj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zj.dao.IUserDao;
import zj.service.IUserService;

/**
 * Created by lzj on 2016/12/31.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public int saveAll() throws Exception {
        userDao.saveUser1(null);
        userDao.saveUser2(null);
        return 0;
    }


}
