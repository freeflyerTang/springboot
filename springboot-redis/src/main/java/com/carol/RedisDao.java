package com.carol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-07 14:11
 * @Description: 通过redisTemplate来访问redis.
 **/
@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setKey(String key,String value){
        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        ops.set(key, value,1, TimeUnit.MINUTES);//1分钟过期

    }

    public String getValue(String key){
        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        return ops.get(key);
    }
}
