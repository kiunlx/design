package com.study.factory.abstracts;

/**
 * 抽象工厂模式
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:39:59
 * 
 */
public class AbstractFactory {

	public static void main(String[] args) {

		SystemFactory mFactory;
		UIController interfaceController;
		OperationController operationController;

		// Android
		mFactory = new AndroidFactory();

		interfaceController = mFactory.createInterfaceController();
		operationController = mFactory.createOperationController();
		interfaceController.display();
		operationController.control();
	}
}
