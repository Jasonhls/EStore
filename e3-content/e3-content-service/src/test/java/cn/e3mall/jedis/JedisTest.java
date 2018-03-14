package cn.e3mall.jedis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class JedisTest {
	//连接单机版
	@Test
	public void testJedis() throws Exception{
		Jedis jedis = new Jedis("192.168.1.126", 6379);
		jedis.set("test123", "my first jedis test");
		String string = jedis.get("test123");
		System.out.println(string);
		jedis.close();
	}
	//使用连接池，连接单机版
	@Test
	public void testJedisPool() throws Exception{
		JedisPool jedisPool = new JedisPool("192.168.1.126", 6379);
		Jedis jedis = jedisPool.getResource();
		String string = jedis.get("test123");
		System.out.println(string);
		jedis.close();
		jedisPool.close();
	}
	//集群版连接redisCluster
	@Test
	public void testJedisCluster() throws Exception{
		Set<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort("192.168.1.126", 7001));
		nodes.add(new HostAndPort("192.168.1.126", 7002));
		nodes.add(new HostAndPort("192.168.1.126", 7003));
		nodes.add(new HostAndPort("192.168.1.126", 7004));
		nodes.add(new HostAndPort("192.168.1.126", 7005));
		nodes.add(new HostAndPort("192.168.1.126", 7006));
		JedisCluster jedisCluster = new JedisCluster(nodes);
		jedisCluster.set("test", "该吃晚饭了");
		String string = jedisCluster.get("test");
		System.out.println(string);
		jedisCluster.close();
	}
}
