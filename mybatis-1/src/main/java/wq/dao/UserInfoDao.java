package wq.dao;

import wq.pojo.UserInfo;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> selectAll();
//    Integer insertUser(UserInfo userInfo);
}
