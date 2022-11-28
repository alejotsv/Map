package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class MapPane extends JPanel {
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;

//        Set blue background
        comp2D.setColor(Color.BLUE);
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Rectangle2D.Float background = new Rectangle2D.Float(0F, 0F, getSize().width, getSize().height);
        comp2D.fill(background);

//        Draw waves
        comp2D.setColor(Color.WHITE);
        BasicStroke pen = new BasicStroke(2F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        comp2D.setStroke(pen);
        for(int ax=0; ax<340; ax+=10){
            for(int ay=0; ay<340; ay+=10){
                Arc2D.Float wave = new Arc2D.Float(ax, ay, 10, 10, 0, -180, Arc2D.OPEN);
                comp2D.draw(wave);
            }
        }
    }
}
