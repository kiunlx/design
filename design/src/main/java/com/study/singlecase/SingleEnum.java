package com.study.singlecase;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-29 15:55:53
 * 
 */
public enum SingleEnum {

	INSTANCE;

	private Single single;

	private SingleEnum() {
		this.single = new Single();
	}

	public Single getInstance() {
		return single;
	}
}

class Single {
}