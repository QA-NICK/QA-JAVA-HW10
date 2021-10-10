package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    void ShouldSetButtonNextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.setButtonNextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void ShouldSetButtonNextStationBoundVal() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setButtonNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void ShouldSetButtonNextStationBoundVal2() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setButtonNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void ShouldSetButtonNextStationBoundVal3() {
        Radio radio = new Radio();
        radio.setStation(11);
        radio.setButtonNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void setButtonPrevStation() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.setButtonPrevStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationBoundVal() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setButtonPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationBoundVal1() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.setButtonPrevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationBoundVal2() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setButtonPrevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }




    @Test
    void setButtonPrevStation3() {
        Radio radio = new Radio();
        radio.setStation(11);
        radio.setButtonPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        assertEquals(actual, expected);


    }

    @Test
    void ShouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(actual, expected);


    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void ShouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void ShouldSetCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void ShouldSetCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-8);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

}

