package ru.netology.radiostation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadiostation() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(9);
        int expected = 9;
        int actual = cond.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(50);
        int expected = 50;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radiostationNotMoreThenAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(10);
        int expected = 0;
        int actual = cond.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radiostationNotThenBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(-5);
        int expected = 0;
        int actual = cond.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeNotThenBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNotMoreThenAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(150);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextOneVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        int expected = 6;
        int actual = cond.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolumeAfterUseNext() {

        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        int expected = 100;
        int actual = cond.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevOneVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(7);
        int expected = 6;
        int actual = cond.decreseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolumeAfterUsePrev() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        int expected = 0;
        int actual = cond.decreseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusOneRadiostation() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(6);
        int expected = 7;
        int actual = cond.nextRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxRadiostationAfterUseNext() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(9);
        int expected = 0;
        int actual = cond.nextRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostation() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(7);
        int expected = 6;
        int actual = cond.prevRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minRadiostationAfterUsePrev() {
        Radio cond = new Radio();
        cond.setCurrentRadiostation(0);
        int expected = 9;
        int actual = cond.prevRadiostation();
        Assertions.assertEquals(expected, actual);
    }

}


