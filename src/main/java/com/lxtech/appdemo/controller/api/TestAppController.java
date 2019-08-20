package com.lxtech.appdemo.controller.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxtech.appdemo.common.ErrorCodes;
import com.lxtech.appdemo.common.UserQuery;
import com.lxtech.appdemo.entity.User;
import com.lxtech.appdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api_userinfo")
@Controller
public class TestAppController extends BaseController {

    @Autowired
    IUserService userService;

    @CrossOrigin
    @RequestMapping("/queryPage")
    @ResponseBody
    public Object queryPage(UserQuery userQuery) {
        Page page = userService.queryPage(userQuery);
        User user = new User();
        user.setId("1");
        user.setName("张三丰");
        boolean result = userService.updateById(user);
        System.out.println(result);
        page = userService.queryPage(userQuery);
        return page;
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/testApi",method = RequestMethod.POST)
    public Map<String, Object> testApi() {
        Map<String, Object> result = new HashMap<String,Object>();
        this.clear();
        try {
            int count = userService.queryUserinfoCount();
            result.put("count", count);
            result.put("aaa", "CCC");
            this.setDatas(result);
            this.setStatus(ErrorCodes.API_RESULT_STATUS_VALUE_SUCCESS);//修改成功
            this.setErrorCode(ErrorCodes.API_RESULT_ERRORCODE_VALUE_DEFUALT);
            return getResult();
        } catch (Exception e) {
            e.printStackTrace();
            this.setStatus(ErrorCodes.API_RESULT_STATUS_VALUE_FAILED);//失败
            this.setErrorCode(ErrorCodes.API_RESULT_ERRORCODE_VALUE_SYS_EXCEPTION);//系统异常
            return getResult();
        }
    }


}
