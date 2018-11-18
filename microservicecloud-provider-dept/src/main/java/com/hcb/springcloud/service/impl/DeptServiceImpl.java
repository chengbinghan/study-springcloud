package com.hcb.springcloud.service.impl;

import java.util.List;

import com.hcb.springcloud.dao.DeptDao;
import com.hcb.springcloud.entities.Dept;
import com.hcb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    //tips: 方法名叫get 不叫getById 是为了和rest风格的controller保持一致
    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}
