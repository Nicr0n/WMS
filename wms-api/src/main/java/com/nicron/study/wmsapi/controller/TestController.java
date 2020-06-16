package com.nicron.study.wmsapi.controller;

import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @ResponseBody
    @PostMapping("/123")
    public Result abc(){
        Result result = ResultUtil.error(404,"this is a test");
        return result;
    }
}
