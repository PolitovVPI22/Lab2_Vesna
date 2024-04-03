package org.dstu.shapes.animation;

import org.dstu.shapes.Circle;
import org.dstu.shapes.Shape;

import javax.swing.*;

public class CircleAnimator extends Animator {

    public CircleAnimator(Shape shape, JComponent component) {
        super(shape, component);
    }

    @Override
    public void run() {
        while (true) {
            shape.moveRel((int) (Math.random() * 10), (int) (Math.random() * 10));
            if (component != null) {
                component.repaint();
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
