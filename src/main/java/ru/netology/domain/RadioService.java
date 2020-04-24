package ru.netology.domain;

import java.io.InputStream;
import java.util.Scanner;

public class RadioService {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;

    }

    public void setUpCurrentStation(int currentStation) {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        } else this.currentStation = currentStation + 1;
    }

    public void setDownCurrentStation(int currentStation) {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        } else this.currentStation = currentStation - 1;
    }

}
