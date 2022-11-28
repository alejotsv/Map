package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
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

//        Draw Florida
        GradientPaint gp = new GradientPaint(0F, 0F, Color.green, 350F, 350F, Color.orange, true);
        comp2D.setPaint(gp);
        GeneralPath fl = new GeneralPath();
        fl.moveTo(10F, 12F);
        fl.lineTo(234F, 15F);
        fl.lineTo(253F, 25F);
        fl.lineTo(261F, 71F);
        fl.lineTo(344F, 209F);
        fl.lineTo(336F, 278F);
        fl.lineTo(295F, 274F);
        fl.lineTo(259F, 188F);
        fl.lineTo(211F, 171F);
        fl.lineTo(195F, 174F);
        fl.lineTo(191F, 118F);
        fl.lineTo(120F, 56F);
        fl.lineTo(94F, 68F);
        fl.lineTo(81F, 49F);
        fl.lineTo(12F, 37F);
        fl.closePath();
        comp2D.fill(fl);
    }
}
