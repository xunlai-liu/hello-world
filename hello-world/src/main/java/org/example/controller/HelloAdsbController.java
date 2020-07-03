package org.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xunlailiu
 * @date 2020/04/09
 */
@Controller
@RequestMapping("/")
public class HelloAdsbController {

    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(){
        return "BarChartAxes";
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hi(){
        return "BarChartAxes";
    }
    @RequestMapping("/hij")
    @ResponseBody
    public String hij(){
        String str= "BarChartAxes";
        return JSONObject.toJSONString(str);
    }

    @RequestMapping("/hiInt")
    @ResponseBody
    public String hiInt(){
        Integer str= 100;
        return JSONObject.toJSONString(str);
    }
}
