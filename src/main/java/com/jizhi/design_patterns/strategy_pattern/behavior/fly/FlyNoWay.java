package com.jizhi.design_patterns.strategy_pattern.behavior.fly;

import com.jizhi.design_patterns.strategy_pattern.behavior.fly.base.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
