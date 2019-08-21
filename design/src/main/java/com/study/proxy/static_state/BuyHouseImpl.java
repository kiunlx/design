package com.study.proxy.static_state;

/**
 * 被代理类
 *
 * @author lx
 * @date 2019/8/21 0021 15:16
 */
public class BuyHouseImpl implements BuyHouse {

    public void buyHouse() {
        System.out.println("我要买房");
    }
}