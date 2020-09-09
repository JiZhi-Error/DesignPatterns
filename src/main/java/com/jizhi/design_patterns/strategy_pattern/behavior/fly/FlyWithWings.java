package com.jizhi.design_patterns.strategy_pattern.behavior.fly;

import com.jizhi.design_patterns.strategy_pattern.behavior.fly.base.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会飞，牛皮吧");
    }
}
