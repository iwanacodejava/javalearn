package com;

public class TapeDeckTestDrive {
    public static void main (String[] args) {
        TapeDeck deckPlayer = new TapeDeck();
        deckPlayer.setCanRecord(true);
        deckPlayer.playTape();
        boolean ideckPlayer = deckPlayer.isCanRecord();

        if (ideckPlayer == true) {
            deckPlayer.recordTape();
        }
    }
}
