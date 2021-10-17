package ru.netology;

public class Radio {
    private int countOfStation = 10;
    private int currentStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int countOfStation) {
        this.countOfStation = countOfStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int newStation) {
        currentStation = newStation;
    }

    ;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > (countOfStation - 1)) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setButtonNextStation() {

        if (currentStation < (countOfStation - 1)) {

            currentStation = currentStation + 1;
            return;
        }
        if (currentStation == (countOfStation - 1)) {
            currentStation = 0;
        }
        if (currentStation > (countOfStation - 1)) {
            currentStation = 0;

        }
    }


    public void setButtonPrevStation() {


        if (currentStation == 0) {
            currentStation = (countOfStation - 1);
            return;
        }

        if (currentStation <= (countOfStation - 1)) {
            currentStation = currentStation - 1;
        }
        if (currentStation > (countOfStation - 1)) {
            currentStation = (countOfStation - 1);

        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            this.currentVolume = currentVolume;

        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            this.currentVolume = currentVolume;

        }
    }

}

