package com.threedroid.emulator;

public class EmulatorCore {

    private CPU cpu;
    private Memory memory;
    private Renderer renderer;
    private boolean running = false;

    public EmulatorCore() {
        cpu = new CPU();
        memory = new Memory();
        renderer = new Renderer();
    }

    public void start() {
        System.out.println("Starting 3Droid Emulator...");

        cpu.initialize();
        memory.loadSystem();
        renderer.initialize();

        running = true;
        runLoop();
    }

    private void runLoop() {
        new Thread(() -> {
            while (running) {
                cpu.executeCycle();
                renderer.drawFrame();

                try {
                    Thread.sleep(16); // ~60 FPS
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void stop() {
        running = false;
        System.out.println("Emulator stopped.");
    }
}