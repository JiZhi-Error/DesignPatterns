package com.jizhi.design_patterns.strategy_pattern.behavior.fly;

import com.jizhi.design_patterns.strategy_pattern.behavior.fly.base.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我有火箭动力系统，飞的快");
    }
}
