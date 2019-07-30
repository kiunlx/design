package com.study.factory.abstracts;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:53:10
 * 
 */
public class AndroidUIController implements UIController {

	@Override
	public void display() {
		System.out.println("android中的UI控制器");
	}

}
