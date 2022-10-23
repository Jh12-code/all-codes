package com.itheima.service;

import com.itheima.mapper.BrandMapper;

import java.util.List;

public interface BrandService {
    List<BrandMapper> selectAll();
}
