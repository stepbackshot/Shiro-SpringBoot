package com.howie.shiro.controller;

import com.howie.shiro.model.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Harden
 * @title: OtherController
 * @date 2019年05月15日 21:42
 */
@RestController
public class OtherController {
    ResultMap resultMap = new ResultMap();

    @RequestMapping(value = "/other", method = RequestMethod.GET)
    public ResultMap getMessage() {
        return resultMap.success().message("主要这行代码必须放在所有权限设置的最后，不然会导致所有 url 都被拦截");
    }
}
