package com.lxtech.appdemo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lxtech.appdemo.common.UserQuery;
import com.lxtech.appdemo.entity.User;


public interface IUserService extends IService<User> {

    public boolean delete(String ... ids);

    public Page queryPage(UserQuery userQuery);

    public int queryUserinfoCount();

}
