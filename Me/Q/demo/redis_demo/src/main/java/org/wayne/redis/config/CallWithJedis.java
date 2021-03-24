package org.wayne.redis.config;

import redis.clients.jedis.Jedis;

/**
 * @Description:
 * @author: LinWeiQi
 */
public interface CallWithJedis {
    /**
     * 获取单例,保证线程安全
     * @param jedis
     */
    void call(Jedis jedis);
}
