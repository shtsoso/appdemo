package com.lxtech.appdemo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxtech.appdemo.common.UserQuery;
import com.lxtech.appdemo.dao.UserMapper;
import com.lxtech.appdemo.entity.User;
import com.lxtech.appdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean delete(String... ids) {
        for (String id : ids) {
            removeById(id);
            //int i = 1/0;
        }
        return true;
    }

    @Override
    public Page queryPage(UserQuery userQuery) {
        Page page = new Page(1, 10);
        page.setRecords(userMapper.queryPage(page, userQuery));

        return page;
    }

    @Override
    public int queryUserinfoCount() {
        return userMapper.queryUserinfoCount();
    }
}
