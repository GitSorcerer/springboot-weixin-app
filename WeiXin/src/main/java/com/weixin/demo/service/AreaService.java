package com.weixin.demo.service;

import com.weixin.demo.dao.AreaDao;
import com.weixin.demo.entity.TbArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: GH
 * @Date: 2019/4/9 12:05
 * @Version 1.0
 */
@Service
public class AreaService {

    @Autowired
    private AreaDao areaDao;

    public void insert(TbArea area) {
        areaDao.insertSelective(area);
    }

    public TbArea selectOne(TbArea tbArea) {
        return areaDao.selectOne(tbArea);
    }
}
