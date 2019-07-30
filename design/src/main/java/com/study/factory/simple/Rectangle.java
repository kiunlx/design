package com.study.factory.simple;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:26:57
 * 
 */
public class Rectangle implements Shape {

	public Rectangle() {
		System.out.println("画图矩形初始化成功.....");
	}

	public void draw() {
		System.out.println("画了一个矩形");
	}

}
