package com.chajiu.bangbangbe.Mapper;


import com.chajiu.bangbangbe.entity.Session;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SessionMapper {
    /**
     * 登录，把里面的属性都存进去
     * @param session
     */
    void add(Session session);

    /**
     * 依据openid更新session_key和skey
     * @param session
     */
    void update(Session session);

    /**
     * 依据openid查找是否有记录
     * @param openid
     * @return
     */
    Integer exist(String openid);

    /**
     * 利用skey找openid
     * @param skey
     * @return
     */
    String findOpenid(String skey);
}
