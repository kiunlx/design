package com.study.proxy.static_state;

/**
 * 静态代理
 *
 * @author lx
 * @date 2019/8/21 0021 15:15
 */
public class StaticState {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}