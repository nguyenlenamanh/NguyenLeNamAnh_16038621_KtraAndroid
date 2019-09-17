package com.example.student.nlna_cau1;

public class HoaHau {
    private String Name;
    private int Avatar;
    private String Year;
    private int Country;

    public HoaHau(String name, int avatar, String year, int country) {
        Name = name;
        Avatar = avatar;
        Year = year;
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int avatar) {
        Avatar = avatar;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public int getCountry() {
        return Country;
    }

    public void setCountry(int country) {
        Country = country;
    }
}
