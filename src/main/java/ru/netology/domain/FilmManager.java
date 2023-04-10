package ru.netology.domain;

public class FilmManager {
    private Films[] films = new Films[0];
    private int maxLimitReverse = 5;

    public FilmManager() {

    }
    public FilmManager(int max) {
        maxLimitReverse = max;
    }

    public Films add(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
        return film;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        int resultLength;
        if (maxLimitReverse > films.length) {
            resultLength = films.length;
        } else {
            resultLength = maxLimitReverse;
        }
        Films[] reversed = new Films[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }

}
