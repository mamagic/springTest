package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Marker;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface MarkerMapper extends MyMapper<Integer,Marker>{

}
