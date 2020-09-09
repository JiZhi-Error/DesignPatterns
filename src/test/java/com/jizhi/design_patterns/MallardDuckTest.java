package com.jizhi.design_patterns;


import com.jizhi.design_patterns.strategy_pattern.Duck;
import com.jizhi.design_patterns.strategy_pattern.MallardDuck;
import com.jizhi.design_patterns.strategy_pattern.behavior.fly.FlyNoWay;
import com.jizhi.design_patterns.strategy_pattern.behavior.quack.MuteQuack;
import org.junit.Test;

public class MallardDuckTest {

    @Test
    public void display() {

        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly();
        duck.performQuack();

    }
}