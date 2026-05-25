package com.threedroid.emulator;

public class Renderer {

    private int screenWidth;
    private int screenHeight;

    public void initialize() {
        System.out.println("Renderer initialized.");
    }

    public void setScreenSize(int width, int height) {
        this.screenWidth = width;
        this.screenHeight = height;
        System.out.println("Renderer screen size: " + width + "x" + height);
    }

    public void drawFrame() {
        // Placeholder for drawing logic
        System.out.println("Frame drawn.");
    }
}