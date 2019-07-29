package com.study.singlecase;

/**
 * 单例饿汉模式
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-29 13:39:25
 * 
 */
public class HungryMan {

	private static HungryMan hungryMan = new HungryMan();

	private HungryMan() {
	}

	public static HungryMan getInstance() {
		return hungryMan;
	}

}
