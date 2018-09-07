package com.carol.mapper;

import com.carol.entity.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Insert("INSERT INTO account (name,money) VALUES (#{name},#{money})")
    int add(@Param("name") String name,@Param("money") Double money);

    @Update("UPDATE account SET name = #{name},money = #{money} WHERE id = #{id}")
    int update(@Param("name") String name,@Param("money") Double money,@Param("id") int id);

    @Delete("DELETE FROM account WHERE id = #{id}")
    int delete(@Param("id") int id);

    @Select("SELECT * FROM account")
    List<Account> findAccountList();

    @Select("SELECT * FROM account WHERE id = #{id}")
    Account fineAccountById(@Param("id") int id);
}
