package com.study.singlecase;

/**
 * 内部类模式
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-29 15:48:56
 * 
 */
public class InnerClass {

	private InnerClass() {
	}

	public static InnerClass getInstance() {
		return InnerClassHolder.sInstance;
	}

	private static class InnerClassHolder {
		private static final InnerClass sInstance = new InnerClass();

	}
}
