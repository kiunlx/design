package com.study.factory.abstracts;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:55:15
 * 
 */
public interface SystemFactory {

	public OperationController createOperationController();

	public UIController createInterfaceController();
}
