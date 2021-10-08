package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    void ShouldSetButtonNextStation() {
        radio radio = new radio();
        radio.setCurrentStation(0);
        radio.setButtonNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void ShouldSetButtonNextStation2() {
        radio radio = new radio();
        radio.setCurrentStation(9);
        radio.setButtonNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void setButtonPrevStation() {
        radio radio = new radio();
        radio.setCurrentStation(9);
        radio.setButtonPrevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStation2() {
        radio radio = new radio();
        radio.setCurrentStation(0);
        radio.setButtonPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation() {
        radio radio = new radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation2() {
        radio radio = new radio();
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation3() {
        radio radio = new radio();
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolume() {
        radio radio = new radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 8;
        assertEquals(actual, expected);


    }

    @Test
    void ShouldIncreaseVolume2() {
        radio radio = new radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(actual, expected);


    }

    @Test
    void decreaseVolume() {
        radio radio = new radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    void decreaseVolume2() {
        radio radio = new radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void ShouldSetCurrentVolume() {
        radio radio = new radio();
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    void ShouldSetCurrentVolume2() {
        radio radio = new radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }
    @Test
    void ShouldSetCurrentVolume3() {
        radio radio = new radio();
        radio.setCurrentVolume(-8);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }
}