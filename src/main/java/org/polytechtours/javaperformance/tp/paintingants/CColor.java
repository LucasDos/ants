package org.polytechtours.javaperformance.tp.paintingants;

public class CColor {
    static int getRGB(int r, int g, int b) {
        int rgb = r;
        rgb = (rgb << 8) + g;
        rgb = (rgb << 8) + b;
        return rgb;
    }
    static int getRed(int rgb){
        return ( (rgb >> 16) & 0xFF);
    }

    static int getGreen(int rgb){
        return ((rgb >> 8) & 0xFF);
    }

    static int getBlue(int rgb){
        return rgb & 0xFF;
    }
}
