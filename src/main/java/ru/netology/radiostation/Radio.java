package ru.netology.radiostation;

public class Radio {
    private int currentRadiostation;
    private int currentVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int newCurrentRadiostation) {
        if (newCurrentRadiostation < 0) {
            return;
        }
        if (newCurrentRadiostation > 9) {
            return;
        }
        currentRadiostation = newCurrentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int nextRadiostation() {

        if (currentRadiostation < 9) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = 0;
        }
        return currentRadiostation;
    }

    public int prevRadiostation() {

        if (currentRadiostation > 0) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = 9;
        }
        return currentRadiostation;
    }
}
