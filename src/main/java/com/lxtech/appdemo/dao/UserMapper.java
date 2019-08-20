package com.lxtech.appdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxtech.appdemo.common.UserQuery;
import com.lxtech.appdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 查询分页列表
     *
     * @author itachi
     * @date 2018-10-05 17:25
     */
    public List<User> queryPage(Page page, @Param("user") UserQuery userQuery);

    public int queryUserinfoCount();

}
