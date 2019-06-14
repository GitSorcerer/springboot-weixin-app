package com.weixin.demo.dao;

import com.weixin.demo.entity.TbArea;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AreaDao extends Mapper<TbArea> {

}
