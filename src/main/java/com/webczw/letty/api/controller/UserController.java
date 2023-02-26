package com.webczw.letty.api.controller;

import com.webczw.letty.api.converter.UserConverter;
import com.webczw.letty.api.model.req.UserReq;
import com.webczw.letty.api.model.vo.UserVo;
import com.webczw.letty.common.result.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping("/findName")
    public String findName(){
        return "name";
    }

    @PostMapping(value = "/query")
    public Result<UserVo> query(@RequestBody UserReq userReq) {
        UserVo userVo = UserConverter.INSTANCE.userReqConverterUserVo(userReq);
        return new Result<UserVo>().success(userVo);
    }
}
