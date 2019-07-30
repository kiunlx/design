package com.study.factory.method;

/**
 *
 * @author lx
 * @version 1.0.0
 * @date 2019-07-30 10:33:51
 * 
 */
public class FactoryMethod {

	public static void main(String[] args) {

		ReaderFactory readerFactory = new JpgReaderFactory();
		readerFactory.getReader().read();
	}
}
