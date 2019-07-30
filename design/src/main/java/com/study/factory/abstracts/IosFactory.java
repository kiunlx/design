package com.study.factory.abstracts;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:56:39
 * 
 */
public class IosFactory implements SystemFactory {

	@Override
	public OperationController createOperationController() {
		return new IosOperationController();
	}

	@Override
	public UIController createInterfaceController() {
		return new IosUIController();
	}
}
