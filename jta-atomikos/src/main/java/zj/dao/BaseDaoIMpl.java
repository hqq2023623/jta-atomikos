package zj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by lzj on 2016/12/31.
 */
public abstract class BaseDaoIMpl {

    @Autowired
    private JdbcTemplate jdbcTemplate1;

    @Autowired
    private JdbcTemplate jdbcTemplate2;

    public JdbcTemplate getJdbcTemplate1() {
        return jdbcTemplate1;
    }

    public void setJdbcTemplate1(JdbcTemplate jdbcTemplate1) {
        this.jdbcTemplate1 = jdbcTemplate1;
    }

    public JdbcTemplate getJdbcTemplate2() {
        return jdbcTemplate2;
    }

    public void setJdbcTemplate2(JdbcTemplate jdbcTemplate2) {
        this.jdbcTemplate2 = jdbcTemplate2;
    }
}
