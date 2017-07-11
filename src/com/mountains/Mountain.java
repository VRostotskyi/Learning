package com.mountains;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Mountain {
    private String name;
    private int height;

    public Mountain(String n, int h) {
        name = n;
        height = h;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String toString(){
        return name + " " + height;
    }
}
