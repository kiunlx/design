package com.study.factory.abstracts;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:51:53
 * 
 */
public class AndroidOperationController implements OperationController {

	@Override
	public void control() {
		System.out.println("android控制器");
	}

}
