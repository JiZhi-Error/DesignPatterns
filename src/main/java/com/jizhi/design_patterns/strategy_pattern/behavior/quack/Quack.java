package com.jizhi.design_patterns.strategy_pattern.behavior.quack;

import com.jizhi.design_patterns.strategy_pattern.behavior.quack.base.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
