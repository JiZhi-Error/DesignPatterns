package com.jizhi.design_patterns.strategy_pattern;

import com.jizhi.design_patterns.strategy_pattern.behavior.fly.base.FlyBehavior;
import com.jizhi.design_patterns.strategy_pattern.behavior.quack.base.QuackBehavior;

public abstract class Duck {

    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("我会游泳");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
