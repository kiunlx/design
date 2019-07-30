package com.study.factory.method;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:37:17
 * 
 */
public class PngFactory implements ReaderFactory {

	public Reader getReader() {
		return new PngReader();
	}

}
