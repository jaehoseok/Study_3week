package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[5];
        cars[0] = new Car("K3", 17570000, "KIA", 80);
        cars[1] = new Car("K5", 23560000, "KIA", 70);
        cars[2] = new Car("아반떼", 15700000, "HYUNDAI", 100);
        cars[3] = new Car("소나타", 23860000, "HYUNDAI", 120);
        cars[4] = new Car("테슬라 모델3", 54690000, "TESLA", 60);

        //입력 할 시
//        IntStream.range(0, cars.length).forEach(i -> {
//            cars[i].setName(scan.next());
//            cars[i].setPrice(scan.nextInt());
//            cars[i].setMaker(scan.next());
//            cars[i].setSpeed(scan.nextInt());
//        });

        boolean run = true;
        while (run) {
            System.out.println("1.수정 2.삭제 3.조회 4.전체조회 5.종료");
            int input = scan.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("수정할 인덱스 번호 입력 ( 0~" + cars.length + " )");
                    int index = scan.nextInt();
                    System.out.println("수정할 정보 선택 1.이름 2.가격 3.제조사 4.속도");
                    int info = scan.nextInt();

                    if (info == 1) cars[index].setName(scan.next());
                    else if (info == 2) cars[index].setPrice(scan.nextInt());
                    else if (info == 3) cars[index].setMaker(scan.next());
                    else if (info == 4) cars[index].setSpeed(scan.nextInt());
                    else System.out.println("업는 정보");
                }

                case 2 -> {
                    System.out.println("삭제할 인덱스 번호 입력 ( 0~" + (cars.length - 1) + " )");
                    int index = scan.nextInt();
                    cars[index].setName("");
                }

                case 3 -> {
                    System.out.println("검색할 인덱스 번호 입력 ( 0~" + (cars.length - 1) + " )");
                    int index = scan.nextInt();
                    System.out.println("이름 : " + cars[index].getName() + "\n" +
                            "가격 : " + cars[index].getPrice() + "\n" +
                            "제조사 : " + cars[index].getMaker() + "\n" +
                            "속도 : " + cars[index].getSpeed());
                }

                case 4 -> {
                    for (Car car : cars) {
                        if (!car.getName().equals("")){
                            System.out.println("이름 : " + car.getName() + "\n" +
                                    "가격 : " + car.getPrice() + "\n" +
                                    "제조사 : " + car.getMaker() + "\n" +
                                    "속도 : " + car.getSpeed() + "\n");
                        }
                    }
                }

                case 5 -> run = false;

                default -> System.out.println("없는 정보");
            }
        }
    }
}
