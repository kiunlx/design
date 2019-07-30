package com.study.factory.simple;

/**
 * 简单工厂
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:22:52
 * 
 */
public class SimpleFactory {

	public static Shape build(String type) {
		Shape shape = null;

		if (type.equals("circular")) {
			shape = new Circular();
		}
		if (type.equals("rectangle")) {
			shape = new Rectangle();
		}
		return shape;
	}
}
