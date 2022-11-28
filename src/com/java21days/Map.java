package com.java21days;

import javax.swing.*;

public class Map extends JFrame {
    public Map(){
        super("Map");
        setSize(360, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MapPane mapPane = new MapPane();
        add(mapPane);
        setVisible(true);
    }
}
