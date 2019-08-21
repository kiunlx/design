package com.study.proxy.dynamic;

import com.study.proxy.static_state.BuyHouse;
import com.study.proxy.static_state.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试类
 *
 * @author lx
 * @date 2019/8/21 0021 15:43
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
                Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
    }
}