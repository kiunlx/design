package com.study.singlecase;

/**
 * 饿汉线程安全
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-29 15:06:33
 * 
 */
public class SlackerSafe {

	private SlackerSafe() {
	}

	private static SlackerSafe instance;

	public static synchronized SlackerSafe getInstance() {

		if (instance == null)
			instance = new SlackerSafe();

		return instance;
	}
}
