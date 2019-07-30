package com.study.singlecase;

/**
 * 双重检查模式
 * 
 * @author lx
 * @version 1.0.0
 * @date 2019-07-29 15:11:43
 * 
 */
public class DuplicationCheck {

	private DuplicationCheck() {
	}

	private static volatile DuplicationCheck instance;

	public static DuplicationCheck getInstance() {

		if (instance == null) {
			synchronized (DuplicationCheck.class) {
				if (instance == null) {
					instance = new DuplicationCheck();
				}
			}
		}
		return null;
	}
}
