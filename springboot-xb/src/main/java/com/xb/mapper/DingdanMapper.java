package com.xb.mapper;

import com.xb.entity.Dingdan;
import com.xb.entity.RBAC.UserInfo;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Administrator on 2018/1/9.
 */
public interface DingdanMapper {

    @Update("UPDATE dingdan SET dingdanstatus=#{dingdanstatus} WHERE dingdanid =#{dingdanid}")
    void updatedingdan(Dingdan dingdan);
    @Select("select * from user_info u WHERE u.username =#{username}")
    UserInfo findByUsaernamess(String username);
}
