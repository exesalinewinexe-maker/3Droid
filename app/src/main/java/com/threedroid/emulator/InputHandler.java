package com.threedroid.emulator;

import android.view.MotionEvent;
import android.view.KeyEvent;

public class InputHandler {

    public void handleTouch(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        // For now, just print the touch
        System.out.println("Touch at: " + x + ", " + y);
    }

    public void handleKey(KeyEvent event) {
        int keyCode = event.getKeyCode();

        // For now, just print the key
        System.out.println("Key pressed: " + keyCode);
    }

    public void handleGamepad(MotionEvent event) {
        // Gamepad analog sticks, triggers, etc.
        System.out.println("Gamepad event detected");
    }
}