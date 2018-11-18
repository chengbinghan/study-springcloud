package com.hcb.springcloud.dao;

import com.hcb.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ChengBing Han
 * @date 22:03  2018/11/18
 * @description
 */
@Mapper //添加后springboot 识别mybatis
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
