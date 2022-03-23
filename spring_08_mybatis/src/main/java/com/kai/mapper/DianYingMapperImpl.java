package com.kai.mapper;

import com.kai.pojo.DianYing;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class DianYingMapperImpl implements DianYingMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<DianYing> selectAll() {
        DianYingMapper mapper = sqlSessionTemplate.getMapper(DianYingMapper.class);
        return mapper.selectAll();
    }

    @Override
    public List<DianYing> selectAllByLeixingId() {
        return null;
    }
}
