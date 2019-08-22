package com.study.command;

/**
 * 命令模式实现接口
 *
 * @author lx
 * @date 2019/8/22 0022 10:44
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //可以做更复杂的操作
        receiver.action();
    }
}