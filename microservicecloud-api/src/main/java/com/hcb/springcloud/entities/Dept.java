package com.hcb.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ChengBing Han
 * @date 21:12  2018/11/18
 * @description
 */
@AllArgsConstructor//全部参数的构造函数
@NoArgsConstructor
@Data //get ,set ...
@Accessors(chain=true) //链式访问
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;


/*    public static void main(String[] args) {
        final Dept dept = new Dept();
        dept.setDb_source("db01").setDname("mydb").setDeptno(11L);//链式设置
    }*/
}
