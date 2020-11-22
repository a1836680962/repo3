package cn.redis;

import redis.clients.jedis.Jedis;

/**
 * @ClassName:RedisConnection
 * @Description:TODO
 * @author:shubo
 * @date:2020/11/17 21:30
 * @version:1.0
 */
public class RedisConnection {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127");
    }
}