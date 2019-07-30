package com.study.factory.simple;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:25:55
 * 
 */
public class Circular implements Shape {

	public Circular() {
		System.out.println("圆形画图初始化成功");
	}

	public void draw() {
		System.out.println("画了一个圆");
	}

}
