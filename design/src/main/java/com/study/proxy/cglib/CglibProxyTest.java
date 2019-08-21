package com.study.proxy.cglib;

import com.study.proxy.static_state.BuyHouse;
import com.study.proxy.static_state.BuyHouseImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * cglib代理测试类
 *
 * @author lx
 * @date 2019/8/21 0021 15:59
 */
public class CglibProxyTest {

    public static void main(String[] args){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(StudyProxy.class);
        enhancer.setCallback(new CglibProxy());
        StudyProxy studyProxyNow = (StudyProxy)enhancer.create();
        studyProxyNow.studyProxy();
    }
}