package com.study.command;

/**
 * @author lx
 * @date 2019/8/22 0022 10:45
 */
public class Invoke {

    private Command cmd;

    public Invoke(Command cmd) {
        this.cmd = cmd;
    }
    public void call() {
        cmd.execute();
    }
}