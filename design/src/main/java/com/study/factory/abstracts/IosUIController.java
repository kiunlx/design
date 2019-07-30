package com.study.factory.abstracts;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:54:31
 * 
 */
public class IosUIController implements UIController {

	@Override
	public void display() {
		System.out.println("ios中的ui控制器");
	}

}
