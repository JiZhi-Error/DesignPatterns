package com.jizhi.design_patterns.strategy_pattern;

import com.jizhi.design_patterns.strategy_pattern.behavior.fly.FlyWithWings;
import com.jizhi.design_patterns.strategy_pattern.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("我是一个绿皮鸭");
    }
}
