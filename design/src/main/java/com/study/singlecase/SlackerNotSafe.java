package com.study.singlecase;

/**
 * 懒汉线程不安全
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-29 14:54:24
 * 
 */
public class SlackerNotSafe {

	private SlackerNotSafe() {
	}

	private static SlackerNotSafe instance;

	public static SlackerNotSafe getInstance() {

		if (instance == null)
			instance = new SlackerNotSafe();
		return instance;
	}
}
