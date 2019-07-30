package com.study.factory.abstracts;

/**
 * android工厂
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:55:55
 * 
 */
public class AndroidFactory implements SystemFactory {

	@Override
	public OperationController createOperationController() {
		return new AndroidOperationController();
	}

	@Override
	public UIController createInterfaceController() {
		return new AndroidUIController();
	}
}
