package org.dstu.shapes;

import org.dstu.shapes.animation.Animator;
import org.dstu.shapes.animation.SquareAnimator;

import javax.swing.*;
import java.awt.*;

public class Square extends Shape {
    protected int side;

    public Square() {
    }

    public Square(int x, int y, int side, Color color) {
        super(x, y, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, side, side);
        g.fillRect(x, y, side, side);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new SquareAnimator(this, component);
    }
}
