package ru.netology.radiostation;

public class Radio {

    private int currentVolume;
    private int maxRadiostation = 9;
    private int minRadiostation = 0;
    private int currentRadiostation = minRadiostation;

    public Radio(int size) {
        maxRadiostation = minRadiostation + size;

    }

    public Radio() {
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public int getMaxRadiostation() {
        return maxRadiostation;
    }

    public int getMinRadiostation() {
        return minRadiostation;
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

        if (currentRadiostation < maxRadiostation) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = minRadiostation;
        }
        return currentRadiostation;
    }

    public int prevRadiostation() {

        if (currentRadiostation > minRadiostation) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = maxRadiostation;
        }
        return currentRadiostation;
    }
}

