package com.company;

public class Car implements Car_Interface {

    private String name;
    private int price;
    private String maker;
    private int speed;

    public Car(String name, int price, String maker, int speed){
        this.name = name;
        this.price = price;
        this.maker = maker;
        this.speed = speed;
    };

    @Override
    public void Forward() {
        System.out.println(this.name + "가 전진합니다.");
    }

    @Override
    public void Reverse() {
        System.out.println(this.name + "가 후진합니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
