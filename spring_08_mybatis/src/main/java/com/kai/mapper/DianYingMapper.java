package com.kai.mapper;

import com.kai.pojo.DianYing;

import java.util.List;

public interface DianYingMapper {
    List<DianYing> selectAll();

    List<DianYing> selectAllByLeixingId();

}
