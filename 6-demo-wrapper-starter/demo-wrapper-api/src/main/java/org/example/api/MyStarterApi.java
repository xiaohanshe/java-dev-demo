package org.example.api;

import org.example.api.entity.user.Userinfo;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/28
 */
public interface MyStarterApi {
    /**
     * 查询用户
     *
     * @return 用户信息
     */
    public Userinfo getUserInfo();
    /**
     * 添加用户
     *
     * @param userinfo 用户信息
     */
    public void insertUserInfo(Userinfo userinfo);
    /**
     * 用户自定义扩展
     * @param userinfo 用户信息
     */
    public void custom(Userinfo userinfo);
}
