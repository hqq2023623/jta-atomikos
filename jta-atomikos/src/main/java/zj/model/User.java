package zj.model;

import java.io.Serializable;

/**
 * Created by lzj on 2016/12/31.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -9098667351161581472L;

    private int id;

    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
