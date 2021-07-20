package com;

public class TapeDeck {
    private boolean canRecord = false;

    public void playTape() {
        System.out.println("Пленка проигрывается");
    }

    public void recordTape() {
        System.out.println("Идет запись на пленку");
    }

    public void setCanRecord(boolean canRecord) {
        this.canRecord = canRecord;
    }

    public boolean isCanRecord() {
        return canRecord;
    }
}
