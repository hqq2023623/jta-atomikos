package zj.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import zj.service.IUserService;
import zj.test.base.SpringTestBase;

/**
 * Created by lzj on 2016/12/31.
 */

public class TestUserService extends SpringTestBase {

    @Autowired
    private IUserService userService;

    /**
     *
     */
    @Test
    public void test01() throws Exception {
        userService.saveAll();
        System.out.println("done");
    }


}
