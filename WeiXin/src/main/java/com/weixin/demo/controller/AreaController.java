package com.weixin.demo.controller;

import com.weixin.demo.entity.TbArea;
import com.weixin.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: GH
 * @Date: 2019/4/9 12:05
 * @Version 1.0
 */
@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

//    @CrossOrigin("*")
    @RequestMapping(value = "/add")
    public Map<String, Object> add(@RequestBody TbArea area) {
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        Map<String, Object> resultMap = new HashMap<>(6);
        try {
            areaService.insert(area);
        } catch (Exception e) {
            resultMap.put("msg", e);
        }
        resultMap.put("result", "成功");
        return resultMap;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/selectOne")
    public TbArea selectOne(@RequestBody TbArea area) {
        TbArea tbArea = areaService.selectOne(area);
        return tbArea;
    }
}
