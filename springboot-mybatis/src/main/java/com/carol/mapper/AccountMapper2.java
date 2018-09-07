package com.carol.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 采用声明式事务方式
 * @Param: 
 * @return: 
 * @Author: Carol Tang
 * @Date: 2018/9/7
 **/
@Mapper
public interface AccountMapper2 {
    int update(@Param("money") Double money,@Param("id") int id);
}
