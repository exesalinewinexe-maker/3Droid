package com.threedroid.emulator;

public class Memory {

    private byte[] ram = new byte[1024 * 1024]; // 1MB placeholder

    public void loadSystem() {
        System.out.println("System memory loaded.");
    }

    public byte read(int address) {
        return ram[address];
    }

    public void write(int address, byte value) {
        ram[address] = value;
    }
}