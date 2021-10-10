package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

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
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setButtonNextStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        if (currentStation > 9) {
            currentStation = 0;

        }
    }


        public void setButtonPrevStation () {


            if (currentStation == 0) {
                currentStation = 9;
                return;
            }

            if (currentStation <= 9) {
                currentStation = currentStation - 1;
            }
            if (currentStation > 9) {
                currentStation = 9;

            }

        }

        public void increaseVolume () {
            if (currentVolume < 10) {
                currentVolume = currentVolume + 1;
            }
            if (currentVolume >= 10) {
                this.currentVolume = currentVolume;

            }
        }


        public void decreaseVolume () {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
            if (currentVolume <= 0) {
                this.currentVolume = currentVolume;

            }
        }

    }

