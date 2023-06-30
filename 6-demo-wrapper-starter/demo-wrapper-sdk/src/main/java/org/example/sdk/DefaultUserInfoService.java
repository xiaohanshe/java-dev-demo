package org.example.sdk;

import org.example.api.MyStarterApi;
import org.example.api.entity.user.Userinfo;
import org.springframework.stereotype.Service;

/**
 * 默认用户服务
 *
 * @author han
 * @since 2023/06/28
 */
@Service
public abstract class DefaultUserInfoService implements MyStarterApi {

    @Override
    public Userinfo getUserInfo() {
        return null;
    }

    @Override
    public void insertUserInfo(Userinfo userinfo) {

    }
}
