package com.study.singlecase;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例 也就是本地缓存的方法
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:15:46
 * 
 */
public class SingletonManager {

	private static Map<String, Object> objMap = new HashMap<String, Object>();

	private SingletonManager() {
	}

	public static void registerService(String key, Object instance) {
		if (!objMap.containsKey(key)) {
			objMap.put(key, instance);
		}
	}

	public static Object getService(String key) {
		return objMap.get(key);
	}
}
