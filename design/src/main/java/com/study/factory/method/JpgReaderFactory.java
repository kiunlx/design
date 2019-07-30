package com.study.factory.method;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:36:42
 * 
 */
public class JpgReaderFactory implements ReaderFactory {

	public Reader getReader() {
		return new JpgReader();
	}

}
