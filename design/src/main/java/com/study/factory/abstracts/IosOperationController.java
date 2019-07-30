package com.study.factory.abstracts;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:53:47
 * 
 */
public class IosOperationController implements OperationController {

	@Override
	public void control() {
		System.out.println("ios中的操作控制器");
	}

}
