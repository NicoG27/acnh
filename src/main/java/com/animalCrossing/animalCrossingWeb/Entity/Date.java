package com.animalCrossing.animalCrossingWeb.Entity;

public class Date {
    private String date;
    private String time;
    private String select;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date(String date, String time, String select) {
        this.date = date;
        this.time = time;
        this.select = select;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", select='" + select + '\'' +
                '}';
    }
}
