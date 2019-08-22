package com.study.command;

/**
 * @author lx
 * @date 2019/8/22 0022 10:46
 */
public class Client {

    public static void main(String[] args) {

        Command cmd = new ConcreteCommand(new Receiver());
        Invoke invoke = new Invoke(cmd);
        invoke.call();
    }
}